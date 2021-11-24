import java.util.Scanner;

public class lesson2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama: ");

        //Deklarasikan variable name dari tipe String untuk mengambil nilai input dari console
        String name = scanner.next();
        scanner.close(); //harus selalu diclose yakk

        //Cetak "Hello, ____."
        System.out.println("Hello, " + name + ".");
    }
}
