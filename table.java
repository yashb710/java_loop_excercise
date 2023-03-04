package java_loop;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    sc.close();
    int table=1;
          for(int i=1;i<=10;i++){
            for(int j =1;j<=n;j++){
            table = i*j;
            System.out.print(table+" ");
          } 
          System.out.println();
        }
    }
}
