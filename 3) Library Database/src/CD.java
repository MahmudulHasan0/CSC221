import java.util.Date;

public class CD extends MultiMedialItem {
	private String artist;
	public CD(String id, String title, Date addedOn, int playingTime, String artist) {
		super(id, title, addedOn, playingTime);
		this.artist = artist;
		super.setIsCD(true);
	}

	@Override
	public void CompareTo() {		
	}
	@Override
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	//THE ONLY UNIMPLEMENT ABSTRACT METHOD FROM THE SUPERCLASS (Item) IS THSI:
	@Override
	public String getDirector() {
		return "NONE";
	}
	@Override
	public String getAuthor() {
		return "NONE";
	}
}
