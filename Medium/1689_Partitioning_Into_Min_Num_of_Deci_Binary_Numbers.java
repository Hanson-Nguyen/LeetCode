class Solution {
    public int minPartitions(String n) {
        int result = 0;
        
        for (char i : n.toCharArray()) {
            result = Math.max(i - '0', result);
            
            if (result == 9) {
                return 9;
            }
        }
        return result;
    }
}