package hust.soict.dsai.aims.cart;
import java.util.ArrayList;
import java.util.Collections;

import hust.soict.dsai.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Cart {
	private static final int MAX_NUMBERS_ORDERED = 20;

	
//	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
	
//	public ArrayList<Media> getItemsOrdered() {
//		return itemsOrdered;
//	}
	

	public ObservableList<Media> getItemsOrdered() {
		return itemsOrdered;
	}
	

	public void addMedia(Media media) {
		if ((itemsOrdered.size()) >= MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is full");
		}
		else if (itemsOrdered.contains(media)) {
			System.out.println("Media already exists");
		}

		else {
			itemsOrdered.add(media);
			System.out.println("Media is added successfully");
			}
	}
	
	public void removeMedia(Media media) {
		if (itemsOrdered.contains(media)) {
			itemsOrdered.remove(media);
			System.out.println("Media has been removed");
		}
		else {
			System.out.println("Media does not exist");
		}
	}
	
	public float totalCost() {
		float totalCost = 0;
		for (Media media : itemsOrdered) {
			totalCost += media.getCost();
		}	
		return totalCost;
	}
	
	
//	public void print() {
//		System.out.println("***********************CART***********************");
//		System.out.println("Ordered Items:");
//		for (int i=0; i < qtyOrdered; i ++) {
//			System.out.println(Integer.toString(i) + ". " + itemsOrdered[i].toString());  
//		}
//		
//		System.out.println("Total cost: " + totalCost());
//	}
//	
//	public void idSearch(int id) {
//		boolean found = false;
//		for (DigitalVideoDisc disc : itemsOrdered) {
//			if (disc == null) {
//				break;
//			} else {
//				if (disc.isMatch(id)) {
//					System.out.println("found: " + disc.toString());
//					found = true;
//				}
//			}
//			
//
//		}
//		if (found == false) {
//			System.out.println("not found: " + id);
//		}
//	}
//	
//	public void titleSearch(String title) {
//		boolean found = false;
//		for (DigitalVideoDisc disc : itemsOrdered) {
//			if (disc == null) {
//				break;
//			} else {
//				if (disc.isMatch(title)) {
//					System.out.println("found: " + disc.toString());
//					found = true;
//				}
//			}
//			
//		}
//		if (found == false) {
//			System.out.println("not found: " + title);
//		}
//	}
	
	 public void print() {
		 System.out.println("***********************CART***********************");
		 System.out.println("Ordered Items:");
		 for (Media media : itemsOrdered) {
			 System.out.println(media.toString());
			}		 
		 System.out.println("Total cost: " + totalCost());
	 }
	 
	 public void sortCartCostTitle() {
		 Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
	 }
	 public void sortCartTitleCost() {
		 Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
	 }
	 
	 public void idSearch(int id) {
		 boolean found = false;
		 for (Media media : itemsOrdered) {
			 if (media == null) {
				 break;
			 }
			 else if (media.getId() == id) {
				 System.out.println("found: " + media.toString());
				 found = true;
				 break;
			 } 
		 }
		 if (found == false) {
			 System.out.println("Empty");
			 }
	 }	
	 
	 public void titleSearch(String title) {
		 boolean found = false;
		 String lowercaseTitle = title.toLowerCase();
		 for (Media media : itemsOrdered) {
			 if (media == null) {
				 break;
			 }
			 String[] keywords = lowercaseTitle.split(" ");
			 String lowercaseDVDTitle = media.getTitle().toLowerCase();
			 for (String keyword : keywords) {
			        if (lowercaseDVDTitle.contains(keyword)) {
			            found = true;
			            System.out.println("found: " + media.toString());
			            break;
			        }
			    }
		 }

		 if (found == false) {
			 System.out.println("Empty");
			 }
	 }


	
}
