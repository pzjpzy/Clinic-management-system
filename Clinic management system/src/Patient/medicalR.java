/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JButton;
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
public class medicalR extends JPanel{
    public medicalR(JFrame frame){
        FileReader fr;
        JTextArea textArea = new JTextArea();
        try {
            fr = new FileReader("medicalrecord.txt");
            BufferedReader br  = new BufferedReader(fr);
            String line = null;
            while((line = br.readLine()) != null){
                String values[] = line.split(",");
                if(user.disease.equals(values[0])){
                    textArea.setText(
                        "\n"+   
                        "\s"+"\s"+"Disease : "+user.disease+"\n"+
                        "\s"+"\s"+"Medicine : "+user.medicine+"\n"+
                        "\s"+"\s"+"Allergies : "+user.allergies+"\n"+
                        "\s"+"\s"+"Date : "+user.date+"\n"+
                        "\s"+"\s"+"Vitals : "+user.vital+"\n"+
                        "\s"+"\s"+"Follow-up Appointment : "+user.followup+"\n"                
                    );  
                                
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("file not found");
        } catch (IOException e){
            System.out.println("error occured");
        }


        
        JPanel box1 = new JPanel();//the box contain medical record
        box1.setBackground(Color.white);
        box1.setBounds(200,150,1125,700);
        
        JLabel label = new JLabel();
        label.setText("Medical Record");
        label.setOpaque(false);
        label.setFont(new Font("My Boli",Font.PLAIN,50));
        label.setBounds(575,50,400,50);
        label.setHorizontalAlignment(JLabel.CENTER);
        
        JButton back = new JButton();
        back.setText("Back");
        back.setBackground(new Color(162,229,221));
        back.setHorizontalAlignment(JButton.CENTER);
        back.setBounds(50,20,200,100);
        back.setFont(new Font("My Boli",Font.PLAIN,25));
        back.setFocusable(false);
        back.addActionListener((ActionEvent e)->{ // go to patientMenu
        frame.remove(this);

        mrTable panel = new mrTable(frame);
        frame.add(panel);
        frame.revalidate();
        frame.repaint();    
        });
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

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
        layer.add(back,Integer.valueOf(2));
        layer.add(scrollPane,Integer.valueOf(2));
        
//        JFrame frame = new JFrame();
//        frame.setTitle("Patient Medical Record");
//        frame.setVisible(true);
//        frame.setResizable(false);
//        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        add(layer);
        setBounds(0,0,1536,864);

        setLayout(null);
    }
}
