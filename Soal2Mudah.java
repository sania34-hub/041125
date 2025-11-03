import java.util.Scanner;

public class Soal2Mudah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Bilangan");
        int bilangan = input.nextInt();

        if (bilangan % 2 == 0){
            System.out.println( "adalah bilangan genap");
        } else {
            System.out.println("adalah bilangan ganjil");
        }

    }
}
