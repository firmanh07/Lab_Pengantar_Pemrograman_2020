import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        
     
        Scanner hm = new Scanner(System.in); 
      System.out.println("input 5 angka yang ingin di cek");
      try{
        int a = hm.nextInt();
       int b = hm.nextInt();
       int c = hm.nextInt();
       int d = hm.nextInt();
       int e = hm.nextInt();
       int w = 0;
       int x = 0;
       int y = 0;
       int z = 0;
    if (a%2==0){ w++;} 
    else {x++;}
    if (a > 0){y++;} 
    else{z++;}
   

    if (b%2==0){ w++;} 
    else {x++;}
    if (b > 0){y++;} 
    else{z++;}

    if (c%2==0){ w++;} 
    else {x++;}
    if (c > 0){y++;} 
    else{z++;}
   
    if (d%2==0){ w++;} 
    else {x++;}
    if (d > 0){y++;} 
    else{z++;}
   
    if (e%2==0){ w++;} 
    else {x++;}
    if (e > 0){y++;} 
    else{z++;}
   


System.out.println("jumlah bilangan genap: " + w);
System.out.println("jumlah bilangan ganjil: " + x);
System.out.println("jumlah bilangan positif: " + y);
System.out.println("jumlah bilangan negatif: " + z);

}catch(Exception e){System.out.println("input tidak valid");}










    }
}
