/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

/**
 *
 * @author pangz
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class patientMenu extends JFrame{
	patientMenu(){
		ImageIcon image = new ImageIcon("patient.png");
		
		JLabel label = new JLabel();
		label.setText("This is patient menu.");
		label.setIcon(image);
		
		JFrame frame = new JFrame();
		frame.setTitle("This is Java");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.add(label);
	}
}
