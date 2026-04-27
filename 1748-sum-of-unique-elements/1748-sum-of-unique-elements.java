class Solution {
    public int sumOfUnique(int[] nums) 
    {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int c:nums)
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int sum=0;
        for(Map.Entry<Integer,Integer>e:map.entrySet())
        {
            if(e.getValue()==1)
            {
                sum+=e.getKey();
            }
        }
        return sum;
    }
}