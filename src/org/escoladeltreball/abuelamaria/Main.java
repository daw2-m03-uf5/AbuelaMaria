package org.escoladeltreball.abuelamaria;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {

	final static int TEETH = 6;

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			int[] sup = new int[TEETH];
			int[] inf = new int[TEETH];

			for (int j = 0; j < TEETH; j++) {
				sup[j] = sc.nextInt();
			}

			for (int k = 0; k < TEETH; k++) {
				inf[k] = sc.nextInt();
			}

			if (solve(sup, inf)) {
				out.printf("SI%n");
			} else {
				out.printf("NO%n");
			}
		}

	}

	private static boolean solve(int[] sup, int[] inf) {
		int sum = sup[0] + inf[0];
		for (int i = 1; i < TEETH; i++) {
			if (sum != sup[i] + inf[i]) {
				return false;
			}
		}
		return true;
	}

}
