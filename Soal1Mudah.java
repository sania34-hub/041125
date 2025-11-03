import java.util.Scanner;

public class Soal1Mudah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Berat Paket (kg): ");
        double berat = input.nextDouble();
        System.out.println("Masukkan Jarak Tempuh (km): ");
        double jarak = input.nextDouble();
        System.out.println("Masukkan Panjang Paket (cm): ");
        double panjang = input.nextDouble();
        System.out.println("Masukkan Lebar Paket (cm): ");
        double lebar = input.nextDouble();
        System.out.println("Masukkan Tinggi Paket (cm): ");
        double tinggi = input.nextDouble();

        double Volume = panjang*lebar*tinggi;

        double biayaPerKg;
        if (jarak <= 10 ) {
            biayaPerKg =  4250;
        } else {
            biayaPerKg = 6000;
        }
        double biayaBerat = berat * biayaPerKg;
        
        double biayaVolume = 0;
        if (Volume > 100);{
            biayaVolume = 50000;
        }
        double total = biayaBerat + biayaVolume;

         System.out.println("RINCIAN BIAYA PENGIRIMAN");
        System.out.println("Berat paket : " + berat + " kg");
        System.out.println("Jarak tempuh : " + jarak + " km");
        System.out.println("Volume paket : " + Volume + " cm³");
        System.out.println("Total biaya pengiriman : Rp " +total);;}
    }