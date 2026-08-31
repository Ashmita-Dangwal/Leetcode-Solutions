class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if(n <= 2) return n;

        int minIndex = 0;
        int maxIndex = 0;
        for(int i = 1; i < n; i++){
            if(nums[i] < nums[minIndex]){
                minIndex = i;
            }
            if(nums[i] > nums[maxIndex]){
                maxIndex = i;
            }
        }

        int a = Math.min(minIndex , maxIndex);
        int b = Math.max(minIndex , maxIndex);

        int bothFromFront = b + 1;
        int bothFromBack = n - a;
        int oneFromEach = (a+1) + (n-b);

        return Math.min(bothFromFront , Math.min(bothFromBack , oneFromEach));
    }
}