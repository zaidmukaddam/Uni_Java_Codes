/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
	public static void main(String[] args) throws Exception {
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		if (T >= 1 && T <= 1000) {

			for (int i = 0; i < T; i++) {
				int G1 = sc.nextInt();
				int G2 = sc.nextInt();
				int S1 = sc.nextInt();
				int S2 = sc.nextInt();
				int B1 = sc.nextInt();
				int B2 = sc.nextInt();

				if (G1 >= 0 && G1 <= 30 && G2 >= 0 && G2 <= 30 && S1 >= 0 && S1 <= 30 && S2 >= 0 && S2 <= 30 && B1 >= 0
						&& B1 <= 30 && B2 >= 0 && B2 <= 30) {
					int ans1 = G1 + S1 + B1;
					int ans2 = G2 + S2 + B2;

					if (ans1 > ans2) {
						System.out.println("1");
					} else if (ans2 > ans1) {
						System.out.println("2");
					}
				}

			}

		}
		sc.close();
	}
}