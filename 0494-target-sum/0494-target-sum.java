class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int totalSum = 0;
        for(int num : nums){
            totalSum+=num;
        }
        if(totalSum < Math.abs(target) || (totalSum+target) %2 !=0){
            return 0;
        }
        int subsetTarget = (totalSum+target)/2;

        int [][] dp = new int[n+1][subsetTarget+1];
        dp[0][0] =1;

        for(int i =1;i <=n;i++){
            int currentNum = nums[i-1];

            for(int j = 0; j<= subsetTarget; j++){
                int notPick = dp[i-1][j];
                int pick = 0;
                if(currentNum <= j){
                    pick = dp[i-1][j-currentNum];
                }
                dp[i][j] = pick + notPick;
            }
        }
        return dp[n][subsetTarget];
    }
}