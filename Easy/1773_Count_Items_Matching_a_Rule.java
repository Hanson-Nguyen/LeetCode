class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        //default is j = 0 for ruleKey = "type" as it will check only first column
        int j = 0;
        
        int count = 0;
        
        if (ruleKey.equals("color")) {
            j = 1;
        }
        else if (ruleKey.equals("name")) {
            j = 2;
        }
        
        for (List i : items) {
            
            if ((i.get(j)).equals(ruleValue)) {
                count++;
            }
            
        }
        
        return count;
        
    }
}