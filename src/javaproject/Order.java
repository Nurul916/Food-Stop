/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */

public class Order extends javax.swing.JFrame {

    /**
     * Creates new form Order
     * @param i
     * @param j
     */
    int fst,secnd;
    String fname,fname2;
    private Writer fw;
    public Order()
    {
        initComponents();
        
    }
    
    public Order(int i,int j,String st1,String st3,int p1,int p3) {
        initComponents();
        fname=st1;
        fname2=st3;
        showMsg(i,j,st1,st3,p1,p3);
    }
    void showMsg(int i,int j,String st,String st2,int p1,int p2)
    {
       // String st="Beef Chesse Burger";
        //String st2="Beef & Bacon";
        fst=i;
        secnd=j;
        if(i>0 && j==0)
        {
            NameOfFood1.setText(st);
            Quantity1.setText(String.valueOf(i));
            int p=i*p1;
            Price1.setText(String.valueOf(p));
            double vat=(p*15)/100;
            TotatVat.setText(String.valueOf(vat));
            TotalQ.setText(String.valueOf(i));
            TotalP.setText(String.valueOf(vat+p));
        }
        else if(j>0 && i==0)
        {
            NameOfFood1.setText(st2);
            Quantity1.setText(String.valueOf(j));
            int p=j*p2;
            Price1.setText(String.valueOf(p));
             double vat=(p*15)/100;
            TotatVat.setText(String.valueOf(vat));
            TotalQ.setText(String.valueOf(j));
            TotalP.setText(String.valueOf(vat+p));
            
        }
        else if(i>0 && j>0)
        {
             NameOfFood1.setText(st);
            Quantity1.setText(String.valueOf(i));
            int m=i*p1;
            double vat=(m*15)/100;
            Price1.setText(String.valueOf(m));
            NameOfFood2.setText(st2);
            Quantity2.setText(String.valueOf(j));
            int p=j*p2;
            double vat1=(p*15)/100;
            vat1=vat1+vat;
            vat=vat+vat1+m+p;
            Price2.setText(String.valueOf(p));
            TotatVat.setText(String.valueOf(vat1));
            TotalQ.setText(String.valueOf(i+j));
            TotalP.setText(String.valueOf(vat));
            
            
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

        NameOfFood = new javax.swing.JLabel();
        Quantity = new javax.swing.JLabel();
        TotalPrice = new javax.swing.JLabel();
        NameOfFood1 = new javax.swing.JLabel();
        NameOfFood2 = new javax.swing.JLabel();
        Quantity1 = new javax.swing.JLabel();
        Quantity2 = new javax.swing.JLabel();
        Price1 = new javax.swing.JLabel();
        Price2 = new javax.swing.JLabel();
        Vat = new javax.swing.JLabel();
        VatValue = new javax.swing.JLabel();
        TotatVat = new javax.swing.JLabel();
        BorderLine = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        TotalQ = new javax.swing.JLabel();
        TotalP = new javax.swing.JLabel();
        BackToTakeout = new javax.swing.JButton();
        Confirm = new javax.swing.JLabel();
        Yes = new javax.swing.JButton();
        No = new javax.swing.JButton();
        BackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NameOfFood.setFont(new java.awt.Font("Ravie", 3, 24)); // NOI18N
        NameOfFood.setText("Name Of Food");
        getContentPane().add(NameOfFood, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 240, 30));

        Quantity.setFont(new java.awt.Font("Ravie", 3, 24)); // NOI18N
        Quantity.setText("Quantity");
        getContentPane().add(Quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 170, 30));

