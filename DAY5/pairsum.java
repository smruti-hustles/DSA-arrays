import java.util.Scanner;
public class pairsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
           
            int[] a=new int[5];
            int t;
            System.out.println("enetr array elements:\n");
            for(int i=0;i<5;i++){
                a[i]=sc.nextInt();
            }
            
             System.out.println("ARRAY ELEMENTS ARE\n");
                for(int i=0;i<5;i++){
              System.out.println(a[i]);  
            }
            
             System.out.println("ENTER SUM:");
             int x=sc.nextInt();
             int count=0;
             System.out.println("sorting:\n");
                for(int i=0;i<5;i++){
                        for(int j=i+1;j<5;j++){
                         if((a[i]+a[j])==x){
                             count+=1;
                            }
                        }
                    
                }
             System.out.println("no of such pairs which give the sum are :"+count);
        
        }
}
