/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import data.Point;
import data.Points;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Roland
 */
public class MainFrame extends javax.swing.JFrame {
    Points p;
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        p = new Points();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addPointDialog = new javax.swing.JDialog();
        addPointDialogAddButton = new javax.swing.JButton();
        addPointDialogCancelButton = new javax.swing.JButton();
        addPointDialogXField = new javax.swing.JTextField();
        addPointDialogYField = new javax.swing.JTextField();
        addPointDialogXLabel = new javax.swing.JLabel();
        addPointDialogYLabel = new javax.swing.JLabel();
        addPointDialogNameField = new javax.swing.JTextField();
        addPointDialogNameLabel = new javax.swing.JLabel();
        addPointButton = new javax.swing.JButton();
        removePointButton = new javax.swing.JButton();
        addNeighbourButton = new javax.swing.JButton();
        removeNeighbourButton = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        log = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        getAllPointsButton = new javax.swing.JButton();
        draw = new DrawingPanel();
        selectedPointXField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        selectedPointYField = new javax.swing.JTextField();

        addPointDialog.setTitle("Add Point");
        addPointDialog.setBounds(new java.awt.Rectangle(200, 200, 200, 170));
        addPointDialog.setMinimumSize(new java.awt.Dimension(190, 140));
        addPointDialog.setResizable(false);

