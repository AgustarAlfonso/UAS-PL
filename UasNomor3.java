import java.util.Scanner;

public class UasNomor3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        for (int i=0; i < array.length; i++)
        {
            array[i] = input.nextInt();
        }
        int banyakangka=0;
        for (int i=0; i < array.length; i++)
        {
            if (array[i] % 5 == 0)
            {
                banyakangka++;
            }
        }
        if (banyakangka==0)
        {
            System.out.println("tidak ada angka yang kelipatan 5 dari input tersebut");
        }
        else {
            System.out.println("Ada " + banyakangka + " angka yang kelipatan 5 dari input tersebut!");
        }

    }
}
