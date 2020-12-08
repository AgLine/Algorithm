package D2;
import java.util.Scanner;

public class PrimeFactorization {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception{
        int n = sc.nextInt();
        int exp[] = new int[5];
        while(n%11==0){
            n/=11;
            exp[4]++;
        }
        while(n%7==0){
            n/=7;
            exp[3]++;
        }
        while(n%5==0){
            n/=5;
            exp[2]++;
        }
        while(n%3==0){
            n/=3;
            exp[1]++;
        }
        while(n%2==0){
            n/=2;
            exp[0]++;
        }

        for(int i=0;i<5;i++){
            System.out.print("\t"+exp[i]);
        }
    }
}
