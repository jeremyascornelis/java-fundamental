public class proyekakhir {
    public static void main(String[] args) {
        //Tetapkan daftar bilangan ke variable numbers 
        int[] numbers = {1,4,6,9,13,16};

        int oddSum = 0;
        int evenSum = 0;

        //Kalkulasikan jumlah bilangan ganjil dan jumlah bilangan genap
        for(int number:numbers) {
            if(number % 2 == 1) {
                oddSum += number;
            } else {
                evenSum += number;
            }
        }

        System.out.println("Jumlah bilangan ganjil: " + oddSum);
        System.out.println("Jumlah bilangan genap: " + evenSum);
    }
}
