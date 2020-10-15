import java.util.Scanner;

public class Tugas5 {
    public static void main(String[] args) {
        Scanner baper = new Scanner(System.in);
        System.out.println("INPUT DIAMETER DAN TINGGI TABUNG");
        double D = baper.nextDouble();
        double T = baper.nextDouble();
        
        double R = D/2;
        double  V = Math.PI * R * R * T;

        System.out.printf("Volume Tabung : " + "%.2f", V );
        System.out.print(" Ml");
    
    }
}
