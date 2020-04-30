package musicPlayer;

public class Track implements Comparable<Track>{
	private String Title;
	private String Artist;
	private int Year;
    private int Duration;
	
	public Track(String title,String artist) {
		this.Duration = 0;
		this.Year = 0;
		this.Artist = artist;
		this.Title = title;
	}
	
	public Track(String title,String artist,int year,int duration) {
		this.Duration = duration;
		this.Year = year;
		this.Artist = artist;
		this.Title = title;
	}
	
	public String toString() {
		String listing,trackTime;
		int minutes,seconds;
		minutes = Duration / 60;
		seconds = Duration % 60;
		trackTime = minutes + ":" + seconds;
		if(this.Year == 0 && this.Duration == 0) {
			listing = "Title:" + this.Title + ",Artist:" +  this.Artist;
		}else {
			listing = "Title:" + this.Title + ",Released:" + this.Year + ",Artist:" + this.Artist + ",Duration:" + trackTime;
		}
		return listing;
	}
	
	public int compareTo(Track t) {
		return this.Title.compareToIgnoreCase(t.Title); 
	}
	
	public int getYear() {
		return Year;
	}
	
	public String getArtist() {
		return Artist;
	}
	
	public String getTitle() {
		return Title;
	}
	
	public int getDuration() {
		return Duration;
	}
	
	public void setYear(int year) {
		Year = year;
	}
	
	public void setArtist(String artist) {
		Artist = artist;
	}
	
	public void setDuration(int seconds) {
		Duration = seconds;
	}
	
	public void setTitle(String title) {
		Title = title;
	}
}