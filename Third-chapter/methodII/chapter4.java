public class chapter4 {
    public static void main(String[] args) {
        printData(fullName("Kate", "Jones"), 27, 1.6, 50.0);
        printData(fullName("Kevin", "Setiadi", "Seng"), 19, 1.65, 50.0);
    }

    public static void printData(String name, int age, double height, double weight) {
        System.out.println("Nama saya adalah " + name + ".");
        System.out.println("Saya berusia " + age + " tahun.");
        System.out.println("Tinggi saya adalah " + height + " meter.");
        System.out.println("Berat saya adalah " + weight + " kilogram");

        //tetapkan BMI ke variable bmi menggunakan method bmi
        double bmi = bmi(height, weight);

        //Menggunakan variable bmi, cetak
        System.out.println("BMI saya adalah " + bmi);

        //Buat statement if untuk menentukan hasil dari method isHealthy
        if (isHealthy(bmi)) {
            System.out.println("Anda sehat!");
        } else {
            System.out.println("Anda tidak sehat.");
        }
    }
    
    public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static String fullName(String firstName, String middleName, String lastName) {
        return firstName + " " + middleName + " " + lastName;
    }

    public static double bmi(double height, double weight) {
        return weight / height / height;
    }

    public static boolean isHealthy(double bmi) {
        if(bmi >= 18.5 && bmi < 25.0) {
            return true;
        } else {
            return false;
        }
    }
}
