package javaproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

public class Water_Billing_ extends javax.swing.JFrame {

    /**
     * Creates new form Water_Billing_
     */
    public Water_Billing_() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Background = new javax.swing.JPanel();
        Name = new javax.swing.JTextField();
        NameLabel = new javax.swing.JLabel();
        Menu = new javax.swing.JComboBox<>();
        IncreaseCCF = new javax.swing.JSpinner();
        PhoneNumber = new javax.swing.JTextField();
        NameLabel1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Button = new javax.swing.JButton();
        PriceTotalLabel = new javax.swing.JLabel();
        TotalPrice = new javax.swing.JTextField();
        Paymentsandoffers = new javax.swing.JPanel();
        Payment = new javax.swing.JLabel();
        Pay1 = new javax.swing.JRadioButton();
        Pay2 = new javax.swing.JRadioButton();
        Pay3 = new javax.swing.JRadioButton();
        Pay4 = new javax.swing.JRadioButton();
        Pay5 = new javax.swing.JRadioButton();
        PaymentButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(153, 255, 102));

        NameLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        NameLabel.setText("Name:");

        Menu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " 3/4 inch(Inside City)\t $13.10\t", " 3/4 inch(Outside City)\t $20.75\t", " 1 inch(Inside City)\t $16.00\t", " 1 inch(Outside City)\t $24.00\t", " 1 1/2 inches(Inside City)\t$28.90\t ", " 1 1/2 inches(Outside City)$38.50", " 2 inches(Inside City)\t $38.80\t ", " 2 inches(Outside City)\t$49.80\t", " 3 inches(Inside City)\t $81.25\t ", " 3 inches(Outside City)\t$98.25", " 4 inches(Inside City)\t $130.00\t ", " 4 inches(Outside City)\t$152.75", " 6 inches(Inside City)\t $253.00\t ", " 6 inches(Outside City)\t$291.00\t", " 8 inches(Inside City)\t $374.50\t ", " 8 inches(Outside City)\t$429.50\t", " 10 inches(Inside City)\t $496.50\t ", " 10 inches(Outside City)\t$567.00\t ", " 12 inches(Inside City)\t $569.50\t ", " 12 inches(Outside City)\t$649.00" }));
        Menu.setSelectedIndex(-1);

        NameLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        NameLabel1.setText("Phone Number:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Select the Plan accordingly!");

        Button.setText("Go Ahead!");
        Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActionPerformed(evt);
            }
        });

        PriceTotalLabel.setBackground(new java.awt.Color(0, 0, 0));
        PriceTotalLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        PriceTotalLabel.setText("Total price:");

        TotalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalPriceActionPerformed(evt);
            }
        });

        Paymentsandoffers.setBackground(new java.awt.Color(255, 153, 153));

        Payment.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Payment.setText("Payment:");

        Pay1.setText("GPay");
        Pay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pay1ActionPerformed(evt);
            }
        });

        Pay2.setText("PayTM");
        Pay2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pay2ActionPerformed(evt);
            }
        });

        Pay3.setText("Card Payment");
        Pay3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pay3ActionPerformed(evt);
            }
        });

        Pay4.setText("Cash");
        Pay4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pay4ActionPerformed(evt);
            }
        });

        Pay5.setText("Other");
        Pay5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pay5ActionPerformed(evt);
            }
        });

        PaymentButton.setBackground(new java.awt.Color(102, 0, 204));
        PaymentButton.setText("Pay");
        PaymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PaymentsandoffersLayout = new javax.swing.GroupLayout(Paymentsandoffers);
        Paymentsandoffers.setLayout(PaymentsandoffersLayout);
        PaymentsandoffersLayout.setHorizontalGroup(
            PaymentsandoffersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaymentsandoffersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Payment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Pay1)
                .addGap(18, 18, 18)
                .addComponent(Pay2)
                .addGap(18, 18, 18)
                .addComponent(Pay3)
                .addGap(18, 18, 18)
                .addComponent(Pay4)
                .addGap(32, 32, 32)
                .addComponent(Pay5)
                .addGap(18, 18, 18)
                .addComponent(PaymentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        PaymentsandoffersLayout.setVerticalGroup(
            PaymentsandoffersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaymentsandoffersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PaymentsandoffersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pay1)
                    .addComponent(Pay2)
                    .addComponent(Pay3)
                    .addComponent(Pay4)
                    .addComponent(Pay5)
                    .addComponent(Payment)
                    .addComponent(PaymentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("Water Billing System");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Extra Gallons");

        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("*Gallon Charges Included seperately for Inside and outside of cities");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("to know more about how you get charged");

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 255));
        jButton1.setText("Click Here");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(NameLabel)
                                    .addComponent(NameLabel1))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(BackgroundLayout.createSequentialGroup()
                                    .addGap(239, 239, 239)
                                    .addComponent(Button, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(BackgroundLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(BackgroundLayout.createSequentialGroup()
                                            .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(57, 57, 57)
                                            .addComponent(IncreaseCCF, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(BackgroundLayout.createSequentialGroup()
                                            .addComponent(PriceTotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton1)
                                            .addGap(3, 3, 3)
                                            .addComponent(jLabel6))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addContainerGap())
            .addComponent(Paymentsandoffers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IncreaseCCF, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PriceTotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addComponent(Paymentsandoffers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        if(Name.getText().length()>0 && PhoneNumber.getText().length()>0 && Menu.getSelectedItem().toString().length()>0 && Integer.parseInt(IncreaseCCF.getValue().toString())>=0)
        {
               String ItemSelected=Menu.getSelectedItem().toString();
                //3/4 inch(Inside City)	 $13.10	
 //3/4 inch(Outside City)	 $20.75	
               String[] Price=ItemSelected.split("\\$");
               Double Pricee=Double.parseDouble(Price[1]);
               String[] cityDetermine=ItemSelected.split("\\(");
               String CityDetermined=cityDetermine[1];
               Double Value1=1.0;
               if(CityDetermined.startsWith("In")){
                   Value1=1.90;
               }
               if(CityDetermined.startsWith("Out")){
                   Value1=3.60;
               }
               Double CCFPrice=1.0;
               if(Integer.parseInt(IncreaseCCF.getValue().toString())==0){
                   CCFPrice=1.0;
               }
               else{
                   CCFPrice= Value1*Double.parseDouble(IncreaseCCF.getValue().toString());
               }
               Double TotalResultant=Pricee*CCFPrice;
               TotalPrice.setText(TotalResultant.toString());
        }
        else{
            JOptionPane.showMessageDialog(this, "Enter the Data Appropriately!");
        }
    }                                      

    private void TotalPriceActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void Pay1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void Pay2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void Pay3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void Pay4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void Pay5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void PaymentButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              

        JOptionPane.showMessageDialog(this, Name.getText().toUpperCase()+"!! THANKS FOR CONNECTING WITHUS !!");
        Name.setText("");
        PhoneNumber.setText("");
        TotalPrice.setText("");
        Menu.setSelectedIndex(-1);
        Pay1.setSelected(false);
        Pay2.setSelected(false);
        Pay3.setSelected(false);
        Pay4.setSelected(false);
        Pay5.setSelected(false);
        IncreaseCCF.setValue(0);
    }                                             

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
         try{
        String url="https://www.charlestonwater.com/360/How-to-Calculate-Your-Water-Bill";
        java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
    }catch(IOException ex){
         JOptionPane.showMessageDialog(this, Name.getText().toUpperCase()+" Sorry Can't able to load the browser");
    }
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
            java.util.logging.Logger.getLogger(Water_Billing_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Water_Billing_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Water_Billing_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Water_Billing_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Water_Billing_().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel Background;
    private javax.swing.JButton Button;
    private javax.swing.JSpinner IncreaseCCF;
    private javax.swing.JComboBox<String> Menu;
    private javax.swing.JTextField Name;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel NameLabel1;
    private javax.swing.JRadioButton Pay1;
    private javax.swing.JRadioButton Pay2;
    private javax.swing.JRadioButton Pay3;
    private javax.swing.JRadioButton Pay4;
    private javax.swing.JRadioButton Pay5;
    private javax.swing.JLabel Payment;
    private javax.swing.JButton PaymentButton;
    private javax.swing.JPanel Paymentsandoffers;
    private javax.swing.JTextField PhoneNumber;
    private javax.swing.JLabel PriceTotalLabel;
    private javax.swing.JTextField TotalPrice;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration                   
}