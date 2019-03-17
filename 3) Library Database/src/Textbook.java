import java.util.Date;

public class Textbook extends Item {
	private String author;
	public Textbook(String id, String title, Date addedOn, String author) {
		super(id, title, addedOn);
		this.author = author;
		super.setIsTextbook(true);
	}
	
	@Override
	public void CompareTo() {
		//Dont know what exactly im suppost to implement here...
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String getAuthor() {
		return author;
	}
	
	//THE ONLY UNIMPLEMENT ABSTRACT METHOD FROM THE SUPERCLASS (Item) ARE THESE:
	@Override
	public String getArtist() {
		return "NONE";
	}
	@Override
	protected String getDirector() {
		// TODO Auto-generated method stub
		return "NONE";
	}
	

}
