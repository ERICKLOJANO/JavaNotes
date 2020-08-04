public class PowerOf {

	
	public static boolean isPowerOfFour(int num){
		
		//finds the natural log of both numbers and divides them
		// if num is the power of 4, a will be a whole number
		//therefore true
		double a = Math.log(num) / Math.log(4);
		double b = (int)a;
		
		if(a - b == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
