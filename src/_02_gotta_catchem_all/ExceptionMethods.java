package _02_gotta_catchem_all;

public class ExceptionMethods extends Exception{
	public static void main(String[] args) {
		
	}
	double divide(double x, double y) throws IllegalArgumentException {
		if(y==0.0) {
			throw new IllegalArgumentException();
		}
			return x/y;
		
	}
	String reverseString(String x) {
		String reverse = "";
		if(x=="") {
			throw new IllegalStateException();
		}
		for(int i = x.length()-1; i >= 0; i--) {
			reverse += x.charAt(i);
		}
		
		return reverse;
		
	}
}
