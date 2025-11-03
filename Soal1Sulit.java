import java.util.Scanner;

public class Soal1Sulit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Siswa: ");
        int jumlahSis = input.nextInt();
        int awal = 1;
        int nilai,temp=0;

        while(awal<=jumlahSis){
            System.out.print("Nilai Siswa " + awal);
            nilai = input.nextInt();
            temp += nilai;
            awal++;
        }

        double rata=temp/jumlahSis;
        System.out.print("Rerata Kelas dengan jumlah siswa "+jumlahSis+" adalah "+rata);
    }
}