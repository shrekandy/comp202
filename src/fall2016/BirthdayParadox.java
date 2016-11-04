import java.util.Arrays;
import java.util.Random;

public class BirthdayParadox {

	public static void main(String[] args) {
		// for(int i = 0; i < 10; i++){
		// System.out.println(Arrays.toString(generateArray(20+i, 20)));
		// }
		// int[][] table = generateAllData(3, 6, 20);
		// System.out.println(Arrays.deepToString(table));
		// System.out.println(countElement(table, 19));

	}

	public static int countElement(int[][] dataTalbe, int element) {
		int count = 0;
		for (int i = 0; i < dataTalbe.length; i++) {
			for (int j = 0; j < dataTalbe[i].length; j++) {
				if (dataTalbe[i][j] == element) {
					count++;
				}
			}
		}
		return count;
	}

	public static int[][] generateAllData(int iterations, int size, int range) {
		int[][] allData = new int[iterations][size];
		for (int i = 0; i < iterations; i++) {
			allData[i] = generateArray(size, range);
		}
		return allData;
	}

	public static int[] generateArray(int size, int range) {
		int[] arrayToReturn = new int[size];
		Random rand = new Random();
		for (int i = 0; i < arrayToReturn.length; i++) {
			arrayToReturn[i] = rand.nextInt(range);
		}
		return arrayToReturn;
	}

}
