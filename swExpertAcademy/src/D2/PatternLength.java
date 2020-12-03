package D2;
import java.util.Scanner;

public class PatternLength {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String str = sc.next();
        for(int i=1; i<30;i++){
            if( str.substring(0,i).equals(str.substring(i+1,i+i+1))){
                System.out.println(i+1);
                break;
            }
        }
    }
    
}
