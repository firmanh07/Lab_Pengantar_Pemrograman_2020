import java.util.Scanner;
public class Nomor5 {
    public static void main(String[] args) {
        Scanner rindu = new Scanner(System.in);
     
        boolean x = true;

        
           while(x){
              System.out.println("input derajat");
              float d = rindu.nextFloat();
            if(d>=0 && d<=360){
              float detik1 = d*240;
              int jam = (int)detik1/3600;
              int sisa = (int)detik1%3600;
              int menit = sisa/60;
              int detik = sisa%60;

             int jam1 = 6 + jam;
             if(jam1==25){jam1=1;}
             if(jam1==26){jam1=2;}
             if(jam1==27){jam1=3;}
             if(jam1==28){jam1=4;}
             if(jam1==29){jam1=5;}
             if(jam1==30){jam1=6;}
            if(jam1>=6 && jam1<=10){
                System.out.println("selamat pagi :)");
             System.out.printf("%02d : %02d : %02d",jam1,menit,detik);
            }else if(jam1>=10 && jam1<=14){
                System.out.println("selamat siang :)");
             System.out.printf("%02d : %02d : %02d",jam1,menit,detik);
            }else if(jam1>=14 && jam1<=18){
                System.out.println("selamat sore :)");
             System.out.printf("%02d : %02d : %02d",jam1,menit,detik);
            }else{ System.out.println("selamat malam :)");
                 System.out.printf("%02d : %02d : %02d",jam1,menit,detik);
                
            }System.out.println();
     
            System.out.println("***apakah anda masih ingin mencoba?(No/Yes)***");
                String coba = rindu.next();
                if (coba.equalsIgnoreCase("No")){
                    System.out.println("end of program");
                    x = false;
                }else if (coba.equalsIgnoreCase("Yes")){
                    x = true;
                }else{System.out.println("input tidak valid");
                return;
                }

        
        
            }else{System.out.println("input tidak boleh lebih dari 360 derajat dan tak urang dari 0 derajat");}

            }

    }
}
