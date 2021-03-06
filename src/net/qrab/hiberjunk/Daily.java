/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.qrab.hiberjunk;

/**
 *
 * @author jkl
 */
public class Daily extends javax.swing.JPanel {

  /**
   * Creates new form Daily
   */
  public Daily() {
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

    buttonGroup2 = new javax.swing.ButtonGroup();
    txtDate = new javax.swing.JTextField();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    comboJob = new javax.swing.JComboBox();
    radioDay = new javax.swing.JRadioButton();
    radioNight = new javax.swing.JRadioButton();
    btnNewDate = new javax.swing.JButton();
    btnDeleteDate = new javax.swing.JButton();
    btnMainMenu = new javax.swing.JButton();
    jLabel3 = new javax.swing.JLabel();
    txtStartDay = new javax.swing.JTextField();
    txtStartPlant = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    txtEndDay = new javax.swing.JTextField();
    txtEndPlant = new javax.swing.JTextField();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    txtMaintEnd = new javax.swing.JTextField();
    txtMaintStart = new javax.swing.JTextField();
    jLabel9 = new javax.swing.JLabel();
    txtTons = new javax.swing.JTextField();
    jLabel10 = new javax.swing.JLabel();
    txtTonsPerHr = new javax.swing.JTextField();
    jLabel11 = new javax.swing.JLabel();
    txtNoChargeTons = new javax.swing.JTextField();
    jTabbedPane2 = new javax.swing.JTabbedPane();
    jButton3 = new javax.swing.JButton();

    txtDate.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtDateActionPerformed(evt);
      }
    });

    jLabel1.setText("Date");

    jLabel2.setText("Job");

    comboJob.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

    buttonGroup2.add(radioDay);
    radioDay.setText("Day");

    buttonGroup2.add(radioNight);
    radioNight.setText("Night");
    radioNight.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        radioNightActionPerformed(evt);
      }
    });

    btnNewDate.setText("New Date");

    btnDeleteDate.setText("Delete Date");

    btnMainMenu.setText("Main Menu");

    jLabel3.setText("Start Day");

    txtStartDay.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtStartDayActionPerformed(evt);
      }
    });

    txtStartPlant.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtStartPlantActionPerformed(evt);
      }
    });

    jLabel4.setText("Start Plant");

    jLabel5.setText("End Day");

    jLabel6.setText("End Plant");

    txtEndDay.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtEndDayActionPerformed(evt);
      }
    });

    txtEndPlant.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtEndPlantActionPerformed(evt);
      }
    });

    jLabel7.setText("Add'l Maint End");

    jLabel8.setText("Add'l Maint Start");

    txtMaintEnd.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtMaintEndActionPerformed(evt);
      }
    });

    txtMaintStart.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtMaintStartActionPerformed(evt);
      }
    });

    jLabel9.setText("Tons");

    txtTons.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtTonsActionPerformed(evt);
      }
    });

    jLabel10.setText("Tons / Hr");

    txtTonsPerHr.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtTonsPerHrActionPerformed(evt);
      }
    });

    jLabel11.setText("No Charge Tons");

    txtNoChargeTons.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtNoChargeTonsActionPerformed(evt);
      }
    });

    jButton3.setText("jButton3");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(157, 157, 157)
                .addComponent(comboJob, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(radioDay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioNight))
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel9)
                    .addGap(12, 12, 12)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                      .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaintStart, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                      .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTons, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTonsPerHr, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                  .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                      .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStartDay, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStartPlant, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(77, 77, 77)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(jLabel6)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtEndPlant, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel5)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtEndDay, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(jLabel7)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtMaintEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(jLabel11)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtNoChargeTons, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(btnMainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(btnDeleteDate, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
              .addComponent(btnNewDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
          .addComponent(jTabbedPane2)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel2)
          .addComponent(comboJob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(radioDay)
          .addComponent(radioNight)
          .addComponent(btnNewDate))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnDeleteDate)
          .addComponent(jLabel3)
          .addComponent(txtStartDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel4)
          .addComponent(txtStartPlant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel6)
          .addComponent(txtEndPlant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel5)
          .addComponent(txtEndDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel8)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(btnMainMenu)
            .addComponent(txtMaintEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel7)
            .addComponent(txtMaintStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel9)
          .addComponent(txtTons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel10)
          .addComponent(txtTonsPerHr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel11)
          .addComponent(txtNoChargeTons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
        .addGap(18, 18, 18)
        .addComponent(jButton3)
        .addContainerGap())
    );
  }// </editor-fold>//GEN-END:initComponents

  private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtDateActionPerformed

  private void radioNightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNightActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_radioNightActionPerformed

  private void txtStartDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStartDayActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtStartDayActionPerformed

  private void txtStartPlantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStartPlantActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtStartPlantActionPerformed

  private void txtEndDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEndDayActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtEndDayActionPerformed

  private void txtEndPlantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEndPlantActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtEndPlantActionPerformed

  private void txtMaintEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaintEndActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtMaintEndActionPerformed

  private void txtMaintStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaintStartActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtMaintStartActionPerformed

  private void txtTonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTonsActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtTonsActionPerformed

  private void txtTonsPerHrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTonsPerHrActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtTonsPerHrActionPerformed

  private void txtNoChargeTonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoChargeTonsActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtNoChargeTonsActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnDeleteDate;
  private javax.swing.JButton btnMainMenu;
  private javax.swing.JButton btnNewDate;
  private javax.swing.ButtonGroup buttonGroup2;
  private javax.swing.JComboBox comboJob;
  private javax.swing.JButton jButton3;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JTabbedPane jTabbedPane2;
  private javax.swing.JRadioButton radioDay;
  private javax.swing.JRadioButton radioNight;
  private javax.swing.JTextField txtDate;
  private javax.swing.JTextField txtEndDay;
  private javax.swing.JTextField txtEndPlant;
  private javax.swing.JTextField txtMaintEnd;
  private javax.swing.JTextField txtMaintStart;
  private javax.swing.JTextField txtNoChargeTons;
  private javax.swing.JTextField txtStartDay;
  private javax.swing.JTextField txtStartPlant;
  private javax.swing.JTextField txtTons;
  private javax.swing.JTextField txtTonsPerHr;
  // End of variables declaration//GEN-END:variables
}
