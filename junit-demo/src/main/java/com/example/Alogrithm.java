package com.example;

public class Alogrithm {
    /*
 * used to find maximum subArray in o(N) time.
 */
	public int kadensAlgorithm(int []arr) {
        int sum =0;
        int N = arr.length;
		int max = Integer.MIN_VALUE;
		for(int i = 0;i<N;i++) {
			sum +=arr[i];
			if(sum > max) max  = sum;
			if(sum < 0) sum =0; 
		}
		return max;
	}
}
