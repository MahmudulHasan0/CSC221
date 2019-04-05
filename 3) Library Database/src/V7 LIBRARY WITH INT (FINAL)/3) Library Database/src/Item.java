import java.util.Date;

public abstract class Item implements Comparable {
	//private String id;
	private int id;
	private String title;
	private Date addedOn; 
	public abstract void CompareTo();
	public Item(int id, String title, Date addedOn) {
		this.id = id;
		this.title = title;
		this.addedOn = addedOn;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getAddedOn() {
		return addedOn;
	}
	public void setAddedOn(Date addedOn) {
		this.addedOn = addedOn;
	}
	
}
