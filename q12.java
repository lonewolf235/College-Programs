import java.util.*;
public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]ar=new int[5];
        int p1=0,n1=0,z1=0;
        int[]p=new int[5];
        int[]n=new int[5];
        int[]z=new int[5];
        for(int i=0;i<5;i++){
           ar[i]=sc.nextInt();
           if(ar[i]>0){
            p[p1++]=ar[i];
           }
           else if(ar[i]<0){
            n[n1++]=ar[i];
           }
           else{
            z[z1++]=ar[i];
           }

        }
        System.out.println("Number of positive"+p1);
        System.out.println("Number of negative"+n1);
        System.out.println("Number of zero"+z1);
    }
}
