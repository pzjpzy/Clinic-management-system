/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Admin;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
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
public class adminDP extends JFrame{
    public adminDP(){
        ImageIcon image1 = new ImageIcon("src/Patient/home.png");
        Image resizedUserImage1 = image1.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon homeImage = new ImageIcon(resizedUserImage1);
        ImageIcon image2 = new ImageIcon("src/Patient/appointment.png");
        Image resizedUserImage2 = image2.getImage().getScaledInstance(175, 175, Image.SCALE_SMOOTH);
        ImageIcon apImage = new ImageIcon(resizedUserImage2);
        ImageIcon image3 = new ImageIcon("src/Patient/medical.png");
        Image resizedUserImage3 = image3.getImage().getScaledInstance(175, 175, Image.SCALE_SMOOTH);
        ImageIcon mrImage = new ImageIcon(resizedUserImage3);


        JLabel label1 = new JLabel(); //welcome user
        label1.setText("Doctor Page");
        label1.setOpaque(false);
        label1.setFont(new Font("My Boli",Font.PLAIN,40));
        label1.setIconTextGap(30);
        label1.setHorizontalTextPosition(JLabel.RIGHT);// text for button
        label1.setVerticalTextPosition(JLabel.CENTER);
        label1.setVerticalAlignment(JLabel.CENTER); // text
        label1.setHorizontalAlignment(JLabel.CENTER);


        JPanel subban = new JPanel(); // box for welcome user
        subban.setBackground(new Color(92,201,205));
        subban.setBounds(30,45,360,140);
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

        JButton appoint = new JButton(); //button 1
        appoint.setText("View Daily Appointment");
        appoint.setVerticalTextPosition(JButton.BOTTOM);
        appoint.setHorizontalTextPosition(JButton.CENTER);
        appoint.setIcon(apImage);
        appoint.setBounds(300,230,370,250);
        appoint.setFont(new Font("My Boli",Font.PLAIN,25));
        appoint.setFocusable(false);
        appoint.setBackground(Color.white);

        JButton mRecord = new JButton(); //button 2
        mRecord.setText("Delete Doctor Info");
        mRecord.setVerticalTextPosition(JButton.BOTTOM);
        mRecord.setHorizontalTextPosition(JButton.CENTER);
        mRecord.setIcon(mrImage);
        mRecord.setBounds(830,230,370,250);
        mRecord.setFont(new Font("My Boli",Font.PLAIN,25));
        mRecord.setFocusable(false);
        mRecord.setBackground(Color.white);
        
        JButton payment = new JButton(); // button 3
        payment.setText("Update Doctor Info");
        payment.setVerticalTextPosition(JButton.BOTTOM);
        payment.setHorizontalTextPosition(JButton.CENTER);
        payment.setIcon(mrImage);
        payment.setBounds(550,515,370,250);
        payment.setFont(new Font("My Boli",Font.PLAIN,25));
        payment.setFocusable(false);
        payment.setBackground(Color.white);

        JPanel banner = new JPanel(); //banner
        banner.setBackground(new Color(92,201,205));
        banner.setBounds(0,0,1920,150);
        banner.setLayout(null);
        banner.add(subban);
        banner.add(home); 

        JPanel subbox = new JPanel();
        subbox.setBackground(new Color(162,229,221));
        subbox.setBounds(200,200,1100,600);
        subbox.add(payment);


        JPanel box = new JPanel(); //below box
        box.setBounds(0,0,1920,1080);
        box.setBackground(Color.white);
        box.add(subbox);
        
        

        JLayeredPane layer = new JLayeredPane();
        layer.setBounds(0,150,1000,1000);
        layer.add(box,Integer.valueOf(0));
        layer.add(subbox,Integer.valueOf(1));
        layer.add(appoint,Integer.valueOf(2));
        layer.add(mRecord,Integer.valueOf(2));
        layer.add(payment,Integer.valueOf(2));


        JFrame frame = new JFrame(); //the frame
        frame.setTitle("Patient Menu");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.add(banner);
        frame.add(layer);    
    }
}
