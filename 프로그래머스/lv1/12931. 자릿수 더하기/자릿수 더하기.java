import java.util.*;

public class Solution {
    public int solution(int n) {
        String N = Integer.toString(n); // 문자열 123
		int answer = 0;
		
		for (int i = 0; i < N.length(); i++) {
			answer += N.charAt(i) - '0';
			
		}

        
        

        return answer;
    }
}