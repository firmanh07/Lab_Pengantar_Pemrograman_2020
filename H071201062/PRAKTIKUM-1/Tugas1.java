import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("==INPUT WAKTU TEMPUH DALAM JAM (SPASI) KECEPATAN RATA-RATA PERJALANAN DALAM KM/JAM==");
        int T = x.nextInt();
        int V = x.nextInt();
        int S = T*V;
        double L = (double)S/14;
        System.out.printf("BENSIN YANG DIGUNAKAN : " + "%.3f",L);
        System.out.print(" Liter");

    }
    
}
