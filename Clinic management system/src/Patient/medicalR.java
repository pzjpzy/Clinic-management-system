/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

/**
 *
 * @author pangz
 */
public class medicalR extends JFrame{
    int j = 0;
    medicalR(){

        
        JPanel box1 = new JPanel();//the box contain medical record
        box1.setBackground(Color.white);
        box1.setBounds(200,150,1125,700);
        
        JLabel label = new JLabel();
        label.setText("Medical Record");
        label.setOpaque(false);
        label.setFont(new Font("My Boli",Font.PLAIN,50));
        label.setBounds(575,50,400,50);
        label.setHorizontalAlignment(JLabel.CENTER);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        JTextArea textArea = new JTextArea();
        textArea.setText(
        "\n"+
        "\s"+"\s"+"Full Name : "+j+"\n"+
        "\s"+"\s"+"IC Number : "+j+"\n"+          
        "\s"+"\s"+"Disease : "+j+"\n"+
        "\s"+"\s"+"Medicine : "+j+"\n"+
        "\s"+"\s"+"Allergies : "+j+"\n"+
        "\s"+"\s"+"Date : "+j+"\n"+
        "\s"+"\s"+"Vitals : "+j+"\n"+
        "\s"+"\s"+"Follow-up Appointment : "+j+"\n"                
        );
        textArea.setFont(new Font("My Boli",Font.PLAIN,40));
        textArea.setBounds(200,150,1125,700);
        textArea.setBorder(new LineBorder(Color.BLACK));
        textArea.setEditable(true);
        
        scrollPane.setBounds(200,150,1125,700);
        scrollPane.getViewport().setBackground(Color.white);
        scrollPane.getViewport().add(textArea);
        
        JPanel box = new JPanel(); //big box
        box.setBounds(0,0,1536,864);
        box.setBackground(new Color(240,240,240));
        
        JLayeredPane layer = new JLayeredPane();
        layer.setBounds(0,0,1536,864);
        layer.add(box,Integer.valueOf(0));
        layer.add(label,Integer.valueOf(1));
        layer.add(box1,Integer.valueOf(1));
        layer.add(scrollPane,Integer.valueOf(2));
        
        JFrame frame = new JFrame();
        frame.setTitle("Patient Medical Record");
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.add(layer);
    }
}
