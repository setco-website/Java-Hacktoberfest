public int arraySumAdjacentDifference(int[] in) {
    
    int sum=0;
    for(int i=1;i<in.length;i++) {
        sum += Math.abs(in[i]-in[i-1]);
    }

    return sum;
}
