import java.util.Date;
//EX: A type of bike called Pulsar IS-A bike (suerclass). and it HAS-A Engine (pulsar extend Bike, it calls an Engine object)

public class Video extends MultiMedialItem{
	private String director;
	public Video(int id, String title, Date addedOn, int playingTime, String director) {
		super(id, title, addedOn, playingTime);
		this.director = director;
	}

	@Override
	public void CompareTo() {
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
}
