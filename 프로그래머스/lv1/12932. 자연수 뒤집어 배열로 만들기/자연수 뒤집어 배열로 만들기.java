import java.util.*;
class Solution {
    public List solution(long n) {
        List<Long> answer = new ArrayList<>();
		
		while(true) {
			answer.add(n%10);
			n = n/10;
			if(n == 0) break;
		}
        return answer;
    }
}