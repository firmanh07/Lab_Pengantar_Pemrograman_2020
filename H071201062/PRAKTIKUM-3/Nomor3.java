import java.util.Scanner;
public class Nomor3 {
    public static void main(String[] args) {
        Scanner kangen = new Scanner(System.in);
        System.out.println("input n");
       try{ 
        long n = kangen.nextLong();
        long a = 0;
        long b = 1;
        long d;
        System.out.print(a+" "+ b+ " ");
        for(int i = 3 ; i <= n ; i++ ){
            d = a + b;
            System.out.print(d+ " ");
            a = b;
            b = d;



        }
       }catch(Exception e){System.out.println("input harus bilanngan bulat");}
     }

}
