class Solution {
    public int singleNumber(int[] nums) {
        int l=nums.length;
        if(l==1)
        return nums[0];
        else
        {
            int c=0;
            Arrays.sort(nums);
            for(int i=0;i<l-1;i++)
            {
                if(nums[i]==nums[i+1])
                {
                    i=i+1;
                    continue;
                }                
                else return nums[i];                
            }
            return nums[l-1];
        }
        
        
    } 
}