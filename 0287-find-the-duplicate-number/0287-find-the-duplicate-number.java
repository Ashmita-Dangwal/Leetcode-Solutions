class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> duplicate = new HashSet<>();
            int n = nums.length;
            for(int i = 0; i< n;i++){
                if(duplicate.contains(nums[i])){
                    return nums[i];
                }
                else{
                   duplicate.add(nums[i]);
                }
            }
            return 0;
        
    }
}