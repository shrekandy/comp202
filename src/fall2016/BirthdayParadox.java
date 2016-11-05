package fall2016;

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
	
	public static double runExperiment(int size) throws IllegalArgumentException{
		int iterations = 200;
		int range = 365;
		int duplicatedArrays = 0;
		
		if(size == 1){
			throw new IllegalArgumentException();
		}
		int[][] dates = generateAllData(iterations, size, range);
		for(int i =0; i < dates.length; i++){
			if(hasDuplicates(dates[i])){
				duplicatedArrays++;
			}
		}
		
		return (double)duplicatedArrays / (double) iterations;
		
	}
	
	public static int maxDay(int[][] dataTable){
		int frequecny = 0;
		int mode  = 0;
		
		for (int i = 0; i < dataTable.length; i++) {
			for (int j = 0; j < dataTable[i].length; j++) {
				if(countElement(dataTable, dataTable[i][j]) > frequecny){
					mode = dataTable[i][j];
				}
			}
		}
		return mode;
	}
	
	public static boolean hasDuplicates(int[] input){
		int[][] dataTable = new int[2][];
		dataTable[0] = input.clone();
		dataTable[1] = input.clone();
		
		for(int i = 0; i<dataTable[0].length; i++){
			if(countElement(dataTable, dataTable[0][i]) != 2){
				return true;
			}
		}
		return false;
	}
	
	public static int countElement(int[][] dataTable, int element) {
		int count = 0;
		for (int i = 0; i < dataTable.length; i++) {
			for (int j = 0; j < dataTable[i].length; j++) {
				if (dataTable[i][j] == element) {
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
