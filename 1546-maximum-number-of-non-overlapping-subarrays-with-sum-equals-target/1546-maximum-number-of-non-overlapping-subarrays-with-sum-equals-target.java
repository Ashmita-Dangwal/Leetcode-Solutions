class Solution {
    public int maxNonOverlapping(int[] nums, int target) {
        Set<Integer> seenPrefixSums = new HashSet<>();
        seenPrefixSums.add(0);

        int currentPrefixSum = 0;
        int count = 0;
        for(int num : nums){
            currentPrefixSum += num;

            if(seenPrefixSums.contains(currentPrefixSum - target)){
                count++;
                seenPrefixSums.clear();
                seenPrefixSums.add(0);
                currentPrefixSum = 0;

            }
            else{
                seenPrefixSums.add(currentPrefixSum);
            }

        }
        return count;
    }
}