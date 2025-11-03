import java.util.Scanner;

public class Soal2Sedang {

    static double volumeTabung(double r, double t) {
        return 22/7 * r * r * t;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari tabung: ");
        double r = input.nextDouble();

        System.out.print("Masukkan tinggi tabung: ");
        double t = input.nextDouble();

        double v = volumeTabung(r, t);
        System.out.println("Volume tabung = " + v);
    }
}
