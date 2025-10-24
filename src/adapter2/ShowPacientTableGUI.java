package adapter2;

import java.awt.Component;
import java.awt.Font;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;
import javax.swing.table.TableModel;

import domain.Covid19Pacient;


public class ShowPacientTableGUI extends JFrame implements Observer{
	
	JTable table;
	private Observable o;
	private TableModel tm;
	
  
  public ShowPacientTableGUI(Observable o) {
	  	this.setTitle("Covid Symptoms "+((Covid19Pacient)o).getName());
	  	
	  	this.o=o;
	  	
	  	setFonts();
	    
	  	tm=new Covid19PacientTableModelAdapter((Covid19Pacient)o);
		table = new JTable(tm);
	    table.setRowHeight(36);
	    JScrollPane pane = new JScrollPane(table);
	    pane.setPreferredSize(
	      new java.awt.Dimension(300, 200));
	    this.getContentPane().add(pane);
	    
	  o.addObserver(this);
  }

	  private static void setFonts() {
	    Font font = new Font("Dialog", Font.PLAIN, 18);
	    UIManager.put("Table.font", font);
	    UIManager.put("TableHeader.font", font);
	  }

	@Override
	public void update(Observable arg0, Object arg1) {
		tm = new Covid19PacientTableModelAdapter((Covid19Pacient)o);
		table.setModel(tm);
	}
}
