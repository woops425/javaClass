// InsertionSort.java
public class InsertionSort implements SortingAlgorithm {

    @Override
    public void sort(int[] data) {
        ComparisonCounter.reset();
        for (int i = 1; i < data.length; i++) {
            int key = data[i];
            int j = i - 1;
            while (j >= 0 && ComparisonCounter.compare(key, data[j])) {
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
