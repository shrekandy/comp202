package fall2016;

public class WeatherUtilities {
	public static void main(String[] args){
		
	}
	
	public static int countGoodDays(WeatherEntry[] weatherEntries){
		int goodDays = 0;
		for(int i = 0 ; i < weatherEntries.length; i++){
			if(weatherEntries[i].isGoodWeather()){
				goodDays++;
			}
		}
		return goodDays;
	}
	
	public static int countGoodDays(double[] temperaturesInCelsius, boolean[] sunninessDays){
		if(temperaturesInCelsius.length != sunninessDays.length){
			throw new IllegalArgumentException("temperaturesInCelsius.length != sunninessDays.length");
		}
		int goodDays = 0;
		for(int i = 0; i < temperaturesInCelsius.length; i++){
			if(temperaturesInCelsius[i] > -30 && sunninessDays[i]){
				goodDays ++;
			}
		}
		return goodDays;
	}
}
