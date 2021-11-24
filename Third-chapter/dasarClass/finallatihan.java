import java.util.Scanner;

public class finallatihan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jumlah orang: ");
        int n = scanner.nextInt();

        int maxAge = 0;
        int totalAge = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Orang ke " + (i + 1));

            System.out.print("Nama depan: ");
            String firstName = scanner.next();

            System.out.print("Nama belakang: ");
            String lastName = scanner.next();

            System.out.print("Usia: ");
            int age = scanner.nextInt();

            if(age > maxAge) {
                maxAge = age;
            }

            totalAge += age;

            System.out.print("Tinggi badan(m): ");
            double height = scanner.nextDouble();

            System.out.print("Berat badan(kg): ");
            double weight = scanner.nextDouble();

            Orang.printData(firstName, lastName, age, height, weight);
        }
        scanner.close();

        System.out.println("Usia tertua: " + maxAge + ".");
        System.out.println("Usia rata-rata: " + totalAge / n + ".");
    }
}
