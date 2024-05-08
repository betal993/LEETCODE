class Solution {
    public int hammingDistance(int x, int y) {
        int p=x^y;
        int q=0;
        while(p>0){   
           q += p &  1 ;
           p  = p >> 1 ;
        }
        return q;

    }
}