/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doctor;

import Patient.login;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
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
public class doctorMainPage extends JPanel {
    public doctorMainPage(JFrame frame) {
        ImageIcon image = new ImageIcon("src/Patient/patient.png");	
        Image resizedUserImage = image.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedUserImage);
        ImageIcon image1 = new ImageIcon("src/Patient/logout.png");
        Image resizedUserImage1 = image1.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon loImage = new ImageIcon(resizedUserImage1);
        ImageIcon image2 = new ImageIcon("src/Patient/appointment.png");
        Image resizedUserImage2 = image2.getImage().getScaledInstance(175, 175, Image.SCALE_SMOOTH);
        ImageIcon apImage = new ImageIcon(resizedUserImage2);
        ImageIcon image3 = new ImageIcon("src/Patient/medical.png");
        Image resizedUserImage3 = image3.getImage().getScaledInstance(175, 175, Image.SCALE_SMOOTH);
        ImageIcon mrImage = new ImageIcon(resizedUserImage3);


        JLabel label1 = new JLabel(); //welcome user
        label1.setText("Welcome, Doctor");
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
        subban.setBounds(30,20,400,140);
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

        JButton appoint = new JButton(); //button 1
        appoint.setText("Appointment history");
        appoint.setVerticalTextPosition(JButton.BOTTOM);
        appoint.setHorizontalTextPosition(JButton.CENTER);
        appoint.setIcon(apImage);
        appoint.setBounds(300,100,370,250);
        appoint.setFont(new Font("My Boli",Font.PLAIN,25));
        appoint.setFocusable(false);
        appoint.setBackground(Color.white);
        appoint.addActionListener((ActionEvent e) -> {
            frame.remove(this);

            appointmentHistory panel = new appointmentHistory(frame);
            frame.add(panel);
            frame.revalidate();
            frame.repaint();
        });

        JButton schedule = new JButton(); //button 2
        schedule.setText("Upload Daily Schedule");
        schedule.setVerticalTextPosition(JButton.BOTTOM);
        schedule.setHorizontalTextPosition(JButton.CENTER);
        schedule.setIcon(mrImage);
        schedule.setBounds(830,100,370,250);
        schedule.setFont(new Font("My Boli",Font.PLAIN,25));
        schedule.setFocusable(false);
        schedule.setBackground(Color.white);
        schedule.addActionListener((ActionEvent e) -> {
            frame.remove(this);

            dailySchedule panel = new dailySchedule(frame);
            frame.add(panel);
            frame.revalidate();
            frame.repaint();
        });
        
        JButton payment = new JButton(); // button 3
        payment.setText("Check Patient Medical Record");
        payment.setVerticalTextPosition(JButton.BOTTOM);
        payment.setHorizontalTextPosition(JButton.CENTER);
        payment.setIcon(mrImage);
        payment.setBounds(300,375,370,250);
        payment.setFont(new Font("My Boli",Font.PLAIN,25));
        payment.setFocusable(false);
        payment.setBackground(Color.white);

        JButton cancel = new JButton(); //button 4
        cancel.setText("Cancel Appointment");
        cancel.setVerticalTextPosition(JButton.BOTTOM);
        cancel.setHorizontalTextPosition(JButton.CENTER);
        cancel.setIcon(mrImage);
        cancel.setBounds(830,375,370,250);
        cancel.setFont(new Font("My Boli",Font.PLAIN,25));
        cancel.setFocusable(false);
        cancel.setBackground(Color.white);
        cancel.addActionListener((ActionEvent e) -> {
            frame.remove(this);

            cancelAppointment panel = new cancelAppointment(frame);
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
        subbox.add(payment);


        JPanel box = new JPanel(); //below box
        box.setBounds(0,0,1920,1080);
        box.setBackground(Color.white);
        box.add(subbox);
        
        

        JLayeredPane layer = new JLayeredPane();
        layer.setBounds(0,150,1536,864);
        layer.add(box,Integer.valueOf(0));
        layer.add(subbox,Integer.valueOf(1));
        layer.add(appoint,Integer.valueOf(2));
        layer.add(schedule,Integer.valueOf(2));
        layer.add(payment,Integer.valueOf(2));
        layer.add(cancel,Integer.valueOf(2));


        
       
        
        setBounds(0,0,frame.getWidth(),frame.getHeight());
        setLayout(null);
        add(banner);
        add(layer);
        
        setBounds(0,0,1536,864);
        
        setLayout(null);
    }
}
