package java_loop;

import java.util.Scanner;

public class armStrong {
    public static int digit(int n) {
        int digit =0; 
        while (n>0){
            digit++;
            n/=10;
        }
        return digit;
    }
    
    public static int armstrong(int n) { 
        int sum =0;
        int X =digit(n);
        while (n>0){
            int N=n%10;
            sum=sum+(int)(Math.pow(N,X));
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if(n==armstrong(n)){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }
    }
}
