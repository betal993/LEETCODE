class Solution {
    public int maxConsecutiveAnswers(String answerkey, int k) {
        
        int l=0,i,ans=0,count=0;
        for(i=0;i<answerkey.length();i++)
        {
            if(answerkey.charAt(i)=='T')
            count++;
            while(count>k)
            {
                if(answerkey.charAt(l)=='T')
                count--;
                l++;
            }
            ans=Math.max(ans, i-l+1);

        }
        l=0;
        count=0;
        for(i=0;i<answerkey.length();i++)
        {
            if(answerkey.charAt(i)=='F')
            count++;
            while(count>k)
            {
                if(answerkey.charAt(l)=='F')
                count--;
                l++;
            }
            ans=Math.max(ans, i-l+1);

        }
        return ans;
        
        
    }
}