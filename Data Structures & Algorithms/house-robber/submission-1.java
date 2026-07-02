class Solution {
    public int rob(int[] nums) {
        int dp[] = new int[nums.length+1];
        Arrays.fill(dp,-1);
        return robRecur(nums,0,nums.length, dp);
    }

    public int robRecur(int[] nums,int i,  int n, int[] dp) {
        if (i >= n) {
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }

        return dp[i] = Math.max(nums[i] + robRecur(nums, i + 2, n, dp), robRecur(nums, i + 1, n, dp));
    }
}
