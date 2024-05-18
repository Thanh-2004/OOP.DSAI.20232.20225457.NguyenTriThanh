package hust.soict.dsai.aims.cart;
import java.util.ArrayList;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Cart {
	private static final int MAX_NUMBERS_ORDERED = 20;

	
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	

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
	
	
}
