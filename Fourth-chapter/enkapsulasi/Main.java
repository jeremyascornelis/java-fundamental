public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Murni", "Aminah", 27, 1.6, 50.0);
        person1.printData();
        Person person2 = new Person("Yahya", "Nasrun", "Rizal", 65, 1.75, 80.0);
        person2.printData();

        System.out.println("------------------");
        //Mengatur `middleName` dari `person1` menjadi `Budi`;
        person1.setMiddleName("Siti");

        System.out.println("Telah mengubah nama tengah menjadi " + person1.getMiddleName() + ".");
        person1.printData();
    }
}
