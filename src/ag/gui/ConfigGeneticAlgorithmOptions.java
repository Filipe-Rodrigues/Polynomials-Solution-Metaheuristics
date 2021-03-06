/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ag.gui;

import ag.core.GeneticAlgorithm;
import ag.core.ObjectiveFunction;
import ag.core.PolynomialFunction;

/**
 *
 * @author filip
 */
public class ConfigGeneticAlgorithmOptions extends javax.swing.JDialog {

    private GeneticAlgorithm config;

    /**
     * Creates new form ConfigGeneticAlgorithmOptions
     */
    private ConfigGeneticAlgorithmOptions(java.awt.Frame parent, boolean modal, GeneticAlgorithm previousConf) {
        super(parent, modal);
        initComponents();
        initializeFields(previousConf);
        setLocationRelativeTo(parent);
    }

    private void initializeFields(GeneticAlgorithm previousConf) {
        if (previousConf != null) {
            String equation = previousConf.getObjectiveFunction().getFormattedEquation().replaceAll(" ", "");
            equation = equation.substring(0, equation.length() - 2);
            fieldFunction.setText(equation);
            spinMin.setValue(previousConf.getLeftIntervalValue());
            spinMax.setValue(previousConf.getRightIntervalValue());
            spinPop.setValue(previousConf.getPopulationNumber());
            spinMutRatio.setValue(previousConf.getMutationRatio());
            spinCrossRatio.setValue(previousConf.getCrossoverRatio());
            spinCrossPoints.setValue(previousConf.getNumberOfCrossoverPoints());
            spinGen.setValue(previousConf.getNumberOfGenes());
            spinPrecision.setValue(previousConf.getBinaryPrecision());
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

        jPanel1 = new javax.swing.JPanel();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fieldFunction = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        spinMin = new javax.swing.JSpinner();
        spinMax = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        spinGen = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        spinPrecision = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        spinPop = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        spinMutRatio = new javax.swing.JSpinner();
        spinCrossPoints = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        spinCrossRatio = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(350, 400));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Objective function:");

        jLabel2.setText("Min value:");

        spinMin.setModel(new javax.swing.SpinnerNumberModel(0.0f, null, null, 0.2f));
        spinMin.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinMinStateChanged(evt);
            }
        });

        spinMax.setModel(new javax.swing.SpinnerNumberModel(0.0f, null, null, 0.2f));
        spinMax.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinMaxStateChanged(evt);
            }
        });

        jLabel3.setText("Max value:");

        spinGen.setModel(new javax.swing.SpinnerNumberModel(2, 2, null, 1));
        spinGen.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinGenStateChanged(evt);
            }
        });

        jLabel4.setText("Number of genes:");

        spinPrecision.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spinPrecision.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinPrecisionStateChanged(evt);
            }
        });

        jLabel5.setText("Binary decimal precision:");

        spinPop.setModel(new javax.swing.SpinnerNumberModel(2, 2, null, 2));
        spinPop.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinPopStateChanged(evt);
            }
        });

        jLabel6.setText("Population:");

        spinMutRatio.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(0.01f)));

        spinCrossPoints.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        spinCrossPoints.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinCrossPointsStateChanged(evt);
            }
        });

        jLabel7.setText("Crossover points:");

        jLabel8.setText("Crossover ratio:");

        spinCrossRatio.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(0.05f)));

        jLabel9.setText("Mutation ratio:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldFunction)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spinCrossRatio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(spinCrossPoints, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(spinMutRatio, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(spinPop, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(spinPrecision, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(spinGen, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(spinMax, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(spinMin, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fieldFunction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spinMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinPop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinMutRatio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinCrossRatio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinCrossPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinPrecision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        ObjectiveFunction test = new PolynomialFunction(fieldFunction.getText());
        if (test.isValid()) {
            float range = (float) spinMax.getValue() - (float) spinMin.getValue();
            float center = range / 2f + (float) spinMin.getValue();
            int pop = (int) spinPop.getValue();
            int genes = (int) spinGen.getValue();
            int precision = (int) spinPrecision.getValue();
            int crossPoints = (int) spinCrossPoints.getValue();
            float crossRatio = (float) spinCrossRatio.getValue();
            float mutRatio = (float) spinMutRatio.getValue();
            String function = fieldFunction.getText();
            config = new GeneticAlgorithm(pop, genes, precision, range, center, crossPoints, mutRatio, crossRatio, function, true);
            this.dispose();
        }
    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        config = null;
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void spinMinStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinMinStateChanged
        float minValue = (float) spinMin.getValue();
        float maxValue = (float) spinMax.getValue();
        int genes = (int) spinGen.getValue();
        int minExponent = getMinExponent() + 1;
        if (minValue > maxValue) {
            spinMin.setValue(spinMax.getValue());
        }
        if (minExponent > genes) {
            spinGen.setValue(minExponent);
        }
        spinPrecisionStateChanged(null);
    }//GEN-LAST:event_spinMinStateChanged

    private void spinMaxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinMaxStateChanged
        float minValue = (float) spinMin.getValue();
        float maxValue = (float) spinMax.getValue();
        int genes = (int) spinGen.getValue();
        int minExponent = getMinExponent() + 1;
        if (maxValue < minValue) {
            spinMax.setValue(spinMin.getValue());
        }
        if (minExponent > genes) {
            spinGen.setValue(minExponent);
        }
        spinPrecisionStateChanged(null);
    }//GEN-LAST:event_spinMaxStateChanged

    private void spinGenStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinGenStateChanged
        spinMaxStateChanged(null);

        int genes = (int) spinGen.getValue();
        int crossPoints = (int) spinCrossPoints.getValue();
        int precision = (int) spinPrecision.getValue();

        if (crossPoints > genes) {
            spinCrossPoints.setValue(genes);
        }
        if (precision > genes - 2) {
            spinPrecision.setValue(genes - 2);
        }
    }//GEN-LAST:event_spinGenStateChanged

    private void spinPopStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinPopStateChanged
        if ((int) spinPop.getValue() % 2 == 1) {
            spinPop.setValue((int) spinPop.getValue() + 1);
        }
    }//GEN-LAST:event_spinPopStateChanged

    private void spinPrecisionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinPrecisionStateChanged
        int genes = (int) spinGen.getValue();
        int precision = (int) spinPrecision.getValue();
        int minExponent = getMinExponent();
        if (precision > genes - minExponent - 1) {
            spinPrecision.setValue(genes - minExponent - 1);
        }
    }//GEN-LAST:event_spinPrecisionStateChanged

    private void spinCrossPointsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinCrossPointsStateChanged
        int genes = (int) spinGen.getValue();
        int crossPoints = (int) spinCrossPoints.getValue();
        if (crossPoints > genes) {
            spinCrossPoints.setValue(genes);
        }
    }//GEN-LAST:event_spinCrossPointsStateChanged

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        config = null;
    }//GEN-LAST:event_formWindowClosing

    private int getMinExponent() {
        float minValue = (float) spinMin.getValue();
        float maxValue = (float) spinMax.getValue();
        float greatestAbsolute = (Math.abs(minValue) > Math.abs(maxValue))
                ? (Math.abs(minValue)) : (Math.abs(maxValue));
        double logE = (greatestAbsolute >= 1) ? (Math.log(greatestAbsolute)) : (0);
        return (int) Math.ceil(Math.floor(logE / Math.log(2)) + 1);
    }

    public static GeneticAlgorithm getConfig(GeneticAlgorithm previousConfig) {
        ConfigGeneticAlgorithmOptions configDialog = new ConfigGeneticAlgorithmOptions(null, true, previousConfig);
        configDialog.setVisible(true);
        return configDialog.config;
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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConfigGeneticAlgorithmOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfigGeneticAlgorithmOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfigGeneticAlgorithmOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfigGeneticAlgorithmOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConfigGeneticAlgorithmOptions dialog = new ConfigGeneticAlgorithmOptions(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField fieldFunction;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton okButton;
    private javax.swing.JSpinner spinCrossPoints;
    private javax.swing.JSpinner spinCrossRatio;
    private javax.swing.JSpinner spinGen;
    private javax.swing.JSpinner spinMax;
    private javax.swing.JSpinner spinMin;
    private javax.swing.JSpinner spinMutRatio;
    private javax.swing.JSpinner spinPop;
    private javax.swing.JSpinner spinPrecision;
    // End of variables declaration//GEN-END:variables

}
