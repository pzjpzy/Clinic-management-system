/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

/**
 *
 * @author pangz
 */
public class test extends JFrame {
    private static JTextArea textArea; // the place to make scrollable
    private static JScrollPane scrollPane;
    
    public test(){
        setSize(700,700);
        setTitle("Hello Swing");
        setLocation(200,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        scrollPane = new JScrollPane();
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        textArea = new JTextArea("Sample text in text area");
        textArea.setBounds(20,20,500,400);
        textArea.setBorder(new LineBorder(Color.BLACK));
        textArea.setEditable(false);
        
        scrollPane.setBounds(20,20,500,400);
        scrollPane.getViewport().setBackground(Color.white);
        scrollPane.getViewport().add(textArea);
        
        add(scrollPane);
        repaint();
        setVisible(true);
    }
}
