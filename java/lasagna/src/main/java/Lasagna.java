public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
	public int expectedMinutesInOven() {
		return 40;
	}
	
	
	
	public int remainingMinutesInOven(int elapsedTime) {
		return expectedMinutesInOven() - elapsedTime;
	}
	
	public int preparationTimeInMinutes(int layers) {
		int minutesPerLayer = 2;
		return minutesPerLayer * layers;
	}
	
	public int totalTimeInMinutes(int layers, int elapsedTime) {
		return preparationTimeInMinutes(layers) + elapsedTime;
	}

    // TODO: define the 'remainingMinutesInOven()' method

    // TODO: define the 'preparationTimeInMinutes()' method

    // TODO: define the 'totalTimeInMinutes()' method
	
	
}