public class chapter2 {
    public static void main(String[] args) {
        printData(fullName("Jeremyas","Cornelis"), 18);

        printData(fullName("Augusta", "Steven", "Benedict"), 19);
    }

    public static void printData(String name, int age) {
        System.out.println("Nama saya adalah " + name + ".");
        System.out.println("Saya berusia " + age + " tahun.");
    }

    public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static String fullName(String firstName, String middleName, String lastName) {
        return firstName + " " + middleName + " " + lastName;
    }
}
