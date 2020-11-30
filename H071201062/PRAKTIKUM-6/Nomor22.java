import java.util.Scanner;
public class Nomor22 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        String kalimat = c.nextLine();
        String kalimatBaru="";
        int panjang = kalimat.length();
            String[] kalimat1 = new String [panjang];
            for(int i =0;i<panjang;i++){
                char a = kalimat.charAt(i);
                kalimat1[i] = ""+a;
                if(i%2!=0){
                    int b = Character.codePointAt(kalimat,i);
                    kalimat1[i] = ""+b;
                }
                kalimatBaru = kalimatBaru+kalimat1[i] ;
            }System.out.println(kalimatBaru);
            double x = (double)kalimatBaru.length()/16;
            int y = kalimatBaru.length()/16;
            int bagi = y;
            if(x>y){
            bagi = y+1;
            }
            int beda = bagi*16 - kalimatBaru.length();
            String kalimat3[] = new String[kalimatBaru.length()+beda];
            String kalimatBaru3 = "";
            if(kalimatBaru.length()<bagi*16){
                for(int i = 0;i<kalimat3.length;i++){
                    if(i<kalimatBaru.length()){
                        kalimat3[i] = "" + kalimatBaru.charAt(i);
                    }else{
                        kalimat3[i] = "?";
                    }

                }
            }
                for(int i = 0;i<kalimat3.length;i++){
                    kalimatBaru3 = kalimatBaru3 + kalimat3[i];
                }

            String kalimat2[]= new String [kalimatBaru3.length()];
            String kalimatBaru2 ="";
            for(int i = 0;i<kalimat2.length;i++){
                char d = kalimatBaru3.charAt(i);
                kalimat2[i] = ""+d;
                if(i%bagi==0 && i>0 ){
                    kalimat2[i] ="-"+ kalimatBaru3.charAt(i);
                }
                kalimatBaru2 = kalimatBaru2 + kalimat2[i];
            }
            String [] a = kalimatBaru2.split("-");
           
        String [][] matrix = new String [4][4];
        int n = 0;
        for(int i = 0;i<4;i++){
            for(int j = 0;j<4;j++){
                matrix[i][j] = a[n];
                n++;
            }
        }
        for(int i = 0;i<4;i++){
            for(int j = 0;j<4;j++){
                System.out.printf(matrix[i][j]+ "\t");
            }System.out.println();
        }











        }
    }


