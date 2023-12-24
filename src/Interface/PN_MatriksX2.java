/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interface;

import Rumus.Rumus;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author zero
 */
public class PN_MatriksX2 extends javax.swing.JPanel {

    /**
     * Creates new form X2
     */
    public PN_MatriksX2() {
        initComponents();
        ButtonGroup bG = new ButtonGroup();
        bG.add(OP_penjumlahan);
        bG.add(OP_pengurangan);
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
        MatriksA = new javax.swing.JPanel();
        A11 = new javax.swing.JTextField();
        A21 = new javax.swing.JTextField();
        A22 = new javax.swing.JTextField();
        A12 = new javax.swing.JTextField();
        LB_MatriksA = new javax.swing.JLabel();
        MatriksB = new javax.swing.JPanel();
        B11 = new javax.swing.JTextField();
        B21 = new javax.swing.JTextField();
        B22 = new javax.swing.JTextField();
        B12 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        OP_penjumlahan = new javax.swing.JRadioButton();
        OP_pengurangan = new javax.swing.JRadioButton();
        LB_Hasil = new javax.swing.JLabel();
        Hasil = new javax.swing.JPanel();
        C11 = new javax.swing.JTextField();
        C21 = new javax.swing.JTextField();
        C22 = new javax.swing.JTextField();
        C12 = new javax.swing.JTextField();
        Hitung = new javax.swing.JToggleButton();

        setPreferredSize(new java.awt.Dimension(518, 530));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        MatriksA.setBackground(new java.awt.Color(51, 51, 51));
        MatriksA.setForeground(new java.awt.Color(255, 255, 255));

        A11.setBackground(new java.awt.Color(51, 51, 51));
        A11.setForeground(new java.awt.Color(255, 255, 255));

        A21.setBackground(new java.awt.Color(51, 51, 51));
        A21.setForeground(new java.awt.Color(255, 255, 255));
        A21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A21ActionPerformed(evt);
            }
        });

        A22.setBackground(new java.awt.Color(51, 51, 51));
        A22.setForeground(new java.awt.Color(255, 255, 255));

        A12.setBackground(new java.awt.Color(51, 51, 51));
        A12.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout MatriksALayout = new javax.swing.GroupLayout(MatriksA);
        MatriksA.setLayout(MatriksALayout);
        MatriksALayout.setHorizontalGroup(
            MatriksALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MatriksALayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(MatriksALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MatriksALayout.createSequentialGroup()
                        .addComponent(A11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(A12))
                    .addGroup(MatriksALayout.createSequentialGroup()
                        .addComponent(A21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(A22)))
                .addGap(16, 16, 16))
        );
        MatriksALayout.setVerticalGroup(
            MatriksALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MatriksALayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(MatriksALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A11)
                    .addComponent(A12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MatriksALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A21)
                    .addComponent(A22))
                .addGap(16, 16, 16))
        );

        LB_MatriksA.setBackground(new java.awt.Color(51, 51, 51));
        LB_MatriksA.setForeground(new java.awt.Color(255, 255, 255));
        LB_MatriksA.setText("Matrix A");

        MatriksB.setBackground(new java.awt.Color(51, 51, 51));
        MatriksB.setForeground(new java.awt.Color(255, 255, 255));

        B11.setBackground(new java.awt.Color(51, 51, 51));
        B11.setForeground(new java.awt.Color(255, 255, 255));
        B11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B11ActionPerformed(evt);
            }
        });

        B21.setBackground(new java.awt.Color(51, 51, 51));
        B21.setForeground(new java.awt.Color(255, 255, 255));

        B22.setBackground(new java.awt.Color(51, 51, 51));
        B22.setForeground(new java.awt.Color(255, 255, 255));

        B12.setBackground(new java.awt.Color(51, 51, 51));
        B12.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout MatriksBLayout = new javax.swing.GroupLayout(MatriksB);
        MatriksB.setLayout(MatriksBLayout);
        MatriksBLayout.setHorizontalGroup(
            MatriksBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MatriksBLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(MatriksBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MatriksBLayout.createSequentialGroup()
                        .addComponent(B11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B12))
                    .addGroup(MatriksBLayout.createSequentialGroup()
                        .addComponent(B21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B22)))
                .addGap(16, 16, 16))
        );
        MatriksBLayout.setVerticalGroup(
            MatriksBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MatriksBLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(MatriksBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B11)
                    .addComponent(B12))
                .addGap(14, 14, 14)
                .addGroup(MatriksBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B21)
                    .addComponent(B22))
                .addGap(16, 16, 16))
        );

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Matrix B");

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pilih Operasi yang akan di lakukan");

        OP_penjumlahan.setBackground(new java.awt.Color(51, 51, 51));
        OP_penjumlahan.setForeground(new java.awt.Color(255, 255, 255));
        OP_penjumlahan.setText("Penjumlahan");
        OP_penjumlahan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OP_penjumlahanActionPerformed(evt);
            }
        });

        OP_pengurangan.setBackground(new java.awt.Color(51, 51, 51));
        OP_pengurangan.setForeground(new java.awt.Color(255, 255, 255));
        OP_pengurangan.setText("Pengurangan");
        OP_pengurangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OP_penguranganActionPerformed(evt);
            }
        });

        LB_Hasil.setBackground(new java.awt.Color(51, 51, 51));
        LB_Hasil.setForeground(new java.awt.Color(255, 255, 255));
        LB_Hasil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LB_Hasil.setText("Hasil");

        Hasil.setBackground(new java.awt.Color(51, 51, 51));
        Hasil.setForeground(new java.awt.Color(255, 255, 255));

        C11.setBackground(new java.awt.Color(51, 51, 51));
        C11.setForeground(new java.awt.Color(255, 255, 255));

        C21.setBackground(new java.awt.Color(51, 51, 51));
        C21.setForeground(new java.awt.Color(255, 255, 255));

        C22.setBackground(new java.awt.Color(51, 51, 51));
        C22.setForeground(new java.awt.Color(255, 255, 255));

        C12.setBackground(new java.awt.Color(51, 51, 51));
        C12.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout HasilLayout = new javax.swing.GroupLayout(Hasil);
        Hasil.setLayout(HasilLayout);
        HasilLayout.setHorizontalGroup(
            HasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HasilLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(HasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HasilLayout.createSequentialGroup()
                        .addComponent(C11, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(C12, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(HasilLayout.createSequentialGroup()
                        .addComponent(C21, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(C22, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        HasilLayout.setVerticalGroup(
            HasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HasilLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(HasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(HasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        Hitung.setBackground(new java.awt.Color(0, 153, 102));
        Hitung.setForeground(new java.awt.Color(0, 0, 0));
        Hitung.setText("Hitung");
        Hitung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HitungMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(221, 221, 221))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(OP_penjumlahan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(OP_pengurangan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(37, 37, 37)
                        .addComponent(Hitung, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MatriksA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LB_MatriksA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(119, 119, 119)))
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MatriksB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(118, 118, 118)))
                        .addGap(28, 28, 28))
                    .addComponent(LB_Hasil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Hasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LB_MatriksA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MatriksB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(MatriksA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OP_penjumlahan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OP_pengurangan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Hitung))
                .addGap(63, 63, 63)
                .addComponent(LB_Hasil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Hasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void B11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B11ActionPerformed

    private void OP_penjumlahanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OP_penjumlahanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OP_penjumlahanActionPerformed

    private void OP_penguranganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OP_penguranganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OP_penguranganActionPerformed

    private void HitungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HitungMouseClicked
        // TODO add your handling code here:
        
        double a11 = Integer.parseInt(A11.getText());
        double a12 = Integer.parseInt(A12.getText());
        double a21 = Integer.parseInt(A21.getText());
        double a22= Integer.parseInt(A22.getText());

        double b11 = Integer.parseInt(B11.getText());
        double b12 = Integer.parseInt(B12.getText());
        double b21 = Integer.parseInt(B21.getText());
        double b22= Integer.parseInt(B22.getText());
        
        Rumus rumus = new Rumus();
        double result[][];
        
        
        if(OP_penjumlahan.isSelected()){
            
            result = rumus.M2(a11, a12, a21, a22, b11, b12, b21, b22,OP_penjumlahan.getText());
            
            C11.setText(String.valueOf(result[0][0]));
            C12.setText(String.valueOf(result[0][1]));
            C21.setText(String.valueOf(result[1][0]));
            C22.setText(String.valueOf(result[1][1]));
            
            System.out.println(OP_penjumlahan.getText());
            
        }else if (OP_pengurangan.isSelected()){
            result = rumus.M2(a11, a12, a21, a22, b11, b12, b21, b22,OP_pengurangan.getText());
            
            C11.setText(String.valueOf(result[0][0]));
            C12.setText(String.valueOf(result[0][1]));
            C21.setText(String.valueOf(result[1][0]));
            C22.setText(String.valueOf(result[1][1]));
            
            System.out.println(OP_pengurangan.getText());
                
        }else{
            JOptionPane.showConfirmDialog(null, "Pilih Operasi !");
        }
        
        
        
        
    }//GEN-LAST:event_HitungMouseClicked

    private void A21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A21ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A11;
    private javax.swing.JTextField A12;
    private javax.swing.JTextField A21;
    private javax.swing.JTextField A22;
    private javax.swing.JTextField B11;
    private javax.swing.JTextField B12;
    private javax.swing.JTextField B21;
    private javax.swing.JTextField B22;
    private javax.swing.JTextField C11;
    private javax.swing.JTextField C12;
    private javax.swing.JTextField C21;
    private javax.swing.JTextField C22;
    private javax.swing.JPanel Hasil;
    private javax.swing.JToggleButton Hitung;
    private javax.swing.JLabel LB_Hasil;
    private javax.swing.JLabel LB_MatriksA;
    private javax.swing.JPanel MatriksA;
    private javax.swing.JPanel MatriksB;
    private javax.swing.JRadioButton OP_pengurangan;
    private javax.swing.JRadioButton OP_penjumlahan;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
