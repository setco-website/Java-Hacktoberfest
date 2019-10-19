int arraySumAdjacentDifference(int[] inputArray) {
    int sum = 0;
    for(int i = 1; i<inputArray.length; i++) {
        sum += Math.abs(inputArray[i]-inputArray[i-1]);
    }
    return sum;
}
