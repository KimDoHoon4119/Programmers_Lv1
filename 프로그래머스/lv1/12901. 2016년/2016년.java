import java.util.*;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] temp = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		Date date = new Date();
		date.setYear(116);
		date.setMonth(a-1);
		date.setDate(b);
		
        
    
		for (int i = 0; i < temp.length; i++) {
			if(date.getDay() == i) {
				answer = temp[i];
			}
		}
        return answer;
    }
}