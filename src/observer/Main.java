package observer;

import java.util.Observable;

import adapter2.ShowPacientTableGUI;
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
		new SemaphorGUI(pacient);
		ShowPacientTableGUI gui1=new ShowPacientTableGUI(pacient);
		gui1.setPreferredSize(
			      new java.awt.Dimension(300, 200));
		gui1.setVisible(true);
		Observable	pacient2=new	Covid19Pacient("aitor2",	35);
		new	PacientObserverGUI(pacient2);
		new	PacientSymptomGUI((Covid19Pacient) pacient2);
		new PacientThermometerGUI(pacient2);
		new SemaphorGUI(pacient2);
		ShowPacientTableGUI gui2=new ShowPacientTableGUI(pacient2);
		gui2.setPreferredSize(
			      new java.awt.Dimension(300, 200));
		gui2.setVisible(true);
		Observable	pacient3=new	Covid19Pacient("aitor3",	35);
		new	PacientObserverGUI(pacient3);
		new	PacientSymptomGUI((Covid19Pacient) pacient3);
		new PacientThermometerGUI(pacient3);
		new SemaphorGUI(pacient3);
		ShowPacientTableGUI gui3=new ShowPacientTableGUI(pacient3);
		gui3.setPreferredSize(
			      new java.awt.Dimension(300, 200));
		gui3.setVisible(true);
	}


}
