class Solution {
    public int smallestEqual(int[] nums) {
        int r=0;       
        for(int i=0; i<nums.length;i++)
        {
            if(i%10==nums[i])
            return i;
            else
            {
                r=1;
            }
        }
        if(r==1)
        return -1;
        else return 0;
    }
}