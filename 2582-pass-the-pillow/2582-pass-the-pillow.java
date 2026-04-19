class Solution {
    public int passThePillow(int n, int time)
    {
        int circle=2*(n-1);
        int t=time%circle;
        if(t<n)
        {
            return t+1;
        }
        return n-(t-(n-1));
    }
}