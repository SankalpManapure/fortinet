	package com.fortinet;
	
	public class MultiDimensionArray {
		
	    // This is a provided function, Assume it works
	    public static Long getValue(int... indexOfDimension) {
	        //... 
	        return value;
	    }
	    // lengthOfDeminsion: each dimension's length, assume it is valid: lengthOfDeminsion[i]>0.
	    public static Long sum(MultiDimensionArray mArray, int[] lengthOfDeminsion) { 
	   // Your resolution 
	   // TIME COMPLEXITY: O(i*j),  We need to iterate through each element and add there value to the sum variable
	   // So the complexity equals to the time required to add all the elements. So, if its a 2 dimensional array
	   // with i rows and j columns then the complexity is O(i*j)
	    	
	   // SPACE COMPLEXITY:  O(1) -- Constant Space is required to store the sum variable
	    	
	    	Long sum = new Long("0");
	    	for(int row = 0 ; row < lengthOfDeminsion.length ; row++){
	    		int rowCount = lengthOfDeminsion[row];
	    		for(int column=0 ; column < rowCount ; column++ ){
	    			sum += mArray.getValue(column);
	    		}
	    	}
	    	 return sum;
	    }
	
	}
