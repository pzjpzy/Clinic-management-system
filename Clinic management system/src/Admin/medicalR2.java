/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Admin;

import Patient.*;
import Doctor.mrTablev2;
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
public class medicalR2 extends JPanel{
    public medicalR2(JFrame frame){
        FileReader fr;
        JTextArea textArea = new JTextArea();
        try {
            fr = new FileReader("medicalrecord.txt");
            BufferedReader br  = new BufferedReader(fr);
            String line = null;
            while((line = br.readLine()) != null){
                String values[] = line.split(",");
                String datarow[] = {values[0],values[2],values[3],values[5],values[7]};
                if(user.name.equals(datarow[0]) && user.disease.equals(datarow[1]) && user.medicine.equals(datarow[2]) && user.date.equals(datarow[3]) && user.followup.equals(datarow[4]) ){
                    String ndatarow[] = {values[0],values[1],values[2],values[3],values[4],values[5],values[6],values[7]};
                    textArea.setText(
                        "\n"+   
                        "       "+"Patient Info  "+"\n"+
                        "\n"+   
                        "           "+"Name : "+ndatarow[0]+"\n"+
                        "           "+"IC Number : "+ndatarow[1]+"\n"+
                        "\n"+   
                        "       "+"Medical History "+"\n"+
                        "\n"+   
                        "           "+"Disease : "+ndatarow[2]+"\n"+
                        "           "+"Medicine : "+ndatarow[3]+"\n"+
                        "           "+"Allergies : "+ndatarow[4]+"\n"+
                        "\n"+   
                        "       "+"Health Information  "+"\n"+
                        "\n"+   
                        "           "+"Date : "+ndatarow[5]+"\n"+
                        "           "+"Vitals : "+ndatarow[6]+"\n"+
                        "\n"+   
                        "       "+"Next Step  "+"\n"+
                        "\n"+   
                        "           "+"Follow-up Appointment : "+ndatarow[7]+"\n"                
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

                AMR panel = new AMR(frame);
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
