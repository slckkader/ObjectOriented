/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;

import java.util.Arrays;

/**
 * 
 * @author Selçuk
 */
public class Library {

	public static void deleteBook(Book[] bookArray, String aWord) {
		Book x = new Book();
		String[] b = new String[100];
		String[] c = null;
		if (x.searchKeyword(aWord) == true)
			;
		{
			for (int m = 0; m < b.length; m++) {
				b[m] = Arrays.toString(bookArray[m].getrecordString());
				if (b[m] == null)
					break;
			}
			for (int i = 0; i < bookArray.length; i++) {
				if (b[i] == null)
					break;
				if (b[i].contains(aWord)) {
					bookArray[i].setrecordString(bookArray[i + 1]
							.getrecordString());
					bookArray[i + 1].setrecordString(c);
					System.out.println("Deleted!");
				}
			}
		}
	}

}