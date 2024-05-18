package hust.soict.dsai.test.media;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Disc;
import hust.soict.dsai.aims.media.Media;

public class PolymorphismTest {

    public static void main(String[] args) {

        List<Media> mediae = new ArrayList<Media>();


        CompactDisc cd = new CompactDisc("TestCD", "Thanh");
        Disc disc = new Disc("TestDisc");


        mediae.add(cd);
        mediae.add(disc);

        for (Media media : mediae) {
            System.out.println(media.toString());
        }
        
        List<Media> mediaList = new ArrayList<>();

        // Add Media objects to the list
        mediaList.add(new DigitalVideoDisc("TitleA","Cat1", 10.0f));
        mediaList.add(new DigitalVideoDisc("TitleB", "Cat2" ,125.0f));
        mediaList.add(new DigitalVideoDisc("TitleC", "Cat3" ,20.0f));

        // Sort by title then cost
        Collections.sort(mediaList, Media.COMPARE_BY_TITLE_COST);
        System.out.println("Sorted by title then cost:");
        for (Media media : mediaList) {
            System.out.println(media.getTitle() + " - " + media.getCost());
        }

        // Sort by cost then title
        Collections.sort(mediaList, Media.COMPARE_BY_COST_TITLE);
        System.out.println("Sorted by cost then title:");
        for (Media media : mediaList) {
            System.out.println(media.getTitle() + " - " + media.getCost());
        }
    }
    
    
}
