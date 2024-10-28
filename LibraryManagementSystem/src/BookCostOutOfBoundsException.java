
public class BookCostOutOfBoundsException extends RuntimeException{

	@Override
	public String toString() {
		return getClass()+" BookCost should be in between 300 and 2000";
	}

}
