/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

/**
 *
 * @author pangz
 */
public class user {
    public static String name;
    public static String password;
    public static String role;
    public static String ic;
    public static String phoneNum;
    public static String dob;
    public static String gender;
    public static String bloodType;
    public static String disease;
    public static String medicine;
    public static String allergies;
    public static String date;
    public static String vital;
    public static String followup;
    
    
    static void update(String name,String password,String role,String ic, String phoneNum,String dob,String gender,String bloodType){
        user.name = name;
        user.password = password;
        user.role = role;
        user.ic = ic;
        user.phoneNum = phoneNum;
        user.dob = dob;
        user.gender = gender;
        user.bloodType = bloodType;
    }
    
    static void authenticate(String name,String ic,String disease,String medicine,String allergies,String date,String vital,String followup){
        user.name = name;
        user.ic = ic;
        user.disease = disease;
        user.medicine = medicine;
        user.allergies = allergies;
        user.date = date;
        user.vital = vital;
        user.followup = followup;
        
        
        
    }
    
    static void display(){
        System.out.println(name+password+role+ic+phoneNum+dob+gender+bloodType);
    }
}
