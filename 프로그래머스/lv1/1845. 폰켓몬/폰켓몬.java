import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if(!list.contains(nums[i]))
				list.add(nums[i]);
		}
		
		int N = nums.length/2;
		answer = N >= list.size()? list.size():N;
        return answer;
    }
}