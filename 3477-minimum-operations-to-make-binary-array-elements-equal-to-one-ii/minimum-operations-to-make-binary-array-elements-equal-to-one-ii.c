int minOperations(int* nums, int numsSize) {

    int n=0;
    for(int i = 0; i<numsSize;i++){
        int j= nums[i] ^ (n % 2);
        if(j == 0)
        n++;
    }
    return n;
}