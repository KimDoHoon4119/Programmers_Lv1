class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] temp1 = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String[] temp2 = {"0","1","2","3","4","5","6","7","8","9"};
		
		for (int i = 0; i < temp1.length; i++) {
			if(s.contains(temp1[i])) {
				s = s.replaceAll(temp1[i], temp2[i]);
			}
		}
		answer = Integer.parseInt(s);
        return answer;
    }
}