/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interface;

import Rumus.Rumus;
import static java.awt.Color.black;
import static java.awt.Color.white;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author zero
 */
public class PN_MatriksX3 extends javax.swing.JPanel {

    /**
     * Creates new form X2
     */
    public PN_MatriksX3() {
        initComponents();
        initComponents();
        ButtonGroup bG = new ButtonGroup();
        bG.add(OP_penjumahan);
        bG.add(OP_pengurangan);
   A11.setForeground(white);
   A12.setForeground(white);
   A13.setForeground(white);
   A21.setForeground(white);
   A22.setForeground(white);
   A23.setForeground(white);
   A31.setForeground(white);
   A33.setForeground(white);
   A32.setForeground(white);
   B11.setForeground(white);
   B12.setForeground(white);
   B13.setForeground(white);
   B21.setForeground(white);
   B22.setForeground(white);
   B23.setForeground(white);
   B31.setForeground(white);
   B32.setForeground(white);
   B33.setForeground(white);
   C11.setForeground(white);
   C12.setForeground(white);
   C13.setForeground(white);
   C21.setForeground(white);
   C22.setForeground(white);
   C23.setForeground(white);
    C31.setForeground(white);
    C32.setForeground(white);
    C33.setForeground(white);
    LB_hasil.setForeground(white);
    LB_matrixA.setForeground(white);
    LB_matrixB.setForeground(white);
    MatrixA.setForeground(white);
    MatrixA1.setForeground(white);
    MatrixA2.setForeground(white);
    OP_choese.setForeground(white);
    OP_pengurangan.setForeground(white);
    OP_penjumahan.setForeground(white);
    jPanel1.setForeground(white);
    Hitung.setForeground(black);
        LB_hasil.setForeground(white);
        LB_hasil.setForeground(white);
        LB_hasil.setForeground(white);
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
        MatrixA = new javax.swing.JPanel();
        A11 = new javax.swing.JTextField();
        A31 = new javax.swing.JTextField();
        A32 = new javax.swing.JTextField();
        A12 = new javax.swing.JTextField();
        A21 = new javax.swing.JTextField();
        A22 = new javax.swing.JTextField();
        A13 = new javax.swing.JTextField();
        A23 = new javax.swing.JTextField();
        A33 = new javax.swing.JTextField();
        LB_matrixA = new javax.swing.JLabel();
        LB_matrixB = new javax.swing.JLabel();
        OP_choese = new javax.swing.JLabel();
        OP_penjumahan = new javax.swing.JRadioButton();
        OP_pengurangan = new javax.swing.JRadioButton();
        LB_hasil = new javax.swing.JLabel();
        Hitung = new javax.swing.JToggleButton();
        MatrixA1 = new javax.swing.JPanel();
        B11 = new javax.swing.JTextField();
        B31 = new javax.swing.JTextField();
        B32 = new javax.swing.JTextField();
        B12 = new javax.swing.JTextField();
        B21 = new javax.swing.JTextField();
        B22 = new javax.swing.JTextField();
        B13 = new javax.swing.JTextField();
        B23 = new javax.swing.JTextField();
        B33 = new javax.swing.JTextField();
        MatrixA2 = new javax.swing.JPanel();
        C11 = new javax.swing.JTextField();
        C31 = new javax.swing.JTextField();
        C32 = new javax.swing.JTextField();
        C12 = new javax.swing.JTextField();
        C21 = new javax.swing.JTextField();
        C22 = new javax.swing.JTextField();
        C13 = new javax.swing.JTextField();
        C23 = new javax.swing.JTextField();
        C33 = new javax.swing.JTextField();

        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(518, 530));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        MatrixA.setBackground(new java.awt.Color(51, 51, 51));

        A11.setBackground(new java.awt.Color(51, 51, 51));

        A31.setBackground(new java.awt.Color(51, 51, 51));

