package DAY1;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        System.out.println("enetr array elements:\n");
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
         System.out.println("enetr which element u want to search:");
         int x=sc.nextInt();
        for(int i=0;i<5;i++){
           if(x==a[i])
           System.out.println("element is at index="+i);
          
        }
        
    }
}
