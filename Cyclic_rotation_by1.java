//cyclic rotation of an 1-d arrray by 1
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
	      System.out.println("working on reversing the processing\n");
	      int x=a[a.length-1],temp;
	      
        for(int i=a.length-1;i>0;i--){
           
            a[i]=a[i-1];
          
        }
        a[0]=x;
	    System.out.println("rotated array is array is:\n");
	    	
	     for(int i=0;i<n;i++){
		System.out.println(a[i]+" ");
	     }
	}
}
