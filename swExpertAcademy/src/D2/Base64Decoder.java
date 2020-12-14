package D2;
import java.util.Scanner;
import java.util.Base64;
public class Base64Decoder {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception{
        String encode = sc.next();

        byte[] binary = Base64.getDecoder().decode(encode);//byte형식으로 디코딩

        System.out.println(new String(binary));//byte를 String으로 변환

    }
}
