class Solution {
    public int removeElement(int[] nums, int val) {
        int c=0;
        int p= nums.length;
        
        for(int i=0;i<p;i++)
        {
            if(nums[i]!=val)
            nums[c++]=nums[i];  
            
        }
        return c;
    }
}