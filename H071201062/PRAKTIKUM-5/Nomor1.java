import java.util.Scanner;
public class Nomor1 {
    public static void main(String[] args) {
        Scanner bucin = new Scanner(System.in);
        int n = bucin.nextInt();
        int m = bucin.nextInt();
        int fpb = cariFPB(n,m);
        System.out.println("FPB dari "+n+" dan "+m+" = "+fpb);
    }
    public static int cariFPB(int a,int b){
       int r = a%b;
        while(r!=0){
            a = b;
            b = r;
            r = a%b;
        }return b;

    }
}
