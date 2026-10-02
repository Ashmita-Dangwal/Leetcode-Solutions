class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int inf = (int)1e9;
        int dp[][] = new int[n+1][amount+1];
        for(int i =0;i<=n;i++){
            dp[i][0] = 0;
        }
        for(int j =1;j <= amount;j++){
            dp[0][j] = inf;
        }
        for(int i =1;i<=n;i++){
            int coin = coins[i-1];
            for(int j =1;j<=amount;j++){
                int notPick = dp[i-1][j];
                int pick = inf;
                if(coin <= j){
                    pick = 1+dp[i][j-coin];
                }
                dp[i][j] = Math.min(notPick , pick);
            }
        }
        return dp[n][amount] == inf ?-1:dp[n][amount];
    }
}