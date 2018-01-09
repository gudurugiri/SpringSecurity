package com.codility.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class Practice {

	public static void main(String[] args) {
		Practice p = new Practice();
		 int[] A = { 1, 4, 7, 3, 3, 5 };

		// int[]A = { 0, 3, 3, 7, 5, 3, 11, 1 };

		// int[]A = { 1, 1 };

		 //int[]A = { 1, 1, 2, 2 };

		// int[] A = {};

		//int[] A = { 1, 1, 1, 1, 2 };

		System.out.println(p.solution2(A));
	}

	public int solution(int[] A) {
		Map<Integer, Integer> indices = new HashMap<Integer, Integer>();
		IntStream.range(0 ,  A.length).forEach(pos -> {
			if (!indices.containsKey(A[pos])) {
				indices.put(A[pos], pos);
			}
		});
		/*for (int pos = 0; pos < A.length; pos++) {
			if (!indices.containsKey(A[pos])) {
				indices.put(A[pos], pos);
			}
		}*/
		Arrays.sort(A);
		List<Integer> distances = new ArrayList<Integer>();
		distances.add(-1);
		IntStream.range(0 ,  A.length-1).forEach(pos -> {
			if (A[pos] != A[pos + 1]) {
				distances.add(Math.abs(indices.get(A[pos])
						- indices.get(A[pos + 1])));
			}
		});
		//for (int pos = 0; pos < A.length - 1; pos++) {
			//if (A[pos] != A[pos + 1]) {
			//	distances.add(Math.abs(indices.get(A[pos])
			//			- indices.get(A[pos + 1])));
			//}
		//}
		return Collections.max(distances);
	}
	
	public int solution2(int[] A) {
		Map<Integer, Integer> indices = new HashMap<Integer, Integer>();
		IntStream.range(0 ,  A.length).forEach(pos -> {
			if (!indices.containsKey(A[pos])) {
				indices.put(A[pos], pos);
			}
		});
		Arrays.sort(A);
		List<Integer> distances = new ArrayList<Integer>();
		distances.add(-1);
		IntStream.range(0 ,  A.length-1).forEach(pos -> {
			if (A[pos] != A[pos + 1]) {
				distances.add(Math.abs(indices.get(A[pos])
						- indices.get(A[pos + 1])));
			}
		});
		return Collections.max(distances);
	}

}
