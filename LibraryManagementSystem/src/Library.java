import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Library {

	private int libID;
	private String location;
	private Book b;
	private ArrayList<Book> al=new ArrayList<Book>();

	public void addBook(Book b) {
		al.add(b);
		System.out.println("Book is added succesfully..");
		
	}
	public void displayBook() {
		if(al.isEmpty()) {
			System.out.println("Books are not added yet..");
		}
		else {
			for(Book b:al) {
				b.display();
			}
		}
	}
	public void searchBookBasedOnID(int id) {
		boolean isFound=false;
		if(al.isEmpty()) {
			System.out.println("Book are not added yet..");
		}
		else {
			
			for(Book b:al) {
				if(b.getBookId()==id) {
					System.out.println("Book found: "+b.getBookTitle());
					isFound=true;
				}
			}
			
		}
		if(isFound==false) {
			throw new BookIdOutOfBoundsException();
		}
	}
	public void searchBookBaedOnAuthor(String author) {
		boolean isFound=false;
		if(al.isEmpty()) {
			System.out.println("Books are not added yet..");
		}
		else {
			
			for(Book b:al) {
				if(b.getAuthor().equals(author)) {
					System.out.println("Book found: "+b.getBookTitle());
					isFound=true;
				}
			}
			
		}
		if(isFound!=true) {
			throw new BookAuthorMisMatchException();
		}
	}
	public void updateBookBasedOnTitle(String title) {
		boolean isUpdate=false;
		if(al.isEmpty()) {
			System.out.println("Books are not added yet..");
		}
		else {
			for(Book b:al) {
				b.setCost(1000);
				System.out.println("BookCost is updated successfully.."+b.getBookTitle());
				isUpdate=true;
			}
			
		}
		if(isUpdate==false) {
			throw new BookTitleMisMatchException();
		}
		
	}
	public void removeBookBasedOnID(int id) {
		Iterator<Book> itr=al.iterator();
		boolean isRemoved=false;
		while(itr.hasNext()) {
			Book book=itr.next();
			if(book.getBookId()==id){
				itr.remove();
				isRemoved=true;
			}
		}
		if(isRemoved==false) {
			throw new BookIdOutOfBoundsException();
		}
	}
	
}
