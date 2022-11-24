import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
		BirdWatcher bw = new BirdWatcher(birdsPerDay); 
		
		System.out.println("Last Week Count: " + Arrays.toString(bw.getLastWeek()));
		System.out.println("Today Count: " + bw.getToday()); 
		
		bw.incrementTodaysCount();
		System.out.println("Today Count after Incrementing: " + bw.getToday()); 
		
		System.out.println("Any Days Without Birds: " + bw.hasDayWithoutBirds()); 
		
		System.out.println("Number of Birds in First 4 Days: " + bw.getCountForFirstDays(4)); 
		
		System.out.println("Number of Busy Days: " + bw.getBusyDays()); 
	}

}
