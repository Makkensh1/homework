package homework1;

public class Task2 {
    public static void main(String[] args) {
    int [] Arr = {5, 63, 33, -28, 25, 1, 15, 24, 0, 4};
    int m=0, n=0;
    int c = Arr.length;
            for (int pos=0; pos<=c-2; pos++) {
            for (int pos1= pos+1; pos1<=c-1;pos1++) {
                if ( Arr[pos]+Arr[pos1] == 7 ) {m = Arr[pos]; n = Arr[pos1];
                    System.out.println(m);
                    System.out.println(n);}
                else  {System.out.println("Ошибка");
                break;}
            }
        }
       // }

    }
}

