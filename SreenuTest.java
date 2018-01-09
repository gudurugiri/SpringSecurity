/**
 * 
 */
package com.codility.test;

/**
 * @author dguduru
 *
 */
public class SreenuTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//int[] A={0,3,3,3,5,7,9, 11, 1};
		
		//int[] A={ 0, 3 ,3 ,3, 5, 7,  11, 1  };
		//int[] A={ 1,3,7,11,2,15, 0  };
		//int[] A={ 1, 2, 2, 2, 2  };
		
		int[] A={1, 4, 7, 3, 3, 5 };
		
		SreenuTest test = new SreenuTest();
		
		System.out.println( test.solution(A)  );
	}

	// Problem 1 Solution:

	public int solution(int[] A) {

		int n = A.length;
		int result = 0;
		int a[] = A;
		for (int i = 0; i < n; i++) {
			int low_bound = i;
			for (int j = 0; j < n; j++) {
				if (a[j] > a[i] && (low_bound == i || a[low_bound] > a[j])) {
					low_bound = j;
				}
			}

			if (low_bound != i) {
				for (int j = 0; j < n; j++) {
					if (a[j] == a[low_bound] || (a[j] == a[i] && i < j)) {

						int maxValue = a[Math.max(i, j)];
						int minValue = a[Math.min(i, j)];

						if (result < maxValue - minValue) {
							result = maxValue - minValue;
						}

					}
				}
			}

		}

		return result;

	}

	// Problem 2 Solution:

	public int solution(int N) {

		int result = 0;
		for (int i = 0; i <= N; i++) {
			String check = String.valueOf(i);
			for (int j = 0; j < check.length(); j++) {
				if (check.charAt(j) == '1') {
					result++;
				}

			}
		}
		return result;
	}

}
