class Solution {
   
    public int reverse(int x) {
        long s=0;
         int d;
            while(x!=0)
            {
                d=x%10;
                x=x/10;
                s=s*10+d;
            }    
        if(s>-(Math.pow(2,31)) && s< (Math.pow(2,31)-1))
        {
            int s1=(int)s;
           return s1;
                   

        }
        else 
        return 0;
        
        
        
    }
}