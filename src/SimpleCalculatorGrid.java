import javax.swing.*;

import java.awt.GridLayout;

public class SimpleCalculatorGrid {

	public static void main(String[] args) {
		// create panel
		JPanel windowsContent = new JPanel();
		// + maneger  polozenja for PANEL
		GridLayout g1 = new GridLayout(4,2);
		windowsContent.setLayout(g1);
		// create components in memory
		JLabel lebel1 = new JLabel("Number 1: ");
		JTextField field1 = new JTextField(10);
		JLabel lebel2 = new JLabel("Number 2: ");
		JTextField field2 = new JTextField(10);
		JLabel lebel3 = new JLabel("Sum: ");
		JTextField result = new JTextField(10);
		JButton go = new JButton("Add");
		// add components in panel
		windowsContent.add(lebel1);
		windowsContent.add(field1);
		windowsContent.add(lebel2);
		windowsContent.add(field2);
		windowsContent.add(lebel3);
		windowsContent.add(result);
		windowsContent.add(go);
		// create frame and panel for this
		JFrame frame = new JFrame("My First Calculator");
		frame.setContentPane(windowsContent);
		// add size and visible window
		frame.setSize(400, 100);
		frame.setVisible(true);

	}

}
