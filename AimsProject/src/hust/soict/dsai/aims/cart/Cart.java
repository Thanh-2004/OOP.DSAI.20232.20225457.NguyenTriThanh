package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Cart {
	private static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	private int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered != MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered] = disc; 
			System.out.println("The disc has been added!");
			qtyOrdered ++;
		} else {
			System.out.println("Your cart is full!");
		}
		
	}
	
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
	    int index = -1;
	    for (int i = 0; i < qtyOrdered; i++) {
	        if (itemsOrdered[i].equals(disc)) {
	            index = i;
	            break;
	        }
	    }
	    
	    if (index != -1) {
	        for (int i = index; i < qtyOrdered - 1; i++) {
	            itemsOrdered[i] = itemsOrdered[i + 1];
	        }
	        qtyOrdered--;
	        System.out.println("The disc has been removed!");
	        return;
	    }
	    System.out.println("Cannot find the disc");
	    
	}

	public float totalCost() {
		float cost = 0f;
		for (int i=0; i < qtyOrdered ; i++) {
			cost += itemsOrdered[i].getCost();
		}
		return cost;
	}
	

	
	public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
		if ((qtyOrdered + dvdList.length) < MAX_NUMBERS_ORDERED) {
			for (DigitalVideoDisc disc : dvdList) {
				itemsOrdered[qtyOrdered] = disc; 
				System.out.println("The disc has been added!");
				qtyOrdered ++;
			}
		} else {
			System.out.println("Not enough space!");
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2 ) {
		if (qtyOrdered != MAX_NUMBERS_ORDERED -1) {
			itemsOrdered[qtyOrdered] = dvd1; 
			System.out.println("The disc has been added!");
			qtyOrdered ++;
			
			itemsOrdered[qtyOrdered] = dvd2; 
			System.out.println("The disc has been added!");
			qtyOrdered ++;
		} else {
			System.out.println("Not enough space!");
		}
	}
	
	
	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		for (int i=0; i < qtyOrdered; i ++) {
			System.out.println(Integer.toString(i) + ". " + itemsOrdered[i].toString());  
		}
		
		System.out.println("Total cost: " + totalCost());
		System.out.println("***************************************************");
	}
	
	public void idSearch(int id) {
		boolean found = false;
		for (DigitalVideoDisc disc : itemsOrdered) {
			if (disc == null) {
				break;
			} else {
				if (disc.isMatch(id)) {
					System.out.println("found: " + disc.toString());
					found = true;
				}
			}
			

		}
		if (found == false) {
			System.out.println("not found: " + id);
		}
	}
	
	public void titleSearch(String title) {
		boolean found = false;
		for (DigitalVideoDisc disc : itemsOrdered) {
			if (disc == null) {
				break;
			} else {
				if (disc.isMatch(title)) {
					System.out.println("found: " + disc.toString());
					found = true;
				}
			}
			
		}
		if (found == false) {
			System.out.println("not found: " + title);
		}
	}
	
	
}
