package java_loop;

import java.util.Scanner;

public class digits_of_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        String s =Integer.toString(n);
        for(int i = 0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
    }
}
