class Solution {
    public boolean isPowerOfThree(int n) {
        int t=n;
        int counter=0;
        if(t==0)
        return false;
        else if(t==1)
        return true;
        else if(t<0)
        return false;
        else
        {
            while(t>1)
            {
                if(t%3==0)
                {
                    t=t/3;

                }                
                else
                {
                    counter=1;
                    break;
                }
            }
            if(counter==1)
            return false;
            else
            return true;

            

        }
           
        
    }
}