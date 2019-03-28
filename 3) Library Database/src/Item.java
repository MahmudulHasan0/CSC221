import java.util.Date;

public abstract class Item implements Comparable {
	//private String id;
	private String id;
	private String title;
	private Date addedOn; 
	private char itemType;
	
	public boolean isTextbook = false; //these booleans is just so i can print the right stuff
	public boolean isCD = false;
	public boolean isVideo = false;
	
	//ABSTRACT CLASSES SO THAT I CAN GET AUTHOR, ARTIST, AND DIRECTOR
	public abstract void CompareTo();
	protected abstract String getAuthor();
	protected abstract String getArtist();
	protected abstract String getDirector();
	


	public Item(String id, String title, Date addedOn) {
		this.id = id;
		this.title = title;
		this.addedOn = addedOn;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public char getItemType() {
		return itemType;
	}
	public void setItemType(char itemType) {
		this.itemType = itemType;
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
	public boolean isTextbook() {
		return isTextbook;
	}
	public void setIsTextbook(boolean isTextbook) {
		this.isTextbook = isTextbook;
	}
	public boolean isCD() {
		return isCD;
	}
	public void setIsCD(boolean isCD) {
		this.isCD = isCD;
	}
	public boolean isVideo() {
		return isVideo;
	}
	public void setIsVideo(boolean isVideo) {
		this.isVideo = isVideo;
	}
	
	
}
