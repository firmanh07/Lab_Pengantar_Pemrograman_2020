import java.util.Scanner;
public class Nomor2 {
    public static void main(String[] args) {
        Scanner kangen = new Scanner(System.in);
    try{    int a = kangen.nextInt();
        int b = kangen.nextInt();
        int c = kangen.nextInt();
        int sum = 0;

        int [][] matrix1=new int[a][b];
        for(int i = 0 ; i < a;i++){
            for(int j = 0; j<b;j++){
                matrix1[i][j] = kangen.nextInt();
            }
        }
        int [][] matrix2=new int[b][c];
        for(int i = 0 ; i < b;i++){
            for(int j = 0; j<c;j++){
                matrix2[i][j] = kangen.nextInt();
            }
        }

      System.out.println("hasil");
        for(int i = 0 ; i < a;i++){
            for(int j = 0; j<c;j++){
                for(int k = 0;k<b;k++){
                    sum = sum + matrix1[i][k]*matrix2[k][j];
                }
             
                System.out.print(sum+" ");
                if(sum<10){
                    System.out.print(" ");
                }
                sum = 0;
            }System.out.println();
           
        }
    }
        catch (Exception e){
            System.out.println("input tidak valid");
        }
        










    }
    
}
