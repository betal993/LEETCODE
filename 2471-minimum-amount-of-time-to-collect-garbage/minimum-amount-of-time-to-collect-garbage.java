class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int len=garbage.length;
        int s=0;
        int p=0,g=0,m=0;
        int plast=0,glast=0,mlast=0;
        int[] prefix= new int[len];
        for(int i=1;i<len;i++)
        {
            prefix[i]=prefix[i-1]+travel[i-1];
        }
        for(int i=0;i<len;i++)
        {
            
            String str=garbage[i];
            for(int k=0;k<str.length();k++)
            {
                if(str.charAt(k)=='M')
                {
                    m++;
                    mlast=i;
                }
                
                else if(str.charAt(k)=='G')
                {
                    g++;
                    glast=i;
                }
                
                else
                {
                    p++;
                    plast=i;
                }                
            }      

        }
        s=prefix[mlast]+prefix[glast]+prefix[plast]+m+g+p;
        return s ;
    }
}