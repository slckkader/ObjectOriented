/*@author Selçuk.*/
//Computer Engineering.
import java.util.Scanner;

public class Matrix {
	public static void main(String[] args) {

		int i;
		int c = 0;
		int sum = 0;
		int sum2 = 0;
		int j = 0;
		Scanner input = new Scanner(System.in);
		int q;
		System.out.print("Give me Size: ");

		q = input.nextInt();
		if (q >= 0 && q <= 10) {
			int[][] array = new int[q][q];

			for (i = 0; i < array.length; i++) {

				for (j = 0; j < array.length; j++) {
					System.out.println("Give me an element for Matrix");

					array[i][j] = input.nextInt();

				}

			}

			for (i = 0; i < array.length; i++) {
				System.out.print("\n");

				for (j = 0; j < array.length; j++) {

					System.out.print(array[i][j]);
					System.out.print("\t");

				}

			}
			for (i = 0; i < array.length; i++) {

				for (j = 0; j < array.length; j++) {
					sum2 = sum2 + array[i][j];
					sum = sum + array[j][i];

				}
				sum = 0;
				sum2 = 0;
				for (i = 0; i < array.length; i++) {
					for (j = 0; j < array.length; j++) {
						sum = sum + array[j][i];
						sum2 = sum2 + array[i][j];

					}
					if (sum == sum2) {
						c++;
					} else
						continue;
				}
			}

			if (c == q) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
		}
		input.close();
	}

}