//rotating the array by 2 places
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
	      int x=a[0], y=a[1];
	      
        for(int i=0;i<a.length-1;i++){
           
            a[i]=a[i+1];
          
        }
        a[a.length-1]=x;
        for(int i=0;i<a.length-1;i++){
           
            a[i]=a[i+1];
          
        }
        a[a.length-1]=y;
        
	    System.out.println("rotated array is array is:\n");
	    	
	     for(int i=0;i<n;i++){
		System.out.println(a[i]+" ");
	     }
	}
}
