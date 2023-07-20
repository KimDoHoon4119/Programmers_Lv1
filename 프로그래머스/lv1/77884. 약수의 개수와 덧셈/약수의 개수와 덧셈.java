class Solution {
    public int solution(int left, int right) {
        int cnt = 0;
		int sum = 0;
		int asnwer = 0;
		
		while(true) {
			for (int i = 1; i <= left; i++) {
				if(left%i==0) {
					cnt++;
				}
			}
			if (cnt%2==0) {
				sum +=left;
			} else {
				sum -=left;
			}
			
			left++;
			cnt = 0;
			
			if(left > right) {
				
				return sum;
			}
		}
        
    }
}