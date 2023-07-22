import java.util.*;

public class Solution {
    public List solution(int []arr) {
        List<Integer> answer = new ArrayList<>();
		
		int temp = 10;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != temp) {
				answer.add(arr[i]);
				temp = arr[i];
			}
		}

        return answer;
    }
}