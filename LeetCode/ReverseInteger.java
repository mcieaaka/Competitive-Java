/*Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0. */
class Solution {
    public int reverse(int x) {
        Stack<Integer> st = new Stack<Integer>();
        long ans;
        int sign=0;//0 means +ve no.;1 means -ve no.
        String s = String.valueOf(x);
        if(s.charAt(0)=='-')
            sign=1;
        for(int i=0;i<s.length();i++)
        {
            if(i==0 && sign==1)
                continue;
            st.push(Character.getNumericValue(s.charAt(i)));
        }
        
        ans=(long)st.pop();
        while(st.size()!=0)
        {
            ans = ans*10+(long)st.pop();
        }
        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE)
            return 0;
        
        if(sign == 0)
            return (int)ans;
        else
            return (int)-ans;
    }
}