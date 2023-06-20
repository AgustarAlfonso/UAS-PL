import java.util.Scanner;

public class UasNomor5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[input.nextInt()];
        for (int i=0; i < array.length; i++)
        {
            array[i] = input.nextInt();
        }
        System.out.println("Masukkan angka yang ingin anda cari = ");
        int cari = input.nextInt();


        UasNomor5 operasiArray = new UasNomor5();
        operasiArray.cariNilai(array, cari);
    }

    public void cariNilai(int[] array, int cari)
    {
        boolean kondisi = true;
        int jumlah=0;
        for (int i =0; i<array.length;i++)
        {
            if (array[i] == cari)
            {
                kondisi = false;
                jumlah++;
                System.out.println(array[i] + " terdapat pada nomor " + (i+1));
            }
        }
        if (kondisi == true)
        {
            System.out.println("Tidak ada angka "+ cari + " didalam array tersebut!");
        }
        if (jumlah > 0 )
        {
            System.out.println("Terdaoat " + jumlah + " buah angka " + cari + " di dalam array tersebut!");
        }
    }

}
