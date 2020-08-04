package calculator;

/*  
    Name      : Nur Alani Rifhan Binti Roslan
    Matric no : BI19110104
*/

public class Calculator extends javax.swing.JFrame {
    

    String FirstValue = "";
    String SecValue = "";
    String operator = "";
    
    public Calculator() {
        initComponents();
        this.setLocationRelativeTo(null); 
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDisplay = new javax.swing.JTextField();
        btDecimal = new javax.swing.JButton();
        btZero = new javax.swing.JButton();
        btOne = new javax.swing.JButton();
        btSeven = new javax.swing.JButton();
        btTwo = new javax.swing.JButton();
        btThree = new javax.swing.JButton();
        btFour = new javax.swing.JButton();
        btFive = new javax.swing.JButton();
        btSix = new javax.swing.JButton();
        btEight = new javax.swing.JButton();
        btNine = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();
        btAdd = new javax.swing.JButton();
        btSubt = new javax.swing.JButton();
        btMul = new javax.swing.JButton();
        btDiv = new javax.swing.JButton();
        btEqual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtDisplay.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btDecimal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btDecimal.setText(".");
        btDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDecimalActionPerformed(evt);
            }
        });

        btZero.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btZero.setText("0");
        btZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btZeroActionPerformed(evt);
            }
        });

        btOne.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btOne.setText("1");
        btOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOneActionPerformed(evt);
            }
        });

        btSeven.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btSeven.setText("7");
        btSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSevenActionPerformed(evt);
            }
        });

        btTwo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btTwo.setText("2");
        btTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTwoActionPerformed(evt);
            }
        });

        btThree.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btThree.setText("3");
        btThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThreeActionPerformed(evt);
            }
        });

        btFour.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btFour.setText("4");
        btFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFourActionPerformed(evt);
            }
        });

        btFive.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btFive.setText("5");
        btFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFiveActionPerformed(evt);
            }
        });

        btSix.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btSix.setText("6");
        btSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSixActionPerformed(evt);
            }
        });

        btEight.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btEight.setText("8");
        btEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEightActionPerformed(evt);
            }
        });

        btNine.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btNine.setText("9");
        btNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNineActionPerformed(evt);
            }
        });

        btDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btDelete.setText("->");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        btCancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btCancel.setText("CA");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });

        btAdd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btAdd.setText("+");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btSubt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btSubt.setText("-");
        btSubt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubtActionPerformed(evt);
            }
        });

        btMul.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btMul.setText("*");
        btMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMulActionPerformed(evt);
            }
        });

        btDiv.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btDiv.setText("/");
        btDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDivActionPerformed(evt);
            }
        });

        btEqual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btEqual.setText("=");
        btEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEqualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                            .addComponent(btEight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btNine, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btMul, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btOne, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btThree, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btFour, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btFive, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btSix, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btSubt, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btZero, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btEqual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDisplay)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEight, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNine, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMul, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSubt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btFive, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSix, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btFour, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btThree, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btOne, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btZero, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btZeroActionPerformed
        txtDisplay.setText(txtDisplay.getText() + "0");
    }//GEN-LAST:event_btZeroActionPerformed

    private void btOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOneActionPerformed
        txtDisplay.setText(txtDisplay.getText() + "1");
    }//GEN-LAST:event_btOneActionPerformed
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
    private void btTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTwoActionPerformed
        txtDisplay.setText(txtDisplay.getText() + "2");
    }//GEN-LAST:event_btTwoActionPerformed

    private void btThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThreeActionPerformed
        txtDisplay.setText(txtDisplay.getText() + "3");
    }//GEN-LAST:event_btThreeActionPerformed

    private void btFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFourActionPerformed
        txtDisplay.setText(txtDisplay.getText() + "4");
    }//GEN-LAST:event_btFourActionPerformed

    private void btFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFiveActionPerformed
        txtDisplay.setText(txtDisplay.getText() + "5");
    }//GEN-LAST:event_btFiveActionPerformed

    private void btSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSixActionPerformed
        txtDisplay.setText(txtDisplay.getText() + "6");
    }//GEN-LAST:event_btSixActionPerformed

    private void btSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSevenActionPerformed
        txtDisplay.setText(txtDisplay.getText() + "7");
    }//GEN-LAST:event_btSevenActionPerformed

    private void btEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEightActionPerformed
        txtDisplay.setText(txtDisplay.getText() + "8");
    }//GEN-LAST:event_btEightActionPerformed

    private void btNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNineActionPerformed
        txtDisplay.setText(txtDisplay.getText() + "9");
    }//GEN-LAST:event_btNineActionPerformed

    private void btDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDecimalActionPerformed
        
        if (!txtDisplay.getText().toString().contains(".")) 
        {
            txtDisplay.setText(txtDisplay.getText() + ".");
        }
       
    }//GEN-LAST:event_btDecimalActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        
        String number = txtDisplay.getText().toString();
        if (number.length() > 0) 
        {
            number = number.substring(0, number.length() - 1);
            txtDisplay.setText(number);
        }
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        txtDisplay.setText("");
        operator = "";
        FirstValue = "";
        SecValue = "";   
    }//GEN-LAST:event_btCancelActionPerformed

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        operator = "+";
        FirstValue = txtDisplay.getText();
        txtDisplay.setText("");
    }//GEN-LAST:event_btAddActionPerformed

    private void btSubtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubtActionPerformed
        operator = "-";
        FirstValue = txtDisplay.getText();
        txtDisplay.setText("");
    }//GEN-LAST:event_btSubtActionPerformed

    private void btMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMulActionPerformed
        operator = "*";
        FirstValue = txtDisplay.getText();
        txtDisplay.setText("");
    }//GEN-LAST:event_btMulActionPerformed

    private void btDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDivActionPerformed
        operator = "/";
        FirstValue = txtDisplay.getText();
        txtDisplay.setText("");
    }//GEN-LAST:event_btDivActionPerformed

    private void btEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEqualActionPerformed
        SecValue = txtDisplay.getText(); 
        txtDisplay.setText("");
        Calculation ();
    }//GEN-LAST:event_btEqualActionPerformed
    
    public void Calculation () {
        
        double FirstNum = Double.valueOf(FirstValue);
        double SecNum = Double.valueOf(SecValue);
        double result = 0.0;
        
        switch(operator) 
        {
            
            case "+" :
            result = FirstNum + SecNum;
            break;
            
            case "-" :
            result = FirstNum - SecNum;
            break;
            
            case "*" :
            result = FirstNum * SecNum;
            break;
            
            case "/" :
            result = FirstNum / SecNum;
            break;
            
        }
        
        txtDisplay.setText(String.valueOf(result));
        
}
                                         
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btDecimal;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btDiv;
    private javax.swing.JButton btEight;
    private javax.swing.JButton btEqual;
    private javax.swing.JButton btFive;
    private javax.swing.JButton btFour;
    private javax.swing.JButton btMul;
    private javax.swing.JButton btNine;
    private javax.swing.JButton btOne;
    private javax.swing.JButton btSeven;
    private javax.swing.JButton btSix;
    private javax.swing.JButton btSubt;
    private javax.swing.JButton btThree;
    private javax.swing.JButton btTwo;
    private javax.swing.JButton btZero;
    private javax.swing.JTextField txtDisplay;
    // End of variables declaration//GEN-END:variables
}
