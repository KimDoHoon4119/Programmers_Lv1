class Solution {
    public int solution(int[] nums) {
        boolean[] arr = new boolean[3001];
        arr[0] = arr[1] = true;
        
        for(int i = 2; i * i <= 3000; i++){
            if(!arr[i]){
                for(int j = i * i; j <= 3000; j += i){
                    arr[j] = true;
                }
            }
        }
        
        int count = 0;
        int size = nums.length;
        
        for(int i = 0; i < size - 2; i++){
            for(int j = i + 1; j < size - 1; j++){
                for(int k = j + 1; k < size; k++){
                    if(!arr[nums[i] + nums[j] + nums[k]]) count++;
                }
            }
        }
        return count;
    }
}