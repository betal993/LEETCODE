class Solution {
    public String thousandSeparator(int n) {
        String s=Integer.toString(n);
        int l=s.length();
        StringBuffer str=new StringBuffer(s);
        if(l<=3)
        return s;
        else
        {
            int i=l/3;
            for(int k=l-3;k>0;k=k-3)
            {
                str.insert(k,'.');

            }
            return str.toString();
        }

        
    }
}