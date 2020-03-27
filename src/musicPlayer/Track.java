package musicPlayer;
import java.util.*;

public class Track {
	private String Title;
	private String Artist;
	private int Year;
	private int Duration;
	List<String> songs = new ArrayList<String>();
	
	public Track(String title,String artist) {
		Duration = 0;
		Year = 0;
		Artist = artist;
		Title = title;
		String track = toString();
		songs.add(track);
	}
	
	public Track(String title,String artist,int year,int duration) {
		Duration = duration;
		Year = year;
		Artist = artist;
		Title = title;
		String track = toString();
		songs.add(track);
	}
	
	public String toString() {
		String listing,trackTime;
		int minutes,seconds;
		minutes = Duration / 60;
		seconds = Duration % 60;
		trackTime = minutes + ":" + seconds;
		if(Year == 0 && Duration == 0) {
			listing = "Title:" + Title + "\n" + "Artist:" +  Artist;
		}else {
			listing = "Title:" + Title + "Released:" + Year + "\n" + "Artist:" +  Artist + "\n" + "Duration:" + trackTime;
		}
		return listing;
	}
	
	public List<String> compareTo(List<String> music) {
		List<String> Tracks = new ArrayList<String>(music);
		Collections.sort(Tracks, String.CASE_INSENSITIVE_ORDER);
		return Tracks;
	}

}
