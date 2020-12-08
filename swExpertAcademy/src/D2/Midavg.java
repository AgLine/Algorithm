package D2;
import java.util.Scanner;
import java.util.Arrays;

public class Midavg {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception{
        int a[] = new int [10];
        int sum=0;
        int avg=0;
        
        for(int i=0;i<10;i++){
            a[i]= sc.nextInt();
        }
        Arrays.sort(a);
        
        for(int i=1;i<9;i++){
            sum+=a[i];
        }
        avg = (int)Math.round(sum/8.0);
        System.out.println(avg);
    }
}
