import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        List<Integer> temp = new ArrayList<>();
		int answer = 0;
		
		for (int i = 0; i < moves.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[j][moves[i]-1] != 0) {
					temp.add(board[j][moves[i]-1]);
					board[j][moves[i]-1] = 0;
					break;
				}
				//
			}
			
		}
		
		
		int cnt = 0;
		while (true) {
			for (int i = 0; i < temp.size()-1; i++) {
				if (temp.get(i) == temp.get(i+1)) {
					temp.remove(i);
					temp.remove(i);
					answer += 2;
				}
			}
			cnt++;
			if (cnt == temp.size()*2) {
				return answer;
			}
			
		}
        
    }
}