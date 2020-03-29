package musicPlayer;
import java.util.*;

public class Playlist {
	private String Playlist;
	private List<Track> Tracks;
	
	public Playlist(String playlist) {
		this.Tracks = new ArrayList<Track>();
		this.Playlist = playlist;
	}
	
	@Override
	public String toString() {
	   String playlist,name;
	   name  = Playlist;
	   playlist = name;
	   playlist = playlist + "\n" + Tracks;
	   return playlist;
	}
	
	public void add(String title,String artist) {
		Track track = new Track(title,artist);
		Tracks.add(track);
	}
	
	public void add(String title,String artist,int year,int duration) {
		Track track = new Track(title,artist,year,duration);
		Tracks.add(track);
	}
	
	public void add(Track t) {
		Track track = new Track(t.Title,t.Artist,t.Year,t.Duration);
		Tracks.add(track);
	}
	
	public boolean remove(String title) {
		for(int i = 0; i < Tracks.size();i++) {
			String Title = getTitle(Tracks.get(i));
		    if(title.contentEquals(Title)) {
			   Tracks.remove(i); 
		    }
		}
		return false; 
	}
	
	public void showList() {
		Tracks.sort(Comparator.naturalOrder());
		if(Tracks.isEmpty()) {
			System.out.println(Playlist + "\n" + "The list is empty");
		}else {
			System.out.println(Playlist);
			for(int i = 0; i < Tracks.size();i++) {
				System.out.println(Tracks.get(i));
			}
		}
	}
	
	public void play(boolean random) {
		Random rand = new Random();
		if(random) {
			List<Track> randomised = new ArrayList<Track>(Tracks.size());
			for(int i = 0; i <= Tracks.size();i++) {
				int r = rand.nextInt(Tracks.size());
			    randomised.add(Tracks.get(r));
			    Tracks.remove(r);
			    System.out.println("Now Playing:" + randomised.get(i));
			}
		}else if(!random) {
			for(int i = 0; i < Tracks.size();i++) {
				Track track = Tracks.get(i);
				System.out.println("Now Playing:" + track);
			}
		}
	}
	
	public void playOnly(String artist) {
		List<Track> artistSongs = new ArrayList<Track>();
		if(artist.contains("The") || artist.contains("THE") || artist.contains("the")) {
			String temp = "The" + " ";
			artist = artist.replaceAll(temp, "");
		}
		for(int i = 0; i < Tracks.size();i++) {
			String Artist = getArtist(Tracks.get(i));
			if(Artist.equalsIgnoreCase(artist)) {
				artistSongs.add(Tracks.get(i));
				System.out.println("Now Playing:" + Tracks.get(i));
			}
		}
	}
	
	public void playOnly(int year) {
		List<Track> yearSongs = new ArrayList<Track>();
		for(int i = 0; i < Tracks.size();i++) {
			int Year = getYear(Tracks.get(i));
			if(Year == year) {
				yearSongs.add(Tracks.get(i));
				System.out.println("Now Playing:" + Tracks.get(i));
			}
		}
	}
	
	private static int getYear(Track t) {
		return t.Year;
	}
	
	private static String getArtist(Track t) {
		return t.Artist;
	}
	
	private String getTitle(Track t) {
		return t.Title;
	}

}