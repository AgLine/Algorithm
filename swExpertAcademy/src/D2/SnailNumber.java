package D2;
import java.util.Scanner;

public class SnailNumber {
    /*
    https://m.blog.naver.com/zzang9ha/221744958154 
    
    달팽이문제는 전혀 모르겠어서 위에 블로그에서 코드를 보고 품

    */
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int N = sc.nextInt();
        int arr[][] = new int[N][N];
        int col = 0;	// 행
        int row = -1;	// 열
        int flag = 1;	// 위치 조정(1, -1) >> 양수->↓ 음수<-↑
        int number = 1;	// 값 넣기
        int count = N;	// 각 열당 숫자가 N, N-1, N-1, N-2, N-2, ... 로 감소
        while(true) {
            
            // -> , <- 방향
            for(int i=0; i<N; i++) {
                row += flag;	// 열 증가
                arr[col][row] = number;
                number += 1;	// 숫자 1씩 증가
            }
            
            // ->, <-이 끝난 후 개수가 하나씩 감소
            N -= 1;
            if(N == 0)	break;	// 달팽이 알고리즘의 종료 조건
            
            // ↓ , ↑ 방향
            for(int i=0; i<N; i++) {
                col += flag;
                arr[col][row] = number;
                number +=1;
            }
            flag *= (-1);	// -> , ↓ 이 끝난 후에는 열, 행이 감소해야 함 
        }
        /*
        4 33 22 11

        01 02 03     col=0 row=3 n=4 flag=1    
        13 23 33     col=3 row=3 n=3 flag=1
        flag= -1 n=3
        32 31 30     co1=3 row=0 n=3 flag=-1
        20 10        col=1 row=0 n=2 flag=-1
        flag=1 n=2
        11 12        col=1 row=2 n=2 flag=1
        22           col=2 row=2 n=1 flag=1
        flag=-1 n=1
        21


        */
        for(int i=0; i<count; i++) {
            for(int j=0; j<count; j++) {
                System.out.print("\t"+arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}

