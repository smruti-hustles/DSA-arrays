//printing all subarrays of a given array
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    	   
	    	System.out.println("enter array size:");
	    int n=s.nextInt();
	    	System.out.println("enter arrray elements:\n");
	    int a[]=new int[n];
	    for(int i=0;i<n;i++){
	        a[i]=s.nextInt();
	    }
	    System.out.println("array is:\n");
	     for(int i=0;i<n;i++){
		System.out.println(a[i]+" ");
	     }
	      System.out.println("working on  the processing\n");
	     
	      
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(a[k]+"\t");  
                }
                System.out.println();
            }
        }
          
       
	}
}

