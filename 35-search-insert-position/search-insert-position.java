class Solution {
    public int searchInsert(int[] nums, int target) {
        int lower=0;
        int upper=nums.length ;
        int middle=0;
        while(lower<upper)
        {
            middle=(lower+upper)/2;
            if(nums[middle]==target)
            {
                return middle;
                           
            }
            else if(nums[middle]<target)
            {
                lower=middle+1;

            }
            else
            upper=middle;


        }
        return lower;
        

    }
}