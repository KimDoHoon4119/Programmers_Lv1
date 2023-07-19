class Solution {
    public String solution(String s) {
        String answer = "";
        int center = s.length()/2;
		
		if (s.length()%2==1) {
			answer += s.charAt(center);
		} else {
			answer += s.charAt(center-1);
			answer += s.charAt(center);
		}
        return answer;
    }
}