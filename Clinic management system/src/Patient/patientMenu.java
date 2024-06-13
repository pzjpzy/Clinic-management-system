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
		ImageIcon image = new ImageIcon("src/Patient/patient.png");
		
		JLabel label1 = new JLabel();
		label1.setText("This is patient menu.");
		label1.setIcon(image);
		label1.setOpaque(false);
		label1.setHorizontalTextPosition(JLabel.CENTER);
		label1.setVerticalTextPosition(JLabel.BOTTOM);
		label1.setVerticalAlignment(JLabel.CENTER);
		label1.setHorizontalAlignment(JLabel.CENTER);
		
		
		JFrame frame = new JFrame();
		frame.setTitle("This is Java");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.add(label1);
	}
}
