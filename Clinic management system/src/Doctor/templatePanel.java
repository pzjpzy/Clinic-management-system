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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author pangz
 */
public class templatePanel extends JFrame {
    JButton logout;
    public templatePanel(){
        ImageIcon image = new ImageIcon("src/Patient/patient.png");

        Image resizedUserImage = image.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedUserImage);
        ImageIcon image1 = new ImageIcon("src/Patient/logout.png");
        Image resizedUserImage1 = image1.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon loImage = new ImageIcon(resizedUserImage1);


        JLabel label1 = new JLabel(); //welcome user
        label1.setText("Welcome, " );
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

        logout = new JButton(); //logout button
        logout.setBounds(1300,25,200,100);
        logout.setIcon(loImage);
        logout.setFocusable(false);
        logout.setText("Log Out");
        logout.setFont(new Font("My Boli",Font.PLAIN,25));
        logout.setFont(new Font("My Boli",Font.PLAIN,25));
        logout.setBackground(Color.white);




        JPanel banner = new JPanel(); //banner
        banner.setBackground(new Color(92,201,205));
        banner.setBounds(0,0,1536,150);
        banner.setLayout(null);
        banner.add(subban);
        banner.add(logout); 




        JPanel box = new JPanel(); //below box
        box.setBounds(0,150,200,200);
        box.setBackground(Color.red);

        
        JPanel panel = new JPanel();
        panel.setBounds(0,0,1536,864);
        panel.setLayout(null);
        panel.add(box);
        panel.add(banner);
        add(panel);
        setBounds(0,0,1536,864);
        setLayout(null);
    }
}
