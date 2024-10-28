
public class BookAuthorMisMatchException extends RuntimeException {

	@Override
	public String toString() {
		return getClass()+" Book Author should be James || Guido || EFcodd";
	}
}
