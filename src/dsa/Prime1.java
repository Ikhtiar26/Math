package dsa;

public class Prime1 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            System.out.println(i+ " "+isPrime1(i));
        }
    }
    static boolean isPrime1(int n) {
        if (n == 1) {
            return false;
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (n%i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        int c = 2;
        while(c * c <= n) {
            if (n%c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
