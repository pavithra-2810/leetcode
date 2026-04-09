class Solution {
    public int[] searchRange(int[] nums, int target) 
    {
        int start=binary(nums,target,true);
        int end=binary(nums,target,false);
        int[] a={start,end};
        return a;
    }
    public static int binary(int[] nums,int target,boolean find)
    {
        int l=0;
        int r=nums.length-1;
        int ans=-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(target<nums[mid])
            {
                r=mid-1;
            }
            else if(target>nums[mid])
            {
                l=mid+1;
            }
            else
            {
                ans=mid;
                if(find)
                {
                    r=mid-1;
                }
                else
                {
                    l=mid+1;
                }
            }
        }
        return ans;
    }
}