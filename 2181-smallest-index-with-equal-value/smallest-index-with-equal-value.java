class Solution {
    public int smallestEqual(int[] nums) {
        int r=-1;       
        for(int i=0; i<nums.length;i++)
        {
            if(i%10==nums[i])
            {
                r=i;
                break;
            }
            
            
        }
        return r;
    }
}