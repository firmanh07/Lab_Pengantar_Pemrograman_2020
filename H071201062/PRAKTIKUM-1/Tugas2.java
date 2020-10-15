import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
       Scanner x = new Scanner(System.in);
     System.out.println("==INPUT TOTAL DETIK==");
       int TotalDetik= x.nextInt();
      int Jam = TotalDetik/3600;
      int Sisa = TotalDetik%3600;
      int Menit = Sisa/60;
      int Detik = Sisa%60; 
      System.out.printf("Jam:Menit:Detik = "+ "%02d : %02d : %02d",Jam,Menit,Detik);
    }
    
}
