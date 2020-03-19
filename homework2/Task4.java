package homework2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.println("Введите слово");
        String wordCheck = word.nextLine();
        wordCheck = wordCheck.toLowerCase();
        int wordLength = wordCheck.length();
        int check = 0;
        for (int i = 0; i < wordLength; i++) {
            if (wordCheck.charAt(i) == wordCheck.charAt((wordLength - 1) - i)) {
                check += 1;
            } else break;
        }
        if (check == wordCheck.length()) {
            System.out.println("Слово " + wordCheck + " палиндром");
        } else System.out.println("Слово " + wordCheck + " не является палиндромом");
    }
}
