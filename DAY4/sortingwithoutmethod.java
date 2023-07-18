import java.util.Scanner;
public class sortingwithoutmethod 
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        int t;
        System.out.println("enetr array elements:\n");
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        
         System.out.println(" BEFORE sorting:\n");
        	for(int i=0;i<5;i++){
          System.out.println(a[i]);  
        }
         System.out.println("sorting:\n");
        	for(int i=0;i<5;i++){
        	    	for(int j=i+1;j<5;j++){
        	    	 if(a[i]>a[j]){
        	    	      t=a[i];
        	    	      a[i]=a[j];
        	    	      a[j]=t;
        	    	    }
        	    	}
        	    	System.out.println(a[i]);  
        	}
         System.out.println("After sorting:\n");
	

	}
}


