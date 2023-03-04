package java_loop;

import java.util.Scanner;

public class rotate_number {
    public static int digit(int n) {
        int digit =0; 
        while (n>0){
            digit++;
            n/=10;
        }
        return digit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number : ");
        int n = sc.nextInt();
        System.out.print("Number of rotation :");
        int k = sc.nextInt();
        sc.close();
        // Integer is using as it take less memory than String
        // if use String to find length it will also have same output but it take more space.
        int X = digit(n);
        k = ((k%X)+X)%X;
        int N = n%(int)(Math.pow(10, X-k-1));
        n = n/((int)(Math.pow(10, X-k-1)));
        int num = N*(int)(Math.pow(10,digit(n)));
        System.out.println(num+n);
    }
}
