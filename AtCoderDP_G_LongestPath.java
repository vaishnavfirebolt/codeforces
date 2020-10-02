package AtCoderDP;

import java.util.*;

public class AtCoderDP_G_LongestPath {
	
	@SuppressWarnings("unchecked")
	static List<Integer> adj[] = new List[100005];
	static int dp[] = new int[100005];
	static boolean visited[] = new boolean[100005];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt() , m = sc.nextInt();
		
		for(int i = 1 ; i <= n ; i++) {
			adj[i] = new ArrayList<Integer>();
		}
		for(int i= 0 ; i < m ; i++) {
			int x = sc.nextInt() , y = sc.nextInt();
			adj[x].add(y);
		}
		
		for(int i = 1 ; i <= n ; i++) {
			if(!visited[i]) {
				visit(i);
			}
		}
		int ans = 0 ;
		
		for(int i = 1 ; i <= n ; i++) {
			ans = Math.max(ans, dp[i]);
		}
		System.out.println(ans);
		sc.close();
	}
	
	static void visit(int vertex) {
		dp[vertex] = 0;
		visited[vertex] = true;
		for(int child : adj[vertex]) {
			if(!visited[child]) {
				visit(child);
			}
			dp[vertex] = Math.max(dp[vertex], 1 + dp[child]) ;
		}
	}
}
