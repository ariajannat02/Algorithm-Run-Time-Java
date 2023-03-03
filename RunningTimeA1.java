/* Project:  Lab1
* Class: RunningTime1.java 
* Author: Aria Jannat
* Date: September 19, 2022 
* This program prints out expected running time of algorithm 1
*/
import java.util.*;
public class RunningTimeA1 {

	public static void main(String[] args) {
		Random rand= new Random();
		int N= 20000;
		int [] ajArray= new int[N];
	

 		for(int i = 0; i< N-1 ; i++) {
 			ajArray[i]= rand.nextInt(19)-9;
 			
		}
 		
		int answer;
		
		long start = System.nanoTime();
		answer = algorithm1(ajArray);
		long end = System.nanoTime();
		long runTime = (end-start);
		System.out.println("The runtime for algorithm 1 in nanoseconds is " + runTime + ".\n");
		
	}
	
	public static int algorithm1(int[] a) {
		
		int maxSum = 0;

		for (int i = 0; i < a.length; ++i)
			for (int j = i; j < a.length; ++j) {
				int thisSum = 0;

				for (int k = i; k <= j; ++k)
					thisSum += a[k];

				if (thisSum > maxSum)
					maxSum = thisSum;
			}
		

		return maxSum;
		
	}


	}

