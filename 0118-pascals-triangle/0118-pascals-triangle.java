class Solution {
    public List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>> al=new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            List<Integer> r = new ArrayList<>();
            int num=1;
            for(int j=0;j<=i;j++)
            {
                r.add(num);
                num=num*(i-j)/(j+1);
            }
            al.add(r);
        }
        return al;
    }
}