class Solution {
    public int reverse(int x) 
    {
        int d=0;
        
        while(x!=0)
        {
            int rem=x%10;
            if (d > Integer.MAX_VALUE / 10 || d == Integer.MAX_VALUE / 10 && rem > 7)
                return 0;
            if (d < Integer.MIN_VALUE / 10 || d == Integer.MIN_VALUE / 10  && rem <-8)
                return 0;
            d=d*10+rem;
            x/=10;
        }
        return d;
    }
}