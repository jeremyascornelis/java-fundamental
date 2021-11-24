public class Main {
    public static void main(String[] args) {
        //Panggil method printData dan fullName dari class Person
        Person.printData(Person.fullName("Kate", "Jones"), 27, 1.6, 50.0);
        Person.printData(Person.fullName("John", "Christopher", "Smith"), 65, 1.75, 80.0);
    }
}
