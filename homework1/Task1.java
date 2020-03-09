import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите первое число ");
        int num1 = scan.nextInt();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Введите второе");
        int num2 = scan2.nextInt();
        int c;
        int nod = 1;
        if (num1 >= num2) c = num2;
        else c = num1;
        for (int i = 1; i <= c; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                nod = i;
                System.out.println(nod);
            }

        }

    }
}
