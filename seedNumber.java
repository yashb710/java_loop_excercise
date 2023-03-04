package java_loop;

import java.util.Scanner;

public class seedNumber {
    public static int seed(int n){
        int mul=n;
        while(n>0){
             int N = n%10;
             mul = mul*N;
             n=n/10;
        }
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        sc.close();
        if(n1==seed(n)){
            System.out.println(n+" is a seed of "+n1);
        }
        else{
            System.out.println(n+" is not a seed of "+n1);
        }
}
}