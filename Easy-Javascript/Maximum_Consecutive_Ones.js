/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxConsecutiveOnes = function(nums) {
    
    var result = 0;
    var current = 0;
    
    for (var i = 0; i < nums.length; i++) {
        
        if (nums[i] == 0) {
            current = 0;
        } 
        else {
            current++;
        };
        
        if (current > result) {
            result = current;
        }
        
    }
    
    return result;
};