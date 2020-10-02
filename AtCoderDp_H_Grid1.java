package AtCoderDP;

import java.util.Scanner;

public class AtCoderDp_H_Grid1 {

	static long Mod = (long)1e9 + 7;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt() , w = sc.nextInt();
		char grid[][] = new char[h][w];
		for(int i = 0 ; i < h ; i++) {
			grid[i] = sc.next().toCharArray();
		}
		sc.close();
		
		long dp[][] = new long[h][w];
		dp[0][0] = 1;
		for(int i = 0 ; i < h ; i++) {
			for(int j = 0 ; j < w ; j++) {
				
				if(grid[i][j] == '#')continue;
				
				if(i > 0) {
					dp[i][j] += dp[i-1][j];
					dp[i][j] %= Mod;
				}if(j > 0) {
					dp[i][j] += dp[i][j-1];
					dp[i][j] %= Mod;
				}
			}
		}
		System.out.println(dp[h-1][w-1]);
		
		
	}
}
