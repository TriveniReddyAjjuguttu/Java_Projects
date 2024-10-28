
public class BookIdOutOfBoundsException extends RuntimeException {
	@Override
	public String toString() {
		return getClass()+" BookID should be even..";
	}

}
