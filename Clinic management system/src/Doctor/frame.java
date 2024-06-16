/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doctor;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author pangz
 */
class frame extends JFrame{
    public frame() {
    ImageIcon image = new ImageIcon("src/Patient/patient.png");
		
//		JLabel label1 = new JLabel();
//		label1.setText("This is patient menu.");
//		label1.setIcon(image);
//		label1.setOpaque(false);
//		label1.setHorizontalTextPosition(JLabel.CENTER);
//		label1.setVerticalTextPosition(JLabel.BOTTOM);
//		label1.setVerticalAlignment(JLabel.CENTER);
//		label1.setHorizontalAlignment(JLabel.CENTER);
                
		JPanel panel1 = new JPanel();
                panel1.setBackground(Color.red);
                panel1.setBounds(1500,0,250,250);
		
		setLayout(null);
		this.setTitle("This is Java");
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.add(panel1);
                
                System.out.println(this.getWidth());
                System.out.println(getHeight());
    }
                
}
