/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

import java.awt.Color;
import java.awt.Font;
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
    int j = 0;
    
    public test(){
        setSize(700,700);
        setTitle("Hello Swing");
        setLocation(200,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        
        scrollPane = new JScrollPane();
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        textArea = new JTextArea();
        textArea.setText(
            "hi hi "+j+"\n"
             +"bye bye"
        );
        textArea.setFont(new Font("My Boli",Font.PLAIN,50));
        textArea.setBounds(20,20,500,400);
        textArea.setBorder(new LineBorder(Color.BLACK));
        textArea.setEditable(true);
        
        scrollPane.setBounds(20,20,500,400);
        scrollPane.getViewport().setBackground(Color.white);
        scrollPane.getViewport().add(textArea);
        
        add(scrollPane);

        setVisible(true);
    }
}
