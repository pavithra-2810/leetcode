class Solution {
    public double trimMean(int[] arr) 
    {
        Arrays.sort(arr);
        int n=arr.length;
        int k=n/20;
        double sum=0;
        for(int i=k;i<=n-k-1;i++)
        {
            sum+=arr[i];
        }
        double mean=sum/(n-k-k);
        return mean;
    }
}