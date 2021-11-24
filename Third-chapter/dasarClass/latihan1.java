import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama Depan: ");
        //Masukkan nilai string
        String firstName = scanner.next();

        System.out.print("Nama Belakang: ");
        //Masukkan nilai string
        String lastName = scanner.next();

        System.out.print("Usia: ");
        //Masukkan nilai integer
        int age = scanner.nextInt();

        System.out.print("Tinggi(m): ");
        //Masukkan nilai desimal
        double height = scanner.nextDouble();

        System.out.print("Berat(kg): ");
        //Masukkan nilai desimal
        double weight = scanner.nextDouble();

        scanner.close();

        printData(firstName, lastName, age, height, weight);
    }

    public static void printData(String firstName, String lastName, int age, double height, double weight) {
        System.out.println("Nama saya adalah " + fullName(firstName, lastName) + ".");
        System.out.println("Saya berusia " + age + " tahun.");

        if (age >= 18) {
            System.out.println("Saya sudah dewasa");
        } else {
            System.out.println("Saya belum dewasa");
        }

        System.out.println("Tinggi Badan saya " + height + " m.");
        System.out.println("Berat Badan saya " + weight + " kg.");
    }

    public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
