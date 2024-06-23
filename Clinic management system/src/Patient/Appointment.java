/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author pangz
 */
public class Appointment extends JPanel { 
    JButton home;

    public Appointment(JFrame frame){
            ImageIcon image1 = new ImageIcon("src/Patient/home.png");
            Image resizedUserImage1 = image1.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            ImageIcon homeImage = new ImageIcon(resizedUserImage1);
            ImageIcon image2 = new ImageIcon("src/Patient/cAppointment.png");
            Image resizedUserImage2 = image2.getImage().getScaledInstance(175, 175, Image.SCALE_SMOOTH);
            ImageIcon apImage = new ImageIcon(resizedUserImage2);
            ImageIcon image3 = new ImageIcon("src/Patient/mAppointment.png");
            Image resizedUserImage3 = image3.getImage().getScaledInstance(175, 175, Image.SCALE_SMOOTH);
            ImageIcon mrImage = new ImageIcon(resizedUserImage3);
        
                
            JLabel label1 = new JLabel(); //welcome user
            label1.setText("Appointment");
            label1.setOpaque(false);
            label1.setFont(new Font("My Boli",Font.PLAIN,40));
            label1.setIconTextGap(30);
            label1.setHorizontalTextPosition(JLabel.CENTER);// text for button
            label1.setVerticalTextPosition(JLabel.CENTER);
            label1.setVerticalAlignment(JLabel.CENTER); // text
            label1.setHorizontalAlignment(JLabel.CENTER);


            JPanel subban = new JPanel(); // box for welcome user
            subban.setBackground(new Color(92,201,205));
            subban.setBounds(30,50,350,140);
            subban.add(label1);

            JButton home = new JButton(); //home button
            home.setBounds(1300,25,200,100);
            home.setIcon(homeImage);
            home.setIconTextGap(30);
            home.setFocusable(false);
            home.setText("Home");
            home.setFont(new Font("My Boli",Font.PLAIN,25));
            home.setFont(new Font("My Boli",Font.PLAIN,25));
            home.setBackground(Color.white);
                home.addActionListener((ActionEvent e)->{ // go to patientMenu
                    frame.remove(this);

                    patientMenu panel = new patientMenu(frame);
                    frame.add(panel);
                    frame.revalidate();
                    frame.repaint();    
                });

            JButton appoint = new JButton(); //appointment button
            appoint.setText("Cancel Appointment");
            appoint.setVerticalTextPosition(JButton.BOTTOM);
            appoint.setHorizontalTextPosition(JButton.CENTER);
            appoint.setIcon(apImage);
            appoint.setBounds(300,230,370,250);
            appoint.setFont(new Font("My Boli",Font.PLAIN,25));
            appoint.setFocusable(false);
            appoint.setBackground(Color.white);
            appoint.addActionListener((ActionEvent e)->{ // go to patientMenu
                frame.remove(this);

                cancelAppointmentV2 panel = new cancelAppointmentV2(frame);
                frame.add(panel);
                frame.revalidate();
                frame.repaint();    
            });

            JButton mRecord = new JButton();
            mRecord.setText("Make Appointment");
            mRecord.setVerticalTextPosition(JButton.BOTTOM);
            mRecord.setHorizontalTextPosition(JButton.CENTER);
            mRecord.setIcon(mrImage);
            mRecord.setBounds(830,230,370,250);
            mRecord.setFont(new Font("My Boli",Font.PLAIN,25));
            mRecord.setFocusable(false);
            mRecord.setBackground(Color.white);
            
            JButton payment = new JButton(); // button 3
            payment.setText("Appointment History");
            payment.setVerticalTextPosition(JButton.BOTTOM);
            payment.setHorizontalTextPosition(JButton.CENTER);
            payment.setIcon(mrImage);
            payment.setBounds(550,515,370,250);
            payment.setFont(new Font("My Boli",Font.PLAIN,25));
            payment.setFocusable(false);
            payment.setBackground(Color.white);


            JPanel banner = new JPanel(); //banner
            banner.setBackground(new Color(92,201,205));
            banner.setBounds(0,0,1536,150);
            banner.setLayout(null);
            banner.add(subban);
            banner.add(home); 

            JPanel subbox = new JPanel();
            subbox.setBackground(new Color(162,229,221));
            subbox.setBounds(200,200,1100,600);


            JPanel box = new JPanel(); //below box
            box.setBounds(0,0,1536,864);
            box.setBackground(Color.white);
            box.add(subbox);

            JLayeredPane layer = new JLayeredPane();
            layer.setBounds(0,0,1536,1000);
            layer.add(box,Integer.valueOf(0));
            layer.add(subbox,Integer.valueOf(1));
            layer.add(appoint,Integer.valueOf(2));
            layer.add(mRecord,Integer.valueOf(3));
            layer.add(payment,Integer.valueOf(3));

            add(banner);
            add(layer);
            setBounds(0, 0, 1536, 864);
            setLayout(null);

    }
}


