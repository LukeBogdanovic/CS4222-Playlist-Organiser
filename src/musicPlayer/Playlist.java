package musicPlayer;
import java.util.*;

public class Playlist {
	private String Playlist;
	private List<Track> Tracks;
	
	public Playlist(String playlist) {
		List<Track> trackList = new ArrayList<Track>(Tracks);
		this.Playlist = playlist;
	}
	
	public String toString() {
	   String playlist,name;
	   name  = Playlist;
	   for(int i = 0;i < Tracks.size(); i++) {
		   Tracks.get(i).toString();
	   }
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
		Track track = new Track();
	}
	
	public boolean remove(String title) {
		if(title.contains(Track.Title)) {
			return true;
		}else {
			return false;
		}
	}
	
	public void showList() {
		if(Tracks.isEmpty()) {
			System.out.println(Playlist);
			System.out.println("The list is empty");
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
			int r = rand.nextInt(Tracks.size());
			for(int i = 0; i < Tracks.size();i++) {
			    Track shuffle = Tracks.get(r);
			    System.out.println("Now Playing:" + shuffle);
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
		for(Track Tracks : Tracks) {
			if(Tracks.equals(artist)) {
				
			}
		}
	}
	
	public void playOnly(int year) {
		List<Track> yearSongs = new ArrayList<Track>();
		for(Track Tracks : Tracks) {
			if(Tracks.equals(Track.Artist));
		}
	}

}
