package dsa;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int count = 0;
       System.out.print("Enter a number : ");
       int n = sc.nextInt();
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }


    }
}
