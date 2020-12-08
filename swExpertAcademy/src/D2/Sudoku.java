package D2;
import java.util.Scanner;
import java.util.Arrays;

public class Sudoku {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception{
    int i,k;
        int a[][] = new int [9][9];
        
        for(i=0;i<9;i++){
            for(k=0;k<9;k++){
                a[i][k]=sc.nextInt();
            }
        }
        int cnt = check(a);
        System.out.println(cnt);
    }
    
    public static int check(int a[][]){
        int i,k;

        int one[] = new int [9];//1~9까지의 숫자가 한번씩 나왔는지 확인하기 위함

        for(i=0;i<9;i++){//가로
            for(k=0;k<9;k++){
                if(one[a[i][k]-1]==1){
                    return 0;//중복 된 숫자인 경우
                }
                one[a[i][k]-1] = 1;
            }
            Arrays.fill(one, 0);//확인 후 다시 0으로 초기화시켜줌
        }

        for(i=0;i<9;i++){//세로
            for(k=0;k<9;k++){
                if(one[a[k][i]-1]==1){
                    return 0;
                }
                one[a[k][i]-1] = 1;
            }
            Arrays.fill(one, 0);
        }


        //작은 사각형들
        for(i=0;i<=2;i++){
            for(k=0;k<=2;k++){
                if(one[a[i][k]-1]==1){
                    return 0;
                }
                one[a[i][k]-1] = 1;
            }
        }
        Arrays.fill(one, 0);

        for(i=0;i<=2;i++){
            for(k=3;k<=5;k++){
                if(one[a[i][k]-1]==1){
                    return 0;
                }
                one[a[i][k]-1] = 1;
            }
        }
        Arrays.fill(one, 0);

        for(i=0;i<=2;i++){
            for(k=6;k<=8;k++){
                if(one[a[i][k]-1]==1){
                    return 0;                
                }
                one[a[i][k]-1] = 1;
            }
        }
        Arrays.fill(one, 0);

        for(i=3;i<=5;i++){
            for(k=0;k<=2;k++){
                if(one[a[i][k]-1]==1){
                    return 0;
                }
                one[a[i][k]-1] = 1;
            }
        }
        Arrays.fill(one, 0);

        for(i=3;i<=5;i++){
            for(k=3;k<=5;k++){
                if(one[a[i][k]-1]==1){
                    return 0;
                }
                one[a[i][k]-1] = 1;
            }
        }
        Arrays.fill(one, 0);

        for(i=3;i<=5;i++){
            for(k=6;k<=8;k++){
                if(one[a[i][k]-1]==1){
                    return 0;                
                }
                one[a[i][k]-1] = 1;
            }
        }
        Arrays.fill(one, 0);

        for(i=6;i<=8;i++){
            for(k=0;k<=2;k++){
                if(one[a[i][k]-1]==1){
                    return 0;
                }
                one[a[i][k]-1] = 1;
            }
        }
        Arrays.fill(one, 0);

        for(i=6;i<=8;i++){
            for(k=3;k<=5;k++){
                if(one[a[i][k]-1]==1){
                    return 0;
                }
                one[a[i][k]-1] = 1;
            }
        }
        Arrays.fill(one, 0);

        for(i=6;i<=8;i++){
            for(k=6;k<=8;k++){
                if(one[a[i][k]-1]==1){
                    return 0;                
                }
                one[a[i][k]-1] = 1;
            }
        }
        Arrays.fill(one, 0);

        return 1;
    }

}
