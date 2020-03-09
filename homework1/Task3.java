import java.util.Scanner;
import java.util.Arrays;

import static java.lang.Math.random;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int N = scan.nextInt();
        int[] Arr;
        Arr = new int[N];
        int c = 0;
        for (int i = 0; i <= N - 1; i++) {
            Arr[i] = (int) (Math.random() * 1000);
            // Arr [N-1] = (int) (Math.random() * 1000);
        }
        Arrays.sort(Arr);
        for ( int b = 0 ; b<= N-1; b++) {
        c += Arr[b];
        }
        System.out.println(Arr[0]);
        System.out.println(Arr[N / 2]);
        System.out.println(c/N);
    }
}
