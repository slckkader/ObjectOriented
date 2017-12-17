//@author Selçuk.
//Computer Engineering.
import java.util.Scanner;

public class TCKN {

	public static boolean checktc(String number) {
		int tekHaneler = 0;
		int ciftHaneler = 0;
		int kural;
		int toplam = 0;

		if (number.length() < 11) {
			return false;
		}

		if (number.startsWith("0")) {
			return false;
		}

		char arrChar[] = number.toCharArray();
		int[] arr = new int[arrChar.length];
		for (int i = 0; i < arrChar.length; i++) {
			arr[i] = Integer.parseInt(arrChar[i] + "");
		}

		if (arr[10] % 2 != 0) {
			return false;
		}

		for (int i = 0; i < 9; i++) {

			toplam += arr[i];
			if ((i % 2) == 0) {
				tekHaneler += arr[i];
			} else {
				ciftHaneler += arr[i];
			}
		}

		toplam += arr[9];
		kural = ((tekHaneler * 7) - ciftHaneler);

		if (kural % 10 != arr[9]) {
			return false;
		}
		if ((toplam % 10) != arr[10]) {
			return false;
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the your T.C İdentity Number: ");
		String tc = input.nextLine();
		System.out.println(checktc(tc));
	}
}