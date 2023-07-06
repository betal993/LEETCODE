class Solution {
    public int minSubArrayLen(int k, int[] nums) {
        int n=nums.length;
        int l = Integer.MAX_VALUE;
        int windowSum = 0;
        int windowStart = 0;
        for(int windowEnd = 0; windowEnd < n; windowEnd++)
        {
            windowSum += nums[windowEnd];
            while(windowSum >= k)
            {
            l = Math.min(l, windowEnd-windowStart+1);
            windowSum -= nums[windowStart];
            windowStart++;
            }

        }
        return l == Integer.MAX_VALUE ? 0 : l;
    }
}