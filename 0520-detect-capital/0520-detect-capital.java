class Solution {
    public boolean detectCapitalUse(String word)
    {
        return allcap(word) || alllow(word) || title(word);
    }


    public boolean allcap(String word)
    {
        int count=0;
        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            if(Character.isUpperCase(c))
            {
                count++;
            }
        }
        if(count==word.length())
        {
            return true;
        }
        return false;
    }
    public boolean alllow(String word)
    {
        int count=0;
        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            if(Character.isLowerCase(c))
            {
                count++;
            }
        }
        if(count==word.length())
        {
            return true;
        }
        return false;
    }

    public boolean title(String word)
    {
        char c=word.charAt(0);
        String sb=word.substring(1);
        if(Character.isUpperCase(c) && alllow(sb))
        {
            return true;
        }
        return false;
    }
}