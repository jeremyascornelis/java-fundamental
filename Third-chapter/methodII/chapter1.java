class chapter1 {
    public static void main(String[] args) {
        //Tetapkan hasil method fullName ke variable name
        String name = fullName("Jeremyas", "Cornelis");

        printData(name, 27);

        //Biarkan argument ini sebagaimana adanya
        printData("Kevin Setiadi Seng", 19);
    }

    public static void printData(String name, int age) {
        System.out.println("Nama saya adalah " + name + ".");
        System.out.println("Saya berusia " + age + " tahun.");
    }

    //Definisikan method fullName
    public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}