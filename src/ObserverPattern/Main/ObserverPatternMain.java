package ObserverPattern.Main;

import ObserverPattern.Observer.LeftRunner;
import ObserverPattern.Observer.Observer;
import ObserverPattern.Observer.RightRunner;
import ObserverPattern.Subject.QuarterBack;

public class ObserverPatternMain {
	
	private static final int POCKET_SECONDS = 10;
	private static final int SECONDS_WITHOUT_PRESSURE = 7;
	private static final int ONE_SECOND = 1000;
	
	public static void main(String[] args) {
		System.out.println("Second 0...");		
		QuarterBack quarterBack = new QuarterBack();
		Observer rightRunner = new RightRunner(23, quarterBack);
		Observer leftRunner = new LeftRunner(5, quarterBack);
		for (int i = 0 ; i < POCKET_SECONDS; i++){
			System.out.println("Second " + (i + 1) + "...");
			if ((int) i == SECONDS_WITHOUT_PRESSURE){
				quarterBack.setPressure(true);
			}
			try {
				Thread.sleep(ONE_SECOND);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
