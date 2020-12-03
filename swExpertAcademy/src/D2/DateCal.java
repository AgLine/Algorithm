package D2;
import java.util.Scanner;

public class DateCal {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int num[] = new int[4];
        for(int i=0;i<4;i++){
            num[i]=sc.nextInt();
        }
        int tmp;
        int intavel=0;

        int day[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};

        int a = num[2]-num[0];
        int b = num[3]-num[1];

        if(a==0){//같은달인경우
            intavel= b + 1;
        }else if(a==1){//바로 다음달인경우
            intavel+=num[3];
            tmp = day[num[0]]-num[2];
            intavel +=tmp;
        }else{//그외
            for(int i=num[0]+1;i<num[2];i++){
                intavel += day[i];
            }
            intavel+=num[3];
            tmp = day[num[0]]-num[1]+1;
            intavel +=tmp;
        }

        System.out.println(intavel);

    }
}