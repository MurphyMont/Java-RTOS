
package robotics_ia;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Os extends javax.swing.JFrame {
       
        ArrayList<String> ProcessNameList=new ArrayList<>(); 
        ArrayList<String> RuntimeList=new ArrayList<>();
        ArrayList<String> PriorityList=new ArrayList<>();
    
    public Os() {
        initComponents();
       
          setTitle("REAL TIME OPERATING SYTEMS (RTOS)");
        
        // Set the size of the JFrame
        setSize(1117, 650);
          
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        StackTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        MoveButton = new javax.swing.JButton();
        RemoveTaskButtton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ActiveTable = new javax.swing.JTable();
        AddStackButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        HistoryTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NameBox = new javax.swing.JTextField();
        RunTimeBox = new javax.swing.JTextField();
        PriorityBox = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        StackTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process Name", "Process Run Time", "Process Priority"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(StackTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 410, 160));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("PROCESS STACK");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 170, 20));

        MoveButton.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        MoveButton.setText("Move to CPU");
        MoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(MoveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 100, 30));

        RemoveTaskButtton.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        RemoveTaskButtton.setText("END PROCESS");
        RemoveTaskButtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveTaskButttonActionPerformed(evt);
            }
        });
        getContentPane().add(RemoveTaskButtton, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 300, 130, 30));

        ActiveTable.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ActiveTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process Name", "Process Run Time", "Process Priority", "Current Run Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(ActiveTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 600, 260));

        AddStackButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AddStackButton.setText("Add to Stack");
        AddStackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddStackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 120, -1));

        HistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process Name", "Dededicated Runtime", "Process Priority", "Action", "Time Added"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(HistoryTable);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 370, 1070, 210));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("PROCESS HISTORY");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 200, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Process Run Time:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 140, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Process Name:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Process Priority:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 130, -1));
        getContentPane().add(NameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 150, -1));

        RunTimeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RunTimeBoxActionPerformed(evt);
            }
        });
        getContentPane().add(RunTimeBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 70, -1));
        getContentPane().add(PriorityBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 140, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("ACTIVE  PROCESSES IN CPU");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 300, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Seconds");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 60, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddStackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStackButtonActionPerformed
        // TODO add your handling code here:
        
          if(NameBox.getText().equals("")||RunTimeBox.getText().equals("") ||PriorityBox.getText().equals(""))
   {
        JOptionPane.showMessageDialog(this, "Enter All Data");
   }
         else
       {   
           
           // Get Values 
           String name=NameBox.getText();
           String Runtime_String=RunTimeBox.getText();
           String Priority_String=PriorityBox.getText();
           
           //Add the strings to an array 
           String [] data={name,Runtime_String,Priority_String};
           
           
           //Converting Values 
           int Runtime=Integer.parseInt(Runtime_String);
           int Priority=Integer.parseInt(Priority_String);
           
           
           // Working on table 
           DefaultTableModel tblmodel=(DefaultTableModel)StackTable.getModel();
           tblmodel.addRow(data);
           
           // Add to my List
           ProcessNameList.add(name);
           RuntimeList.add(Runtime_String);
           PriorityList.add(Priority_String);
      
           
           NameBox.setText("");
           RunTimeBox.setText("");
           PriorityBox.setText("");
           
                   
          
       }
        
        
        
        
        
        
        
    }//GEN-LAST:event_AddStackButtonActionPerformed

    private void RunTimeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RunTimeBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RunTimeBoxActionPerformed

    private void MoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoveButtonActionPerformed
        // TODO add your handling code here:
        
        // Creating An Instance of Priority class 
        Priority Pr = new Priority();
        
        

       // List to hold Processes about to be created 
       List<Priority.Process> Processes = new ArrayList<>();

       // Add processes to the List 
       Processes = Pr.createProcesses(ProcessNameList, RuntimeList, PriorityList);

      // Arrange the Processes According to Priority and Insert into JTable
        Pr.scheduleProcesses(Processes, ActiveTable,HistoryTable,RemoveTaskButtton);
        
     // Get the DefaultTableModel of the ActiveTable
     DefaultTableModel model = (DefaultTableModel) ActiveTable.getModel();
     

     // Clear Stack  
     DefaultTableModel tblmode = (DefaultTableModel) StackTable.getModel();
     tblmode.setRowCount(0);
       
     //Make the array list empty 
      ProcessNameList.clear();
      RuntimeList.clear();
      PriorityList.clear();
 
       
       
    }//GEN-LAST:event_MoveButtonActionPerformed

    private void RemoveTaskButttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveTaskButttonActionPerformed
        // TODO add your handling code here:
                  
    }//GEN-LAST:event_RemoveTaskButttonActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(Os.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Os.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Os.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Os.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Os().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ActiveTable;
    private javax.swing.JButton AddStackButton;
    private javax.swing.JTable HistoryTable;
    private javax.swing.JButton MoveButton;
    private javax.swing.JTextField NameBox;
    private javax.swing.JTextField PriorityBox;
    private javax.swing.JButton RemoveTaskButtton;
    private javax.swing.JTextField RunTimeBox;
    private javax.swing.JTable StackTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
