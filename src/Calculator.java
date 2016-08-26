import javax.swing.*;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;


public class Calculator {
	// objavlenna components calculator
	JPanel  windowContent;
	JFormattedTextField displayField;
	JButton button0;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton buttonPoint;
	JButton buttonEqual;
	JButton buttonPlus;
	JButton buttonMinus;
	JButton buttonDivision;
	JButton buttonMultipliсation;
	JPanel p1;
	JPanel p2;
	// In constructor create all components
	// + add on frame with combination 
	// Borderlayout and Gridlayout
	    Calculator () {
	    	windowContent = new JPanel();
	    	// add scheme of the panel
	    	BorderLayout b1 = new BorderLayout();
	    	windowContent.setLayout(b1);
	    	
	    	//
	    	//
	    	displayField = new JFormattedTextField();
	    	windowContent.add("North", displayField);
	    	// right-aligned

	    	displayField.setHorizontalAlignment(JTextField.RIGHT);

	    	
	    	//  create button constructor 
	        //
	    	//
	    	button0 = new JButton("0");
	    	button1 = new JButton("1");
	    	button2 = new JButton("2");
	    	button3 = new JButton("3");
	    	button4 = new JButton("4");
	    	button5 = new JButton("5");
	    	button6 = new JButton("6");
	    	button7 = new JButton("7");
	    	button8 = new JButton("8");
	    	button9 = new JButton("9");
	    	buttonPoint = new JButton(".");
	    	buttonEqual = new JButton("=");
	    	
	    	buttonDivision = new JButton("÷");
	    	buttonMultipliсation = new JButton("*");
	    	buttonPlus = new JButton("+");
	    	buttonMinus = new JButton("-");
	    
	    	
	    	//create panel with GridLayout
	    	//
	    	//
	    	p1 = new JPanel();
	    	GridLayout g1 = new GridLayout(4,3);
	    	p1.setLayout(g1);
	    	p2 = new JPanel();
	    	GridLayout g2 = new GridLayout(4,1);
	    	p2.setLayout(g2);
	    	// add button of the panel p1
	    	p1.add(button7);
	    	p1.add(button8);
	    	p1.add(button9);
	    	
	    	p1.add(button4);
	    	p1.add(button5);
	    	p1.add(button6);
	    	
	    	p1.add(button1);
	    	p1.add(button2);
	    	p1.add(button3);
	    	
	    	
	    	p1.add(button0);
	    	p1.add(buttonPoint);
	    	p1.add(buttonEqual);
	    	
	    	p2.add(buttonDivision);
	    	p2.add(buttonMultipliсation);
	    	p2.add(buttonMinus);
	    	p2.add(buttonPlus);
	    	
	    	
	    	
	    	// p1 in center
	    	 windowContent.add("Center",p1);
	    	 // panel 2 in East
		    	windowContent.add("East",p2);

	    	 // create frame and ...
	    	 JFrame frame = new JFrame ("Calculator");
	    	 frame.setContentPane(windowContent);
	    	 // size window
	    	 frame.pack();
	    	 // window
	    	 frame.setVisible(true);
	    	 
	    	 // to tie class  CalculatorEngine
	    	 CalculatorEngine calcEngine = new CalculatorEngine(this);
	    	 button0.addActionListener(calcEngine);
	    	 button1.addActionListener(calcEngine);
	    	 button2.addActionListener(calcEngine);
	    	 button3.addActionListener(calcEngine);
	    	 button4.addActionListener(calcEngine);
	    	 button5.addActionListener(calcEngine);
	    	 button6.addActionListener(calcEngine);
	    	 button7.addActionListener(calcEngine);
	    	 button8.addActionListener(calcEngine);
	    	 button9.addActionListener(calcEngine);
	    	 
	    	 buttonPoint.addActionListener(calcEngine);
	    	 buttonEqual.addActionListener(calcEngine);
	    	 buttonPlus.addActionListener(calcEngine);
	    	 buttonMinus.addActionListener(calcEngine);
	    	 buttonDivision.addActionListener(calcEngine);
	    	 buttonMultipliсation.addActionListener(calcEngine);
	    	   

	    	 
	    	 
	    	 
	     }
	    public static void main (String[] args){
	    	
	    	Calculator calc = new Calculator();
	    	
	    }
	  

}
