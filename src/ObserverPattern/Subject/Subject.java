package ObserverPattern.Subject;

import ObserverPattern.Observer.Observer;

public interface Subject {
	
	void addObserver(Observer observer);
	
	void removeObserver(Integer receptorNumber);
	
	void notifyObservers();
}
