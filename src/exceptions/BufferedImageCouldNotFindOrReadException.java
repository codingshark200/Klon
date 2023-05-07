package exceptions;

public class BufferedImageCouldNotFindOrReadException extends Exception{

	private String message;
	
	public BufferedImageCouldNotFindOrReadException(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return this.message;
	}
	
}
