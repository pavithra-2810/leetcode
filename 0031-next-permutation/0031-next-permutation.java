class Solution {
    public void nextPermutation(int[] nums) 
    {
        int pivot=-1;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                pivot=i;
                break;
            }
        }
        if(pivot==-1)
        {
            reverse(nums,0,nums.length-1);
            return;
        }
        else
        {
            for(int i=nums.length-1;i>pivot;i--)
            {
                if(nums[pivot]<nums[i])
                {
                    swap(nums,i,pivot);
                    break;
                }
            }
            reverse(nums,pivot+1,nums.length-1);
        }

    }
    public static void swap(int[] a,int l,int r)
    {
        int temp=a[l];
        a[l]=a[r];
        a[r]=temp;
    }
    public static void reverse(int[] a,int l,int r)
    {
        while(l<r)
        {
            swap(a,l,r);
            l++;
            r--;
        }
    }
}
