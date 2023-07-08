class Solution {
    public long putMarbles(int[] weights, int k) {
        int n=weights.length;       
        int [] pair=new int[n-1];
        for(int i=0;i<n-1;i++)
        {
            pair[i]=weights[i+1]+weights[i];
        }
        Arrays.sort(pair);
        long max=0,min=0;
        for(int i=0;i<k-1;i++)
        {
            max+=pair[n-i-2];
            min+=pair[i];
        }
        return max-min;
        
    }
}