import java.util.*;
public class Duplicates {
    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	   
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }
	    
	    Arrays.sort(a);
	   System.out.println("duplicate elements are = ");
	    for(int i=0;i<n-1;i++){
	           if(a[i]==a[i+1])
	           System.out.println(a[i]);
	    }
	}
}
