package musicPlayer;

public class Driver {
    public static void main(String[] args) {
        Playlist myFavourites = new Playlist();//sample Driver provided by Dermot
        myFavourites.add("(I Can't Get No) Satisfaction","The Rolling Stones",1965,197);
        myFavourites.add("Imagine", "John Lennon", 1971, 215);
        myFavourites.add("What's Going On", "Marvin Gaye");
        myFavourites.add("Respect", "Aretha Franklin");
        myFavourites.add("Hey Jude", "The Beatles", 1968, 347);
        myFavourites.add("Smells Like Teen Spirit", "Nirvana");
        myFavourites.add("What'd I Say", "Ray Charles");
        myFavourites.add("The Long and Winding Road", "The Beatles");
        myFavourites.add("The Times They are a Changin'","Bob Dylan");
        myFavourites.add("Yellow Submarine", "The Beatles", 1967, 235);
        System.out.println();
        myFavourites.showList();
        System.out.println();
        myFavourites.playAll(false);
        System.out.println();
        System.out.println();
        myFavourites.playAll(true);
        System.out.println();
        myFavourites.playOnly("Beatles");
        System.out.println();
        myFavourites.playOnly(1971);
        myFavourites.remove("WHAT'D I SAY");
        myFavourites.showList();
        
        Playlist myMusic = new Playlist("Assorted Music");//
        myMusic.add("Fluorescent Adolescent","Arctic Monkeys",2007,184);
        myMusic.add("Laid To Rest", "Lamb Of God", 2004, 215);
        myMusic.add("B.Y.O.B", "System Of A Down");
        myMusic.add("BOOGIE", "BROCKHAMPTON");
        myMusic.add("FACE","BROCKHAMPTON",2017,259);
        myMusic.add("About A Girl", "Nirvana");
        myMusic.add("The Less I Know The Better", "Tame Impala");
        myMusic.add("The Real Slim Shady", "Eminem");
        myMusic.add("RENTAL","BROCKHAMPTON");
        myMusic.add("Rich & Sad", "Post Malone",2018 ,206 );
        System.out.println();
        myMusic.showList();
        System.out.println();
        myMusic.playAll(false);
        System.out.println();
        System.out.println();
        myMusic.playAll(true);
        System.out.println();
        myMusic.playOnly("BrockHampton");
        System.out.println();
        myMusic.playOnly(2004);
        myMusic.remove("About A Girl");
        myMusic.setPlaylistName("Top Songs");
        myMusic.showList();
        
        Playlist Music = new Playlist("Music");//
        Music.add("Arabella","Arctic Monkeys",2013,207);
        Music.add("Californication", "Red Hot Chili Peppers", 1999, 330);
        Music.add("Toxicity", "System Of A Down");
        Music.add("INFATUATION", "BROCKHAMPTON");
        Music.add("PALACE","BROCKHAMPTON",2016,249);
        Music.add("Heart-Shaped Box", "Nirvana");
        Music.add("Lost in Yesterday", "Tame Impala");
        Music.add("My Name is", "Eminem");
        Music.add("Under the Bridge","Red Hot Chili Peppers");
        Music.add("Better Now", "Post Malone",2018 ,231);
        System.out.println();
        Music.showList();
        System.out.println();
        Music.playAll(false);
        System.out.println();
        System.out.println();
        Music.playAll(true);
        System.out.println();
        Music.playOnly("Red Hot Chili Peppers");
        System.out.println();
        Music.playOnly(2004);
        Music.remove("Better Now");
        Music.setPlaylistName("Random Music");
        Music.showList();
    }
}