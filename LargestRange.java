package arrays;

import java.util.*;


public class LargestRange {
	
	public static int[] largestRange(int[] arr) {
		if(arr.length == 0|| arr == null) {
			return new int[] {-1,-1};
		}
		int result[] = new int[2]; 
		Map<Integer,Boolean> map = new HashMap<>();
		int longestLength = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			map.put(arr[i],true);
		}
		for(int num : arr ) {
			
			if(map.get(num)) {
			int left = num-1;
			int right = num + 1;
			int length = 1; 
			
			while (map.containsKey(left)) {
				length++;
				map.put(left, false);
				left--;
			}while (map.containsKey(right)) {
				length++;
				map.put(right, false);
				right++;
			}
			if(length > longestLength) {
				longestLength = length;
				result[0] = left +1;
				result[1] = right -1;
			}
			
			}	
		}
		
		return result;
			
		 
	}

	public static void main(String[] args) {
		int a[] = {1,2,3,5,4,6,9,8,2,7,77,55,44,22};
		int result[] = largestRange(a) ;
		for(int item : result) {
			System.out.println(item);
		}
	}

}
