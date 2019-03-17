import java.util.Date;

public abstract class MultiMedialItem extends Item {
	private int playingTime;
	public MultiMedialItem(String id, String title, Date addedOn, int playingTime) {
		super(id, title, addedOn);
		this.playingTime = playingTime;
	}
		
	public int getPlayingTime() {
		return playingTime;
	}
	public void setPlayingTime(int playingTime) {
		this.playingTime = playingTime;
	}
	
	
}
