import java.util.Scanner;
public class tripplesum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
           
            int[] a=new int[8];
            int t;
            System.out.println("enetr array elements:\n");
            for(int i=0;i<8;i++){
                a[i]=sc.nextInt();
            }
            
             System.out.println("ARRAY ELEMENTS ARE\n");
                for(int i=0;i<8;i++){
              System.out.println(a[i]);  
            }
            
             System.out.println("ENTER SUM:");
             int x=sc.nextInt();
             int count=0;
             System.out.println("sorting:\n");
                for(int i=0;i<8;i++){
                        for(int j=i+1;j<8;j++){
                            for(int k=i+2;k<8;k++){
                         if((a[i]+a[j]+a[k])==x){
                             count+=1;
                            }
                        }
                    }
                }
             System.out.println("no of such pairs which give the sum are :"+count);
        
}
