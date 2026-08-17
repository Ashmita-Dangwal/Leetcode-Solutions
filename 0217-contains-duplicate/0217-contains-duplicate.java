class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seenValue = new HashSet<>();
        for(int num : nums){
            if(!seenValue.add(num)) return true;
        }
        return false;
    }
}