package D2;
import java.util.Scanner;

public class SimpleDecompress {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception{
        int n = sc.nextInt();//문자의갯수
        String input[][] = new String[n][2];//각 문자의 반복갯수
        int num[] = new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                input[i][j] = sc.next();
            }
        }
        for(int i=0;i<n;i++){//각 문자의 반복갯수를 String로 받았기 때문에 int로 변환
            num[i]= Integer.parseInt(input[i][1]);
        }

        int cnt =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<num[i];j++){
                cnt++;
                System.out.print(input[i][0]);
                if(cnt==10){
                    System.out.println();
                    cnt=0;
                }
            }

        }
    }
}
