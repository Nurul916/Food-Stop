/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

/**
 *
 * @author HP
 */
public class PizzaSquareMoham extends javax.swing.JFrame {

    /**
     * Creates new form PizzaSquareMoham
     */
     int i=0,j=0,p=220,p2=550;
      String st="Maxcican Pasta";
      String st2="Peparoni Pizza 10\"";
    public PizzaSquareMoham() {
        initComponents();
    }
     public PizzaSquareMoham(int i,int j)
    {
        initComponents();
        this.i=i;
        this.j=j;
        FstQShow.setText(String.valueOf(this.i));
        SecndQShow.setText(String.valueOf(this.j));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        FstFoodName = new javax.swing.JLabel();
        FstPrice = new javax.swing.JLabel();
        FstFoodPic = new javax.swing.JLabel();
        food1plus = new javax.swing.JButton();
        food1minus = new javax.swing.JButton();
        FstQShow = new javax.swing.JTextField();
        SecndFoodPic = new javax.swing.JLabel();
        SecndName = new javax.swing.JLabel();
        SecndPrice = new javax.swing.JLabel();
        food2plus = new javax.swing.JButton();
        food2minus = new javax.swing.JButton();
        SecndQShow = new javax.swing.JTextField();
        order = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaproject/rsz_pizza.png"))); // NOI18N
        Title.setText("jLabel1");
        getContentPane().add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 530, 110));

        Back.setFont(new java.awt.Font("Ravie", 3, 18)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 35, 130, 60));

        FstFoodName.setFont(new java.awt.Font("Ravie", 3, 18)); // NOI18N
        FstFoodName.setText("Mexcican Pasta");
        getContentPane().add(FstFoodName, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, 230, 50));

        FstPrice.setFont(new java.awt.Font("Ravie", 3, 18)); // NOI18N
        FstPrice.setText("Price: 220 Tk");
        getContentPane().add(FstPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 210, 190, 60));

        FstFoodPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaproject/rsz_maxica.jpg"))); // NOI18N
        FstFoodPic.setText("jLabel2");
        getContentPane().add(FstFoodPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 230, 150));

        food1plus.setFont(new java.awt.Font("Ravie", 3, 18)); // NOI18N
        food1plus.setText("+");
        food1plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                food1plusActionPerformed(evt);
            }
        });
        getContentPane().add(food1plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 280, 50, 40));

        food1minus.setFont(new java.awt.Font("Ravie", 3, 18)); // NOI18N
        food1minus.setText("-");
        food1minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                food1minusActionPerformed(evt);
            }
        });
        getContentPane().add(food1minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 280, 50, 40));

        FstQShow.setFont(new java.awt.Font("Ravie", 3, 18)); // NOI18N
        FstQShow.setText("   0");
        FstQShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FstQShowActionPerformed(evt);
            }
        });
        getContentPane().add(FstQShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 280, 80, 40));

        SecndFoodPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaproject/rsz_pepperoni-pizza.jpg"))); // NOI18N
        SecndFoodPic.setText("jLabel1");
        getContentPane().add(SecndFoodPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 230, 150));

        SecndName.setFont(new java.awt.Font("Ravie", 3, 18)); // NOI18N
        SecndName.setText("Peparoni Pizza 10\"");
        getContentPane().add(SecndName, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 390, 270, 40));

        SecndPrice.setFont(new java.awt.Font("Ravie", 3, 18)); // NOI18N
        SecndPrice.setText("Price: 550 Tk");
        getContentPane().add(SecndPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, 180, 50));

        food2plus.setFont(new java.awt.Font("Ravie", 3, 18)); // NOI18N
        food2plus.setText("+");
        food2plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                food2plusActionPerformed(evt);
            }
        });
        getContentPane().add(food2plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 490, 50, 40));

        food2minus.setFont(new java.awt.Font("Ravie", 3, 18)); // NOI18N
        food2minus.setText("-");
        food2minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                food2minusActionPerformed(evt);
            }
        });
        getContentPane().add(food2minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 490, 50, 40));

        SecndQShow.setFont(new java.awt.Font("Ravie", 3, 18)); // NOI18N
        SecndQShow.setText("   0");
        SecndQShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecndQShowActionPerformed(evt);
            }
        });
        getContentPane().add(SecndQShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 490, 80, 40));

        order.setFont(new java.awt.Font("Ravie", 3, 18)); // NOI18N
        order.setText("Order");
        order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderActionPerformed(evt);
            }
        });
        getContentPane().add(order, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 560, 120, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaproject/banana-yellow-solid-color-background.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(1215, 695));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void food1minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_food1minusActionPerformed
        // TODO add your handling code here:
         if(i>0)
            i--;
       FstQShow.setText(String.valueOf(i));     
    }//GEN-LAST:event_food1minusActionPerformed

    private void FstQShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FstQShowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FstQShowActionPerformed

    private void food2plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_food2plusActionPerformed
        // TODO add your handling code here:
         j++;
       SecndQShow.setText(String.valueOf(j));
    }//GEN-LAST:event_food2plusActionPerformed

    private void SecndQShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecndQShowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SecndQShowActionPerformed

    private void food1plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_food1plusActionPerformed
 i++;
        FstQShow.setText(String.valueOf(i));           // TODO add your handling code here:
    }//GEN-LAST:event_food1plusActionPerformed

    private void food2minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_food2minusActionPerformed
        // TODO add your handling code here:
         if(j>0)
            j--;
        SecndQShow.setText(String.valueOf(j));
    }//GEN-LAST:event_food2minusActionPerformed

    private void orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderActionPerformed
        // TODO add your handling code here:
        new Order(i,j,st,st2,p,p2).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_orderActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
         new Mohammadpur().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

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
            java.util.logging.Logger.getLogger(PizzaSquareMoham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PizzaSquareMoham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PizzaSquareMoham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PizzaSquareMoham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PizzaSquareMoham().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel FstFoodName;
    private javax.swing.JLabel FstFoodPic;
    private javax.swing.JLabel FstPrice;
    private javax.swing.JTextField FstQShow;
    private javax.swing.JLabel SecndFoodPic;
    private javax.swing.JLabel SecndName;
    private javax.swing.JLabel SecndPrice;
    private javax.swing.JTextField SecndQShow;
    private javax.swing.JLabel Title;
    private javax.swing.JButton food1minus;
    private javax.swing.JButton food1plus;
    private javax.swing.JButton food2minus;
    private javax.swing.JButton food2plus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton order;
    // End of variables declaration//GEN-END:variables
}
