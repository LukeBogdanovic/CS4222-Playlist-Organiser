package musicPlayer;
import java.util.*;

public class Playlist {
	private String Playlist;
	private List<Track> Tracks;
	
	public Playlist() {
		
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
		Track("Honey","BROCKHAMPTON",2018,195);
	}
	
	public void add(String title,String artist,int year,int duration) {
		
	}
	
	public void add(Track t) {
		
	}
	
	public boolean remove(String title) {
		if()
	}
	
	public void showList() {
		
	}
	
	public void play(boolean random) {
		
	}
	
	public void playOnly(String artist) {
		
	}
	
	public void playOnly(int year) {
		
	}

}
