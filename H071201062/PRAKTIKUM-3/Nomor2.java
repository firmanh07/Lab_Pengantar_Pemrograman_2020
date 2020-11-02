import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner keren = new Scanner(System.in);    
        System.out.println("input nilai x dan y, dimana x < y ");
       try{
        int x = keren.nextInt();
        int y = keren.nextInt();
       
        if (x<y){ int j = 2;
        int r = x;
        for(int i = 1 ; i <= y ; i++){
            System.out.print(i + " ");
            if (i == r){
                System.out.println();
                r = j*x ;
                j++;
        }
        }
        }else{System.out.println("x harus lebih kecil dari y");}
        }catch(Exception e){System.out.println("input tidak valid");}


}
}
