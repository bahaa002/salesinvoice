
package com.salesInvoiceGenerator.view;

import com.salesInvoiceGenerator.controller.SalesInvoiceGeneratorController;
import com.salesInvoiceGenerator.model.InvoiceSummary;
import com.salesInvoiceGenerator.model.InvoiceSummaryTable;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;


public class SalesInvoiceGeneratorFrame extends javax.swing.JFrame {

    /**
     * Creates new form SalesInvoiceGeneratorFrame
     */
    public SalesInvoiceGeneratorFrame() {
        initComponents();
        loadMenuItem.addActionListener(salesInvoiceGeneratorController);
        saveMenuItem.addActionListener(salesInvoiceGeneratorController);
        createNewInvoiceButton.addActionListener(salesInvoiceGeneratorController);
        deleteInvoiceButton.addActionListener(salesInvoiceGeneratorController);
        saveItemButton.addActionListener(salesInvoiceGeneratorController);
        cancelItemButton.addActionListener(salesInvoiceGeneratorController);
        summaryTable.getSelectionModel().addListSelectionListener(salesInvoiceGeneratorController);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        summaryTable = new javax.swing.JTable();
        createNewInvoiceButton = new javax.swing.JButton();
        deleteInvoiceButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        invoiceItemsLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        detailsTable = new javax.swing.JTable();
        invoiceIdLabel = new javax.swing.JLabel();
        invoiceDateLabel = new javax.swing.JLabel();
        customerNameLabel = new javax.swing.JLabel();
        invoiceTotalLabel = new javax.swing.JLabel();
        saveItemButton = new javax.swing.JButton();
        cancelItemButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        summaryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(summaryTable);

        createNewInvoiceButton.setText("Create New Invoice");
        createNewInvoiceButton.setActionCommand("Create");

        deleteInvoiceButton.setText("Delete Invoice");
        deleteInvoiceButton.setActionCommand("Delete");

        jLabel1.setText("Invoice Table");

        label1.setText("Invoice Number");

        label2.setText("Invoice Date");

        label3.setText("Customer Name");

        label4.setText("Invoice Total");

        invoiceItemsLabel.setText("Invoice Items");

        detailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(detailsTable);

        invoiceIdLabel.setText("0");

        invoiceDateLabel.setText("0");

        customerNameLabel.setText("0");

        invoiceTotalLabel.setText("0");

        saveItemButton.setText("Create Item");
        saveItemButton.setActionCommand("SaveItem");

        cancelItemButton.setText("Delete Item");
        cancelItemButton.setActionCommand("DeleteItem");

        jMenu1.setText("File");

        loadMenuItem.setText("Load");
        jMenu1.add(loadMenuItem);

        saveMenuItem.setText("Save");
        saveMenuItem.setActionCommand("SaveFile");
        jMenu1.add(saveMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                    .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(invoiceIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(invoiceDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(customerNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                    .addComponent(invoiceTotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(invoiceItemsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(createNewInvoiceButton)
                .addGap(39, 39, 39)
                .addComponent(deleteInvoiceButton)
                .addGap(145, 145, 145)
                .addComponent(saveItemButton)
                .addGap(58, 58, 58)
                .addComponent(cancelItemButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(label1)
                    .addComponent(invoiceIdLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label2)
                            .addComponent(invoiceDateLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label3)
                            .addComponent(customerNameLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label4)
                            .addComponent(invoiceTotalLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(invoiceItemsLabel)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createNewInvoiceButton)
                    .addComponent(deleteInvoiceButton)
                    .addComponent(saveItemButton)
                    .addComponent(cancelItemButton))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SalesInvoiceGeneratorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesInvoiceGeneratorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesInvoiceGeneratorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesInvoiceGeneratorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesInvoiceGeneratorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelItemButton;
    private javax.swing.JButton createNewInvoiceButton;
    private javax.swing.JLabel customerNameLabel;
    private javax.swing.JButton deleteInvoiceButton;
    private javax.swing.JTable detailsTable;
    private javax.swing.JLabel invoiceDateLabel;
    private javax.swing.JLabel invoiceIdLabel;
    private javax.swing.JLabel invoiceItemsLabel;
    private javax.swing.JLabel invoiceTotalLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JMenuItem loadMenuItem;
    private javax.swing.JButton saveItemButton;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JTable summaryTable;
    // End of variables declaration//GEN-END:variables
    private SalesInvoiceGeneratorController salesInvoiceGeneratorController = new SalesInvoiceGeneratorController(this);
    private ArrayList<InvoiceSummary> invoiceSummarys;
    private InvoiceSummaryTable invoiceSummaryTable;
    

    public ArrayList<InvoiceSummary> getInvoiceSummarys() {
        return invoiceSummarys;
    }

    public void setInvoiceSummarys(ArrayList<InvoiceSummary> invoiceSummarys) {
        this.invoiceSummarys = invoiceSummarys;
    }

    public InvoiceSummaryTable getInvoiceSummaryTable() {
        return invoiceSummaryTable;
    }

    public void setInvoiceSummaryTable(InvoiceSummaryTable invoiceSummaryTable) {
        this.invoiceSummaryTable = invoiceSummaryTable;
    }

    public JTable getSummaryTable() {
        return summaryTable;
    }

    public void setSummaryTable(JTable summaryTable) {
        this.summaryTable = summaryTable;
    }

    public JTable getDetailsTable() {
        return detailsTable;
    }

    public void setDetailsTable(JTable detailsTable) {
        this.detailsTable = detailsTable;
    }

    public JLabel getCustomerNameLabel() {
        return customerNameLabel;
    }

    public void setCustomerNameLabel(JLabel customerNameLabel) {
        this.customerNameLabel = customerNameLabel;
    }

    public JLabel getInvoiceDateLabel() {
        return invoiceDateLabel;
    }

    public void setInvoiceDateLabel(JLabel invoiceDateLabel) {
        this.invoiceDateLabel = invoiceDateLabel;
    }

    public JLabel getInvoiceIdLabel() {
        return invoiceIdLabel;
    }

    public void setInvoiceIdLabel(JLabel invoiceIdLabel) {
        this.invoiceIdLabel = invoiceIdLabel;
    }

    public JLabel getInvoiceTotalLabel() {
        return invoiceTotalLabel;
    }

    public void setInvoiceTotalLabel(JLabel invoiceTotalLabel) {
        this.invoiceTotalLabel = invoiceTotalLabel;
    }

    public SalesInvoiceGeneratorController getSalesInvoiceGeneratorController() {
        return salesInvoiceGeneratorController;
    }
    
    


}

