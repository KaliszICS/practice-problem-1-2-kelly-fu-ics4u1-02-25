public class PracticeProblem {

	public static boolean validIndex(int[] intArr, int index) {
		try{
			int test = intArr[index];
			return true;
		}
		catch (ArrayIndexOutOfBoundsException e){
				return false;
		}
		catch (Exception e){
			return false;
		}
	}


	public static int divide(int num, int numTwo){
		try{
			int out = num/numTwo;
			return out;
	}
		catch (Exception e){
			return 0;
	}
	}
	
	public static int safeConvertStringtoInt(String conver){
		try {
			int out = Integer.parseInt(conver);
			return out;
		}
		catch (Exception e){
			return 0;
		}
	}
}
	