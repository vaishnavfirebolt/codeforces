package day30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Collections;
import java.util.StringTokenizer;
 
public class Codeforces1363A {
 
	public static void main(String[] args) {
		FastScanner sc=new FastScanner();

		int T=sc.nextInt();
		
		for (int tt=0; tt<T; tt++) {
			int n = sc.nextInt(),x = sc.nextInt();
			int odd = 0;
			
			for(int i = 0 ; i < n ; i++){
				if(sc.nextInt() % 2 == 1)odd++;
			}
			int even = n - odd;
			if(x == n){
				if(odd % 2 == 0)System.out.println("NO");
				else System.out.println("YES");
			}
			else{
				if(odd>0 && even>0)System.out.println("YES");
				else{
					if(even>0)System.out.println("NO");
					else if(x%2==1)System.out.println("YES");
					else System.out.println("NO");
	               	}
	            }
	           
		}
		
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
