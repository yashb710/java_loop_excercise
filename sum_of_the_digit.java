package java_loop;

import java.util.Scanner;

public class sum_of_the_digit {
    public static int sum_digit(int n){
        int sum =0;
        while(n>0){
             int N = n%10;
             sum = sum +N;
             n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if(n%sum_digit(n)==0){
            System.out.println(n+" is divisble by its sum of digits");
        }
        else{
            System.out.println(n+" is not divisble by its sum of digits");
        }

    }
}
