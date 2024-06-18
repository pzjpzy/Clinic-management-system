/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doctor;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 *
 * @author pangz
 */
public class patientmenuPanel extends JPanel{
    JButton logout;
    patientmenuPanel(){
        ImageIcon image = new ImageIcon("src/Patient/patient.png");	
            Image resizedUserImage = image.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            ImageIcon resizedIcon = new ImageIcon(resizedUserImage);
            ImageIcon image1 = new ImageIcon("src/Patient/logout.png");
            Image resizedUserImage1 = image1.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            ImageIcon loImage = new ImageIcon(resizedUserImage1);
            ImageIcon image2 = new ImageIcon("src/Patient/appointment.png");
            Image resizedUserImage2 = image2.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
            ImageIcon apImage = new ImageIcon(resizedUserImage2);
            ImageIcon image3 = new ImageIcon("src/Patient/medical3.png");
            Image resizedUserImage3 = image3.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
            ImageIcon mrImage = new ImageIcon(resizedUserImage3);
        
                
		JLabel label1 = new JLabel(); //welcome user
		label1.setText("Welcome, XXX");
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
                subban.setBounds(30,20,350,140);
                subban.add(label1);
                
                JButton logout = new JButton(); //logout button
                logout.setBounds(1300,25,200,100);
                logout.setIcon(loImage);
                logout.setFocusable(false);
                logout.setText("Log Out");
                logout.setFont(new Font("My Boli",Font.PLAIN,25));
                logout.setFont(new Font("My Boli",Font.PLAIN,25));
                logout.setBackground(Color.white);
                
                JButton appoint = new JButton(); //appointment button
                appoint.setText("Appointment");
                appoint.setVerticalTextPosition(JButton.BOTTOM);
                appoint.setHorizontalTextPosition(JButton.CENTER);
                appoint.setIcon(apImage);
                appoint.setBounds(300,150,400,400);
                appoint.setFont(new Font("My Boli",Font.PLAIN,25));
                appoint.setFocusable(false);
                appoint.setBackground(Color.white);
                
                JButton mRecord = new JButton();
                mRecord.setText("Medical Record");
                mRecord.setVerticalTextPosition(JButton.BOTTOM);
                mRecord.setHorizontalTextPosition(JButton.CENTER);
                mRecord.setIcon(mrImage);
                mRecord.setBounds(800,150,400,400);
                mRecord.setFont(new Font("My Boli",Font.PLAIN,25));
                mRecord.setFocusable(false);
                mRecord.setBackground(Color.white);
                
                
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
                layer.setBounds(0,150,1536,714);
                layer.add(box,Integer.valueOf(0));
                layer.add(subbox,Integer.valueOf(1));
                layer.add(appoint,Integer.valueOf(2));
                layer.add(mRecord,Integer.valueOf(3));
        
        setBounds(0,0,1536,864);
        setLayout(null);
        add(banner);
        add(layer);
        
        setBounds(0,0,1536,864);
        
        setLayout(null);
    }
}