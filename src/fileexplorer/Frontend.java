/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fileexplorer;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollPane;
/**
 *
 * @author jawad
 */
public class Frontend extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    FileFunction fileFunc=new FileFunction();
    public Frontend() {
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
        MusicJButton = new javax.swing.JButton();
        PicturesJButton = new javax.swing.JButton();
        DocumentJButton = new javax.swing.JButton();
        DownloadJButton = new javax.swing.JButton();
        SearchTextField = new javax.swing.JTextField();
        DisplayPanel = new javax.swing.JPanel();
        BackPanel = new javax.swing.JScrollPane();
        DesktopJButton = new javax.swing.JButton();
        ThisPCJButton = new javax.swing.JButton();
        VideosJButton = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        URLTextField = new javax.swing.JTextField();
        SearchJButton = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        RenameJButton = new javax.swing.JButton();
        DeleteJButton = new javax.swing.JButton();
        PasteJButton = new javax.swing.JButton();
        CopyJButton = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1307, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fileexplorer/FILE EXPLORER.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, 40));

        MusicJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fileexplorer/Group 14.png"))); // NOI18N
        MusicJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MusicJButtonActionPerformed(evt);
            }
        });
        getContentPane().add(MusicJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 160, 30));

        PicturesJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fileexplorer/Group 10.png"))); // NOI18N
        PicturesJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PicturesJButtonActionPerformed(evt);
            }
        });
        getContentPane().add(PicturesJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 160, 30));

        DocumentJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fileexplorer/Group 9.png"))); // NOI18N
        DocumentJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocumentJButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DocumentJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 160, 30));

        DownloadJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fileexplorer/Group 8.png"))); // NOI18N
        DownloadJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DownloadJButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DownloadJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 160, 30));

        SearchTextField.setBackground(new java.awt.Color(153, 153, 0));
        getContentPane().add(SearchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 69, 190, 30));

        DisplayPanel.setBackground(new java.awt.Color(0, 102, 102));
        DisplayPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/fileexplorer/Rectangle 10.png")))); // NOI18N
        DisplayPanel.add(BackPanel);

        getContentPane().add(DisplayPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 880, 450));

        DesktopJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fileexplorer/Group 7.png"))); // NOI18N
        DesktopJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesktopJButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DesktopJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 160, 30));

        ThisPCJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fileexplorer/Group 6.png"))); // NOI18N
        ThisPCJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThisPCJButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ThisPCJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 160, 30));

        VideosJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fileexplorer/Group 12.png"))); // NOI18N
        VideosJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VideosJButtonActionPerformed(evt);
            }
        });
        getContentPane().add(VideosJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 160, 30));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fileexplorer/Group 12.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 160, 30));

        URLTextField.setBackground(new java.awt.Color(153, 153, 0));
        URLTextField.setForeground(new java.awt.Color(153, 153, 255));
        getContentPane().add(URLTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 112, 880, 30));

        SearchJButton.setBackground(new java.awt.Color(0, 0, 0));
        SearchJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fileexplorer/Vector.png"))); // NOI18N
        getContentPane().add(SearchJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 70, 31, 29));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fileexplorer/Group 15.png"))); // NOI18N
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 61, 45));

        RenameJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fileexplorer/Group 4.png"))); // NOI18N
        getContentPane().add(RenameJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 61, 45));

        DeleteJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fileexplorer/Group 3.png"))); // NOI18N
        DeleteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteJButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 61, 45));

        PasteJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fileexplorer/Group 2.png"))); // NOI18N
        getContentPane().add(PasteJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 61, 45));

        CopyJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fileexplorer/Group 1.png"))); // NOI18N
        getContentPane().add(CopyJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 61, 45));

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fileexplorer/Group 5.png"))); // NOI18N
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, 61, 45));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fileexplorer/triangle.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1308, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MusicJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MusicJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MusicJButtonActionPerformed

    private void PicturesJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PicturesJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PicturesJButtonActionPerformed

    private void DocumentJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocumentJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DocumentJButtonActionPerformed

    private void DownloadJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DownloadJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DownloadJButtonActionPerformed

    private void DesktopJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesktopJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DesktopJButtonActionPerformed

    private void ThisPCJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThisPCJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ThisPCJButtonActionPerformed

    private void VideosJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VideosJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VideosJButtonActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void DeleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteJButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void startAgain(File []listFiles){
        if(DisplayPanel.isAncestorOf(BackPanel))
        {DisplayPanel.remove(BackPanel);}
        JScrollPane BackPanel=new JScrollPane();
        Dimension dim=DisplayPanel.getSize();
        BackPanel.setPreferredSize(dim);
        for(File file:listFiles){
            System.out.println("File:"+file.getPath());
            makeJButton(file);
            }
        DisplayPanel.add(BackPanel);
        
    }
    public void makeJButton(File file){
        String text;
        if(file.getName()!="")
        {text=file.getName();}
        else
        {text=file.getPath();}
        JButton btn=new JButton();
        btn.setText(text);
        btn.setPreferredSize(new Dimension(100,30));
        btn.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            if(!(file.isDirectory())){   
            try 
            {Desktop.getDesktop().open(file);} 
            catch (IOException ex) 
            {Logger.getLogger(Frontend.class.getName()).log(Level.SEVERE, null, ex);}
            }
            else
            {
            startAgain(file.listFiles());
            }
        }
        });
        DisplayPanel.add(btn);
    }
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
            java.util.logging.Logger.getLogger(Frontend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frontend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frontend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frontend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            @Override
            public void run() {
                Frontend front=new Frontend();
                front.startAgain(front.fileFunc.getDrives());
                front.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane BackPanel;
    private javax.swing.JButton CopyJButton;
    private javax.swing.JButton DeleteJButton;
    private javax.swing.JButton DesktopJButton;
    private javax.swing.JPanel DisplayPanel;
    private javax.swing.JButton DocumentJButton;
    private javax.swing.JButton DownloadJButton;
    private javax.swing.JButton MusicJButton;
    private javax.swing.JButton PasteJButton;
    private javax.swing.JButton PicturesJButton;
    private javax.swing.JButton RenameJButton;
    private javax.swing.JButton SearchJButton;
    private javax.swing.JTextField SearchTextField;
    private javax.swing.JButton ThisPCJButton;
    private javax.swing.JTextField URLTextField;
    private javax.swing.JButton VideosJButton;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}