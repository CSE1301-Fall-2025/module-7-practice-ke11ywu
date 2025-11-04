package exam.codewriting.q3;

/*
 * We wish to create a Song class. A song has-a(n):
	name
	artist
	duration (in seconds)
 */
public class Song {
	
	// Define your instance variables here
	private String name;
	private String artist;
	private double duration;

	// Write the constructor for the Song class
	public Song(String name, String artist, double duration){
		this.name = name;
		this.artist = artist;
		this.duration = duration;
	}
	
	public String getName () {
		return this.name; //FIXME
	}
	
	public String toString () {
		return this.name + " by " + this.artist + ", " + this.duration + " seconds"; //FIXME
	}
	
	/**
	* When two songs are mashed up, a new Song should be created and returned.
	* The name and artist of the new song should contain both names and both
	* artists from the original songs, and the duration should be the average
	* of the durations of the original songs.
	*/
	public Song mashUp ( Song other ) {
		String newName = this.getName() + other.getName();
		String newArtist = this.artist + " ft. " + other.artist;
		double newDuration = (this.duration + other.duration) / 2;
		return new Song(newName, newArtist, newDuration); //FIXME
	}

	public static void main(String[] args){
		Song song1 = new Song("flash", "2hollis", 150.2);
		Song song2 = new Song("Bags", "Clairo", 201.7);
		System.out.println(song1);
		System.out.println(song2);
		System.out.println(song1.name);
		System.out.println(song1.mashUp(song2));
	}
}
