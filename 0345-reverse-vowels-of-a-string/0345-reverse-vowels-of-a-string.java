class Solution 
{
    public static void swap(char[] a,int l,int r)
    {
        char t=a[l];
        a[l]=a[r];
        a[r]=t;
    }
    public String reverseVowels(String s) 
    {
        char[] a=s.toCharArray();
       int l=0;
       int r=a.length-1;
       while(l<r)
       {
        while(!isv(a[l]) && l<r)
        {
            l++;
        }
        while(!isv(a[r]) && l<r)
        {
            r--;
        }
        swap(a,l,r);
        l++;
        r--;
       }
        return new String(a);
    }

    public static boolean isv(char c)
    {
        return "aeiouAEIOU".indexOf(c)!=-1;
    }
}