import java.util.Scanner;

public class Tugas3 {

   public static void main(String[] args) {
       Scanner cinta = new Scanner(System.in);
       System.out.println("##INPUT KETINGGIAN,SUDUT ELEVASI BELAKANG KAPAL,DAN SUDUT ELEVASI DEPAN KAPAL##");
       double H = cinta.nextDouble();
       double A = cinta.nextDouble();
       double B = cinta.nextDouble();

       

       double Y = Math.tan(Math.toRadians(B))*H;
       double PanjangKapal =( Math.tan(Math.toRadians(A))*(double)H )- Y;
       System.out.printf("PanjangKapal : "+"%.1f",PanjangKapal);
       System.out.print(" M");


   }



    }

