package musicPlayer;

public class Driver {

	public static void main(String[] args) {
		Playlist call = new Playlist("Assorted Music");
		call.toString();
		call.add("BOOGIE","BROCKHAMPTON",2017,193);
		call.add("GOLD","BROCKHAMPTON",2017,266);
		call.add("J'OUVERT","BROCKHAMPTON",2018,234);
		call.showList();
		call.play(false);
		call.playOnly(2018);
		call.playOnly("The brockhampton");
		call.remove("GOLD");
		call.showList();
	}

}
