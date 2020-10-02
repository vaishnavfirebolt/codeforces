package day61;

import java.util.Arrays;
import java.util.Scanner;

public class Codeforces1166C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = Math.abs(sc.nextInt());
		}
		Arrays.sort(a);
		long ans = 0;
		for(int i = 0 ; i < n ; i++) {
			if(i > 0 && a[i] == a[i-1]) {
				ans++;
			}
			int x = a[i];
			ans += UpperBound(a,2*x) - UpperBound(a,x);
		}
		
		System.out.println(ans);
		
		
		sc.close();
	}
	
	 static int UpperBound(int a[], int x) {// x is the key or target value
		    int l=-1,r=a.length;
		    while(l+1<r) {
		       int m=(l+r)>>>1;
		       if(a[m]<=x) l=m;
		       else r=m;
		    }
		    return l+1;
		 }
}
