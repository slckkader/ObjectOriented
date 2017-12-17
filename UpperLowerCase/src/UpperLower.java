import java.util.Scanner;

public class UpperLower {

	public static void main(String[] args) {

		System.out.println("Give Me a word and letter");

		Scanner input = new Scanner(System.in);
		String girdi = input.nextLine();

		char a = input.next().charAt(0);

		System.out.println(myConvert(girdi, a));

	}

	public static String myConvert(String myStr, char myChar) {
		char[] array = new char[myStr.length()];
		int b;
		b = myChar;
		array = myStr.toCharArray();
		if (b >= 97 && b <= 122) {
			for (int i = 0; i < myStr.length(); i++) {

				if (myChar == array[i]) {
					array[i] = Character.toUpperCase(myChar);

				}

			}

		} else if (b >= 65 && b <= 90) {

			for (int i = 0; i < myStr.length(); i++) {

				if (myChar == array[i]) {
					array[i] = Character.toLowerCase(myChar);

				}

			}

		}
		myStr = String.valueOf(array);
		return myStr;
	}

}