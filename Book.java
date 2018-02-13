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

	public void setID(int id)
	{
		this.id = id;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public void setAuthor(Author author)
	{
		this.author = author;
	}

	public void setGenre(String genre)
	{
		this.genre = genre;
	}

	public void setYearOfPublication(int yearOfPublication)
	{
		this.yearOfPublication = yearOfPublication;
	}

	public String toString() //methodos toString
	{
		int id 					= this.getID();
		String title 			= this.getTitle();
		Author author 			= this.getAuthor();
		String genre 			= this.getGenre();
		int yearOfPublication 	= this.getYearOfPublication();

		String toPrint = "Book [ID: " + id + "], [Title: " + title +
				"], [Author: " + author.getName() + "], [Genre: " + genre +
				"], [Published: " + yearOfPublication + "]";
		return toPrint;
	}

}
