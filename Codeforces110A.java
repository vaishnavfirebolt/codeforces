package day30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Collections;
import java.util.StringTokenizer;
 
public class Codeforces110A {
 
	public static void main(String[] args) {
		FastScanner sc=new FastScanner();
		String s = sc.next();
		int count = 0;
		for(int i = 0; i < s.length() ; i++) {
			if(s.charAt(i)== '4' || s.charAt(i)=='7') {
				count++;
			}
		}
		if(count ==0 ) {
			System.out.println("NO");
			return;
		}
		while(count > 0) {
			int toCount = count%10;
			if(toCount != 4 && toCount != 7) {
				System.out.println("NO");
				return;
			}
			count = count/10;
		}
		System.out.println("YES");
	}
	
	public void sort(int[] a) {
		ArrayList<Integer> l=new ArrayList<>();
		for (int i:a) l.add(i);
		Collections.sort(l);
		for (int i=0; i<a.length; i++) a[i]=l.get(i);
	}
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		
		public String next() {
			while (!st.hasMoreElements())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		
		long nextLong() {
			return Long.parseLong(next());
		}
		
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
	}
 
}