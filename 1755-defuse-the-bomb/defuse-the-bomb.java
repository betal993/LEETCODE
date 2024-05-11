class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] arr = new int[code.length];
        Arrays.fill(arr, 0);
        
        if(k==0)
        return arr;
        else{
        for(int i=0;i<code.length;i++)
        {
            int p=0;
            int j=0;
            if(k<0)
            j=code.length+i+k;
            else
            j=i+1;
            int l=Math.abs(k);
            while(l-- >0)
            {
                p+=code[j%code.length];
                j++;

            }
            
            arr[i]=p;
            
            
            
        }
        return arr;
        }
        
    }
}