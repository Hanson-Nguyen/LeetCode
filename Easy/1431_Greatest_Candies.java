class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int largest = candies[0];
        List result = new ArrayList<>();

        for (int i = 1; i < candies.length; i++) {
            if (largest < candies[i]) {
                largest = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
            if ((candies[i] + extraCandies) >= largest) {
                result.add(true);
            }
            else {
                result.add(false);
            }
        }

        return result;
    }
}