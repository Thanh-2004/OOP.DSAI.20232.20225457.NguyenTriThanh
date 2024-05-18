package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{

//	private String director;
//	private int length;

	
	private static int nbDigitalVideoDiscs = 0;

	
	
	
	
//	public DigitalVideoDisc() {
//		super();
//		nbDigitalVideoDiscs += 1;
//		setId(nbDigitalVideoDiscs);
//	}

	public DigitalVideoDisc(String title) {
		super(title);
		nbDigitalVideoDiscs += 1;
		setId(nbDigitalVideoDiscs);
	}
	
	public DigitalVideoDisc(String category, String title, float cost) {
		super(category, title, cost);
		nbDigitalVideoDiscs += 1;
		setId(nbDigitalVideoDiscs);
	}
	
	public DigitalVideoDisc(String director, String category, String title, float cost) {
		super(director,category, title, cost);
		nbDigitalVideoDiscs += 1;
		setId(nbDigitalVideoDiscs);
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, director, length , cost);
		nbDigitalVideoDiscs += 1;
		setId(nbDigitalVideoDiscs);
	}
	
	
//	public String toString() {
//		return "DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + ": " + this.getCost() + " $" ;
//	}
	
	public boolean isMatch(String title) {
		String lowercaseTitle = title.toLowerCase();
		String[] keywords = lowercaseTitle.split(" ");
		
		for (String keyword : keywords) {
			if (this.getTitle().toLowerCase().contains(keyword)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isMatch(int id) {
		if (this.getId() == id) {
			return true;
		}
		return false;
	}
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
}
