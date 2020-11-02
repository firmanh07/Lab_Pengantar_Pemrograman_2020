import java.util.Scanner;
public class Nomor1 {
    public static void main(String[] args) {
        Scanner gombal = new Scanner(System.in);
        System.out.println("input x dan y ");
        int x = gombal.nextInt();
        int y = gombal.nextInt();

        for (int i = x; i <= y; i++){
            if (i % 2 == 0 && i>0){
                System.out.println(i + " genap positif");
            }else if (i % 2 == 0 && i<0 ){
                System.out.println(i + " genap negatif");
            }else if (i % 2 != 0 && i<0 ){
                System.out.println(i + " ganjil negatif");
            }else if (i % 2 != 0 && i>0){
                System.out.println(i + " ganjil positif");
            }else{ System.out.println(i + " nol");}

        }
        for (int i = y; i <= x; i++){
            if (i % 2 == 0 && i>0){
                System.out.println(i + " genap positif");
            }else if (i % 2 == 0 && i<0 ){
                System.out.println(i + " genap negatif");
            }else if (i % 2 != 0 && i<0 ){
                System.out.println(i + " ganjil negatif");
            }else if (i % 2 != 0 && i>0){
                System.out.println(i + " ganjil positif");
            }else{ System.out.println(i + " nol");}
        }    
    }
}

