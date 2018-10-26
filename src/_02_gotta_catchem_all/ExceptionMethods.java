package _02_gotta_catchem_all;

public class ExceptionMethods {
	double divide(double a, double b) throws IllegalArgumentException{
	if(b==0) {
		throw new IllegalArgumentException("Can't divide by 0");
	}
	else {
			return a/b;
	}
		
		
	}
	String reverseString(String s) throws IllegalStateException {
		if(s.length()==0) {
			throw new IllegalStateException();
		}
		else {
			String x= "";
			for (int i = s.length(); i >0; i--) {
				x+=s.substring(i-1,i);
			}
			return x;
		}
	}
}
