import java.util.Scanner;

public class UasNomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();

        if (angka % 5 == 0)
        {
            System.out.println("Angka tersebut adalah kelipatan 5");
        }
        else {
            System.out.println("Angka tersebut bukan kelipatan 5");
        }
    }
}
