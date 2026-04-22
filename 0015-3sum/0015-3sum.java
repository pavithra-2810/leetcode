class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
        Set<List<Integer>> set=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
                List<Integer> al=new ArrayList<>();
                if(sum==0)
                {
                    al.add(nums[i]);
                    al.add(nums[j]);
                    al.add(nums[k]);
                    j++;
                    k--;
                    set.add(al);
                }
                else if(sum>0)
                {
                    k--;
                }
                else
                {
                    j++;
                }
            }
        }
        return new ArrayList<>(set);
    }
}