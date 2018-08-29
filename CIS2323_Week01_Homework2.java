
//import javax.swing.JOptionPane; 
import javax.swing.JFrame;
import javax.swing.JTextArea;
public class CIS2323_Week01_Homework2 {
	public static void main(String[] args) {
		//JOptionPane.showMessageDialog(null, "First Java Dialog box");
				
		//Create and set up the window.
		JFrame frame = new JFrame("Business Card");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create our text area
		JTextArea textArea = new JTextArea(
		"============================================================================" +
		"Logan Schanbacher				                                       " +
		"Desktop Support, GC Services - Oklahoma City                                " +
		"                                                                            " +
		"8121 NW Expressway			p: (405)621-6499                                 " +
		"Oklahoma City, OK			e: logan.schanbacher@gcserv.com                  " +
		"							g: github.com/schogan                            " +
		"============================================================================");
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setEditable(false);

		// Add textarea to our window, and make it visible.
		frame.add(textArea);
		frame.pack();
		frame.setVisible(true);
	}
}

