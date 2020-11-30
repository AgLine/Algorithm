package D2;
import java.util.Scanner;

public class Simple369 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int N;
        N=sc.nextInt();
        
        for(int i=1;i<=N;i++){
       		String str= Integer.toString(i);
            String reg = "[0-9]"; //정규표현식
            
            if(str.contains("3")||str.contains("6")||str.contains("9")){
                str = str.replaceAll("3", "-");
                str = str.replaceAll("6", "-");
                str = str.replaceAll("9", "-");
                str = str.replaceAll(reg, "");
            }
            System.out.print(str+" ");
        }
    }
}
