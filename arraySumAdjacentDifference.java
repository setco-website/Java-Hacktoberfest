int arraySumAdjacentDifference(int[] inputArray) {
    int sum=0;
    for(int i=0; i<inputArray.length-1; i++) {
        if(inputArray[i]<inputArray[i+1])
            sum+=inputArray[i+1]-inputArray[i];
        else 
            sum+=inputArray[i]-inputArray[i+1];
    }
}