        addPointDialogAddButton.setText("Add Point");
        addPointDialogAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPointDialogAddButtonActionPerformed(evt);
            }
        });

        addPointDialogCancelButton.setText("Cancel");
        addPointDialogCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPointDialogCancelButtonActionPerformed(evt);
            }
        });

        addPointDialogXField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPointDialogXFieldActionPerformed(evt);
            }
        });

        addPointDialogYField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPointDialogYFieldActionPerformed(evt);
            }
        });

        addPointDialogXLabel.setText("X:");

        addPointDialogYLabel.setText("Y:");

        addPointDialogNameLabel.setText("Name:");

        javax.swing.GroupLayout addPointDialogLayout = new javax.swing.GroupLayout(addPointDialog.getContentPane());
        addPointDialog.getContentPane().setLayout(addPointDialogLayout);
        addPointDialogLayout.setHorizontalGroup(
            addPointDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPointDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addPointDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPointDialogLayout.createSequentialGroup()
                        .addComponent(addPointDialogAddButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addPointDialogCancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPointDialogLayout.createSequentialGroup()
                        .addGroup(addPointDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addPointDialogLayout.createSequentialGroup()
                                .addGroup(addPointDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(addPointDialogXLabel)
                                    .addComponent(addPointDialogYLabel))
                                .addGap(0, 32, Short.MAX_VALUE))
                            .addComponent(addPointDialogNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addPointDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addPointDialogNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(addPointDialogXField)
                            .addComponent(addPointDialogYField))))
                .addContainerGap())
        );
        addPointDialogLayout.setVerticalGroup(
            addPointDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPointDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addPointDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPointDialogXField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPointDialogXLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addPointDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPointDialogYField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPointDialogYLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addPointDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPointDialogNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPointDialogNameLabel))
                .addGap(18, 18, 18)
                .addGroup(addPointDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addPointDialogCancelButton)
                    .addComponent(addPointDialogAddButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KI-Prak1 - Pfadsuche");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        addPointButton.setText("Add Point");
        addPointButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPointButtonActionPerformed(evt);
            }
        });

        removePointButton.setText("Remove Point");
        removePointButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePointButtonActionPerformed(evt);
            }
        });

        addNeighbourButton.setText("Add Neighbour");

        removeNeighbourButton.setText("Remove Neighbour");

        jButton5.setText("Exit");
        jButton5.setToolTipText("");

        log.setEditable(false);
        jScrollPane1.setViewportView(log);

        jLabel7.setText("Log:");

        getAllPointsButton.setText("Get all points");

        draw.setPreferredSize(new java.awt.Dimension(615, 0));
        draw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                drawMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout drawLayout = new javax.swing.GroupLayout(draw);
        draw.setLayout(drawLayout);
        drawLayout.setHorizontalGroup(
            drawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 885, Short.MAX_VALUE)
        );
        drawLayout.setVerticalGroup(
            drawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );

        jLabel8.setText("X:");

        jLabel9.setText("Y:");

        selectedPointYField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedPointYFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(getAllPointsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addNeighbourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeNeighbourButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addPointButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(removePointButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(selectedPointXField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(selectedPointYField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 8, Short.MAX_VALUE)))
                        .addGap(38, 38, 38)))
                .addComponent(draw, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addPointButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(removePointButton)
                            .addComponent(selectedPointXField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(selectedPointYField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(getAllPointsButton)
                        .addGap(34, 34, 34)
                        .addComponent(addNeighbourButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeNeighbourButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 67, Short.MAX_VALUE)
                        .addComponent(draw, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addPointButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPointButtonActionPerformed
        addPointDialog.setVisible(true);
//        double x = Double.parseDouble(xAddPoint.getText());
//        double y = Double.parseDouble(yAddPoint.getText());
//        
//        p.addPoint(new Point(x, y));
//        StringBuilder sb = new StringBuilder();
//        sb.append(log.getText());
//        sb.append( "Neuer Punkt(" + x + ", " + y + ") hinzugefügt\n");
//        log.setText(sb.toString());
//        draw.setPoints(p.getAllPoints());
//        draw.paintPoints();
        
    }//GEN-LAST:event_addPointButtonActionPerformed

    private void addPointDialogYFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPointDialogYFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addPointDialogYFieldActionPerformed

    private void addPointDialogXFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPointDialogXFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addPointDialogXFieldActionPerformed

    private void addPointDialogCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPointDialogCancelButtonActionPerformed
        // TODO add your handling code here:
        addPointDialog.setVisible(false);
    }//GEN-LAST:event_addPointDialogCancelButtonActionPerformed

    private void addPointDialogAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPointDialogAddButtonActionPerformed
        // TODO add your handling code here:
        double x = Integer.parseInt(addPointDialogXField.getText());
        double y = Integer.parseInt(addPointDialogYField.getText());
        String name = addPointDialogNameField.getText();

        p.addPoint(new Point(x, y, name));
        StringBuilder sb = new StringBuilder();
        sb.append(log.getText());
        sb.append( "Punkt " +name+" (" + x + ", " + y + ") hinzugefügt\n");

        addPointDialog.setVisible(false);

        log.setText(sb.toString());
        draw.setPoints(p.getAllPoints());
        draw.paintPoints();
    }//GEN-LAST:event_addPointDialogAddButtonActionPerformed

    private void drawMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawMouseClicked
        // TODO add your handling code here:
        int x = evt.getX();
        int y = evt.getY();
        
        for(Point po : p.getAllPoints()) {
            int poX = (int) po.getX();
            int poY = (int) po.getY();
            if((x >= poX-30 && x <= poX+30 && y >= poY-30 && y <= poY+30)) 
            {
                selectedPointXField.setText(Integer.toString(poX));
                selectedPointYField.setText(Integer.toString(poY));
                draw.selectPoint(po);
                break;
            }
            else {
                selectedPointXField.setText("");
                selectedPointYField.setText("");
                draw.unselectPoints();
                break;
            }
        }
    }//GEN-LAST:event_drawMouseClicked

    private void selectedPointYFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectedPointYFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectedPointYFieldActionPerformed

    private void removePointButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePointButtonActionPerformed
        // TODO add your handling code here:
        String x1 = selectedPointXField.getText();
        String y1 = selectedPointYField.getText();
        if(x1 != "" && y1 != "") {
            double x = Double.parseDouble(x1);
            double y = Double.parseDouble(y1);
            Point po = p.getPoint(x, y);
            p.removePoint(po);
            draw.removePoint(po);
            addLogLine("remove", po, "p");
            selectedPointXField.setText("");
            selectedPointYField.setText("");
        }
    }//GEN-LAST:event_removePointButtonActionPerformed
    
    private void addLogLine(String typeFlag, Point p, String logType) {
        double x = p.getX();
        double y = p.getY();
        String name = p.getName();
        
        StringBuilder sb = new StringBuilder();
        sb.append(log.getText());
        
        switch(typeFlag) {
            case "add": {
                if(logType.equals("nb")) {
                    sb.append("Nachbar zu Punkt " +name+"(" + x + ", " + y + ") hinzugefügt\n");
                }
                else if(logType.equals("p")) {
                    sb.append( "Punkt " +name+"(" + x + ", " + y + ") hinzugefügt\n");
                }
                break;
            }
            case "remove": {
                if(logType.equals("nb")) {
                    sb.append("Nachbar von Punkt " +name+"(" + x + ", " + y + ") entfernt\n");
                }
                else if(logType.equals("p")) {
                    sb.append( "Punkt " +name+"(" + x + ", " + y + ") entfernt\n");
                }
                break;
            }
        }
        
        
        log.setText(sb.toString());
    }
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
        
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /*
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNeighbourButton;
    private javax.swing.JButton addPointButton;
    private javax.swing.JDialog addPointDialog;
    private javax.swing.JButton addPointDialogAddButton;
    private javax.swing.JButton addPointDialogCancelButton;
    private javax.swing.JTextField addPointDialogNameField;
    private javax.swing.JLabel addPointDialogNameLabel;
    private javax.swing.JTextField addPointDialogXField;
    private javax.swing.JLabel addPointDialogXLabel;
    private javax.swing.JTextField addPointDialogYField;
    private javax.swing.JLabel addPointDialogYLabel;
    private javax.swing.JPanel draw;
    private javax.swing.JButton getAllPointsButton;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane log;
    private javax.swing.JButton removeNeighbourButton;
    private javax.swing.JButton removePointButton;
    private javax.swing.JTextField selectedPointXField;
    private javax.swing.JTextField selectedPointYField;
    // End of variables declaration//GEN-END:variables
*/
    private javax.swing.JTextField selectedPointXField;
    private javax.swing.JTextField selectedPointYField;
    private javax.swing.JButton addNeighbourButton;
    private javax.swing.JButton addPointButton;
    private javax.swing.JDialog addPointDialog;
    private javax.swing.JButton addPointDialogAddButton;
    private javax.swing.JButton addPointDialogCancelButton;
    private javax.swing.JTextField addPointDialogNameField;
    private javax.swing.JLabel addPointDialogNameLabel;
    private javax.swing.JTextField addPointDialogXField;
    private javax.swing.JLabel addPointDialogXLabel;
    private javax.swing.JTextField addPointDialogYField;
    private javax.swing.JLabel addPointDialogYLabel;
    private javax.swing.JButton getAllPointsButton;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane log;
    private javax.swing.JButton removeNeighbourButton;
    private javax.swing.JButton removePointButton;
    private javax.swing.JTextField x1AddNeighbour;
    private javax.swing.JTextField x2AddNeighbour;
    private javax.swing.JTextField xAddPoint;
    private javax.swing.JTextField y1AddNeighbour;
    private javax.swing.JTextField y2AddNeighbour;
    private javax.swing.JTextField yAddPoint;
    private DrawingPanel draw;
    }
