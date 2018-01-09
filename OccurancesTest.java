/**
 * 
 */
package com.codility.test;

import java.util.stream.IntStream;

/**
 * @author dguduru
 *
 */
public class OccurancesTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int N = 11;
		long result = solution(N);
		System.out.println(result);
	}

	private static int solution(int N) {
		StringBuilder stringBuilder = new StringBuilder();
		IntStream.rangeClosed(1, N).forEach(j -> {
			stringBuilder.append(j);
		});
		/*for (int i = 1; i <= N; i++) {
			stringBuilder.append(i);
		}*/
		return (int)stringBuilder.codePoints().filter(digit -> digit=='1').count();
	}
	
	 public static int solution1(int N) {

	        // write your code in Java SE 8

	        

	        int ans=0;

	        

	        

	          for (int i=0;i<=N;i++){

	              

	              String val = String.valueOf(i);

	              

	              if(val.contains("1")){

	                  ans++;

	                  

	                  }

	                  if(val.length() ==2 && String.valueOf(i%10).contains("1")){

	                      ans++;

	                  }

	                 

	             }

	             

	             int result = ans+result(ans);

	              return result;

	    }
	 
	 public static int result(int n){

	      String val = String.valueOf(n);

	             int ans=0; 

	              if(val.contains("1")){

	                  ans++;

	                  

	                  }

	                  if(val.length() ==2 && String.valueOf(n%10).contains("1")){

	                      ans++;

	                  }

	                  

	                  return ans;

	    }

}
