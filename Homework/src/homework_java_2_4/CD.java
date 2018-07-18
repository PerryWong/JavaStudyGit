package homework_java_2_4;

public class CD extends Item{

	private String artist;
	private int numOfTracks;
	
	public CD(String title, String artist, int numOfTracks, int playingTime, String comment) {
		super(title,playingTime,false,comment);
		this.artist = artist;
		this.numOfTracks = numOfTracks;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void print() {
		System.out.println("CD:");
		super.print();
		System.out.println(artist);
	}

}
