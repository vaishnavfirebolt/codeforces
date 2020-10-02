package day61;

import java.util.*;
import java.util.Scanner;

public class Codeforces632C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		List<String> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < n ; i++)list.add(sc.next());
		Collections.sort(list , new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				String a = s1+s2;
				String b = s2 + s1;
				return a.compareTo(b);
			}
		});
		
		for(int i = 0 ; i < n ; i++) {
			sb.append(list.get(i));
		}
		System.out.println(sb);
		
		sc.close();
	}
}
