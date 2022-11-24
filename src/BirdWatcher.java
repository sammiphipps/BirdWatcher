
public class BirdWatcher {
	private int[] birdCount = new int[8]; 
	
	BirdWatcher(int[] birdCount) {
		this.birdCount = birdCount; 
	}
	
	public int[] getLastWeek() {
		return new int[] {0, 2, 5, 3, 7, 8, 4};
	}
	
	public int getToday() {
		return birdCount[birdCount.length - 1]; 
	}
	
	public void incrementTodaysCount() {
		int currentCount = birdCount[birdCount.length - 1];
		birdCount[birdCount.length - 1] = currentCount + 1; 
	}
	
	public boolean hasDayWithoutBirds() {
		boolean dayWithZeroBirds = false; 
		
		for(int i = 0; i < birdCount.length; i++) {
			if(birdCount[i] == 0) {
				dayWithZeroBirds = true; 
				break; 
			}
		}
		
		return dayWithZeroBirds; 
	}
	
	public int getCountForFirstDays(int lastDayInclude) {
		int totalBirdCount = 0; 
		
		for(int i = 0; i < lastDayInclude; i++) {
			totalBirdCount += birdCount[i]; 
		}
		
		return totalBirdCount; 
	}
	
	public int getBusyDays() {
		int busyDayCount = 0; 
		
		for(int i = 0; i < birdCount.length; i++) {
			if(birdCount[i] >= 5) {
				busyDayCount++; 
			}
		}
		
		return busyDayCount; 
	}
}
