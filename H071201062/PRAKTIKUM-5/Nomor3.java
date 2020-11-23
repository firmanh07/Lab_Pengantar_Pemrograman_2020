import java.util.Scanner;
public class Nomor3 {
    public static void main(String[] args) {
        Scanner bucin = new Scanner(System.in);
        int hari = bucin.nextInt();
        myDay(hari);
       
    }
    public static void myDay(int m){
        int tahun = m/365;
        int sisa = m%365;
        int bulan = sisa/30;
        int hari = sisa%30;
        System.out.println(tahun +" tahun");
        System.out.println(bulan +" bulan");
        System.out.println(hari +" hari");
       } 
}
