/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospitalmanager;
import hospitalmanager.Patient.PatientStartupUI;
import hospitalmanager.FrontDesk.FrontDeskStartUpUI;
import hospitalmanager.Doctor.DoctorStartUpUI;
import java.awt.event.KeyEvent;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author guest123
 */
public class LoginStartupUI extends javax.swing.JFrame {

    /**
     * Creates new form LoginStartupUI
     */
    private static Scanner x;
    
    public LoginStartupUI() {
        initComponents();
        Username.setBackground(new java.awt.Color(0,0,0,0));
        Password.setBackground(new java.awt.Color(0,0,0,0));
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Password = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanager/Icons/5259_aurora.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Password.setBackground(new java.awt.Color(255, 255, 255));
        Password.setForeground(new java.awt.Color(51, 51, 51));
        Password.setText("Password");
        Password.setBorder(null);
        Password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordFocusGained(evt);
            }
        });
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordKeyPressed(evt);
            }
        });
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 211, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 210, 15));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 210, 15));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanager/Icons/icons8_contacts_20px.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanager/Icons/icons8_lock_20px_1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 20, 30));

        Username.setBackground(new java.awt.Color(255, 255, 255));
        Username.setForeground(new java.awt.Color(51, 51, 51));
        Username.setText("Username");
        Username.setBorder(null);
        Username.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UsernameFocusGained(evt);
            }
        });
        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });
        Username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UsernameKeyPressed(evt);
            }
        });
        jPanel1.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 210, 30));
        Username.getAccessibleContext().setAccessibleName(" ");
        Username.getAccessibleContext().setAccessibleDescription("");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanager/Icons/Screenshot_1553.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 220, 150));

        jButton2.setBackground(new java.awt.Color(101, 170, 190));
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("Forget Password?");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 130, 40));

        jButton3.setBackground(new java.awt.Color(101, 170, 190));
        jButton3.setForeground(new java.awt.Color(51, 51, 51));
        jButton3.setText("Log In");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 100, 40));

        jButton4.setBackground(new java.awt.Color(101, 170, 190));
        jButton4.setForeground(new java.awt.Color(51, 51, 51));
        jButton4.setText("Sign Up");
        jButton4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton4FocusGained(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 100, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanager/Icons/5259_aurora.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 420, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        List<String[]> rowList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src\\hospitalmanager\\UserDatabase.csv"))) 
        {
            String line = "";
            while ((line = br.readLine()) != null) 
            {
                String[] lineItems = line.split(",");
                rowList.add(lineItems);
            }
            br.close();
        }
        catch(Exception e)
        {
            // Handle any I/O problems
        }
        matrix = new String[rowList.size()][];
                
        for (int i = 0; i < rowList.size(); i++) 
        {
            String[] row = rowList.get(i);
            matrix[i] = row;
        }
        SignUp register = new SignUp();
        register.show();
        
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String username = Username.getText();
        String password = Password.getText();
        boolean found = false;

        try
        {
            File filex = new File("src\\hospitalmanager\\UserDatabase.csv");
            Scanner scan = new Scanner(filex);
            scan.useDelimiter("[,\n]");

            while(scan.hasNext() && !found)
            {
                String usernamex = scan.next();
                String passwordx = scan.next();
                
                if(usernamex.trim().equals(username.trim()) && passwordx.trim().equals(password.trim()))
                {
                    found = true;
                }
                else
                {
                    for(int i = 0; i < 12; i++)scan.next();
                }
            }
            if(found && username.contains("@guest.com"))
            {
                JOptionPane.showMessageDialog(null, "Logging Into Guest Account...");
                PatientStartupUI nextPage = new PatientStartupUI();
                nextPage.FName.setText(scan.next());
                nextPage.LName.setText(scan.next());
                nextPage.PhoneN.setText(scan.next());
                nextPage.EmailA.setText(scan.next());
                nextPage.DateOB.setText(scan.next());
                nextPage.HomeAddress.setText(scan.next());
                nextPage.Sex.setText(scan.next());
            
                nextPage.show();
                for (int i = 0; i < 5;i++)
                {
                    scan.next();
                }
                dispose();
                scan.reset();
            }

            if(found && username.contains("@doctor.com"))
            {
                JOptionPane.showMessageDialog(null, "Logging Into Doctor/Nurse Account...");
                if(Username.getText().equals("mirkamandari@doctor.com")) doc = 0;
                if(Username.getText().equals("bui@doctor.com")) doc=1;
                if(Username.getText().equals("lewitsky@doctor.com")) doc=2;
                if(Username.getText().equals("Kariyawasam")) doc=3;
                DoctorStartUpUI nextPage = new DoctorStartUpUI();
                nextPage.show();

                dispose();
            }

            if(found && username.contains("@front.com"))
            {
                JOptionPane.showMessageDialog(null, "Logging Into Front Desk Account...");
                FrontDeskStartUpUI nextPage = new FrontDeskStartUpUI();
                nextPage.show();

                dispose();
            }

            if(!found)
            {
                JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
                Username.setText("Username");
                Password.setText("Password");
            }

        }

        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "An error occured! "+e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String username = (String)JOptionPane.showInputDialog(this, "Username","Account Verification", JOptionPane.PLAIN_MESSAGE);
        int rNum = ((int) (Math.random()*(3 - 0)));
        String[] questions = new String[] {"What is your favorite food?","What's your favourite color?","What is your favorite sport?"};
        String q = questions[rNum];
        String ans;
        
        boolean valid = true;
        boolean found = false;
                
        try
        {
            File filex = new File("src\\hospitalmanager\\UserDatabase.csv");
            Scanner scan = new Scanner(filex);
            scan.useDelimiter("[,\n]");

            while(scan.hasNext() && !found)
            {
                String usernamex = scan.next();

                if(usernamex.trim().equals(username.trim()))
                {
                    found = true;
                }
                
                else
                {
                    for(int i = 0; i < 13; i++)scan.next();
                }
            }
            
            if(found)
            {
                valid = false;
                String secQ = (String)JOptionPane.showInputDialog(this, q,"Account Verification", JOptionPane.PLAIN_MESSAGE);
                for(int i = 0; i < 10+rNum; i++)scan.next();
                ans = scan.next();
                if(secQ.trim().equals(ans.trim()))valid = true;
            }

            if(!found)
            {
                JOptionPane.showMessageDialog(null, "Incorrect Username");
            }
            
            if(!valid)
            {
                JOptionPane.showMessageDialog(null, "Inccorect");
            }  
            
            if(valid)
            {
                String newPass = (String)JOptionPane.showInputDialog(this, "Please Enter new password","Password Reset", JOptionPane.PLAIN_MESSAGE);
                

                List<String[]> rowList = new ArrayList<>();
                try (BufferedReader br = new BufferedReader(new FileReader("src\\hospitalmanager\\UserDatabase.csv"))) {
                    String line = "";
                    while ((line = br.readLine()) != null) {
                        String[] lineItems = line.split(",");
                        rowList.add(lineItems);
                    }
                    br.close();
                }
                catch(Exception e){
                    // Handle any I/O problems
                }
                
                matrix = new String[rowList.size()][];
                
                for (int i = 0; i < rowList.size(); i++) {
                    String[] row = rowList.get(i);
                    matrix[i] = row;
                }

                try
                {
                    File file = new File("src\\hospitalmanager\\UserDatabase.csv");
                    FileWriter fw = new FileWriter(file);
                    PrintWriter pw = new PrintWriter(fw);

                    for (int i = 0; i < matrix.length; i++) {
                        for(int j = 0; j < matrix[i].length-1; j++)
                        {
                            if(matrix[i][0].equals(username.trim()))
                            {
                                matrix[i][1] = newPass.trim();
                            }
                            pw.append(matrix[i][j]+",");
                        }
                        pw.append(matrix[i][matrix[i].length-1]+"\n");
                    }
                    pw.close();
                }                
                catch(Exception e)
                {
                    
                }
                //newFile.
                JOptionPane.showMessageDialog(null, "Password has been reset");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "An error occured! "+e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed

    }//GEN-LAST:event_UsernameActionPerformed

    private void UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFocusGained
        String username = Username.getText();
        if(username.equals("Username"))Username.setText("");
        String password = Password.getText();
        if(password.length()==0)Password.setText("password");
    }//GEN-LAST:event_UsernameFocusGained

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed

    }//GEN-LAST:event_PasswordActionPerformed

    private void PasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFocusGained
        Password.setText("");
        if(Username.getText().isEmpty())Username.setText("Username");
    }//GEN-LAST:event_PasswordFocusGained

    private void jButton4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton4FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4FocusGained

    private void PasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            String username = Username.getText();
            String password = Password.getText();
            boolean found = false;

            try
            {
                File filex = new File("src\\hospitalmanager\\UserDatabase.csv");
                Scanner scan = new Scanner(filex);
                scan.useDelimiter("[,\n]");

                while(scan.hasNext() && !found)
                {
                    String usernamex = scan.next();
                    String passwordx = scan.next();

                    if(usernamex.trim().equals(username.trim()) && passwordx.trim().equals(password.trim()))
                    {
                        found = true;
                    }
                    else
                    {
                        for(int i = 0; i < 12; i++)scan.next();
                    }
                }
                if(found && username.contains("@guest.com"))
                {
                    JOptionPane.showMessageDialog(null, "Logging Into Guest Account...");
                    PatientStartupUI nextPage = new PatientStartupUI();
                    nextPage.FName.setText(scan.next());
                    nextPage.LName.setText(scan.next());
                    nextPage.PhoneN.setText(scan.next());
                    nextPage.EmailA.setText(scan.next());
                    nextPage.DateOB.setText(scan.next());
                    nextPage.HomeAddress.setText(scan.next());
                    nextPage.Sex.setText(scan.next());

                    nextPage.show();
                    for (int i = 0; i < 5;i++)
                    {
                        scan.next();
                    }
                    dispose();
                    scan.reset();
                }

                if(found && username.contains("@doctor.com"))
                {
                    JOptionPane.showMessageDialog(null, "Logging Into Doctor/Nurse Account...");
                    if(Username.getText().equals("mirkamandari@doctor.com")) doc = 0;
                    if(Username.getText().equals("bui@doctor.com")) doc=1;
                    if(Username.getText().equals("lewitsky@doctor.com")) doc=2;
                    if(Username.getText().equals("Kariyawasam")) doc=3;

                    DoctorStartUpUI nextPage = new DoctorStartUpUI();
                    nextPage.show();

                    dispose();
                }

                if(found && username.contains("@front.com"))
                {
                    JOptionPane.showMessageDialog(null, "Logging Into Front Desk Account...");
                    FrontDeskStartUpUI nextPage = new FrontDeskStartUpUI();
                    nextPage.show();

                    dispose();
                }

                if(!found)
                {
                    JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
                    Username.setText("Username");
                    Password.setText("Password");
                }

            }

            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "An error occured! "+e);
            }
        }
    }//GEN-LAST:event_PasswordKeyPressed

    private void UsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsernameKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            String username = Username.getText();
            String password = Password.getText();
            boolean found = false;

            try
            {
                File filex = new File("src\\hospitalmanager\\UserDatabase.csv");
                Scanner scan = new Scanner(filex);
                scan.useDelimiter("[,\n]");

                while(scan.hasNext() && !found)
                {
                    String usernamex = scan.next();
                    String passwordx = scan.next();

                    if(usernamex.trim().equals(username.trim()) && passwordx.trim().equals(password.trim()))
                    {
                        found = true;
                    }
                    else
                    {
                        for(int i = 0; i < 12; i++)scan.next();
                    }
                }
                if(found && username.contains("@guest.com"))
                {
                    JOptionPane.showMessageDialog(null, "Logging Into Guest Account...");
                    PatientStartupUI nextPage = new PatientStartupUI();
                    nextPage.FName.setText(scan.next());
                    nextPage.LName.setText(scan.next());
                    nextPage.PhoneN.setText(scan.next());
                    nextPage.EmailA.setText(scan.next());
                    nextPage.DateOB.setText(scan.next());
                    nextPage.HomeAddress.setText(scan.next());
                    nextPage.Sex.setText(scan.next());

                    nextPage.show();
                    for (int i = 0; i < 5;i++)
                    {
                        scan.next();
                    }
                    dispose();
                    scan.reset();
                }

                if(found && username.contains("@doctor.com"))
                {
                    JOptionPane.showMessageDialog(null, "Logging Into Doctor/Nurse Account...");
                    if(Username.getText().equals("mirkamandari@doctor.com")) doc = 0;
                    if(Username.getText().equals("bui@doctor.com")) doc=1;
                    if(Username.getText().equals("lewitsky@doctor.com")) doc=2;
                    if(Username.getText().equals("Kariyawasam")) doc=3;

                    DoctorStartUpUI nextPage = new DoctorStartUpUI();
                    nextPage.show();

                    dispose();
                }

                if(found && username.contains("@front.com"))
                {
                    JOptionPane.showMessageDialog(null, "Logging Into Front Desk Account...");
                    FrontDeskStartUpUI nextPage = new FrontDeskStartUpUI();
                    nextPage.show();

                    dispose();
                }

                if(!found)
                {
                    JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
                    Username.setText("Username");
                    Password.setText("Password");
                }

            }

            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "An error occured! "+e);
            }
        }
    }//GEN-LAST:event_UsernameKeyPressed

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
            java.util.logging.Logger.getLogger(LoginStartupUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginStartupUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginStartupUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginStartupUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginStartupUI().setVisible(true);
            }
        });
    }
    public static void removeRecord(String filepath, String removeUser, int positionOfTerm)
    {
        int position = positionOfTerm - 1;
        String tempFile = "temp. txt";
        File oldFile = new File(filepath);
        File newFile = new File(tempFile);
        
        String currentLine;
        String data[];
        
        try
        {
            FileWriter fw = new FileWriter(tempFile,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            FileReader fr = new FileReader(filepath);
            BufferedReader br = new BufferedReader(fr);
            
            while ((currentLine = br.readLine ()) != null)
            {
                data = currentLine.split (",");
                if (!(data[position].equalsIgnoreCase(removeUser))) pw.println(currentLine);
            }
            
            pw.flush(); 
            pw.close(); 
            fr.close(); 
            br.close(); 
            bw.close(); 
            fw.close();

            oldFile.delete();
            File dump = new File(filepath);
            newFile.renameTo(dump);
        }
        catch(Exception e)
        {
                
        }

    }
    
    public static String[][] matrix;
    public static int doc;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password;
    public javax.swing.JTextField Username;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
