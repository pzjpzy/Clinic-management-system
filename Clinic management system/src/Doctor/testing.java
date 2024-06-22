/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doctor;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author pangz
 */
public class testing {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("dailyAppointment.txt");
//            fw.write("Roses are red \nViolets are blue \nBooty booty booty booty \nRockin' everywhere!");
            fw.append("\n(A poem by Bro)");
            fw.close();
        }catch(IOException e){
            System.out.println("error");
        }
        
    }
}