        A32.setBackground(new java.awt.Color(51, 51, 51));
        A32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A32ActionPerformed(evt);
            }
        });

        A12.setBackground(new java.awt.Color(51, 51, 51));

        A21.setBackground(new java.awt.Color(51, 51, 51));

        A22.setBackground(new java.awt.Color(51, 51, 51));

        A13.setBackground(new java.awt.Color(51, 51, 51));

        A23.setBackground(new java.awt.Color(51, 51, 51));

        A33.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout MatrixALayout = new javax.swing.GroupLayout(MatrixA);
        MatrixA.setLayout(MatrixALayout);
        MatrixALayout.setHorizontalGroup(
            MatrixALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MatrixALayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(MatrixALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(A21, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(A31, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(A11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MatrixALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(A22, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(A12, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(A32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MatrixALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(A13)
                    .addComponent(A23, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(A33, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(16, 16, 16))
        );
        MatrixALayout.setVerticalGroup(
            MatrixALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MatrixALayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(MatrixALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(A13)
                    .addGroup(MatrixALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(A11)
                        .addComponent(A12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MatrixALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A22)
                    .addComponent(A21)
                    .addComponent(A23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MatrixALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A31)
                    .addComponent(A32)
                    .addComponent(A33))
                .addGap(13, 13, 13))
        );

        LB_matrixA.setBackground(new java.awt.Color(51, 51, 51));
        LB_matrixA.setText("Matrix A");

        LB_matrixB.setBackground(new java.awt.Color(51, 51, 51));
        LB_matrixB.setText("Matrix B");

        OP_choese.setBackground(new java.awt.Color(51, 51, 51));
        OP_choese.setText("Pilih Operasi yang akan di lakukan");

        OP_penjumahan.setBackground(new java.awt.Color(51, 51, 51));
        OP_penjumahan.setText("Penjumlahan");
        OP_penjumahan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OP_penjumahanActionPerformed(evt);
            }
        });

        OP_pengurangan.setBackground(new java.awt.Color(51, 51, 51));
        OP_pengurangan.setText("Pengurangan");
        OP_pengurangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OP_penguranganActionPerformed(evt);
            }
        });

        LB_hasil.setBackground(new java.awt.Color(51, 51, 51));
        LB_hasil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LB_hasil.setText("Hasil");

        Hitung.setBackground(new java.awt.Color(0, 153, 102));
        Hitung.setForeground(new java.awt.Color(0, 0, 0));
        Hitung.setText("Hitung");
        Hitung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HitungMouseClicked(evt);
            }
        });

        MatrixA1.setBackground(new java.awt.Color(51, 51, 51));

        B11.setBackground(new java.awt.Color(51, 51, 51));

        B31.setBackground(new java.awt.Color(51, 51, 51));

        B32.setBackground(new java.awt.Color(51, 51, 51));

        B12.setBackground(new java.awt.Color(51, 51, 51));

        B21.setBackground(new java.awt.Color(51, 51, 51));

        B22.setBackground(new java.awt.Color(51, 51, 51));

        B13.setBackground(new java.awt.Color(51, 51, 51));

        B23.setBackground(new java.awt.Color(51, 51, 51));

        B33.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout MatrixA1Layout = new javax.swing.GroupLayout(MatrixA1);
        MatrixA1.setLayout(MatrixA1Layout);
        MatrixA1Layout.setHorizontalGroup(
            MatrixA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MatrixA1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(MatrixA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(B21, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B31, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MatrixA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(B22, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B12, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MatrixA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(B13)
                    .addComponent(B23, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B33, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(16, 16, 16))
        );
        MatrixA1Layout.setVerticalGroup(
            MatrixA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MatrixA1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(MatrixA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B13)
                    .addGroup(MatrixA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(B11)
                        .addComponent(B12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MatrixA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B22)
                    .addComponent(B21)
                    .addComponent(B23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MatrixA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B31)
                    .addComponent(B32)
                    .addComponent(B33))
                .addContainerGap())
        );

        MatrixA2.setBackground(new java.awt.Color(51, 51, 51));

        C11.setBackground(new java.awt.Color(51, 51, 51));

        C31.setBackground(new java.awt.Color(51, 51, 51));

        C32.setBackground(new java.awt.Color(51, 51, 51));

        C12.setBackground(new java.awt.Color(51, 51, 51));

        C21.setBackground(new java.awt.Color(51, 51, 51));

        C22.setBackground(new java.awt.Color(51, 51, 51));

        C13.setBackground(new java.awt.Color(51, 51, 51));

        C23.setBackground(new java.awt.Color(51, 51, 51));

        C33.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout MatrixA2Layout = new javax.swing.GroupLayout(MatrixA2);
        MatrixA2.setLayout(MatrixA2Layout);
        MatrixA2Layout.setHorizontalGroup(
            MatrixA2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MatrixA2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(MatrixA2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(C21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(C31, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(C11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MatrixA2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(C22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(C12, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(C32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MatrixA2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(C13, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(C23, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(C33, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(16, 16, 16))
        );
        MatrixA2Layout.setVerticalGroup(
            MatrixA2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MatrixA2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(MatrixA2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(C13)
                    .addGroup(MatrixA2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(C11)
                        .addComponent(C12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MatrixA2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C22)
                    .addComponent(C21)
                    .addComponent(C23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MatrixA2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C31)
                    .addComponent(C32)
                    .addComponent(C33))
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LB_hasil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(MatrixA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LB_matrixA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(143, 143, 143)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LB_matrixB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(196, 196, 196))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(MatrixA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(OP_penjumahan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OP_pengurangan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Hitung, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(OP_choese, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MatrixA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_matrixA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LB_matrixB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MatrixA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MatrixA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(OP_choese, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OP_penjumahan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OP_pengurangan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Hitung, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(LB_hasil, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MatrixA2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(195, 195, 195))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void OP_penjumahanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OP_penjumahanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OP_penjumahanActionPerformed

    private void OP_penguranganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OP_penguranganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OP_penguranganActionPerformed

    private void HitungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HitungMouseClicked
        // TODO add your handling code here:
        double a11 = Integer.parseInt(A11.getText());
        double a12 = Integer.parseInt(A12.getText());
        double a21 = Integer.parseInt(A21.getText());
        double a22= Integer.parseInt(A22.getText());
        double a13= Integer.parseInt(A13.getText());
        double a23= Integer.parseInt(A23.getText());
        double a31= Integer.parseInt(A31.getText());
        double a32= Integer.parseInt(A32.getText());
        double a33= Integer.parseInt(A33.getText());

        double b11 = Integer.parseInt(B11.getText());
        double b12 = Integer.parseInt(B12.getText());
        double b21 = Integer.parseInt(B21.getText());
        double b22= Integer.parseInt(B22.getText());
        double b13= Integer.parseInt(B13.getText());
        double b23= Integer.parseInt(B23.getText());
        double b31= Integer.parseInt(B31.getText());
        double b32= Integer.parseInt(B32.getText());
        double b33= Integer.parseInt(B33.getText());
        
        Rumus rumus = new Rumus();
        
        if(OP_penjumahan.isSelected()){
            double [][]result = rumus.M3(a11, a12, a13, a21, a22, a23, a31, a32, a33, b11, b12, b13, b21, b22, b23, b31, b32, b33, OP_penjumahan.getText());
            C11.setText(String.valueOf(String.valueOf(result[0][0])));
            C12.setText(String.valueOf(String.valueOf(result[0][1])));
            C13.setText(String.valueOf(String.valueOf(result[0][2])));
            C21.setText(String.valueOf(String.valueOf(result[1][0])));
            C22.setText(String.valueOf(String.valueOf(result[1][1])));
            C23.setText(String.valueOf(String.valueOf(result[1][2])));
            C31.setText(String.valueOf(String.valueOf(result[2][0])));
            C32.setText(String.valueOf(String.valueOf(result[2][1])));
            C33.setText(String.valueOf(String.valueOf(result[2][2])));
            
        }else if (OP_pengurangan.isSelected()){
            double [][]result = rumus.M3(a11, a12, a13, a21, a22, a23, a31, a32, a33, b11, b12, b13, b21, b22, b23, b31, b32, b33, OP_pengurangan.getText());
            C11.setText(String.valueOf(String.valueOf(result[0][0])));
            C12.setText(String.valueOf(String.valueOf(result[0][1])));
            C13.setText(String.valueOf(String.valueOf(result[0][2])));
            C21.setText(String.valueOf(String.valueOf(result[1][0])));
            C22.setText(String.valueOf(String.valueOf(result[1][1])));
            C23.setText(String.valueOf(String.valueOf(result[1][2])));
            C31.setText(String.valueOf(String.valueOf(result[2][0])));
            C32.setText(String.valueOf(String.valueOf(result[2][1])));
            C33.setText(String.valueOf(String.valueOf(result[2][2])));
            
        }else{
            JOptionPane.showConfirmDialog(null, "Pilih Operasi !");

        }

        
        
    }//GEN-LAST:event_HitungMouseClicked

    private void A32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A32ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A11;
    private javax.swing.JTextField A12;
    private javax.swing.JTextField A13;
    private javax.swing.JTextField A21;
    private javax.swing.JTextField A22;
    private javax.swing.JTextField A23;
    private javax.swing.JTextField A31;
    private javax.swing.JTextField A32;
    private javax.swing.JTextField A33;
    private javax.swing.JTextField B11;
    private javax.swing.JTextField B12;
    private javax.swing.JTextField B13;
    private javax.swing.JTextField B21;
    private javax.swing.JTextField B22;
    private javax.swing.JTextField B23;
    private javax.swing.JTextField B31;
    private javax.swing.JTextField B32;
    private javax.swing.JTextField B33;
    private javax.swing.JTextField C11;
    private javax.swing.JTextField C12;
    private javax.swing.JTextField C13;
    private javax.swing.JTextField C21;
    private javax.swing.JTextField C22;
    private javax.swing.JTextField C23;
    private javax.swing.JTextField C31;
    private javax.swing.JTextField C32;
    private javax.swing.JTextField C33;
    private javax.swing.JToggleButton Hitung;
    private javax.swing.JLabel LB_hasil;
    private javax.swing.JLabel LB_matrixA;
    private javax.swing.JLabel LB_matrixB;
    private javax.swing.JPanel MatrixA;
    private javax.swing.JPanel MatrixA1;
    private javax.swing.JPanel MatrixA2;
    private javax.swing.JLabel OP_choese;
    private javax.swing.JRadioButton OP_pengurangan;
    private javax.swing.JRadioButton OP_penjumahan;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
