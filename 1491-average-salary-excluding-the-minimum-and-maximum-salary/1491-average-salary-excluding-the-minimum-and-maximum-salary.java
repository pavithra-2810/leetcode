class Solution {
    public double average(int[] salary)
    {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<salary.length;i++)
        {
            max=Math.max(max,salary[i]);
            min=Math.min(min,salary[i]);
            sum+=salary[i];
        }
        double n=salary.length-2;
        double avg=sum-(min+max);
        avg=avg/n;
        return avg;
    }
}