/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

/**
 *
 * @author pangz
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class patientMenu extends JFrame{
	patientMenu(){
            ImageIcon image = new ImageIcon("src/Patient/patient.png");	
            Image resizedUserImage = image.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            ImageIcon resizedIcon = new ImageIcon(resizedUserImage);
            ImageIcon image1 = new ImageIcon("src/Patient/logout.png");
            Image resizedUserImage1 = image1.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            ImageIcon loImage = new ImageIcon(resizedUserImage1);
        
                
		JLabel label1 = new JLabel();
		label1.setText("Welcome, XXX");
		label1.setIcon(resizedIcon);
		label1.setOpaque(false);
                label1.setFont(new Font("My Boli",Font.PLAIN,30));
                label1.setIconTextGap(30);
		label1.setHorizontalTextPosition(JLabel.RIGHT);// text for button
		label1.setVerticalTextPosition(JLabel.CENTER);
		label1.setVerticalAlignment(JLabel.CENTER); // text
		label1.setHorizontalAlignment(JLabel.CENTER);
                
                
                JPanel subban = new JPanel();
                subban.setBackground(Color.lightGray);
                subban.setBounds(30,20,350,140);
                subban.add(label1);
                
                JButton logout = new JButton();
                logout.setBounds(1300,25,200,100);
                logout.setIcon(loImage);
                logout.setFocusable(false);
                logout.setText("Log Out");
                logout.setFont(new Font("My Boli",Font.PLAIN,25));
                logout.setFont(new Font("My Boli",Font.PLAIN,25));
                
                JPanel banner = new JPanel();
                banner.setBackground(Color.LIGHT_GRAY);
                banner.setBounds(0,0,1920,150);
                banner.setLayout(null);
                banner.add(subban);
                banner.add(logout);
                
                JButton appoint = new JButton();
                appoint.setBounds(1300,25,200,100);
                logout.setFont(new Font("My Boli",Font.PLAIN,25));
                logout.setFont(new Font("My Boli",Font.PLAIN,25));
                logout.setFocusable(false);
                
                JPanel box = new JPanel();
                box.setBounds(0,0,1920,980);
                box.setBackground(Color.white);
                
		
		JFrame frame = new JFrame();
		frame.setTitle("Patient Menu");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                frame.add(banner);
                frame.add(box);
                        
	}
}
