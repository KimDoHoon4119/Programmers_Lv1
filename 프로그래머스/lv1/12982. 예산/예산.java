import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int result = 0; //예산 결과
        Arrays.sort(d); //정렬
    
        //작은 수부터 더하는 것이 가장 최대의 값을 낸다.
        for(int i=0; i<d.length; i++){
            result += d[i];
            if(result > budget){
                answer = i;
                break;
            }
        }
        
        if(result <= budget){
            answer = d.length;
        }
        
        return answer;  
    }
}