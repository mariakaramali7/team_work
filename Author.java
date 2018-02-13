
//klash syggrafewn
public class Author {

	private static int counter;
	public static Author[] authors = new Author[10];

	private int id;  //dhlwsh metablhtwn
	private String name;
	private String nationality;
	private int numberOfWorks;

	public Author(String name, String nationality, int numberOfWorks) //costructor gia syggrafeis
	{
		counter++;        //metrhths counter gia ton constructor
		this.id 		   = counter;   //this gia to paron antikeimeno pou dhmiourgeitai
		this.name 		   = name;
		this.nationality   = nationality;
		this.numberOfWorks = numberOfWorks;
		authors[counter-1] = this;        //xrhsh tou counter gia na orisw th thesi tou pinaka
	}

	public int getID()   //methodoi getters
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public String getNationality()
	{
		return nationality;
	}

	public int getNumberOfWorks()
	{
		return numberOfWorks;
	}

public void setID(int id) //methodoi setters
	{
		this.id = id;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setNationality(String nationality)
	{
		this.nationality = nationality;
	}

	public void setNumberOfWorks(int numberOfWorks)
	{
		this.numberOfWorks = numberOfWorks;
	}

	public String toString() //methodos to String
	{
		int id 				= this.getID();
		String name 		= this.getName();
		String nationality  = this.getNationality();
		int numberOfWorks 	= this.getNumberOfWorks();

		String toPrint = "Author [ID: " + id + "], [Name: " + name +
					"], [Nationality: " + nationality + "], [Publications: " + numberOfWorks + "]";
		return toPrint;
	}

}