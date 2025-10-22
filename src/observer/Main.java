package observer;

import java.util.Observable;

import domain.Covid19Pacient;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Observable	pacient=new	Covid19Pacient("aitor",	35);
		new	PacientObserverGUI(pacient);
		new	PacientSymptomGUI((Covid19Pacient) pacient);
		new PacientThermometerGUI(pacient);
		Observable	pacient2=new	Covid19Pacient("aitor2",	35);
		new	PacientObserverGUI(pacient2);
		new	PacientSymptomGUI((Covid19Pacient) pacient2);
		new PacientThermometerGUI(pacient2);
		Observable	pacient3=new	Covid19Pacient("aitor3",	35);
		new	PacientObserverGUI(pacient3);
		new	PacientSymptomGUI((Covid19Pacient) pacient3);
		new PacientThermometerGUI(pacient3);
	}


}
