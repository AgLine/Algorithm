package D2;
import java.util.Scanner;

public class Word {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception{
        int i,k;
        int n,m;
        int cnt=0;
        
        n=sc.nextInt();
        int a[][] =  new int[n+2][n+2];//끝부분을 0으로 패딩해줌
        m=sc.nextInt();         
        String target="";
        for(i=0;i<m;i++){
            target+="1";
        }
        
        for(i=1;i<=n;i++){
            for(k=1;k<=n;k++){
                a[i][k] = sc.nextInt();
            }
        }
        
        
        String sumString[][]=new String[2][n+2];
        
        for(i=0;i<2;i++){
            for(k=0;k<n+2;k++){
                sumString[i][k]="";
            }
        }

        for(i=0;i<n+2;i++){ //문자열가로합
            for(k=0;k<n+2;k++){
                sumString[0][i]+=a[i][k];
            }
        }
    
        for(i=0;i<n+2;i++){ //문자열세로합
            for(k=0;k<n+2;k++){
                sumString[1][k]+=a[i][k];
            }
        }
        
        for(i=0;i<2;i++){
            for(k=0;k<n+2;k++){
                for(int j=0;j<n+2;j++){
                    if(j+m+1>=n+2){//배열범위를 넘어감
                        break;
                        }                   
                        if((sumString[i][k].substring(j,j+m+2)).equals("0"+target+"0")){
                            cnt++;
                        }
                }
            }
        }
        System.out.println(cnt);
            
		
    }
}
