import java.util.Scanner;

public class UasNomor10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[input.nextInt()];
        for (int i =0; i < array.length ; i++)
        {
            array[i] = input.nextInt();
        }

        UasNomor10 operasiArray = new UasNomor10();
        operasiArray.sortingArray(array);
        operasiArray.kelipatanLima(array);


    }
    public void sortingArray (int[] arraybaru)
    {
        int sementara=0;
            for (int i = 0;i < arraybaru.length-1; i++)
            {
                for (int j=0; j < arraybaru.length-1;j++ )
                {
                    if(arraybaru[j] > arraybaru[j+1])
                    {
                        sementara = arraybaru[j];
                        arraybaru[j] = arraybaru[j+1];
                        arraybaru[j+1] = sementara;
                    }
                }
            }
        }

    public  void kelipatanLima(int[] array)
    {
        int angka=1;
        for (int i=0; i < array.length; i++)
        {
            if (array[i] % 5 == 0)
            {
                System.out.println(angka + ". "+ array[i]);
                angka++;
            }
        }
    }
}
