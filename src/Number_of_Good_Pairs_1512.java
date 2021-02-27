class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        int pairs = 0;
        
        if (nums.length == 0 || nums.length == 1) {
            return pairs;
        }
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    pairs++;
                }
            }
        }
        
        return pairs;
    }
}