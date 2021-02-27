class Solution {
    public int maximumWealth(int[][] accounts) {
        int largest = 0;
        int temp = 0;
        
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[0].length; j++) {
                temp = temp + accounts[i][j];
            }
            
            if (largest < temp) {
                largest = temp;
            }
            
            temp = 0;
        }
        
        return largest;
    }
}