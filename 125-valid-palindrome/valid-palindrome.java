class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","");
        s=s.toUpperCase();
        int l=s.length();
        int f=0,r=0;
        while(f<(l-1))
        {
            char one=s.charAt(f);
            char two=s.charAt(l-1);
            if(one!=two)
            {
                r=1;
                break;
            }
            f++;
            l--;
        }
        if(r==0)
        return true;
        else
        return false;
        
    
    }
}