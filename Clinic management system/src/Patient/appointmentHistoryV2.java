/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Patient;

import Doctor.*;
import Patient.user;
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
public class appointmentHistoryV2 extends javax.swing.JPanel {
    JFrame frame;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    LocalDateTime now = LocalDateTime.now();
    String date = dtf.format(now);
    
    String doctorName;
    String patientName;
    String timeSlot;
    String rowDate;
    private DefaultTableModel container = new DefaultTableModel();
    
    private String columnName[] = {"Doctor's Name","Patient's name","Time slot","Date"};
    
    boolean search = false;
    String user = "";
    /**
     * Creates new form cancelAppointment
     */
    public appointmentHistoryV2(JFrame frame) {
        setBounds(0,0,1536,864);
        this.frame = frame;
        container.setColumnIdentifiers(columnName);
        try{
            FileReader fr = new FileReader("Appointment.txt");
            BufferedReader br  = new BufferedReader(fr);

            String line = null;
            while((line = br.readLine()) != null){
                String values[] = line.split(",");
                
                container.addRow(values);
                    
                
            }
        }catch(IOException e) {
                System.out.println("Some error occured");
        }
        initComponents();
    }
    
    
    public appointmentHistoryV2(JFrame frame,boolean search, String user) {
        setBounds(0,0,1536,864);
        this.frame = frame;
        this.search = search;
        this.user = user;
        container.setColumnIdentifiers(columnName);
        try{
            FileReader fr = new FileReader("Appointment.txt");
            BufferedReader br  = new BufferedReader(fr);

            String line = null;
            while((line = br.readLine()) != null){
                String values[] = line.split(",");
                if(search == true){
                    if(user.equals(values[1])){
                    container.addRow(values);
                    }
                
                }else{
                    container.addRow(values);
                }
                
            }
        }catch(IOException e) {
                System.out.println("Some error occured");
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setBackground(java.awt.Color.white);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Appointment History");

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTable1.setModel(container);
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(211, 211, 211));
        jTable1.setRowHeight(40);
        jTable1.setRowMargin(10);
        jTable1.setShowVerticalLines(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setBackground(java.awt.Color.white);
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Back");
        jLabel3.setFocusable(false);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel3MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(512, 512, 512))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        int row  = jTable1.getSelectedRow();
        
        doctorName = String.valueOf(container.getValueAt(row,0));
         patientName = String.valueOf(container.getValueAt(row,1));
         timeSlot = String.valueOf(container.getValueAt(row,2));
         rowDate = String.valueOf(container.getValueAt(row,3));
    }//GEN-LAST:event_jTable1MouseReleased

    private void jLabel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseReleased
        doctorMainPage panel = new doctorMainPage(frame);
        frame.remove(this);
        frame.add(panel);
        frame.revalidate();
        frame.repaint();
    }//GEN-LAST:event_jLabel3MouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
