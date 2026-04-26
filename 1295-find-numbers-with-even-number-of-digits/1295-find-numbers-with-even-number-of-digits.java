class Solution {
    public int findNumbers(int[] nums) 
    {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(even(nums[i]))
            {
                count++;
            }
        }
        return count;
    }
    public boolean even(int n)
    {
        int count=0;
        while(n!=0)
        {
            n/=10;
            count++;
        }
        if(count%2==0)
        {
            return true;
        }
        return false;
    }
}