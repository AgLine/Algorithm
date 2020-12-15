package D2;
import java.util.Scanner;

public class Insomnia {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception{
        int n = sc.nextInt();
        int input=n;
        boolean arr[] = new boolean[10];
        int cnt=0;
        int a;

        while(true){
            String nstr = Integer.toString(n);
            String []str = nstr.split("");
            for(int i=0;i<str.length;i++){
                a = Integer.parseInt(str[i]);
                if(arr[a]==false){
                    arr[a]=true;
                    cnt++;
                }
            }
            if(cnt==10){
                System.out.println(n);
                break;
            }
            n+=input;
            //n+=n으로 하면 11 22 44 로 늘어남
        }

    }
}
