package D2;
import java.util.Scanner;

public class ZigzagNumber {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception{
        int n = sc.nextInt();
            int a=0, b=0;
            int i;
            for(i=0;i<=n;i+=2){
            	a-=i;
            }
            for(i=1;i<=n;i+=2){
            	b+=i;
            }
            
            System.out.println(a+b);
    }
    
}
