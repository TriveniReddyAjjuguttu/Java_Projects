import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title;
		int bookID;
		int bookCost;
		int bookNoOfPages;
		String bookAuthor;
		Scanner sc = new Scanner(System.in);

		Library l = new Library();
		boolean isStart = true;
		while(isStart) {
			System.out.println(
					"Enter choice: \n 1.addBooks \n 2.displayBooks \n 3.searchBookBasedOnID \n 4.searchBookBasedOnAuthor \n 5.updateBookBasedOnTitle \n 6.RemoveBookBasedOnID \n 7.Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				while(true) {
					try {
						System.out.println("Enter BookTitle");
						title = sc.next();
						System.out.println("Enter BookID");
						bookID = sc.nextInt();
						System.out.println("Enter BookCost");
						bookCost = sc.nextInt();
						System.out.println("Enter BookNoOfPages");
						bookNoOfPages = sc.nextInt();
						System.out.println("Enter BookAuthor");
						bookAuthor = sc.next();
						l.addBook(new Book(title, bookID, bookCost, bookNoOfPages, bookAuthor));
						break;
					}
					catch(BookTitleMisMatchException b1) {
						System.out.println("Re-enter valid BookTitle ");
						title = sc.next();
					}
					catch(BookIdOutOfBoundsException b2) {
						System.out.println("Re-enter valid BookID");
						bookID = sc.nextInt();
					}
					catch (BookCostOutOfBoundsException b3) {
						System.out.println("Re-enter valid BookCost");
						bookCost = sc.nextInt();
					}
					catch(BookNoOfPagesOutOfBoundException b4) {
						System.out.println("Re-enter valid Book's NoOfPages");
						bookNoOfPages = sc.nextInt();
					}
					catch(BookAuthorMisMatchException b5) {
						System.out.println("Re-enter valid Book Author");
						bookAuthor = sc.next();
					}
					
				}
			}
			
			case 2: {
				l.displayBook();
			}
				break;
			case 3: {
				System.out.println("Enter Book ID");
				int id = sc.nextInt();
				l.searchBookBasedOnID(id);
			}
				break;
			case 4: {
				System.out.println("Enter Book Author");
				String author = sc.next();
				l.searchBookBaedOnAuthor(author);
			}
				break;
			case 5: {
				System.out.println("Enter Book Title");
				String title1 = sc.next();
				l.updateBookBasedOnTitle(title1);
			}
				break;
			case 6: {
				System.out.println("Enter Book ID");
				int bookid = sc.nextInt();
				l.removeBookBasedOnID(bookid);
			}

			case 7: {
				isStart = false;
				System.out.println("ThankYou..");
			}
				break;
			default: {
				System.out.println("Invalid choice");
			}
			}
		}
	}

}
