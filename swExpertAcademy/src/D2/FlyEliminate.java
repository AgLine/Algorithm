package D2;
import java.util.Scanner;

public class FlyEliminate {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception{
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
            
        int max=0;
            
        for(int a=0;a<n;a++){
            for(int b=0;b<n;b++){
                int sum=0;
                for(int c=0;c<m;c++){
                    for(int d=0;d<m;d++){
                        if(a+c>=n||b+d>=n){
                            continue;                            
                        }
                        sum+=arr[a+c][b+d];
                    }                    	
                }
                max = Math.max(max,sum);
            }
        }
        System.out.println(max);
    }
}