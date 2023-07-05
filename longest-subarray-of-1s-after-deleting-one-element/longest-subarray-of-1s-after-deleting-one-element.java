class Solution {
    public int longestSubarray(int[] nums) {
        int l=nums.length;
        int neww = 0 ;
        int old = 0 ;
        int m = 0;
        for(int i=0;i<l;i++)
        {
            if(nums[i]==1)
            {
                neww++;
                old++;
            }
            else
            {
                m=Math.max(m,old);
                old= neww;
                neww=0;
            }

        }
        m=Math.max(m,old);
        if(m<l)
        return m;
        else
        return m-1;

        
        
    }
}