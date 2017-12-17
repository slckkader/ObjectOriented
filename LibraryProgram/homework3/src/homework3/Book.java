package homework3;

import java.util.Scanner;

/**
 * 
 * @author Selçuk
 */
public class Book {

	private String bookName; /* Name Of Books */
	private String authorName; /* Name of Authors */
	private String isbnNumber; /* Book's ISBN number */
	private int numPages; /* Number of Page */
	private int pubYear; /* Year of publishing */
	private String[] keyWords; /* Keyword Signatures */
	private int k = 0; /* İndex of recordString */
	private String[] recordString = new String[100]; /*
													 * All things in this
													 * record.That is a big
													 * String
													 */

	public Book() {

	};

	public Book(String bookName, String authorName, String isbnNumber,
			int numPages, int pubYear, String[] keyWords) {
		bookName = null; /* İnitializing all things */
		authorName = null; /* İnitializing all things */
		isbnNumber = null; /* İnitializing all things */
		numPages = 0; /* İnitializing all things */
		pubYear = 0; /* İnitializing all things */
		keyWords = null; /* İnitializing all things */
		recordString = null; /* İnitializing all things */
	}

	public String getBookName() { /* Generating getters */
		return this.bookName;
	}

	public String getauthorName() { /* Generating getters */
		return authorName;
	}

	public String getisbnNumber() { /* Generating getters */
		return isbnNumber;
	}

	public int getnumPages() { /* Generating getters */
		return numPages;
	}

	public int getpubYear() { /* Generating getters */
		return pubYear;
	}

	public String[] getkeyWords() { /* Generating getters */
		return keyWords;
	}

	public String[] getrecordString() { /* Generating getters */
		return recordString;
	}

	public void setBooksName(String booksName) { /* Generating setters */
		if (booksName.length() < 2) { /*
									 * Book’s name which must have at least 2
									 * letters.
									 */
			System.exit(0); /* Exit the program. */
		}
		this.bookName = booksName;
	}

	public void setauthorsName(String authorsName) { /* Generating setters */
		if (authorsName.length() < 3) { /*
										 * Author’s name which must have at
										 * least 3 letters.
										 */
			System.exit(0); /* Exit the program. */
		}
		this.authorName = authorsName;
	}

	public void setisbnNumber(String isbnNumber) { /* Generating setters */
		if (isbnNumber.length() != 13) { /* ISBN must have 13 digit. */
			System.exit(0); /* Exit the program. */
		}
		this.isbnNumber = isbnNumber;
	}

	public void setpages(int pages) { /* Generating setters */
		if (pages < 0) { /*
						 * Number of pages in the book which must be a positive
						 * number.
						 */
			System.exit(0); /* Exit the program. */
		}
		this.numPages = pages;
	}

	public void setYear(int Year) { /* Generating setters */
		if (Year < 1923 || Year > 2016) { /*
										 * Publication year which must be a
										 * positive number between 1923 and
										 * 2016.
										 */
			System.exit(0); /* Exit the program. */
		}
		this.pubYear = Year;
	}

	public void setkeywords(String[] keywords) { /* Generating setters */
		if (keywords.length < 3 && keywords.length > 5) { /*
														 * The book’s keywords
														 * which are at least 3
														 * words and most 5
														 * words
														 */
			System.exit(0); /* Exit the program. */
		}
		this.keyWords = keywords;
	}

	public void setrecordString(String[] recordString) { /* Generating setters */
		this.recordString = recordString;
	}

	public void addBook() { /* Allows to add new books to the library. */
		StringBuilder b = new StringBuilder(); /*
												 * Creating StringBuilder
												 * object.This name is b
												 */
		if (bookName.charAt(1) != ' ') { /*
										 * If user write no specific
										 * characters(A,D,X,Q) we want to add,so
										 * we controll charAt(1).
										 */
			b.append(bookName); /* we can append with StringBuilder. */
		} else {
			b.append(bookName.substring(2)); /*
											 * if charat(1)=space we dont add A
											 * or X or D or Q so we use
											 * substring(2).
											 */
		}
		b.append(", "); /* We append the ", " on the b object */
		b.append(authorName); /* We append the author name on the b object */
		b.append(", "); /* We append the ", " on the b object */
		b.append(isbnNumber); /* We append the isbnNumber on the b object */
		b.append(", "); /* We append the ", " on the b object */
		b.append(numPages); /* We append the numPages on the b object */
		b.append(", "); /* We append the ", " on the b object */
		b.append(pubYear); /* We append the pubYear on the b object */
		b.append(", "); /* We append the ", " on the b object */
		/* That are desired intended things */
		for (int l = 0; l < keyWords.length; l++) { /*
													 * We append the all
													 * keyWords using this loop.
													 */
			b.append(keyWords[l]);
			b.append(", "); /* We append the ", " on the b object */
		}

		recordString[k] = b.toString();/* We add to recordString with k index */
		k++; /* After we increase index */
		System.out.println("Added"); /* We say the status */
	}

