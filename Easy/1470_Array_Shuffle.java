class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] result = new int[nums.length];
        
        int temp = 0;
        int current = 0;
        
        while (current < nums.length) {
            result [current++] = nums[temp++];
            result [current++] = nums[n++];
        }
        
        return result;
        
    }
}