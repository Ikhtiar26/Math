package dsa;

import java.util.Scanner;

public class Prime2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1 to n Prime Number ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i+" "+prime(i));
        }
    }
    static String prime(int n) {
        if (n == 1) {
            return "Not a Prime Number";
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (n%i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
           return "Prime Number";
        } else {
           return "Not a Prime Number";
        }
    }
}
