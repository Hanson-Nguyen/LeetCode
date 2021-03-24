class Solution {
    public int[] minOperations(String boxes) {
        
        int[] intBoxes = Arrays.stream(boxes.split("")).mapToInt(Integer::parseInt).toArray();
        
        int[] result = new int[boxes.length()];
        
        
        for (int i = 0; i < intBoxes.length; i++) {
        
            int count = 0;

            for (int j = 0; j < intBoxes.length; j++) {
                
                if (i == j) {
                    j++;
                }
                
                if (j < intBoxes.length && intBoxes[j] == 1) {
                    count = count + Math.abs(i - j);
                }
                
                
            }
            
            result[i] = count;
        }
        
        return result;
    }
}