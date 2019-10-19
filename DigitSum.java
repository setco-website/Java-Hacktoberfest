int digitSum(int n) {
    int sum=0;
    if(n == 0) return 0;
    if(n == 1) return 1;
    if(n>1) {
        sum += n%10 + digitSum(n/10);
    }
    return sum;
}
