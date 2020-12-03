package D2;
import java.util.Scanner;

public class pascal {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception{
        int n = sc.nextInt();
        int [][]pascal = new int[20][20];
        int i,j;
        pascal[1][1]=1;//초기값
        if(n>1){
            for(i=2;i<=n;i++){
                for(j=1;j<=i;j++){
                    pascal[i][j]= pascal[i-1][j-1]+pascal[i-1][j];//위왼+위위         
                }
            }
        }

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
               if(pascal[i][j]!=0){
                        System.out.print(pascal[i][j]+" ");
                }
            }
        System.out.println();
        }
    }
}
