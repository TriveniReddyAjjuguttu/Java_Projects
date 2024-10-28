
public class Book {
	private String bookTitle;
	private int bookId;
	private int cost;
	private int noOfPages;
	private String author;
	public Book() {
		
	}
	public Book(String bookTitle, int bookId, int cost, int noOfPages, String author) {
		if(validateBookTitle(bookTitle))
			this.bookTitle = bookTitle;
		else
			throw new BookTitleMisMatchException();
		if(validateID(bookId))
			this.bookId = bookId;
		else
			throw new BookIdOutOfBoundsException();
		if(validateCost(cost))
			this.cost = cost;
		else
			throw new BookCostOutOfBoundsException();
		if(validateNoOfPages(noOfPages))
			this.noOfPages = noOfPages;
		else
			throw new BookNoOfPagesOutOfBoundException();
		if(validateAuthor(author))
			this.author = author;
		else
			throw new BookAuthorMisMatchException();
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean validateBookTitle(String bookTitle){
		if(bookTitle.equals("Java")||bookTitle.equals("Python")||bookTitle.equals("SQL"))
			return true;
		return false;
	}
	public boolean validateID(int bookId) {
		if(bookId%2==0)
			return true;
		return false;
	}
	public boolean validateCost(int cost) {
		if(cost>=300&&cost<=2000)
			return true;
		return false;
	}
	public boolean validateNoOfPages(int noOfPages) {
		if(noOfPages>=500&&noOfPages<=3000)
			return true;
		return false;
	}
	public boolean validateAuthor(String author) {
		if(author.equals("James")||author.equals("Guido")||author.equals("EFcodd"))
			return true;
		return false;
	}
	public void display() {
		System.out.println("BookTitle:"+getBookTitle());
		System.out.println("BookId:"+getBookId());
		System.out.println("BookCost:"+getCost());
		System.out.println("BookNoOfPages:"+getNoOfPages());
		System.out.println("BookAuthor:"+getAuthor());
	}
	@Override
	public String toString() {
		return "\n bookTitle=" + bookTitle + "\n bookId=" + bookId + "\n cost=" + cost + "\n noOfPages=" + noOfPages
				+ "\n author=" + author + "\n";
	}
	

}
