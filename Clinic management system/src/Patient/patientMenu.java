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
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLayeredPane;

public class patientMenu extends JPanel{
	public patientMenu(JFrame frame){
            ImageIcon image = new ImageIcon("src/Patient/patient.png");	
            Image resizedUserImage = image.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            ImageIcon resizedIcon = new ImageIcon(resizedUserImage);
            ImageIcon image1 = new ImageIcon("src/Patient/logout.png");
            Image resizedUserImage1 = image1.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            ImageIcon loImage = new ImageIcon(resizedUserImage1);
            ImageIcon image2 = new ImageIcon("src/Patient/appointment.png");
            Image resizedUserImage2 = image2.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
            ImageIcon apImage = new ImageIcon(resizedUserImage2);
            ImageIcon image3 = new ImageIcon("src/Patient/medical.png");
            Image resizedUserImage3 = image3.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
            ImageIcon mrImage = new ImageIcon(resizedUserImage3);
        
                
		JLabel label1 = new JLabel(); //welcome user
		label1.setText("Welcome, "+user.name);
		label1.setIcon(resizedIcon);
		label1.setOpaque(false);
                label1.setFont(new Font("My Boli",Font.PLAIN,30));
                label1.setIconTextGap(30);
		label1.setHorizontalTextPosition(JLabel.RIGHT);// text for button
		label1.setVerticalTextPosition(JLabel.CENTER);
		label1.setVerticalAlignment(JLabel.CENTER); // text
		label1.setHorizontalAlignment(JLabel.CENTER);
                
                
                JPanel subban = new JPanel(); // box for welcome user
                subban.setBackground(new Color(92,201,205));
                subban.setBounds(30,20,500,140);
                subban.add(label1);
                
                JButton logout = new JButton(); //logout button
                logout.setBounds(1300,25,200,100);
                logout.setIcon(loImage);
                logout.setFocusable(false);
                logout.setText("Log Out");
                logout.setFont(new Font("My Boli",Font.PLAIN,25));
                logout.setFont(new Font("My Boli",Font.PLAIN,25));
                logout.setBackground(Color.white);
                logout.addActionListener((ActionEvent e)->{
                    frame.remove(this);

                    login panel = new login(frame);
                    frame.add(panel);
                    frame.revalidate();
                    frame.repaint();    
                });
                
                JButton appoint = new JButton(); //appointment button
                appoint.setText("Appointment");
                appoint.setVerticalTextPosition(JButton.BOTTOM);
                appoint.setHorizontalTextPosition(JButton.CENTER);
                appoint.setIcon(apImage);
                appoint.setBounds(300,150,400,400);
                appoint.setFont(new Font("My Boli",Font.PLAIN,25));
                appoint.setFocusable(false);
                appoint.setBackground(Color.white);
                appoint.addActionListener((ActionEvent e)->{
                    frame.remove(this);

                    Appointment panel = new Appointment(frame);
                    frame.add(panel);
                    frame.revalidate();
                    frame.repaint();    
                });
                
                JButton mRecord = new JButton();
                mRecord.setText("Medical Record");
                mRecord.setVerticalTextPosition(JButton.BOTTOM);
                mRecord.setHorizontalTextPosition(JButton.CENTER);
                mRecord.setIcon(mrImage);
                mRecord.setBounds(800,150,400,400);
                mRecord.setFont(new Font("My Boli",Font.PLAIN,25));
                mRecord.setFocusable(false);
                mRecord.setBackground(Color.white);
                mRecord.addActionListener((ActionEvent e)->{
                    frame.remove(this);

                    mrTable panel = new mrTable(frame);
                    frame.add(panel);
                    frame.revalidate();
                    frame.repaint();    
                });
                
                
                JPanel banner = new JPanel(); //banner
                banner.setBackground(new Color(92,201,205));
                banner.setBounds(0,0,1920,150);
                banner.setLayout(null);
                banner.add(subban);
                banner.add(logout); 
                
                JPanel subbox = new JPanel();
                subbox.setBackground(new Color(162,229,221));
                subbox.setBounds(200,50,1100,600);

                
                JPanel box = new JPanel(); //below box
                box.setBounds(0,0,1920,1080);
                box.setBackground(Color.white);
                box.add(subbox);
                
                JLayeredPane layer = new JLayeredPane();
                layer.setBounds(0,150,1536,864);
                layer.add(box,Integer.valueOf(0));
                layer.add(subbox,Integer.valueOf(1));
                layer.add(appoint,Integer.valueOf(2));
                layer.add(mRecord,Integer.valueOf(3));
		

//		frame.setTitle("Patient Menu");
//		frame.setVisible(true);
//		frame.setResizable(false);
//		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                add(banner);
                add(layer);

                setBounds(0,0,1536,864);
        
                setLayout(null);
                        
	}
}
