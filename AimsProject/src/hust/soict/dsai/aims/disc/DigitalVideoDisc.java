package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private int id;
	
	private static int nbDigitalVideoDiscs = 0;
	
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	
	public int getId() {
		return id;
	}
	
	
	public void setTitle(String title) {
		this.title = title;
	}

	
	public DigitalVideoDisc() {
		nbDigitalVideoDiscs += 1;
		this.id = nbDigitalVideoDiscs;
	}
	
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		nbDigitalVideoDiscs += 1;
		this.id = nbDigitalVideoDiscs;
	}
	
	public DigitalVideoDisc(String category, String title, float cost) {
		super();
		this.category = category;
		this.title = title;
		this.cost = cost;
		nbDigitalVideoDiscs += 1;
		this.id = nbDigitalVideoDiscs;
	}
	
	public DigitalVideoDisc(String director, String category, String title, float cost) {
		super();
		this.director = director;
		this.category = category;
		this.title = title;
		this.cost = cost;
		nbDigitalVideoDiscs += 1;
		this.id = nbDigitalVideoDiscs;
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.director = director;
		this.category = category;
		this.length = length;
		this.title = title;
		this.cost = cost;
		nbDigitalVideoDiscs += 1;
		this.id = nbDigitalVideoDiscs;
	}
	
	public String toString() {
		return "DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + ": " + this.getCost() + " $" ;
	}
	
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
}
