import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[][] Arr = new int[5][8];
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 8; k++) {
                Arr[i][k] = (int) (Math.random() * 198 - 99);
            }
        }
        System.out.println(Arrays.deepToString(Arr));
        for (int c = 0; c < 5; c++) {
            Arrays.sort(Arr[c]);
        }
        int max = -99;
        for (int m = 0; m < 5; m++) {
            if (Arr[m][7] > max) {
                max = Arr[m][7];
            }
        }
        System.out.println(max);
    }
}
