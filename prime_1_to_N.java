package java_loop;

import java.util.Scanner;

public class prime_1_to_N {
    static boolean isPrime(int n){
        if(n==1||n==0)return false;
 
        for(int i=2; i<n; i++){
              if(n%i==0)return false;
        }
        //otherwise, n is prime number.
        return true;
  }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int n = Integer.parseInt(args[0]);
        sc.close();
        for(int i=1; i<=n; i++){
            //check if current number is prime
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