	public boolean searchKeyword(String aWord) { /*
												 * We use boolean type for the
												 * search keywords on the
												 * recordString.
												 */
		Book x = new Book(); /* Creating Book object.This name is x */
		for (int i = 0; i <= recordString.length; i++) {
			/* We controll in the all the String recordString using this loop. */
			if (recordString[i] == null) {
				break; /* If recordString[i]==null we want break. */
			}
			if (recordString[i].contains(aWord)) {

				return true; /*
							 * If recordstring[i].contains(aWord) we want return
							 * true this boolean type.
							 */
			}
		}
		return false; /* If other status we want return false this boolean type. */
	}

	public void displayBook() { /*
								 * Prints all of the data fields separated by a
								 * comma in a single line.
								 */
		for (int s = 0; s < recordString.length; s++) {
			if (recordString[s] == null)
				break;
			System.out.println(recordString[s]);
		}
	}

	public static void main(String[] args) { /* Main method. */
		int t = 0; /* a Counter. */
		Scanner input = new Scanner(System.in);/*
												 * Scanner object.This name is
												 * input.
												 */
		String selcuk;/* a String with selcuk name. */
		String[] Books = new String[100];/*
										 * 100 elements a Book String
										 * declaration.
										 */
		Book[] b = new Book[100]; /* 100 elements a Book array object. */
		for (int q = 0; q < b.length; q++) {
			b[q] = new Book();
		}
		Library y = new Library();/* Creating a Library object.This name is y. */
		while (true) {
			/* OUTPUTS. */
			System.out.println("Press A to insert a book");
			System.out.println("Press D to delete a book");

			System.out.println("Press X to display all book");
			System.out.println("Press Q to exit");
			System.out.print("Your choice: ");
			selcuk = input.nextLine();

			if (selcuk.charAt(0) == 'A') { /*
											 * If input's first element is 'A'
											 * this if running.
											 */
				Books = selcuk.split(", "); /* We seperate from ", " */
				String[] key = new String[Books.length - 5]; /*
															 * For the go to
															 * Book's name. We
															 * create a key
															 * object from
															 * Book.length-5.
															 */
				b[t].setBooksName(Books[0]);/* First element is name of book. */
				b[t].setauthorsName(Books[1]);/* Second element is name of author. */
				b[t].setisbnNumber(Books[2]);/* Third element is isbnNumber. */
				b[t].setpages(Integer.parseInt(Books[3]));/*
														 * Fourth element is
														 * pageNumber (cast
														 * int).
														 */
				b[t].setYear(Integer.parseInt(Books[4]));/*
														 * Fifth element is
														 * pubYear (cast int).
														 */
				int k = 0;
				for (int i = 5; i < Books.length; i++) { /*
														 * All elements of book
														 * we declare keys.
														 */
					key[k] = Books[i];
					k++;
				}
				b[t].setkeywords(key);
				b[t].addBook();
				t++;
			}

			if (selcuk.charAt(0) == 'D') { /*
											 * If the first input == D we go to
											 * delete function.
											 */
				Library.deleteBook(b, selcuk.substring(2)); /*
															 * We delete from
															 * substring
															 * (2).Because we
															 * don't want remove
															 * D
															 */
			}

			if (selcuk.charAt(0) == 'X') { /*
											 * If the first input == X we go to
											 * display function.
											 */
				for (int e = 0; e < b.length; e++) {
					if (b[e].recordString == null)
						break;
					b[e].displayBook();
				}
				continue;
			}
			if (selcuk.charAt(0) == 'Q') { /*
											 * If the first input == Q we exit
											 * from program.
											 */
				System.out.println("Good Bye!");
				System.exit(0);
			}
			if (selcuk.charAt(1) != ' ') { /* Similar.. */
				Books = selcuk.split(", ");
				String[] key = new String[Books.length - 5];
				b[t].setBooksName(Books[0]);
				b[t].setauthorsName(Books[1]);
				b[t].setisbnNumber(Books[2]);
				b[t].setpages(Integer.parseInt(Books[3]));
				b[t].setYear(Integer.parseInt(Books[4]));
				int k = 0;
				for (int i = 5; i < Books.length; i++) {
					key[k] = Books[i];
					k++;
				}
				b[t].setkeywords(key);
				b[t].addBook();
				t++;
			}
		}
	}

}