package D2;
import java.util.Scanner;

public class Timeaddition {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception{
        int si1,bun1,si2,bun2;
        si1 = sc.nextInt();
        bun1 = sc.nextInt();
        si2 = sc.nextInt();
        bun2 = sc.nextInt();
        
        int sumsi=0, sumbun=0;
        
        sumsi = si1+si2;
        sumbun = bun1+bun2;
        
        if(sumbun>=60){
            sumbun = sumbun-60;
            sumsi++;
        }
        if(sumsi>12){
            sumsi = sumsi-12;
        }
        
        System.out.println(sumsi+" "+sumbun);
    }
}
