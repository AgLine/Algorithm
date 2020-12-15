package D2;
import java.util.Scanner;

public class Water {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception{
       int arr[] = new int[5]; //P,Q,R,S,W
       int a,b;

       for(int i=0;i<5;i++){
           arr[i]=sc.nextInt();
       }
       a = arr[0]*arr[4];
       if(arr[2]>arr[4]){
           b = arr[1];
       }else{
           int tmp = arr[4]-arr[2];
           b = tmp*arr[3]+arr[1];
       }

       if(a>b){
           System.out.println(b);
       }else{
        System.out.println(a);
       }
    }
}
