int digitSum(int n) 
{
    int sum=0;
    if(n == 0) return 0;
    if(n == 1) return 1;
    if(n>1) 
    {
    for (;n>0;n/=10)
    int d=n%10;
    sum+=d 
    return sum;
}}
