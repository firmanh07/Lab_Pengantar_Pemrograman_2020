import java.util.Scanner;
public class Nomor44 {
    public static void main(String[] args) {
        Scanner rindu = new Scanner(System.in);
        System.out.println("input harga barang dan jumlah uang yang dibayarkan");
        int harga = rindu.nextInt();
        int bayar = rindu.nextInt();
        int sisa = bayar - harga;
        boolean x = true;
        int jumlah;
        int serabu=0;
        int limpu=0;
        int duapu=0;
        int sepu=0;
        int libu=0;
        int duabu=0;
        int sebu=0;
        int lirus=0;
        while(x){
            if(sisa>=100000){
                jumlah = sisa/100000;
                sisa = sisa%100000;
                serabu+=jumlah;
            }else if(sisa>=50000){
                jumlah = sisa/50000;
                sisa = sisa%50000;
                limpu+=jumlah;
            }else if(sisa>=20000){
                jumlah = sisa/20000;
                sisa = sisa%20000;
                duapu+=jumlah;
            }else if(sisa>=10000){
                jumlah = sisa/10000;
                sisa = sisa%10000;
                sepu+=jumlah;
            }else if(sisa>=5000){
                jumlah = sisa/5000;
                sisa = sisa%5000;
                libu+=jumlah;
            }else if(sisa>=2000){
                jumlah = sisa/2000;
                sisa = sisa%2000;
                duabu+=jumlah;
            }else if(sisa>=1000){
                jumlah = sisa/1000;
                sisa = sisa%1000;
                sebu+=jumlah;
            }else if(sisa>=500){
                jumlah = sisa/500;
                sisa = sisa%500;
                lirus+=jumlah;
            }if (sisa==0){
                x = false;
            
        }
           
    } 
    System.out.println("******kembalian******");
    System.out.println(serabu + " uang Rp 100.000");
    System.out.println(limpu+ " uang Rp 50.000");
    System.out.println(duapu + " uang Rp 20.000");
    System.out.println(sepu + " uang Rp 10.000");
    System.out.println(libu + " uang Rp 5.000");
    System.out.println(duabu + " uang Rp 2.000");
    System.out.println(sebu + " uang Rp 1.000");
    System.out.println(lirus + " uang Rp 500");
}  
}
