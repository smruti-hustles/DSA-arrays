//max and min elements in an 1-d array
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    System.out.println("enter array elements:\n");
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }
	    int max=a[0];
	    int min=a[n-1];
	     for(int i=0;i<n;i++){
	       if(a[i]>max)
	       max=a[i];
	       else if(a[i]<min)
	       min=a[i];
	    }
		System.out.println("Max="+max);
		System.out.println("Min="+min);
	}
}

