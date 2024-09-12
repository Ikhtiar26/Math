package dsa;

public class Prime7 {
    public static void main(String[] args) {
        int n = 30;
        for (int i = 1; i <= n; i++) {
            System.out.println(i+ " "+((prime(i)) ? "Prime number" : "Not a Prime Number") );
        }
//       if (prime(n)) {
//            System.out.println("Prime number");
//        } else {
//            System.out.println("Not a Prime number");
//        }
    }
    static boolean prime(int n){
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i*i <= n; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
}
