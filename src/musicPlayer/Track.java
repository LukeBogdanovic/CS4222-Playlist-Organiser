package musicPlayer;

class Track implements Comparable<Track>{
	String Title;
	String Artist;
	int Year;
    int Duration;
	
	Track(String title,String artist) {
		this.Duration = 0;
		this.Year = 0;
		this.Artist = artist;
		this.Title = title;
	}
	
	Track(String title,String artist,int year,int duration) {
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
		if(Year == 0 && Duration == 0) {
			listing = "Title:" + Title + "\n" + "Artist:" +  Artist;
		}else {
			listing = "Title:" + Title + "Released:" + Year + "\n" + "Artist:" +  Artist + "\n" + "Duration:" + trackTime;
		}
		return listing;
	}
	
	public int compareTo(Track t) {
		int title = this.Title.compareToIgnoreCase(t.Title);
		return title == 0 ? this.Title.compareToIgnoreCase(t.Title) : title; 
	}

}
