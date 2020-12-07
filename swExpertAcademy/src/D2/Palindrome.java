package D2;
import java.util.Scanner;

public class Palindrome {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception{
        String str = sc.next();
           
        int helf = str.length()/2;//문자열을 반으로 나누기 위함
        String introStr = str.substring(0,helf);//앞부분 문자열
        String outroStr = str.substring(str.length()-helf,str.length());//뒷부분 문자열
        String reverseStr = reverseString(outroStr);
        
        if(introStr.equals(reverseStr)){//앞부분과 거꾸로저장한뒷부분 문자열 비교
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }

    private static String reverseString(String outroStr) {//뒷부분의 문자열을 거꾸로 만듬
        return (new StringBuffer(outroStr)).reverse().toString();
    }
}
