//max and min elements in an 1-d array
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int m=sc.nextInt();
	    int a[][]=new int[n][m];
	    System.out.println("enter array elements:\n");
	    for(int i=0;i<n;i++){
	        for(int j=0;j<m;j++){
	        a[i][j]=sc.nextInt();
	        }
	    }
	    int max=a[0][0];
	    int min=a[n-1][m-1];
	     for(int i=0;i<n;i++){
	          for(int j=0;j<m;j++){
	       if(a[i][j]>max)
	       max=a[i][j];
	       else if(a[i][j]<min)
	       min=a[i][j];
	       }
	     }
		System.out.println("Max="+max);
		System.out.println("Min="+min);
	}
}
