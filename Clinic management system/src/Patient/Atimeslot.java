/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Patient;

import Doctor.mrTablev2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pangz
 */
public class Atimeslot extends javax.swing.JPanel {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    LocalDateTime now = LocalDateTime.now();
    String date = dtf.format(now);
    JFrame frame;
    String time;
    
    javax.swing.DefaultComboBoxModel doctorModel = new javax.swing.DefaultComboBoxModel();
    javax.swing.DefaultComboBoxModel timeModel = new javax.swing.DefaultComboBoxModel();
    private DefaultTableModel container = new DefaultTableModel();
    
    private String columnName[] = {""};
    /**
     * Creates new form Atimeslot
     */
    public Atimeslot(JFrame frame) {
        
        try{
        FileReader fr = new FileReader("dailyAppointment.txt");
        BufferedReader br = new BufferedReader(fr);
        //show all doctor
        String line = null;
        
        while((line = br.readLine())!= null){
 
            String values[] = line.split(",");
            if(values[1].equals(date)){
                doctorModel.addElement(values[0]);

            }
  
        }

        br.close();
        fr.close();
        
        
        }catch(IOException e){
            System.out.println("error");
        }
        
        
        
        container.setColumnIdentifiers(columnName);
        this.frame = frame;
        setBounds(0,0,1536,864);
        initComponents();
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Doctor:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Make new apointment");

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jTable1.setModel(container);
        jTable1.setFocusable(false);
        jTable1.setRowHeight(80);
        jTable1.setRowMargin(10);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jComboBox1.setModel(doctorModel);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButton1.setText("Back");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 204, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButton5.setText("Make appointment");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 204, 204));
        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButton6.setText("Refresh time slot");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.setFocusable(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("*Note: Please press this button after choosing doctor");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Available time slot");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(310, 310, 310))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(389, 389, 389))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(751, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(456, 456, 456)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(133, 133, 133))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(757, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frame.remove(this);

        Appointment panel = new Appointment(frame);
        frame.add(panel);
        frame.revalidate();
        frame.repaint();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        

        if (time != null){
            try{
                //add new appointment to text file

                FileReader fr = new FileReader("Appointment.txt");
                BufferedReader br  = new BufferedReader(fr);
//
                String table[] = new String[100];
                String line = null;
                int row = 0;
//
                while((line = br.readLine()) != null){
                    String values[] = line.split(",");

                 
                    table [row] = line;
                    row ++;


                }
                br.close();
                fr.close();

                FileWriter fw = new FileWriter("Appointment.txt");

                for(int i=0; i<row; i++){
                    if (table[i] != null){
                        fw.append(table[i]+"\n");
                    }
                }
                
                String sentence = String.valueOf(jComboBox1.getSelectedItem())+","+user.name+","+time+","+date;
                fw.append(sentence);

                fw.close();
                
                
                //update doctor schedule availability
                fr = new FileReader("dailyAppointment.txt");
                br  = new BufferedReader(fr);
                
                table = new String[100];
                line = null;
                row = 0;

                while((line = br.readLine()) != null){
                    String values[] = line.split(",");

                    if(values[0].equals(jComboBox1.getSelectedItem())){
                        if(time.equals("9.00-10.00")){
                            values[2] = "false";
                            table [row] = values[0]+","+values[1]+","+values[2]+","+values[3]+","+values[4]+","+values[5]+","+values[6]+","+
                                    values[7]+","+values[8];
                            row ++;
                        }
                        if(time.equals("10.00-11.00")){
                            values[3] = "false";
                            table [row] = values[0]+","+values[1]+","+values[2]+","+values[3]+","+values[4]+","+values[5]+","+values[6]+","+
                                    values[7]+","+values[8];
                            row ++;
                        }
                        if(time.equals("11.00-12.00")){
                            values[4] = "false";
                            table [row] = values[0]+","+values[1]+","+values[2]+","+values[3]+","+values[4]+","+values[5]+","+values[6]+","+
                                    values[7]+","+values[8];
                            row ++;
                        }
                        if(time.equals("12.00-1.00")){
                            values[5] = "false";
                            table [row] = values[0]+","+values[1]+","+values[2]+","+values[3]+","+values[4]+","+values[5]+","+values[6]+","+
                                    values[7]+","+values[8];
                            row ++;
                        }
                        if(time.equals("2.00-3.00")){
                            values[6] = "false";
                            table [row] = values[0]+","+values[1]+","+values[2]+","+values[3]+","+values[4]+","+values[5]+","+values[6]+","+
                                    values[7]+","+values[8];
                            row ++;
                        }
                        if(time.equals("3.00-4.00")){
                            values[7] = "false";
                            table [row] = values[0]+","+values[1]+","+values[2]+","+values[3]+","+values[4]+","+values[5]+","+values[6]+","+
                                    values[7]+","+values[8];
                            row ++;
                        }
                        if(time.equals("4.00-5.00")){
                            values[8] = "false";
                            table [row] = values[0]+","+values[1]+","+values[2]+","+values[3]+","+values[4]+","+values[5]+","+values[6]+","+
                                    values[7]+","+values[8];
                            row ++;
                        }
                    }
                    else{
                        table [row] = line;
                        row ++;
                    }
                }
                
                fr.close();
                br.close();
                
                
                fw = new FileWriter("dailyAppointment.txt");

                for(int i=0; i<row; i++){
                    if (table[i] != null){
                        fw.append(table[i]+"\n");
                    }
                }
                
                fw.close();
            }catch(IOException e) {
                System.out.println("Some error occured");
            }

//            mrTablev2 panel = new mrTablev2(frame);
//            frame.remove(this);
//            frame.add(panel);
            JOptionPane.showMessageDialog(null,"Succesfully made appointment.","Information",JOptionPane.INFORMATION_MESSAGE);
            frame.revalidate();
            frame.repaint();
        }
        else{
            JOptionPane.showMessageDialog(null,"Please select a time slot first.","Information",JOptionPane.INFORMATION_MESSAGE);
        }
        
        //refresh table
        timeModel.removeAllElements();
        container.setRowCount(0);
        try{
        FileReader fr = new FileReader("dailyAppointment.txt");
        BufferedReader br = new BufferedReader(fr);
        
        //show all time slot
        String line = null;
        while((line = br.readLine())!= null){
            
            String values[] = line.split(",");
            
            if(jComboBox1.getSelectedItem().equals(values[0]) && date.equals(values[1])){
                if(values[2].equals("true")){
                    timeModel.addElement("9.00-10.00");
                    String timeslot[] = {"9.00-10.00"};
                    container.addRow(timeslot);
                }
                if(values[3].equals("true")){
                    timeModel.addElement("10.00-11.00");
                    String timeslot[] = {"10.00-11.00"};
                    container.addRow(timeslot);
                }
                if(values[4].equals("true")){
                    timeModel.addElement("11.00-12.00");
                    String timeslot[] = {"11.00-12.00"};
                    container.addRow(timeslot);
                }
                if(values[5].equals("true")){
                    timeModel.addElement("12.00-1.00");
                    String timeslot[] = {"12.00-1.00"};
                    container.addRow(timeslot);
                }
                if(values[6].equals("true")){
                    timeModel.addElement("2.00-3.00");
                    String timeslot[] = {"2.00-3.00"};
                    container.addRow(timeslot);
                }
                if(values[7].equals("true")){
                    timeModel.addElement("3.00-4.00");
                    String timeslot[] = {"3.00-4.00"};
                    container.addRow(timeslot);
                }
                if(values[8].equals("true")){
                    timeModel.addElement("4.00-5.00");
                    String timeslot[] = {"4.00-5.00"};
                    container.addRow(timeslot);
                }
            }
        }

        br.close();
        fr.close();
        
        
        }catch(IOException e){
            System.out.println("error");
        }
        
//        frame.remove(this);
//
//        Atimeslot panel = new Atimeslot(frame);
//        frame.add(panel);
        frame.revalidate();
        frame.repaint();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        timeModel.removeAllElements();
        container.setRowCount(0);
        try{
        FileReader fr = new FileReader("dailyAppointment.txt");
        BufferedReader br = new BufferedReader(fr);
        
        //show all time slot
        String line = null;
        while((line = br.readLine())!= null){
            
            String values[] = line.split(",");
            
            if(jComboBox1.getSelectedItem().equals(values[0]) && date.equals(values[1])){
                if(values[2].equals("true")){
                    timeModel.addElement("9.00-10.00");
                    String timeslot[] = {"9.00-10.00"};
                    container.addRow(timeslot);
                }
                if(values[3].equals("true")){
                    timeModel.addElement("10.00-11.00");
                    String timeslot[] = {"10.00-11.00"};
                    container.addRow(timeslot);
                }
                if(values[4].equals("true")){
                    timeModel.addElement("11.00-12.00");
                    String timeslot[] = {"11.00-12.00"};
                    container.addRow(timeslot);
                }
                if(values[5].equals("true")){
                    timeModel.addElement("12.00-1.00");
                    String timeslot[] = {"12.00-1.00"};
                    container.addRow(timeslot);
                }
                if(values[6].equals("true")){
                    timeModel.addElement("2.00-3.00");
                    String timeslot[] = {"2.00-3.00"};
                    container.addRow(timeslot);
                }
                if(values[7].equals("true")){
                    timeModel.addElement("3.00-4.00");
                    String timeslot[] = {"3.00-4.00"};
                    container.addRow(timeslot);
                }
                if(values[8].equals("true")){
                    timeModel.addElement("4.00-5.00");
                    String timeslot[] = {"4.00-5.00"};
                    container.addRow(timeslot);
                }
            }
        }

        br.close();
        fr.close();
        
        
        }catch(IOException e){
            System.out.println("error");
        }
        
//        frame.remove(this);
//
//        Atimeslot panel = new Atimeslot(frame);
//        frame.add(panel);
        frame.revalidate();
        frame.repaint();

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        int row = jTable1.getSelectedRow();
        time = String.valueOf(container.getValueAt(row, 0));
    }//GEN-LAST:event_jTable1MouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
