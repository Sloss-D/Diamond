package mrb;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		System.out.print("Sayi giriniz:");
		Scanner scan = new Scanner(System.in);
		int k = 0;

		k = scan.nextInt();
		// ÜST KISIM
		for (int i = 0; i < k; i++) {
			// BOŞLUKLAR
			for (int l = k - 1; i < l; l--) {

				System.out.print(" ");
			}
			// SOL
			for (int j = 0; j < i; j++) {
				System.out.print("*");

			}
			// SAĞ
			for (int j = 1; j < i; j++) {
				System.out.print("*");

			}

			System.out.println(" ");

		}
		// ALT KISIM
		for (int i = k - 2; i > 0; i--) {
			for (int l = k - 1; l > i; l--) {
				// BOŞLUK
				System.out.print(" ");
			}
			// SOL
			for (int j = 0; j < i; j++) {

				System.out.print("*");
			}
			// SAĞ
			for (int j = 1; j < i; j++) {
				System.out.print("*");

			}

			System.out.println(" ");

		}

	}
}
