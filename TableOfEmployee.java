/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artechemployeemanagementsystem;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Mofaqkhayrul Islam
 */
public class TableOfEmployee extends javax.swing.JPanel {
    
    JTable table;

    /**
     * Creates new form TableOfEmployee
     */
    public TableOfEmployee() throws SQLException {
        initComponents();
        setLayout(new FlowLayout());
        
        
        ConnectionDetails poo = new ConnectionDetails();
         Statement stmt = poo.con.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT `name`, `address`, `contactNo`, `emailId`, `hiredate`, `employeeType`, `campanydesignation` FROM `employee_details`;");
         int row=0;
         while(rs.next())
         {
             row++;
         }
         //System.out.println(row);
         rs = stmt.executeQuery("SELECT `name`, `address`, `contactNo`, `emailId`, `hiredate`, `employeeType`, `campanydesignation` FROM `employee_details`;");
         Object[][] data=new Object[row][7];
         //Object[] colomn=new Object[7];
         Object[] colomn = {"Name", "Address", "Contact No", "Email ID", "Hired Date", "Employee Type", "Designation"};
        int i1=0;
//        colomn[0]="Name";
//        colomn[1]="Adress";
//        colomn[2]="Contact No";
//        colomn[3]="Email ID";
//        colomn[4]="Hired Date";
//        colomn[5]="Employee Type";
//        colomn[6]="Designation";
        
        
        while(rs.next()){
            for(int j1=0;j1<7;j1++)
            {
                    data[i1][j1]=rs.getString(j1+1);
            }
            i1++;
        }
        
        table = new JTable(data, colomn);
        table.setPreferredScrollableViewportSize(new Dimension(900, 550));
        table.setFillsViewportHeight(true);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setPreferredSize(new java.awt.Dimension(900, 550));

        jLabel1.setFont(new java.awt.Font("Stylus", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Table Of Employees");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(361, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(423, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private void setTitle(String table_Example) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}