/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package v4.UI;

/**
 *
 * @author Kieran
 */
public class MainWindow extends javax.swing.JFrame
{

    /**
     * @return the MenuUndo
     */
    public javax.swing.JMenuItem getMenuUndo() {
        return MenuUndo;
    }

    /**
     * @return the ButtonUndo
     */
    public javax.swing.JButton getButtonUndo() {
        return ButtonUndo;
    }

    /**
     * @return the jLabel1
     */
    public javax.swing.JLabel getjLabel1() {
        return jLabel1;
    }

    /**
     * @return the jTable1
     */
    public javax.swing.JTable getjTable1() {
        return jTable1;
    }

  /**
   * @return the ButtonAddLine
   */
  public javax.swing.JButton getButtonAddLine()
  {
    return ButtonAddLine;
  }

  /**
   * @return the ButtonOpen
   */
  public javax.swing.JButton getButtonOpen()
  {
    return ButtonOpen;
  }

  /**
   * @return the ButtonRemoveLine
   */
  public javax.swing.JButton getButtonRemoveLine()
  {
    return ButtonRemoveLine;
  }

  /**
   * @return the ButtonSave
   */
  public javax.swing.JButton getButtonSave()
  {
    return ButtonSave;
  }

  /**
   * @return the FileChooserPath
   */
  public javax.swing.JFileChooser getFileChooserPath()
  {
    return FileChooserPath;
  }

  /**
   * @return the MenuAddLine
   */
  public javax.swing.JMenuItem getMenuAddLine()
  {
    return MenuAddLine;
  }

  /**
   * @return the MenuOpen
   */
  public javax.swing.JMenuItem getMenuOpen()
  {
    return MenuOpen;
  }

  /**
   * @return the MenuRemoveLine
   */
  public javax.swing.JMenuItem getMenuRemoveLine()
  {
    return MenuRemoveLine;
  }

  /**
   * @return the MenuSave
   */
  public javax.swing.JMenuItem getMenuSave()
  {
    return MenuSave;
  }

  /**
   * @return the PopUpAddLine
   */
  public javax.swing.JMenuItem getPopUpAddLine()
  {
    return PopUpAddLine;
  }

  /**
   * @return the PopUpDeleteLine
   */
  public javax.swing.JMenuItem getPopUpDeleteLine()
  {
    return PopUpDeleteLine;
  }

  /**
   * @return the PopUpFileExplorer
   */
  public javax.swing.JPopupMenu getPopUpFileExplorer()
  {
    return PopUpFileExplorer;
  }

