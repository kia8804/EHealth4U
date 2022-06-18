/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospitalmanager.FrontDesk;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author guest123
 */
public class AppointmentRequestUI extends javax.swing.JFrame {

    /**
     * Creates new form AppointmentRequestUI
     */
    public AppointmentRequestUI() {
        initComponents();
        
        String filepath = "src\\hospitalmanager\\AppointmentRequests.csv";
        String line = "";

        try
        {
            BufferedReader br = new BufferedReader(new FileReader(filepath));

            br.readLine();
            while((line = br.readLine()) != null)
            {
                String[] appointment = line.split(",");
                DefaultTableModel tblModel = (DefaultTableModel)Requests.getModel();
                appointment = new String[]{appointment[1],appointment[2],appointment[3], appointment[4], appointment[6]+' '+appointment[5]+", "+appointment[7],appointment[8]};
                tblModel.addRow(appointment);
            }
        }
        catch(Exception e)
        {

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Requests = new javax.swing.JTable();
        PhoneNumber = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        EmailAddress = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Requests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Phone Number", "Email", "Date", "Doctor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Requests.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Requests);
        if (Requests.getColumnModel().getColumnCount() > 0) {
            Requests.getColumnModel().getColumn(0).setResizable(false);
            Requests.getColumnModel().getColumn(1).setResizable(false);
            Requests.getColumnModel().getColumn(2).setResizable(false);
            Requests.getColumnModel().getColumn(3).setResizable(false);
            Requests.getColumnModel().getColumn(4).setResizable(false);
            Requests.getColumnModel().getColumn(5).setResizable(false);
        }

        PhoneNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PhoneNumberFocusGained(evt);
            }
        });
        PhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumberActionPerformed(evt);
            }
        });

        jButton1.setText("Accept Appointment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        EmailAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EmailAddressFocusGained(evt);
            }
        });

        jButton2.setText("Return");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Phone Number");

        jLabel2.setText("Email Address");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(EmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(117, 117, 117)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addContainerGap(16, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNumberActionPerformed

    private void PhoneNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PhoneNumberFocusGained
    }//GEN-LAST:event_PhoneNumberFocusGained

    private void EmailAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailAddressFocusGained
    }//GEN-LAST:event_EmailAddressFocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String filepath = "src\\hospitalmanager\\AppointmentRequests.csv";
        String line = "";

        try
        {
            BufferedReader br = new BufferedReader(new FileReader(filepath));

            br.readLine();
            while((line = br.readLine()) != null)
            {
                String[] appointment = line.split(",");
                if(appointment[3].equals(PhoneNumber.getText()) && appointment[4].equals(EmailAddress.getText()))
                {
                    String filepath2 = "src\\hospitalmanager\\Appointments.csv";
                    try
                    {
                        FileWriter fw = new FileWriter(filepath2, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter pw = new PrintWriter(bw);

                        int dateValue = 0;
                        
                        if(appointment[6].equals("January"))dateValue+=30;
                        else if(appointment[6].equals("February"))dateValue+=60;
                        else if(appointment[6].equals("March"))dateValue+=90;
                        else if(appointment[6].equals("April"))dateValue+=120;
                        else if(appointment[6].equals("May"))dateValue+=150;
                        else if(appointment[6].equals("June"))dateValue+=180;
                        else if(appointment[6].equals("July"))dateValue+=210;
                        else if(appointment[6].equals("August"))dateValue+=240;
                        else if(appointment[6].equals("September"))dateValue+=270;
                        else if(appointment[6].equals("October"))dateValue+=300;
                        else if(appointment[6].equals("November"))dateValue+=330;
                        else if(appointment[6].equals("December"))dateValue+=360;
                        
                        //dateValue+=Integer.valueOf(appointment[4]);
                        
                        if(appointment[7].equals("2022"))dateValue+=1000;
                        else if(appointment[7].equals("2023"))dateValue+=2000;
                        else if(appointment[7].equals("2024"))dateValue+=3000;
                        
                        pw.println(dateValue+","+appointment[1]+','+appointment[2]+','+appointment[3]+','+appointment[4]+','+appointment[8]+','+appointment[5]+','+appointment[6]+','+appointment[7]);
                        pw.flush();
                        pw.close();

                        JOptionPane.showMessageDialog(null, "Appointment Created");
                        }
                    catch(Exception e)
                    {

                    }
                    return;
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Invalid Entry");
                }
        
            }
        }
        catch(Exception e)
        {

        }
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppointmentRequestUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppointmentRequestUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppointmentRequestUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppointmentRequestUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppointmentRequestUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmailAddress;
    private javax.swing.JTextField PhoneNumber;
    private javax.swing.JTable Requests;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
