
public class BookTitleMisMatchException extends RuntimeException {
	@Override
	public String toString() {
		return getClass()+" BookTitle should be Java || Python ||SQL";
	}
}
