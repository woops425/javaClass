// HeapSort.java
public class HeapSort implements SortingAlgorithm {

    @Override
    public void sort(int[] data) {
        ComparisonCounter.reset();
        int n = data.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(data, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            int temp = data[0];
            data[0] = data[i];
            data[i] = temp;
            heapify(data, i, 0);
        }
    }

    private void heapify(int[] data, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && ComparisonCounter.compare(data[largest], data[left])) largest = left;
        if (right < n && ComparisonCounter.compare(data[largest], data[right])) largest = right;

        if (largest != i) {
            int swap = data[i];
            data[i] = data[largest];
            data[largest] = swap;
            heapify(data, n, largest);
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
