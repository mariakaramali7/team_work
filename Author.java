
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

//oi methodoi setters tha prostethoun meta