import java.util.Date;

public class CD extends MultiMedialItem {
	private String artist;
	public CD(int id, String title, Date addedOn, int playingTime, String artist) {
		super(id, title, addedOn, playingTime);
		this.artist = artist;
	}

	@Override
	public void CompareTo() {		
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	
}
