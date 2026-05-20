class Solution {
    public String clearDigits(String s) 
    {
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(Character.isLetter(c))
            {
                st.push(c);
            }
            else if (Character.isDigit(c))
            {
                st.pop();
            }
        }
        StringBuilder ans = new StringBuilder();
        for(char c:st)
        {
            ans.append(c);
        }
        return ans.toString();
    }
}