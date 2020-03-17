package homework2;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String word1 = "Слог";
        String word2 = "Плот";
        String word3;
        int word3ArrLenght = 0;
        byte[] word1Arr = word1.getBytes(); //представляет строку как последовательность байтов
        byte[] word2Arr = word2.getBytes();
        word3ArrLenght =  (word1Arr.length / 2)  +  (word2Arr.length / 2);
        //System.out.println(word3ArrLenght);

        byte[] word3Arr = new byte[word3ArrLenght];
        for (int i = 0; i < word1Arr.length / 2; i++) {
            word3Arr[i] = word1Arr[i];
        }
        for (int n = word2Arr.length / 2; n < word3ArrLenght; n++) {
            word3Arr[n] = word2Arr[n];
        }
        word3 = new String(word3Arr);
        System.out.println(word3);
        
    }
}
