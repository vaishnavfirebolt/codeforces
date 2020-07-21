package arrays;

import java.util.ArrayList;

public class mergeIntervals {

	static class Intervals{
		int start ;
		int end ;
		
		Intervals(){
			this.start = 0;
			this.end = 0;
		}
		Intervals(int start , int end){
			this.start = start;
			this.end = end ;
		}
	}
	
	public static ArrayList<Intervals> insert (ArrayList<Intervals> intervals , Intervals newInterval){
		
		if(intervals.size() == 0) {
			intervals.add(newInterval);
			return intervals;
		}
//		if(intervals == null) {
//			ArrayList<Intervals> list = new ArrayList<>();
//			list.add(newInterval);
//			return list;
//		}
		
			Intervals toInsert = newInterval;
			int i = 0;
			
			while( i < intervals.size()) {
				Intervals current = intervals.get(i);
				
				if(current.end < toInsert.start) {
					i++;
					continue;
				}else if(current.start > toInsert.end) {
					intervals.add(i, toInsert);
					break; 
				}else {
					toInsert.start = Math.min(toInsert.start , current.start);
					toInsert.end = Math.max(toInsert.end, current.end);
					intervals.remove(i);
				}
				
			}
			if(i == intervals.size()) {
				intervals.add(toInsert);
				
			}
			return intervals;
	}
	
	public static void main(String[] args) {
		

	}

}
