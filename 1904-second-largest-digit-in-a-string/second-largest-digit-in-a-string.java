class Solution {
    public int secondHighest(String s) 
    {
        HashSet<Integer>set=new HashSet<>();
        int max1=-1;
        int max2=-1;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isDigit(c))
            {
                set.add(Character.getNumericValue(c));
            }  
        }
        for(int c:set)
        {
            if(c>max1)
            {
                max2=max1;
                max1=c;
            }
            else if(c>max1 && c!=max2)
            {
                max2=-1;
            }
        }
        return max2;
    }
}