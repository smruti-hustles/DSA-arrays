import java.util.Scanner;
import java.util.Arrays;
public class sortusingmethod 
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        System.out.println("enetr array elements:\n");
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        
         System.out.println(" BEFORE sorting:\n");
        	for(int i=0;i<5;i++){
          System.out.println(a[i]);  
        }
         System.out.println("sorting:\n");
         Arrays.sort(a);
         System.out.println("After sorting:\n");
	
	for(int i=0;i<5;i++){
          System.out.println(a[i]);  
        }
	}
}

