import javax.swing.*;
import java.awt.FlowLayout;

public class SimpleCalculator {
	public static void main(String[] args) {
		// create panel
		JPanel windowsContent = new JPanel ();
		// meneger vidobrazhena dla panel
		JLabel label1 = new JLabel ("Number 1: ");
		JTextField field1 = new JTextField(10);
		JLabel label2 = new JLabel ("Number 2: ");
		JTextField field2 = new JTextField(10);
		JTextField result = new JTextField(10);
		JLabel label3 = new JLabel ("Sum: ");
		JButton go = new JButton("Add");
		// add components of the panel
		windowsContent.add(label1);
		windowsContent.add(field1);
		windowsContent.add(label2);
		windowsContent.add(field2);
		windowsContent.add(label3);
		windowsContent.add(result);
		windowsContent.add(go);
		// create of the frame + panel
		JFrame frame = new JFrame("My first calculator");
		frame.setContentPane(windowsContent);
		// works size and + visible
		frame.setSize(400, 100);
		frame.setVisible(true);
	}

}
