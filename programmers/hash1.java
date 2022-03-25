import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        int temp;
        
        Map<String,Integer> prati = new HashMap();
        
        for(String i : participant){// 참가자 정보를 HashMap에 넣음
            if(prati.containsKey(i)){
                temp = prati.get(i);
                prati.put(i, ++temp);
            }else{
                prati.put(i, 1);
            }
        }
        
        
        for(String i : completion){// 완주자의 경우 value 값을 -1
            temp = prati.get(i);
            prati.put(i, --temp);
        }

        for(String i : participant){
            if(prati.get(i) > 0){
                answer = i;
            }
        }
        return answer;
    }
}