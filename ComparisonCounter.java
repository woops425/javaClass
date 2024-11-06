// ComparisonCounter.java
public class ComparisonCounter {
    private static int comparisonCount = 0;

    public static boolean compare(int x, int y) {
        comparisonCount++;
        return x < y;
    }

    public static int getComparisonCount() {
        return comparisonCount;
    }

    public static void reset() {
        comparisonCount = 0;
    }
}
