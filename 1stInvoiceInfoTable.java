
package com.salesInvoiceGenerator.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class InvoiceDetailsTable extends AbstractTableModel{
    
    private ArrayList<InvoiceDetails> invoiceDetails;
    private String[] detailsTableTitels = {"No.", "Item Name", "Price", "Count", "Total"};

    public InvoiceDetailsTable(ArrayList<InvoiceDetails> invoiceDetailses) {
        this.invoiceDetails = invoiceDetailses;
    }

    @Override
    public int getRowCount() {
        return invoiceDetails.size();
    }

    @Override
    public int getColumnCount() {
        return detailsTableTitels.length;
    }
    
    @Override
    public String getColumnName(int column){
        return detailsTableTitels[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceDetails invoiceDetails = this.invoiceDetails.get(rowIndex);
        switch (columnIndex) {
            case 0:
                
                return invoiceDetails.getInvoiceSummary().getId();
            case 1:
                
                return invoiceDetails.getItemName();
            case 2:
                
                return invoiceDetails.getPrice();
            case 3:
                
                return invoiceDetails.getQuantity();
            case 4:
                
                return invoiceDetails.getItemTotal();
            default:
                return "";
        }
    }
    
}
