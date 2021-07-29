/**
 * @param {number[]} nums
 * @return {number[]}
 */
var runningSum = function(nums) {
    
    let total = 0;
    return nums.map(nums => total += nums);
};