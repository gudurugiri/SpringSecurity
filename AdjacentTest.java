/**
 * 
 */
package com.codility.test;

import java.util.Arrays;

/**
 * @author dguduru
 *
 */
public class AdjacentTest {

	/**
	 * @param args
	 */
	/**
	 * This method to find occarances in range 
	 * @param N
	 * @param c
	 * @return
	 */
	private static long solution(int N, char c) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= N; i++) {
			sb.append(i);
		}
		long result=sb.codePoints().filter(digit -> digit==c).count();
		return result;
	}
	
	
	
	public static void main(String[] args) {
		//System.out.println(solution(11,'1'));
		//int[] a ={1, 4, 7, 3, 3, 5 };
		
		int[] a ={0, 3, 3, 7, 5, 3, 11, 1 };
		System.out.println(solution(a));
	}
	public static int solution(int[] A) {
        // write your code in Java SE 8\
        
        return One_1(A)-2;
    }
	
    
     public static int One_1(int[] A) 
        { 
            int absval = 0; 
            int maxabsolute = 0; 
 
            int[] sortedArray = (int[])A.clone(); 
            Arrays.parallelSort(sortedArray); 
 
            for (int i = 0; i < A.length; i++) 
            { 
                for (int j = (i + 1); j < A.length; j++) 
                { 
                    if (areAdjacent(A, sortedArray, i, j) == true) 
                    { 
                        
                        absval = Math.abs(A[i] - A[j]); 
                        if (absval > maxabsolute) 
                        { 
                            maxabsolute = absval; 
                        } 
                    } 
                } 
            } 
 
            return maxabsolute; 
        } 
 
        public static boolean areAdjacent(int[] myArray, int[] sortedArray, int index1, int index2) 
        { 
            int value1, value2; 
            int minval, maxval; 
 
            value1 = myArray[index1]; 
            value2 = myArray[index2]; 
 
            if (value1 == value2) { return false; } 
 
            index1 = Arrays.asList(sortedArray).indexOf(value1); 
            index2 = Arrays.asList(sortedArray).indexOf(value2); 
 
            minval = Math.min(index1, index2); 
            maxval = Math.max(index1, index2); 
 
            for (int between = minval + 1; between < maxval; between++) 
            { 
                if ((sortedArray[between] != value1) & (sortedArray[between] != value2)) 
                { 
                    return false; 
                } 
            } 
            return true; 
        } 
}
