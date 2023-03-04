package java_loop;


import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    // int n = Integer.parseInt(args[0]);
    sc.close();
    boolean isPrime = false;
    for(int i = 2; i < n; i++){
        if(n%i!=0){
           isPrime = true;
        } 
    }
    if(!isPrime){
        System.out.println("Prime Number");
    }
    else{
        System.out.println("Not Prime Number");
    }
}
}
