package AtCoderDP;

import java.util.Scanner;

public class AtCoderDP_F_LCS {
	
	static Integer dp[][] = new Integer[3005][3005]; 
	
	static int choice[][] = new int[3000][3000];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String t = sc.next();
		
		int n = s.length() , m = t.length();
		
		dp[0][0] = 0;
		if(s.charAt(0) == t.charAt(0)) {
			dp[0][0] = 1;
			choice[0][0] = 2;
		}
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0; j< m ; j++) {
				if(i > 0) {
					dp[i][j] = dp[i-1][j];
				}if(j > 0) {
					if(dp[i][j] == null || dp[i][j] < dp[i][j-1]) {
						dp[i][j] = dp[i][j-1];
						choice[i][j] = 1;
					}
				}if(s.charAt(i) == t.charAt(j)) {
					int ans = 1;
					if(i > 0 && j > 0) {
						ans = 1 + dp[i-1][j-1];
					}
					if(dp[i][j] == null || dp[i][j] < ans) {
						dp[i][j] = ans;
					}
					choice[i][j] = 2;
				}
			}
		}
		int i = n-1; int j = m-1;
		
		StringBuilder sb = new StringBuilder();
		
		while(i >= 0 && j >= 0) {
			if(choice[i][j] == 0) {
				i--;
			}else if(choice[i][j] == 1) {
				j--;
			}else {
				sb.append(s.charAt(i));
				i--;
				j--;
				
			}
		}
		System.out.println(sb.reverse());
		
		sc.close();
	}
	
}
