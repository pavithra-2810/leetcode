class Solution {
    public List<String> fizzBuzz(int n)
    {
        String a="FizzBuzz";
        String b="Fizz";
        String c="Buzz";
        ArrayList<String> al=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(i%3==0 && i%5==0)
            {
                al.add(a);
            }
            else if(i%3==0)
            {
                al.add(b);
            }
            else if(i%5==0)
            {
                al.add(c);
            }
            else
            {
                al.add(String.valueOf(i));
            }
        }
        return al;
    }
}