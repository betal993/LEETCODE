class Solution {
    public boolean isValid(String s) {
        int p=s.length();
        boolean b;
        Stack<Character> stack1=new Stack<Character>();
        if(p%2==0)
        {
            for(int i=0;i<p;i++)
            {
               char x=s.charAt(i);
                if(x=='(' || x=='{' || x=='[')
                {
                    stack1.push(x);
                    continue;
                }
                if(stack1.isEmpty())
                return false;
                char d;

                switch(x)
                {
                    case ')':
                        d=stack1.pop();
                        if(d=='{' || d=='[')
                            return false;
                        break;
                    case '}':
                        d=stack1.pop();
                        if(d=='(' || d=='[')
                            return false;
                        break;
                    case ']':
                        d=stack1.pop();
                        if(d=='(' || d=='{')
                            return false;
                        break;
                }
               
                     
                 


            }
        }
        else
        return false; 
        
        return stack1.isEmpty();
    }
}