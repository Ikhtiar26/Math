package dsa;

public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        pattern(5);
    }

    private static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == col || row+col==n+1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
