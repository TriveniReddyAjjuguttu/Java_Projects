
public class BookNoOfPagesOutOfBoundException extends RuntimeException{

	@Override
	public String toString() {
		return getClass()+"Book's NoOfPages should be in between 500 to 3000";
	}
}
