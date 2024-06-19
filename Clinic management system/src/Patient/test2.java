/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;
 
import java.awt.*;
import javax.swing.*;
 
public class test2 extends JFrame{
	//Hour sixteen, activity one.	
 
 
	public test2(){
		super("Combo Scroll");
		setSize(400,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		FlowLayout flo = new FlowLayout();
		setLayout(flo);
 
		String[] contents = new String[]{"Alem", "Habtam", "Desta", "Almaz", 
				"Zewdit", "Abraham", "Tsehaye" , "abababab", "yoyoyoyo"};
		JComboBox list = new JComboBox(contents);
		add(list);
 
		setVisible(true);
	}
}
