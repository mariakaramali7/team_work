

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {    //methodos main

		Scanner input = new Scanner(System.in);

		Author delta 	= new Author("Pinelopi Delta", "Greek", 20);
		Author exupery 	= new Author("Antoine de Saint-Exupery", "French", 9);
		Author machia 	= new Author("Niccolo Machiavelli", "Italian", 24);
		Author yalom 	= new Author("Irvin David Yalom", "American", 16);
		Author carroll	= new Author("Charles Lutwidge Dodgson (Lewis Carroll)", "English", 27);

		new Book("O Magas‚", delta, "Children's", 1935);
		new Book("The Little Prince", exupery, "Children's", 1943);
		new Book("The Prince", machia, "Non-fiction", 1532);
		new Book("When Nietzsche Wept", yalom, "Fiction", 1992);
		new Book("Alice's Adventures in Wonderland", carroll, "Children's", 1865);
		new Book("Ta Mistika Tou Valtou", delta, "Fiction", 1937);

		boolean exit = false;    //metavlhth boolean gia na mporoume na bgoume apo ton brogxo kai na mhn einai atermwn

		while(!exit) {
			print();

			String choice = input.nextLine();       //diabazoume epilogh tou xrhsth

			if(choice.equals("1"))
			{
				displayBooks();
			}
			else if(choice.equals("2"))
			{
				displayAuthors();
			}
			else if(choice.equals("3"))
			{
				System.out.print("\tEnter the name of the Author.\n\tType here: ");
				String auth = input.nextLine();
				searchBooks(auth);
			}
			else if(choice.equals("4"))
			{
				System.out.print("\tEnter the name of the Author.\n\tType here: ");
				String name = input.nextLine();
				System.out.print("\tEnter the nationality of the Author.\n\tType here: ");
				String nationality = input.nextLine();
				System.out.print("\tType the number of Publications of the Author.\n\tType here: ");
				int numberOfWorks = Integer.parseInt(input.nextLine());

				createAuthor(name, nationality, numberOfWorks);
			}
			else if(choice.equals("5"))
			{
				System.out.print("\tEnter the title of the Book.\n\tType here: ");
				String title = input.nextLine();
				System.out.print("\tEnter the id of the Author.\n\tType here: ");
				int id = Integer.parseInt(input.nextLine());

				if(Author.authors[id-1] != null)
				{

					System.out.print("\tType the genre of the book.\n\tType here: ");
					String genre = input.nextLine();
					System.out.print("\tEnter the year of publication of the book.\n\tType here: ");
					int yearOfPublication = Integer.parseInt(input.nextLine());

					createBook(title, id, genre, yearOfPublication);
				}
				else
				{
					System.out.println("\n\n***** Error! No author with id [" + id + "]. *****\n");
				}
			}
			else if(choice.equals("6"))
			{
				showNewestBook();
			}
			else if(choice.equals("7"))
			{
				System.out.print("\tEnter the id of the Book.\n\tType here: ");
				int id = Integer.parseInt(input.nextLine());

				if(Book.books[id-1] != null)
				{
					System.out.print("\tEnter new publication year.\n\tType here: ");
					int yearOfPublication = Integer.parseInt(input.nextLine());
					changePublicationYear(id, yearOfPublication);
				}
				else
				{
					System.out.println("\n\n***** Error! No book with id [" + id + "]. *****\n");
				}
			}
			else if(choice.equals("exit"))
			{
				exit = true;
			}
			else
			{
				System.out.println("Wrong input! Supported inputs are 1,2,3,4,5,6,7 or exit.\n\n");
			}
		}

		input.close();
	}

