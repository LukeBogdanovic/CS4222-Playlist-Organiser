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
		
	}
	
	public void add(String title,String artist,int year,int duration) {
		
	}
	
	public void add(Track t) {
		
	}
	
	public boolean remove(String title) {
		if(title.contains()) {
			return true;
		}else {
			return false;
		}
	}
	
	public void showList() {
		if(Tracks.isEmpty()) {
			System.out.println("The list is empty");
		}else {
			for(int i = 0; i < Tracks.size();i++) {
				System.out.println(Tracks.get(i));
			}
		}
	}
	
	public void play(boolean random) {
		Random rand = new Random();
		if(random) {
			int r = rand.nextInt(Tracks.size());
			Track shuffle = Tracks.get(r);
			System.out.println(shuffle);
		}else if(!random) {
			System.out.println();
		}
	}
	
	public void playOnly(String artist) {
		List<Track> artistSongs = new ArrayList<Track>();
	}
	
	public void playOnly(int year) {
		List<Track> yearSongs = new ArrayList<Track>();
	}

}
