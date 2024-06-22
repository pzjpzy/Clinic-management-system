/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Admin;
import java.io.*;
/**
 *
 * @author User
 */
public class GenerateNewID {

    public static String NewPatientID(){
    int maxID = 0;
        File data = new File("C:\\Users\\User\\Java\\PatientInformation.txt");

        if (data.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(data))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.trim().isEmpty()) continue;
                    String[] parts = line.split(",");
                    if (parts[0].startsWith("P")) {
                        String idStr = parts[0].substring(1);
                        int id = Integer.parseInt(idStr);
                        if (id > maxID) {
                            maxID = id;
                        }
                    }
                }
            } catch (IOException e) {
                maxID = 0;
            }
        }

        return String.format("Patient", maxID + 1);
    }

    public static String NewDoctorID() {
        int maxID = 0;
        File data = new File("C:\\Users\\User\\Java\\PatientInformation.txt");

        if (data.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(data))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.trim().isEmpty()) continue;
                    String[] parts = line.split(",");
                    if (parts[0].startsWith("D")) {
                        String idStr = parts[0].substring(1);
                        int id = Integer.parseInt(idStr);
                        if (id > maxID) {
                            maxID = id;
                        }
                    }
                }
            } catch (IOException e) {
                maxID = 0;
            }
        }

        return String.format("Doctor", maxID + 1);
    }
}
