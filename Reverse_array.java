//Reversing an 1-d array
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
 int p=0,q=a.length-1,temp;
	    while(p<q){
	        temp=a[p];
	        a[p]=a[q];
	        a[q]=temp;
	        p++;
	        q--;
	    }
	    System.out.println("reveresed array is:\n");
	     for(int i=0;i<n;i++){
		System.out.println(a[i]+" ");
	     }
	}
}
