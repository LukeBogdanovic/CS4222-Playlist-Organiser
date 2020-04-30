package musicPlayer;
import java.util.*;

public class Playlist {
	private String Playlist;
	private List<Track> Tracks;
	
	public Playlist(String playlist) {
		this.Tracks = new ArrayList<Track>();
		this.Playlist = playlist;
	}
	
	public Playlist() {
		this.Tracks = new ArrayList<Track>();
		this.Playlist = "My Playlist";
	}
	
	public String toString() {
	   String playlist,name;
	   name = Playlist;
	   playlist = name + "\n" + Tracks;
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
		Tracks.add(t);
	}
	
	public boolean remove(String title) {
		for(Track t : Tracks) {
		    if(t.getTitle().toUpperCase().compareTo(title.toUpperCase()) == 0) {
			   Tracks.remove(t);
			   return true;
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
	
	public void playAll(boolean random) {
		if(random) {
			List<Track> randomised = Tracks;
			Collections.shuffle(randomised);
			for(Track t : randomised) {			   
			    System.out.println("Now Playing:" + t);
			}
		}else if(!random) {
			for(Track t : Tracks) {
				System.out.println("Now Playing:" + t);
			}
		}
	}
	
	public void playOnly(String artist) {
		if(artist.toUpperCase().contains("the".toUpperCase())) {
			String actualArtist = artist.replace("THE", "");
		    for(Track t : Tracks) {			
			    if(t.getArtist().equalsIgnoreCase(actualArtist)) {
				    System.out.println("Now Playing:" + t);
			    }
			}
		}else {
			for(Track t : Tracks) {			
			    if(t.getArtist().toUpperCase().contains(artist.toUpperCase())) {
				    System.out.println("Now Playing:" + t);
			    }
			}
		}
	}
	
	public void playOnly(int year) {
		for(Track t : Tracks) {			
			if(t.getYear() == year) {
				System.out.println("Now Playing:" + t );
			}
		}
	}
	
	public String getPlaylistName() {
		return this.Playlist;
	}
	
	public void setPlaylistName(String name) {		
		this.Playlist = name;	
	}
}