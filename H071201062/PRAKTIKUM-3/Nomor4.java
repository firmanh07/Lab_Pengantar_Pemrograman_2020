import java.util.Scanner;
public class Nomor4 {
  public static void main(String[] args) {
      Scanner rindu = new Scanner(System.in);
      System.out.println("input harga barang dan jumlah uang yang dibayarkan");
      int harga = rindu.nextInt();
      int bayar = rindu.nextInt();
      int sisa = bayar - harga;
      int uang[] = {100000,50000,20000,10000,5000,2000,1000,500};
      for(int i = 0 ; i <=7 ; i++){
          int jumlah = (sisa)/uang[i];
        sisa = sisa%uang[i];
        System.out.printf(jumlah + " uang Rp %d\n",uang[i]);
      }
  }  
}
