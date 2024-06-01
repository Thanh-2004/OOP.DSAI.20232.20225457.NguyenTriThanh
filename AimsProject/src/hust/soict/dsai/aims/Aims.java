package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.exception.PlayerException;

import java.util.Scanner;

import javax.naming.LimitExceededException;

public class Aims {
	public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}
	
	public static void storeMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}

	public static void mediaDetailsMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}

	public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
	}
	
	
	public static void filterMenu() {
        System.out.println("Option: ");
        System.out.println("----------------------------");
        System.out.println("1. Filter by id");
        System.out.println("2. Filter by title");
        System.out.println("0. Exit");
        System.out.println("----------------------------");
        System.out.println("Please choose a number: 0-1-2");
	}
	
	public static void sortMenu() {
        System.out.println("Option: ");
        System.out.println("----------------------------");
        System.out.println("1. Sort by cost");
        System.out.println("2. Sort by title");
        System.out.println("0. Exit");
        System.out.println("----------------------------");
        System.out.println("Please choose a number: 0-1-2");
	}
	
	public static void updateMenu() {
        System.out.println("Option: ");
        System.out.println("----------------------------");
        System.out.println("1. Add new media");
        System.out.println("2. Remove media");
        System.out.println("0. Exit");
        System.out.println("----------------------------");
        System.out.println("Please choose a number: 0-1-2");
	}
	
	public static void addMenu() {
        System.out.println("Option: ");
        System.out.println("----------------------------");
        System.out.println("1. Add new DVD");
        System.out.println("2. Add new CD");
        System.out.println("3. Add new Book");
        System.out.println("0. Exit");
        System.out.println("----------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Store store = new Store();
		Cart cart = new Cart();
        while(true){
            showMenu();
            int optionChoice = input.nextInt();
            if(optionChoice == 1){
//            	view store
            	store.printItemsInStore();  
            	storeMenu();
            	int viewStorehoice = input.nextInt();
	            if(viewStorehoice == 1){
	            	input.nextLine();
	                System.out.println("Enter the title of the media: ");
	                String title = input.nextLine();
	                boolean found = false;
	                for (Media item : store.getItemsInStore()) {
	                    if(item.getTitle().equals(title)){
	                        System.out.println(item.toString());
	                        found = true;
	                        while(true){
	                            mediaDetailsMenu();
	                            int seeDetailsChoice = input.nextInt();
	                            if(seeDetailsChoice == 1){
	                                cart.addMedia(item);
	                            }
	                            else if(seeDetailsChoice == 2){
	                                if(item instanceof DigitalVideoDisc){
	                                    try {
											((DigitalVideoDisc)item).play();
										} catch (PlayerException e) {
											// TODO Auto-generated catch block
											e.getMessage();
											e.toString();
											e.printStackTrace();
										}
	                                }
	                                else if(item instanceof CompactDisc){
	                                    try {
											((CompactDisc)item).play();
										} catch (PlayerException e) {
											// TODO Auto-generated catch block
											e.getMessage();
											e.toString();
											e.printStackTrace();
										}
	                                }
	                                else{
	                                    System.out.println("Cannot play this type of media");
	                                }
	                            }
	                            else if(seeDetailsChoice == 0){
	                                break;
	                            }
	                        }
	                        break;
	                    }
	                }
	                if(found == false){
	                    System.out.println("Media not found");
	                }
	            }
	            else if(viewStorehoice == 2){
	            	input.nextLine();
	                System.out.println("Enter the title of the media: ");
	                String title = input.nextLine();
	                boolean found = false;
	                for (Media item : store.getItemsInStore()) {
	                    if(item.getTitle().equals(title)){
	                        cart.addMedia(item);
	                        found = true;
	                        break;
	                    }
	                }
	                if(found == false){
	                    System.out.println("Media not found");
	                }
	            }
	            else if(viewStorehoice == 3){
	            	input.nextLine();
	                System.out.println("Enter the title of the media: ");
	                String title = input.nextLine();
	                boolean found = false;
	                for (Media item : store.getItemsInStore()) {
	                    if(item.getTitle().equals(title)){
	                        if(item instanceof DigitalVideoDisc){
	                            try {
									((DigitalVideoDisc)item).play();
								} catch (PlayerException e) {
									// TODO Auto-generated catch block
									e.getMessage();
									e.toString();
									e.printStackTrace();
								}
	                        }
	                        else if(item instanceof CompactDisc){
	                            try {
									((CompactDisc)item).play();
								} catch (PlayerException e) {
									// TODO Auto-generated catch block
									e.getMessage();
									e.toString();
									e.printStackTrace();
								}
	                        }
	                        else{
	                            System.out.println("Cannot play this media");
	                        }
	                        found = true;
	                        break;
	                    }
	                }
	                if(found == false){
	                    System.out.println("Media not found");
	                }
	            }
	            else if(viewStorehoice == 4){
	                cart.print();
	                while(true){
	                    cartMenu();
	                    int cartMenuChoice = input.nextInt();
	                    if(cartMenuChoice == 1){
	                        while(true){
	                        	filterMenu();
	
	                            int filterMenuChoice = input.nextInt();
	                            if(filterMenuChoice ==1){
	                            	input.nextLine();
	                                System.out.println("Enter the id of the media: ");
	                                int id = input.nextInt();
	                                cart.idSearch(id);
	                            }
	                            else if(filterMenuChoice ==2){
	                            	input.nextLine();
	                                System.out.println("Enter the title of the media to the filter: ");
	                                String title = input.nextLine();
	                                cart.titleSearch(title);
	                            }
	                            else if(filterMenuChoice ==0){
	                                break;
	                            }              
	                        }
	                    }
	                    else if(cartMenuChoice == 2){
	                        while(true){
	                        	sortMenu();
	
	                            int sortMenuChoice = input.nextInt();
	                            if(sortMenuChoice ==1){
	                            	cart.sortCartCostTitle();
	                            	cart.print();
	                            }
	                            else if(sortMenuChoice ==2){
	                            	cart.sortCartTitleCost();
	                            	cart.print();
	                            }
	                            else if(sortMenuChoice ==0){
	                                break;
	                            }              
	                        }
	                    }
	                    else if(cartMenuChoice == 3){
	                    	input.nextLine();
	                        System.out.println("Enter the title of the media: ");
	                        String title = input.nextLine();
	                        boolean found = false;
	                        for (Media item : cart.getItemsOrdered()) {
	                            if(item.getTitle().equals(title)){
	                                cart.removeMedia(item);
	                                found = true;
	                                break;
	                            }
	                        }
	                        if(found == false){
	                            System.out.println("Media not found");
	                        }
	                    }
	                    else if(cartMenuChoice == 4){
	                    	input.nextLine();
	                        System.out.println("Enter the title of the media you want to play: ");
	                        String title = input.nextLine();
	                        boolean found = false;
	                        for (Media item : cart.getItemsOrdered()) {
	                            if(item.getTitle().equals(title)){
	                                if(item instanceof DigitalVideoDisc){
	                                    try {
											((DigitalVideoDisc)item).play();
										} catch (PlayerException e) {
											// TODO Auto-generated catch block
											e.getMessage();
											e.toString();
											e.printStackTrace();
										}
	                                }
	                                else if(item instanceof CompactDisc){
	                                    try {
											((CompactDisc)item).play();
										} catch (PlayerException e) {
											// TODO Auto-generated catch block
											e.getMessage();
											e.toString();
											e.printStackTrace();
										}
	                                }
	                                else{
	                                    System.out.println("Cannot play this media");
	                                }
	                                found = true;
	                                break;
	                            }
	                        }
	                        if(found == false){
	                            System.out.println("Media not found");
	                        }
	                    }
	                    else if(cartMenuChoice == 5){
	                        System.out.println("An order has been placed");
	                    	cart = new Cart();
	                    }
	                    else if(cartMenuChoice == 0){
	                        break;
	                    }
	                }
	            }
	            else if(viewStorehoice == 0){
	                break;
	            }
            }
            else if(optionChoice == 2){
//            	update store
                while(true){
                	updateMenu();

                    int updateStoreChoice = input.nextInt();
                    if(updateStoreChoice == 1){
//                    	add
                        while(true){
                        	addMenu();

                            int addUpdateStoreChoice = input.nextInt();
                            if(addUpdateStoreChoice == 1){
                            	input.nextLine();
                                System.out.println("Enter the title of the DVD: ");
                                String title = input.nextLine();
                                System.out.println("Enter the category of the DVD: ");
                                String category = input.nextLine();
                                System.out.println("Enter the director of the DVD: ");
                                String director = input.nextLine();
                                System.out.println("Enter the length of the DVD: ");
                                int length = input.nextInt();
                                System.out.println("Enter the cost of the DVD: ");
                                float cost = input.nextFloat();
                                DigitalVideoDisc dvd = new DigitalVideoDisc(store.getItemsInStore().size(), title, category, director, length, cost);
                                store.addMedia(dvd);
//                                break;
                            }
                            else if(addUpdateStoreChoice == 2){
                            	input.nextLine();
                                System.out.println("Enter the title of the CD: ");
                                String title = input.nextLine();
                                System.out.println("Enter the category of the CD: ");
                                String category = input.nextLine();
                                System.out.println("Enter the director of the CD: ");
                                String director = input.nextLine();
                                System.out.println("Enter the cost of the CD: ");
                                float cost = input.nextFloat();
                                System.out.println("Enter the artist of the CD: ");
                                String artist = input.nextLine();
                                CompactDisc cd = new CompactDisc(store.getItemsInStore().size(), title, category, director, cost, artist);
                                store.addMedia(cd);
                            }
                            else if(addUpdateStoreChoice == 3){
                            	input.nextLine();
                                System.out.println("Enter the title of the Book: ");
                                String title = input.nextLine();
                                System.out.println("Enter the category of the Book: ");
                                String category = input.nextLine();
                                System.out.println("Enter the cost of the Book: ");
                                float cost = input.nextFloat();
                                Book book = new Book(store.getItemsInStore().size(), title, category, cost);
                                store.addMedia(book);
                            }
                            else if(addUpdateStoreChoice == 0){
                                break;
                            }
                        }
                    }
                    else if(updateStoreChoice == 2){
//                    	remove
                    	input.nextLine();
                        System.out.println("Enter the title of the media: ");
                        String title = input.nextLine();
                        boolean found = false;
                        for (Media item : store.getItemsInStore()) {
                            if(item.getTitle().compareTo(title) == 0){
                                store.removeMedia(item);
                                found = true;
                                break;
                            }
                        }
                        if(found == false){
                            System.out.println("Media not found");
                        }
                    }
                    else if(updateStoreChoice == 0){
                        break;
                    }
                }
            }
            else if(optionChoice == 3){
//            	see current cart
                cart.print();
                while(true){
                    cartMenu();
                    int cartMenuChoice = input.nextInt();
                    if(cartMenuChoice == 1){
                        while(true){
                        	filterMenu();

                            int filterMenuChoice = input.nextInt();
                            if(filterMenuChoice ==1){
                            	input.nextLine();
                                System.out.println("Enter the id of the media: ");
                                int id = input.nextInt();
                                cart.idSearch(id);
                            }
                            else if(filterMenuChoice ==2){
                            	input.nextLine();
                                System.out.println("Enter the title of the media: ");
                                String title = input.nextLine();
                                cart.titleSearch(title);
                            }
                            else if(filterMenuChoice ==0){
                                break;
                            }              
                        }
                    }
                    else if(cartMenuChoice == 2){
                        while(true){
                        	sortMenu();

                            int sortMenuChoice = input.nextInt();
                            if(sortMenuChoice ==1){

                                cart.getItemsOrdered().sort(Media.COMPARE_BY_COST_TITLE);
                                cart.getItemsOrdered().toString();
                            }
                            else if(sortMenuChoice ==2){
                                cart.getItemsOrdered().sort(Media.COMPARE_BY_TITLE_COST);
                                cart.getItemsOrdered().toString();
                            }
                            else if(sortMenuChoice ==0){
                                break;
                            }              
                        }
                    }
                    else if(cartMenuChoice == 3){
                    	input.nextLine();
                        System.out.println("Enter the title of the media: ");
                        String title = input.nextLine();
                        boolean found = false;
                        for (Media item : cart.getItemsOrdered()) {
                            if(item.getTitle().equals(title)){
                                cart.removeMedia(item);
                                found = true;
                                break;
                            }
                        }
                        if(found == false){
                            System.out.println("Media not found");
                        }
                    }
                    else if(cartMenuChoice == 4){
                    	input.nextLine();
                        System.out.println("Enter the title of the media: ");
                        String title = input.nextLine();
                        boolean found = false;
                        for (Media item : cart.getItemsOrdered()) {
                            if(item.getTitle().equals(title)){
                                if(item instanceof DigitalVideoDisc){
                                    try {
										((DigitalVideoDisc)item).play();
									} catch (PlayerException e) {
										// TODO Auto-generated catch block
										e.getMessage();
										e.toString();
										e.printStackTrace();
									}
                                }
                                else if(item instanceof CompactDisc){
                                    try {
										((CompactDisc)item).play();
									} catch (PlayerException e) {
										// TODO Auto-generated catch block
										e.getMessage();
										e.toString();
										e.printStackTrace();
									}

                                }
                                else{
                                    System.out.println("Cannot play this media");
                                }
                                found = true;
                                break;
                            }
                        }
                        if(found == false){
                            System.out.println("Media not found");
                        }
                    }
                    else if(cartMenuChoice == 5){
                    	System.out.println("An order has been placed");
                    	cart = new Cart();
                    }
                    else if(cartMenuChoice == 0){
                        break;
                    }
                }
            }
            else if(optionChoice == 0){
            	System.out.println("Bye");
                break;
            }        
        }
    

        input.close();
	}
}