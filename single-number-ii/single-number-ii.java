class Solution {
    public int singleNumber(int[] nums) {
        int p= nums.length;
        for(int i=0;i<p;i++)
        {
            int s=nums[i];
            int c=0;
            for(int j=0;j<p;j++)
            {
                if(nums[j]==s)
                c++;
            }
            if(c==1)
            return nums[i];
        }
        return 0;
        
    }
}