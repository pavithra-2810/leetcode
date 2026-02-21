class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int size=nums1.length+nums2.length;
        int[] c=new int[size];
        int n=size;
        int k=0;
        for(int i=0;i<nums1.length;i++)
        {
            c[k]=nums1[i];
            k++;
        }
        for(int i=0;i<nums2.length;i++)
        {
            c[k]=nums2[i];
            k++;
        }
        Arrays.sort(c);
        if(size%2==0)
        {
            double even=(c[n/2]+c[n/2-1]) /2.0;
            return even;
        }

        double odd=c[n/2];
        return odd;
    }
}