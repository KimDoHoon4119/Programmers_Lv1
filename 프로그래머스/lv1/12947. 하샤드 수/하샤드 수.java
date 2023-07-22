class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int sum = 0;
		String temp = Integer.toString(x);
		
		for (int i = 0; i < temp.length(); i++) {
			sum += temp.charAt(i)-'0';
		}
		
		if (x%sum ==0) {
			answer = true;
		}
        return answer;
    }
}