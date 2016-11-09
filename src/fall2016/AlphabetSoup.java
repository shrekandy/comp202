package fall2016;
public class AlphabetSoup {

	public static void main(String[] args) {

	}

	public static int countChar(String str, char key) {
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == key) {
				counter++;
			}
		}
		return counter;
	}

	public static boolean haveChar(String[] strings, char key) {
		for (int i = 0; i < strings.length; i++) {
			if (countChar(strings[i], key) == 0) {
				return false;
			}
		}
		return true;
	}

	public static String[] copySubArray(String[] original, int startIndex, int endIndex) {
		String[] subArray = new String[endIndex - startIndex + 1];
		int indexOfSubArray = 0;
		for(int i = startIndex; i < endIndex; i++){
			subArray[indexOfSubArray] = original[i];
			indexOfSubArray++;
		}
		return subArray;
	}
}
