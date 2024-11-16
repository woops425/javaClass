import java.util.Random;

public class QuickSort implements SortingAlgorithm {
    private final String pivotType;
    private static final int INSERTION_SORT_THRESHOLD = 35;

    public QuickSort(String pivotType) {
        this.pivotType = pivotType;
    }

    @Override
    public void sort(int[] data) {
        ComparisonCounter.reset();
        quickSort(data, 0, data.length - 1);
    }

    private void quickSort(int[] data, int low, int high) {
        if (high - low < INSERTION_SORT_THRESHOLD) {
            // 입력 크기가 35 미만일 경우 삽입 정렬 사용
            insertionSort(data, low, high);
        } else {
            if (low < high) {
                int pi = partition(data, low, high);
                quickSort(data, low, pi - 1);
                quickSort(data, pi + 1, high);
            }
        }
    }

    private int partition(int[] data, int low, int high) {
        int pivot = getPivot(data, low, high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (ComparisonCounter.compare(data[j], pivot)) {
                i++;
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
        int temp = data[i + 1];
        data[i + 1] = data[high];
        data[high] = temp;
        return i + 1;
    }

    private int getPivot(int[] data, int low, int high) {
        switch (pivotType) {
            case "first":
                return data[low];
            case "last":
                return data[high];
            case "random":
                return data[low + new Random().nextInt(high - low + 1)];
            case "median":
                int mid = (low + high) / 2;
                return medianOfThree(data[low], data[mid], data[high]);
            case "optimized":
                // "optimized" 옵션: 입력 크기에 따라 삽입 정렬 또는 median of three 사용
                if (high - low < INSERTION_SORT_THRESHOLD) {
                    return data[low]; // pivot을 임의로 설정; 어차피 삽입 정렬 사용
                } else {
                    int median = medianOfThree(data[low], data[(low + high) / 2], data[high]);
                    return median;
                }
            default:
                throw new IllegalArgumentException("Unknown pivot type");
        }
    }

    private int medianOfThree(int a, int b, int c) {
        if (ComparisonCounter.compare(a, b)) {
            if (ComparisonCounter.compare(b, c)) return b;
            else return ComparisonCounter.compare(a, c) ? c : a;
        } else {
            if (ComparisonCounter.compare(a, c)) return a;
            else return ComparisonCounter.compare(b, c) ? c : b;
        }
    }

    private void insertionSort(int[] data, int low, int high) {
        for (int i = low + 1; i <= high; i++) {
            int key = data[i];
            int j = i - 1;
            while (j >= low && ComparisonCounter.compare(key, data[j])) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = key;
        }
    }

    @Override
    public int getComparisonCount() {
        return ComparisonCounter.getComparisonCount();
    }

    @Override
    public void resetComparisonCount() {
        ComparisonCounter.reset();
    }
}
