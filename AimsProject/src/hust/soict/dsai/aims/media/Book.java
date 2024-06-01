package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	
	private List<String> authors = new ArrayList<String>();
	
	

	public Book() {
		// TODO Auto-generated constructor stub
	}



	public Book(int id, String title, String category, float cost) {
		// TODO Auto-generated constructor stub
		super();
		setId(id);
		setTitle(title);
		setCategory(category);
		setCost(cost);
	}
	
	public Book(String title, String category, float cost) {
		// TODO Auto-generated constructor stub
		super();
		setTitle(title);
		setCategory(category);
		setCost(cost);
	}


	public List<String> getAuthors() {
		return authors;
	}



	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	public void addAuthor(String author) {
		if (authors.contains(author)) {
			System.out.println("Author: " + author + " is already in the list");
			
		} else {
			authors.add(author);
			System.out.println("Successfully add: " + author);
		}
	}
	
	public void removeAuthor(String author) {
		if (authors.contains(author)) {
			authors.remove(author);
			System.out.println("Successfully remove: " + author);
		} else {
			System.out.println("Author: " + author + " is not in the list");
		}
	}

}
