/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doctor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author pangz
 */
public class frame extends JFrame implements ActionListener {
    JButton logout;
    public frame() {
//        patientmenuPanel panel = new patientmenuPanel(this);
        login panel  = new login(this);
        
        setTitle("Clinic Management System");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        add(panel);

        
        
        }

    @Override
        public void actionPerformed(ActionEvent e) {
//            if(e.getSource()==jButton1){
//            // Remove all components from the content pane
//            getContentPane().removeAll();
//            //add all components back
//            getContentPane().add(new doctorMainPage(this));
//            // Revalidate and repaint to update the UI
//            getContentPane().revalidate();
//            getContentPane().repaint();
//            }
            
        }
        
   }
