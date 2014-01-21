package ObserverPattern.Subject;

import java.util.ArrayList;
import java.util.List;

import ObserverPattern.Observer.Observer;

public class QuarterBack implements Subject {
	
	List<Observer> receptors;
	
	Boolean imUnderPressure;
	
	public QuarterBack(){
		receptors = new ArrayList<Observer>();
		imUnderPressure = false;
	}
	
	public void setPressure(Boolean pressure){
		imUnderPressure = pressure;
		if (imUnderPressure){
			System.out.println("QuarterBack: I'm under pressure. Receptors Stop!");
		}
		notifyObservers();
	}
	
	@Override
	public void notifyObservers() {
		for(Observer receptor : receptors){
			receptor.update(imUnderPressure);
		}
	}

	@Override
	public void removeObserver(Integer receptorNumber) {
		if (receptorNumber >= 0 && receptorNumber < receptors.size()){
			receptors.remove(receptorNumber);
		}
	}

	@Override
	public void addObserver(Observer observer) {
		receptors.add(observer);
		observer.update(imUnderPressure);
	}
}
