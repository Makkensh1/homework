package homework1;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число больше трех");
        int n = scan.nextInt();
        while (n < 3) {
            System.out.println("Ошибка");
            Scanner scan1 = new Scanner(System.in);
            System.out.println("Введите число еще раз");
            int m = scan1.nextInt();
            n = m;
        }
        int[] Arr;
        int[] Arr2;
        int k = 0;
        int c = 0;
        Arr = new int[n];
        Arr2 = new int[1];
        for (int i = 0; i <= (n - 1); i++) {
            Arr[i] = (int) (Math.random() * n+1);
        }
        System.out.println(Arrays.toString(Arr));
        for (int m = 0; m <= (n - 1); m++) {
            if (Arr[m] % 2 == 0 && Arr[m] > 0) {
                k = k + 1;
            }
        }

        Arr2 = new int[k];
        for (int l = 0; l <= (n - 1); l++) {
            if (Arr[l] % 2 == 0 && Arr[l] > 0) {
                Arr2[c] = Arr[l];
                c = c + 1;
            }
        }
        System.out.println(Arrays.toString(Arr2));
    }
}