        TotalPrice.setFont(new java.awt.Font("Ravie", 3, 24)); // NOI18N
        TotalPrice.setText("  Price");
        getContentPane().add(TotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, 130, 30));

        NameOfFood1.setFont(new java.awt.Font("Ravie", 3, 18)); // NOI18N
        getContentPane().add(NameOfFood1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 350, 40));

        NameOfFood2.setFont(new java.awt.Font("Ravie", 3, 18)); // NOI18N
        getContentPane().add(NameOfFood2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 350, 40));

        Quantity1.setFont(new java.awt.Font("Ravie", 3, 18)); // NOI18N
        Quantity1.setText("     ");
        getContentPane().add(Quantity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 120, 40));

        Quantity2.setFont(new java.awt.Font("Ravie", 3, 18)); // NOI18N
        Quantity2.setText("      ");
        getContentPane().add(Quantity2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 120, 40));

        Price1.setFont(new java.awt.Font("Ravie", 3, 18)); // NOI18N
        Price1.setText("      ");
        getContentPane().add(Price1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 180, 120, 40));

        Price2.setFont(new java.awt.Font("Ravie", 3, 18)); // NOI18N
        Price2.setText("     ");
        getContentPane().add(Price2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 280, 120, 40));

        Vat.setFont(new java.awt.Font("Ravie", 3, 24)); // NOI18N
        Vat.setText("VAT");
        getContentPane().add(Vat, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 110, 40));

        VatValue.setFont(new java.awt.Font("Ravie", 3, 24)); // NOI18N
        VatValue.setText("    15%");
        getContentPane().add(VatValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 100, 40));

        TotatVat.setFont(new java.awt.Font("Ravie", 3, 18)); // NOI18N
        TotatVat.setText("   ");
        getContentPane().add(TotatVat, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 420, 110, 40));

        BorderLine.setFont(new java.awt.Font("Ravie", 3, 24)); // NOI18N
        BorderLine.setText("=================================================================");
        getContentPane().add(BorderLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 890, -1));

        Total.setFont(new java.awt.Font("Ravie", 3, 24)); // NOI18N
        Total.setText("  Total");
        getContentPane().add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 140, 40));

        TotalQ.setFont(new java.awt.Font("Ravie", 3, 18)); // NOI18N
        TotalQ.setText("      ");
        getContentPane().add(TotalQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, 100, 40));

        TotalP.setFont(new java.awt.Font("Ravie", 3, 18)); // NOI18N
        TotalP.setText("    ");
        getContentPane().add(TotalP, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 480, 120, 40));

        BackToTakeout.setFont(new java.awt.Font("Ravie", 3, 18)); // NOI18N
        BackToTakeout.setText("Back");
        BackToTakeout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToTakeoutActionPerformed(evt);
            }
        });
        getContentPane().add(BackToTakeout, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 130, 60));

        Confirm.setFont(new java.awt.Font("Ravie", 3, 24)); // NOI18N
        Confirm.setText("Are You Confirm?");
        getContentPane().add(Confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 570, 310, 30));

        Yes.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focus"));
        Yes.setFont(new java.awt.Font("Ravie", 3, 18)); // NOI18N
        Yes.setText("Yes");
        Yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YesActionPerformed(evt);
            }
        });
        getContentPane().add(Yes, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 560, 90, 40));

        No.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focus"));
        No.setFont(new java.awt.Font("Ravie", 3, 18)); // NOI18N
        No.setText("No");
        No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoActionPerformed(evt);
            }
        });
        getContentPane().add(No, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 560, 90, 40));

        BackGround.setForeground(new java.awt.Color(51, 51, 51));
        BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaproject/Order.jpg"))); // NOI18N
        getContentPane().add(BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -70, -1, 890));

        setSize(new java.awt.Dimension(1220, 712));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackToTakeoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToTakeoutActionPerformed
        // TODO add your handling code here:
        if("Beef Chesse Burger".equals(fname)||"Beef & Bacon".equals(fname2))
        {
            new Takeout(fst,secnd).setVisible(true);
            this.dispose();}
        else if("Mixed Choco Nuts Donuts".equals(fname)||"Chocolate Cold Coffee".equals(fname2))
        {
            new KrispyKremeBanani(fst,secnd).setVisible(true);
            this.dispose();
        }
        else if("Set Menu 1".equals(fname)||"Set menu 2".equals(fname2))
        {
            new HeritageBistroLal(fst,secnd).setVisible(true);
            this.dispose();
        }
        else if("Maxcican Pasta".equals(fname)||"Peparoni Pizza 10\"".equals(fname2))
        {
            new PizzaSquareMoham(fst,secnd).setVisible(true);
            this.dispose();
        }
        else if("Kacchi Platter 1person".equals(fname)||"Kacchi Platter 4 person".equals(fname2))
        {
            new Sultan(fst,secnd).setVisible(true);
            this.dispose();
        }
        
    }//GEN-LAST:event_BackToTakeoutActionPerformed

    private void NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoActionPerformed
        if("Beef Chesse Burger".equals(fname)||"Beef & Bacon".equals(fname2))
        {
            new Takeout(fst,secnd).setVisible(true);
            this.dispose();}
        else if("Mixed Choco Nuts Donuts".equals(fname)||"Chocolate Cold Coffee".equals(fname2))
        {
            new KrispyKremeBanani(fst,secnd).setVisible(true);
            this.dispose();
        }
        else if("Set Menu 1".equals(fname)||"Set menu 2".equals(fname2))
        {
            new HeritageBistroLal(fst,secnd).setVisible(true);
            this.dispose();
        }
        else if("Maxcican Pasta".equals(fname)||"Peparoni Pizza 10\"".equals(fname2))
        {
            new PizzaSquareMoham(fst,secnd).setVisible(true);
            this.dispose();
        }
        else if("Kacchi Platter 1person".equals(fname)||"Kacchi Platter 4 person".equals(fname2))
        {
            new Sultan(fst,secnd).setVisible(true);
            this.dispose();
        }
        
    // TODO add your handling code here:
    }//GEN-LAST:event_NoActionPerformed

    private void YesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YesActionPerformed
    
        String nf1= NameOfFood1.getText();
        String nf2= NameOfFood2.getText();
        String p1= Price1.getText();
        String p2= Price2.getText();
        String q1= Quantity1.getText();
        String q2= Quantity2.getText();
        String v= TotatVat.getText();
        String tQ= TotalQ.getText();
        String tP= TotalP.getText();
        
        
{
        try
            (FileWriter fw = new FileWriter("Order.txt", false);
            BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter sw = new PrintWriter(bw)) 
        {
            

                        
                                sw.write(q1);
                                sw.write(",");
                        
                                sw.write(nf1);
                                sw.write(",");
                        
                                sw.write(q2);
                                sw.write(",");
                        
                                sw.write(nf2);
                                sw.println("");
                                
                                sw.close();
                                bw.close();
                                fw.close();
                }
        catch (IOException ex) 
               {
                   
               }
               }
        new LastPage().setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_YesActionPerformed

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
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGround;
    private javax.swing.JButton BackToTakeout;
    private javax.swing.JLabel BorderLine;
    private javax.swing.JLabel Confirm;
    private javax.swing.JLabel NameOfFood;
    private javax.swing.JLabel NameOfFood1;
    private javax.swing.JLabel NameOfFood2;
    private javax.swing.JButton No;
    private javax.swing.JLabel Price1;
    private javax.swing.JLabel Price2;
    private javax.swing.JLabel Quantity;
    private javax.swing.JLabel Quantity1;
    private javax.swing.JLabel Quantity2;
    private javax.swing.JLabel Total;
    private javax.swing.JLabel TotalP;
    private javax.swing.JLabel TotalPrice;
    private javax.swing.JLabel TotalQ;
    private javax.swing.JLabel TotatVat;
    private javax.swing.JLabel Vat;
    private javax.swing.JLabel VatValue;
    private javax.swing.JButton Yes;
    // End of variables declaration//GEN-END:variables
}
