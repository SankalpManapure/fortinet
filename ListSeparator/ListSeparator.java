package com.fortinet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSeparator {
	
	public static boolean separate(List<Integer> list, int k){

		if(list.size()<k){
			return false;
		}
		int arraySum = 0;
		//Get the Sum of all the elements in the array in arraySum Complexity : O(n)
		for(int i : list){
			arraySum += i;
		}
		//If the sum is not divisble by k then we cannot separate the array into partitions of equal sum
		if((arraySum%k) != 0) 
		{
			return false;
		}

		int sizeOfList = list.size();
		boolean isSeparated = false;
		//Sorting the elements in reverse Order Complexity : O(nlogn)
		Collections.sort(list, Collections.reverseOrder() );
		
		int[][] separatedElements = new int[k][sizeOfList];
		int currentPartitionSum= 0 ;
		int[] indexUsed = new int[sizeOfList];
		
		//initaliazing all the elements to -1 Complexity O(n)
		for(int m = 0 ; m < indexUsed.length ; m++){
			indexUsed[m] = -1;
		}
		
		int sumExpected = arraySum/k;
		int currentCount = 0;
		//Complexity O(n^2)
		//Space Complexity : O(n)  //2211
		for(int loopCount = 0 ; loopCount < sizeOfList ; ++loopCount){
			int current = list.get(loopCount);
			currentPartitionSum += current;
			if(indexUsed[loopCount] != -1){
				currentPartitionSum -= current;
				continue;
			}
			
			if(currentPartitionSum<sumExpected){
				indexUsed[loopCount] = loopCount;
			}else if(currentPartitionSum>sumExpected){
				currentPartitionSum -= current;
			}else{
				++currentCount;
				indexUsed[loopCount] = loopCount;
				currentPartitionSum = 0;
				loopCount=currentCount - 1;
			}
		}
		
		for(int m = 0 ; m < indexUsed.length ; m++){
			if(indexUsed[m] == -1){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int inputArray[] = {};
		List<Integer> l = new ArrayList<Integer>();
		l.add(3);
		l.add(2);
		l.add(1);
		l.add(1);
		l.add(2);
		//l.add(1);
		//l.add(2);
		int k = 3;
		boolean isSeparated = separate(l,k);
		System.out.println("Result of separate method "+isSeparated);
	}
}
