//klassh bibliwn

public class Book {

	private static int counter;
	public static Book[] books = new Book[10];
//dhlwsh metablhtwn
	private int id;
	private String title;
	private Author author;
	private String genre;
	private int yearOfPublication;

	public Book(String title, Author author, String genre, int yearOfPublication)
	{
		counter++;
		this.id 		   		= counter;
		this.title 		   		= title;
		this.author		   		= author;
		this.genre		   		= genre;
		this.yearOfPublication 	= yearOfPublication;
		books[counter-1] 		= this;
	}
//methodoi getters &setters
	public int getID()
	{
		return id;
	}

	public String getTitle()
	{
		return title;
	}

	public Author getAuthor()
	{
		return author;
	}

	public String getGenre()
	{
		return genre;
	}

	public int getYearOfPublication()
	{
		return yearOfPublication;
	}



}
