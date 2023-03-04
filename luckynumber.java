package java_loop;

import java.util.*;

public class luckynumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i = 1, even = 0, odd = 0, answer = n;
        while (n > 0) {
            if (i % 2 == 0)
                even += ((n % 10) * (n % 10));
            else
                odd += ((n % 10) * (n % 10));

            n /= 10;
            i++;
        }

        i--;

        if (i % 2 == 0)
            even = odd;

        if (even%9 == 0)
            System.out.println(answer+ " is a lucky number");
        else
            System.out.println(answer + " is not a lucky number");
    }
}