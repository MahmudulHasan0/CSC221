import java.util.Date;

public class Textbook extends Item {
	private String author;
	public Textbook(int id, String title, Date addedOn, String author) {
		super(id, title, addedOn);
		this.author = author;
	}
	
	@Override
	public void CompareTo() {
		// TODO Auto-generated method stu
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	

}
