import java.util.Scanner;


public class Nomor1{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int r;
        int [] data = new int[n];
        for(int i = 0 ; i<n;i++){
            data[i] = read.nextInt();   
        }
        
           for(int j = 0;j<n-1;j++) {
               for(int k = j+1;k<n;k++){ 
                   int a1 = data[j];
                   int a2 = data[k];
                    r = a1%a2;
                    while(r!=0){
                        a1 = a2;
                        a2 = r;
                        r = a1%a2;
                    } 
                    if(a2==1){
                        System.out.println(data[j]+" "+data[k]);
                    }
            
               }
            }
        
      
    }
}