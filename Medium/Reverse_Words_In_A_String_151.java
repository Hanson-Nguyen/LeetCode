class Solution {
    public String reverseWords(String s) {
        String[] split = new String[0];
        split = s.split(" ");
        String output = "";
        
        split = Arrays.stream(split)
                .filter(value ->
                        value != null && value.length() > 0
                )
                .toArray(size -> new String[size]);
        
        
        for (int i = 0; i < split.length; i++) { 
            if (i == split.length - 1) 
                output = split[i] + output; 
            else
                output = " " + split[i] + output; 
        } 
        
        String[] reversed = new String[0];
        reversed = output.split(" "); 
        output = "";
        
        for (int j = 0; j < reversed.length; j++) {
                if (j < reversed.length - 1) {
                    output = output + reversed[j] + " ";
                }
                else {
                    output = output + reversed[j];
                }
            
        }
        
        return output;
        
    }
}