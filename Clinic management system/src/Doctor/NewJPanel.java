/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Doctor;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
/**
 *
 * @author pangz
 */
public class NewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public NewJPanel(JFrame frame) {
       setBounds(0,0,1536,864);
//        setLayout(null);
        ImageIcon image1 = new ImageIcon("src/Patient/home.png");
            Image resizedUserImage1 = image1.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            ImageIcon homeImage = new ImageIcon(resizedUserImage1);
            ImageIcon image2 = new ImageIcon("src/Patient/cAppointment.png");
            Image resizedUserImage2 = image2.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
            ImageIcon apImage = new ImageIcon(resizedUserImage2);
            ImageIcon image3 = new ImageIcon("src/Patient/mAppointment.png");
            Image resizedUserImage3 = image3.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
            ImageIcon mrImage = new ImageIcon(resizedUserImage3);
        
                
		JLabel label1 = new JLabel(); //welcome user
		label1.setText("Appointment");
		label1.setOpaque(false);
                label1.setFont(new Font("My Boli",Font.PLAIN,40));
                label1.setIconTextGap(30);
		label1.setHorizontalTextPosition(JLabel.CENTER);// text for button
		label1.setVerticalTextPosition(JLabel.CENTER);
		label1.setVerticalAlignment(JLabel.CENTER); // text
		label1.setHorizontalAlignment(JLabel.CENTER);
                
                
                JPanel subban = new JPanel(); // box for welcome user
                subban.setBackground(new Color(92,201,205));
                subban.setBounds(30,50,350,140);
                subban.add(label1);
                
                JButton home = new JButton(); //logout button
                home.setBounds(1300,25,200,100);
                home.setIcon(homeImage);
                home.setIconTextGap(30);
                home.setFocusable(false);
                home.setText("Home");
                home.setFont(new Font("My Boli",Font.PLAIN,25));
                home.setFont(new Font("My Boli",Font.PLAIN,25));
                home.setBackground(Color.white);
                
                JButton appoint = new JButton(); //appointment button
                appoint.setText("Cancel Appointment");
                appoint.setVerticalTextPosition(JButton.BOTTOM);
                appoint.setHorizontalTextPosition(JButton.CENTER);
                appoint.setIcon(apImage);
                appoint.setBounds(300,300,400,400);
                appoint.setFont(new Font("My Boli",Font.PLAIN,25));
                appoint.setFocusable(false);
                appoint.setBackground(Color.white);
                
                JButton mRecord = new JButton();
                mRecord.setText("Make Appointment");
                mRecord.setVerticalTextPosition(JButton.BOTTOM);
                mRecord.setHorizontalTextPosition(JButton.CENTER);
                mRecord.setIcon(mrImage);
                mRecord.setBounds(800,300,400,400);
                mRecord.setFont(new Font("My Boli",Font.PLAIN,25));
                mRecord.setFocusable(false);
                mRecord.setBackground(Color.white);
                
                
                JPanel banner = new JPanel(); //banner
                banner.setBackground(new Color(92,201,205));
                banner.setBounds(0,0,1920,150);
                banner.setLayout(null);
                banner.add(subban);
                banner.add(home); 
                
                JPanel subbox = new JPanel();
                subbox.setBackground(new Color(162,229,221));
                subbox.setBounds(200,200,1100,600);

                
                JPanel box = new JPanel(); //below box
                box.setBounds(0,0,1920,1080);
                box.setBackground(Color.white);
                box.add(subbox);
                
                JLayeredPane layer = new JLayeredPane();
                layer.setBounds(0,150,1000,1000);
                layer.add(box,Integer.valueOf(0));
                layer.add(subbox,Integer.valueOf(1));
                layer.add(appoint,Integer.valueOf(2));
                layer.add(mRecord,Integer.valueOf(3));
                
                
                
                add(layer);
                add(banner);
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

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 255, 0));
        setPreferredSize(new java.awt.Dimension(1536, 864));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(339, 339, 339)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(414, 414, 414)
                            .addComponent(jButton1))))
                .addContainerGap(956, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(569, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            System.out.println("Hello" + jTextField1.getText());
            System.out.println("Your gender is " + jTextField2.getText());
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}