  /**
   * Creates new form MainWindow
   */
  public MainWindow()
  {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        PopUpFileExplorer = new javax.swing.JPopupMenu();
        PopUpAddLine = new javax.swing.JMenuItem();
        PopUpDeleteLine = new javax.swing.JMenuItem();
        FileChooserPath = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jToolBar2 = new javax.swing.JToolBar();
        ButtonSave = new javax.swing.JButton();
        ButtonOpen = new javax.swing.JButton();
        ButtonAddLine = new javax.swing.JButton();
        ButtonRemoveLine = new javax.swing.JButton();
        ButtonUndo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuSave = new javax.swing.JMenuItem();
        MenuOpen = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuAddLine = new javax.swing.JMenuItem();
        MenuRemoveLine = new javax.swing.JMenuItem();
        MenuUndo = new javax.swing.JMenuItem();

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        PopUpAddLine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/general/Add16.gif"))); // NOI18N
        PopUpAddLine.setText("Add Line");
        PopUpAddLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PopUpAddLineActionPerformed(evt);
            }
        });
        PopUpFileExplorer.add(PopUpAddLine);

        PopUpDeleteLine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/general/Delete16.gif"))); // NOI18N
        PopUpDeleteLine.setText("Delete Line");
        PopUpDeleteLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PopUpDeleteLineActionPerformed(evt);
            }
        });
        PopUpFileExplorer.add(PopUpDeleteLine);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));
        getContentPane().add(jPanel1);

        jToolBar2.setRollover(true);

        ButtonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/general/Save16.gif"))); // NOI18N
        ButtonSave.setToolTipText("Save");
        ButtonSave.setFocusable(false);
        ButtonSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(ButtonSave);

        ButtonOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/general/Open16.gif"))); // NOI18N
        ButtonOpen.setToolTipText("Open");
        ButtonOpen.setComponentPopupMenu(PopUpFileExplorer);
        ButtonOpen.setFocusable(false);
        ButtonOpen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonOpen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOpenActionPerformed(evt);
            }
        });
        jToolBar2.add(ButtonOpen);

        ButtonAddLine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/general/Add16.gif"))); // NOI18N
        ButtonAddLine.setFocusable(false);
        ButtonAddLine.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonAddLine.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(ButtonAddLine);

        ButtonRemoveLine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/general/Delete16.gif"))); // NOI18N
        ButtonRemoveLine.setFocusable(false);
        ButtonRemoveLine.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonRemoveLine.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(ButtonRemoveLine);

        ButtonUndo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/general/Undo16.gif"))); // NOI18N
        ButtonUndo.setFocusable(false);
        ButtonUndo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonUndo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(ButtonUndo);
        jToolBar2.add(jPanel2);

        getContentPane().add(jToolBar2);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Address", "E-Mail", "Telephone Number"
            }
        ));
        jTable1.setComponentPopupMenu(PopUpFileExplorer);
        jScrollPane3.setViewportView(jTable1);

        getContentPane().add(jScrollPane3);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("File:");
        jLabel1.setRequestFocusEnabled(false);
        jPanel3.add(jLabel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3);

        jMenu1.setMnemonic('F');
        jMenu1.setText("File");

        MenuSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/general/Save16.gif"))); // NOI18N
        MenuSave.setText("Save");
        MenuSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSaveActionPerformed(evt);
            }
        });
        jMenu1.add(MenuSave);

        MenuOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/general/Open16.gif"))); // NOI18N
        MenuOpen.setText("Open");
        jMenu1.add(MenuOpen);

        jMenuBar1.add(jMenu1);

        jMenu2.setMnemonic('E');
        jMenu2.setText("Edit");

        MenuAddLine.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuAddLine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/general/Add16.gif"))); // NOI18N
        MenuAddLine.setText("Add Line");
        MenuAddLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAddLineActionPerformed(evt);
            }
        });
        jMenu2.add(MenuAddLine);

        MenuRemoveLine.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuRemoveLine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/general/Delete16.gif"))); // NOI18N
        MenuRemoveLine.setText("Remove Line");
        jMenu2.add(MenuRemoveLine);

        MenuUndo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuUndo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/general/Undo16.gif"))); // NOI18N
        MenuUndo.setText("Undo");
        MenuUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuUndoActionPerformed(evt);
            }
        });
        jMenu2.add(MenuUndo);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void MenuSaveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_MenuSaveActionPerformed
  {//GEN-HEADEREND:event_MenuSaveActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_MenuSaveActionPerformed

  private void ButtonOpenActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonOpenActionPerformed
  {//GEN-HEADEREND:event_ButtonOpenActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_ButtonOpenActionPerformed

  private void PopUpDeleteLineActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_PopUpDeleteLineActionPerformed
  {//GEN-HEADEREND:event_PopUpDeleteLineActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_PopUpDeleteLineActionPerformed

  private void MenuAddLineActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_MenuAddLineActionPerformed
  {//GEN-HEADEREND:event_MenuAddLineActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_MenuAddLineActionPerformed

  private void PopUpAddLineActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_PopUpAddLineActionPerformed
  {//GEN-HEADEREND:event_PopUpAddLineActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_PopUpAddLineActionPerformed

    private void MenuUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuUndoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuUndoActionPerformed

  /**
   * @param args the command line arguments
   */
  public static void main(String args[])
  {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try
    {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
      {
        if ("Nimbus".equals(info.getName()))
        {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    }
    catch (ClassNotFoundException ex)
    {
      java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex)
    {
      java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex)
    {
      java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (javax.swing.UnsupportedLookAndFeelException ex)
    {
      java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new MainWindow().setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAddLine;
    private javax.swing.JButton ButtonOpen;
    private javax.swing.JButton ButtonRemoveLine;
    private javax.swing.JButton ButtonSave;
    private javax.swing.JButton ButtonUndo;
    private javax.swing.JFileChooser FileChooserPath;
    private javax.swing.JMenuItem MenuAddLine;
    private javax.swing.JMenuItem MenuOpen;
    private javax.swing.JMenuItem MenuRemoveLine;
    private javax.swing.JMenuItem MenuSave;
    private javax.swing.JMenuItem MenuUndo;
    private javax.swing.JMenuItem PopUpAddLine;
    private javax.swing.JMenuItem PopUpDeleteLine;
    private javax.swing.JPopupMenu PopUpFileExplorer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JToolBar jToolBar2;
    // End of variables declaration//GEN-END:variables
}
