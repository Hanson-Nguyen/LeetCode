class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[] results = new int[nums.length];
        
        int count = 0;
        
        for (int i = 0; i < nums.length; i++ ) {
            
            if (nums[i] != 0) {
                for (int j = 0; j < nums.length; j++){
                    if (j == i) {
                    
                    }
                    else if (nums[j] < nums[i]) {
                        count++;
                    }
                }
            }
            
            results[i] = count;
            count = 0;
        }
        
        return results;
    }
}