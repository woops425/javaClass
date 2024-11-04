import java.util.Random;

public class SortingPerformance {
    public static void main(String[] args) {
        int[] smallData = generateRandomData(32); // 작은 데이터 크기
        int[] largeData = generateRandomData(1024); // 큰 데이터 크기 (성능 평가용)

        System.out.println("== Small Array (n = 32) ==");

        runTest(new InsertionSort(), smallData.clone(), "Insertion Sort");
        runTest(new HeapSort(), smallData.clone(), "Heap Sort");
        runTest(new MergeSort(), smallData.clone(), "Merge Sort");

        // QuickSort 다양한 피벗 설정 및 삽입 정렬 최적화 확인
        runTest(new QuickSort("first"), smallData.clone(), "Quick Sort (Pivot: First Element)");
        runTest(new QuickSort("last"), smallData.clone(), "Quick Sort (Pivot: Last Element)");
        runTest(new QuickSort("random"), smallData.clone(), "Quick Sort (Pivot: Random Element)");
        runTest(new QuickSort("median"), smallData.clone(), "Quick Sort (Pivot: Median of Three)");
        runTest(new QuickSort("optimized"), smallData.clone(), "Quick Sort (Optimized: Median or Insertion)");

        System.out.println("\n== Large Array (n = 1024) ==");

        runTest(new InsertionSort(), largeData.clone(), "Insertion Sort");
        runTest(new HeapSort(), largeData.clone(), "Heap Sort");
        runTest(new MergeSort(), largeData.clone(), "Merge Sort");

        runTest(new QuickSort("first"), largeData.clone(), "Quick Sort (Pivot: First Element)");
        runTest(new QuickSort("last"), largeData.clone(), "Quick Sort (Pivot: Last Element)");
        runTest(new QuickSort("random"), largeData.clone(), "Quick Sort (Pivot: Random Element)");
        runTest(new QuickSort("median"), largeData.clone(), "Quick Sort (Pivot: Median of Three)");
        runTest(new QuickSort("optimized"), largeData.clone(), "Quick Sort (Optimized: Median or Insertion)");
    }

    // 무작위 데이터 생성 메소드
    private static int[] generateRandomData(int n) {
        Random rand = new Random();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = rand.nextInt(10000);
        }
        return data;
    }

    // 성능 테스트 실행 메소드
    private static void runTest(SortingAlgorithm algorithm, int[] data, String algorithmName) {
        algorithm.resetComparisonCount(); // 비교 횟수 초기화
        long startTime = System.nanoTime(); // 시작 시간 측정

        algorithm.sort(data);

        long endTime = System.nanoTime(); // 종료 시간 측정
        int comparisons = algorithm.getComparisonCount();
        System.out.printf("%s - 비교횟수 : %d, 시간 : %d ns\n", algorithmName, comparisons, (endTime - startTime));
    }
}

