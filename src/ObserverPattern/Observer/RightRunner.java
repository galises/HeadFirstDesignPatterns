package ObserverPattern.Observer;

import ObserverPattern.Subject.Subject;

public class RightRunner implements Observer, Runner {
	
	private Integer receptorNumber;
	
	private boolean isQuarterBackCoverter;
	
	
	public RightRunner (Integer receptorNumber, Subject subject){
		this.receptorNumber = receptorNumber;
		subject.addObserver(this);
	}
	@Override
	public void run() {
		if (!isQuarterBackCoverter)
			System.out.println("Receptor " + receptorNumber.toString() + " : The quarterBack isn't under pressure I must run to the right");
		else
			System.out.println("Receptor " + receptorNumber.toString() + " : The quarterBack is under pressure I must wait");
	}

	@Override
	public void update(Boolean isQuarterBackCoverter) {
		this.isQuarterBackCoverter = isQuarterBackCoverter;
		run();
	}
}
