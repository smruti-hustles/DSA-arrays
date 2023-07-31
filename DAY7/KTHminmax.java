import java.util.*;
public class KTHminmax {
    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	   
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }
	    
	    Arrays.sort(a);
	  
	      System.out.print("Enter which min element you want = ");  
	      int x=sc.nextInt();

	      System.out.println(a[x-1]);  
	      //reversing the Arrays
	      int p=0;
	      int q=a.length-1;
	      int t;
	      while(p<q){
	          t=a[p];
	          a[p]=a[q];
	          a[q]=t;
	          p++;
	          q--;
	      }
	      System.out.print("Enter which max element you want = ");  
	      int y=sc.nextInt();

	      System.out.println(a[y-1]);  

	}
}
