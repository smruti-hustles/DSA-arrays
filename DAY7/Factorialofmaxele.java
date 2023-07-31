import java.util.*;
public class Factorialofmaxele {
    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	   
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }
	      int max=0;
	        for(int i=0;i<a.length;i++){
	            if(a[i]>max)
	            max=a[i];
	        }
              int fact=1;
              for(int p=1;p<=max;p++){
                  fact*=p;
                  }
	           System.out.println("factrial of maximum element in an array");
	           System.out.println(fact);
	           
}
}
