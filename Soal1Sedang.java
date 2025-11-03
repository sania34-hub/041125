import java.util.Scanner;

public class Soal1Sedang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          System.out.print("Masukkan bilangan bulat positif: ");
        int n = input.nextInt();
        int faktorial = 1;

         for (int i = 1; i <=n; i++) {
            faktorial = faktorial * i;
            
        }
        System.out.println("Faktorial: "+faktorial);
        }

    }