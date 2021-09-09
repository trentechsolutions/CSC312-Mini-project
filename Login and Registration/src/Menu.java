/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shuaib UWC
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jPanel1 = new javax.swing.JPanel();
        CategoryPanel = new javax.swing.JPanel();
        Mathematics_btn = new javax.swing.JButton();
        ComSci_btn = new javax.swing.JButton();
        Physics_btn = new javax.swing.JButton();
        Accounting_btn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        LendBookPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BookName = new javax.swing.JTextField();
        BookID = new javax.swing.JTextField();
        LendBook_btn = new javax.swing.JButton();
        MathematicsPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MathematicsTable = new javax.swing.JTable();
        Math_Closebtn = new javax.swing.JButton();
        ComSciPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ComSciTable = new javax.swing.JTable();
        ComSci_Closebtn = new javax.swing.JButton();
        PhysicsPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        PhysicsTable = new javax.swing.JTable();
        Physics_Closebtn = new javax.swing.JButton();
        AccountingPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        AccountingTable = new javax.swing.JTable();
        Accounting_Closebtn = new javax.swing.JButton();
        ReturnBookPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Return_BookName = new javax.swing.JTextField();
        Return_BookID = new javax.swing.JTextField();
        ReturnBook_btn = new javax.swing.JButton();
        ReturnBook_Closebtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ViewBooksbtn = new javax.swing.JButton();
        ReturnBookbtn = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CategoryPanel.setBackground(new java.awt.Color(34, 0, 0));
        CategoryPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CategoryPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CategoryPanelMouseExited(evt);
            }
        });
        CategoryPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Mathematics_btn.setForeground(new java.awt.Color(204, 204, 204));
        Mathematics_btn.setText("Mathematics");
        Mathematics_btn.setBorder(null);
        Mathematics_btn.setContentAreaFilled(false);
        Mathematics_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Mathematics_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Mathematics_btnMouseEntered(evt);
            }
        });
        Mathematics_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mathematics_btnActionPerformed(evt);
            }
        });
        CategoryPanel.add(Mathematics_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 100, 20));

        ComSci_btn.setForeground(new java.awt.Color(204, 204, 204));
        ComSci_btn.setText("Computer Science");
        ComSci_btn.setBorder(null);
        ComSci_btn.setContentAreaFilled(false);
        ComSci_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ComSci_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ComSci_btnMouseEntered(evt);
            }
        });
        ComSci_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComSci_btnActionPerformed(evt);
            }
        });
        CategoryPanel.add(ComSci_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 100, 20));

        Physics_btn.setForeground(new java.awt.Color(204, 204, 204));
        Physics_btn.setText("Physics");
        Physics_btn.setBorder(null);
        Physics_btn.setContentAreaFilled(false);
        Physics_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Physics_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Physics_btnMouseEntered(evt);
            }
        });
        Physics_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Physics_btnActionPerformed(evt);
            }
        });
        CategoryPanel.add(Physics_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 100, 20));

        Accounting_btn.setForeground(new java.awt.Color(204, 204, 204));
        Accounting_btn.setText("Accounting");
        Accounting_btn.setBorder(null);
        Accounting_btn.setContentAreaFilled(false);
        Accounting_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Accounting_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Accounting_btnMouseEntered(evt);
            }
        });
        Accounting_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Accounting_btnActionPerformed(evt);
            }
        });
        CategoryPanel.add(Accounting_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 100, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Category");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
        });
        CategoryPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        jPanel1.add(CategoryPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 0, 170));

        LendBookPanel.setBackground(new java.awt.Color(34, 0, 0));
        LendBookPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("To lend book please fill in below");
        LendBookPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Book Name");
        LendBookPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 50, 70, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Book ID");
        LendBookPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 50, -1));
        LendBookPanel.add(BookName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 200, 30));
        LendBookPanel.add(BookID, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 200, 30));

        LendBook_btn.setBackground(new java.awt.Color(0, 0, 0));
        LendBook_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LendBook_btn.setForeground(new java.awt.Color(255, 255, 255));
        LendBook_btn.setText("LEND BOOK");
        LendBook_btn.setBorder(null);
        LendBook_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LendBookPanel.add(LendBook_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 90, 30));

        jPanel1.add(LendBookPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 120, 0, 240));

        MathematicsPanel.setBackground(new java.awt.Color(51, 0, 0));
        MathematicsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mathematics");
        MathematicsPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 110, 30));

        MathematicsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Name", "Book ID"
            }
        ));
        jScrollPane1.setViewportView(MathematicsTable);

        MathematicsPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 440, 160));

        Math_Closebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete_20px.png"))); // NOI18N
        Math_Closebtn.setContentAreaFilled(false);
        Math_Closebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Math_Closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Math_ClosebtnActionPerformed(evt);
            }
        });
        MathematicsPanel.add(Math_Closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 0, 30, 20));

        jPanel1.add(MathematicsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 0, 240));

        ComSciPanel.setBackground(new java.awt.Color(51, 0, 0));
        ComSciPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Computer Science");
        ComSciPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 140, 30));

        ComSciTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Name", "Book ID"
            }
        ));
        jScrollPane2.setViewportView(ComSciTable);

        ComSciPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 440, 160));

        ComSci_Closebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete_20px.png"))); // NOI18N
        ComSci_Closebtn.setContentAreaFilled(false);
        ComSci_Closebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ComSci_Closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComSci_ClosebtnActionPerformed(evt);
            }
        });
        ComSciPanel.add(ComSci_Closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 0, 30, 20));

        jPanel1.add(ComSciPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 0, 240));

        PhysicsPanel.setBackground(new java.awt.Color(51, 0, 0));
        PhysicsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Physics");
        PhysicsPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 60, 20));

        PhysicsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Name", "Book ID"
            }
        ));
        jScrollPane3.setViewportView(PhysicsTable);

        PhysicsPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 440, 160));

        Physics_Closebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete_20px.png"))); // NOI18N
        Physics_Closebtn.setContentAreaFilled(false);
        Physics_Closebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Physics_Closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Physics_ClosebtnActionPerformed(evt);
            }
        });
        PhysicsPanel.add(Physics_Closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 0, 30, 20));

        jPanel1.add(PhysicsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 0, 240));

        AccountingPanel.setBackground(new java.awt.Color(51, 0, 0));
        AccountingPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Accounting");
        AccountingPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 110, 40));

        AccountingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Name", "Book ID"
            }
        ));
        jScrollPane4.setViewportView(AccountingTable);

        AccountingPanel.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 440, 160));

        Accounting_Closebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete_20px.png"))); // NOI18N
        Accounting_Closebtn.setContentAreaFilled(false);
        Accounting_Closebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Accounting_Closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Accounting_ClosebtnActionPerformed(evt);
            }
        });
        AccountingPanel.add(Accounting_Closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 0, 30, 20));

        jPanel1.add(AccountingPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 0, 240));

        ReturnBookPanel.setBackground(new java.awt.Color(34, 0, 0));
        ReturnBookPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Return Book");
        ReturnBookPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 120, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Book Name");
        ReturnBookPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Book ID");
        ReturnBookPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 50, 20));
        ReturnBookPanel.add(Return_BookName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 210, -1));
        ReturnBookPanel.add(Return_BookID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 210, -1));

        ReturnBook_btn.setBackground(new java.awt.Color(0, 0, 0));
        ReturnBook_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ReturnBook_btn.setForeground(new java.awt.Color(255, 255, 255));
        ReturnBook_btn.setText("RETURN BOOK");
        ReturnBook_btn.setBorder(null);
        ReturnBook_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ReturnBookPanel.add(ReturnBook_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 100, 30));

        ReturnBook_Closebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete_20px.png"))); // NOI18N
        ReturnBook_Closebtn.setBorder(null);
        ReturnBook_Closebtn.setContentAreaFilled(false);
        ReturnBook_Closebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ReturnBook_Closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnBook_ClosebtnActionPerformed(evt);
            }
        });
        ReturnBookPanel.add(ReturnBook_Closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 30, 20));

        jPanel1.add(ReturnBookPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 0, 200));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu.jpeg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 780, -1));

        ViewBooksbtn.setBackground(new java.awt.Color(34, 0, 0));
        ViewBooksbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ViewBooksbtn.setForeground(new java.awt.Color(255, 255, 255));
        ViewBooksbtn.setText("View Books");
        ViewBooksbtn.setBorder(null);
        ViewBooksbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewBooksbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ViewBooksbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ViewBooksbtnMouseExited(evt);
            }
        });
        ViewBooksbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBooksbtnActionPerformed(evt);
            }
        });
        jPanel1.add(ViewBooksbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 170, 40));

        ReturnBookbtn.setBackground(new java.awt.Color(34, 0, 0));
        ReturnBookbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ReturnBookbtn.setForeground(new java.awt.Color(255, 255, 255));
        ReturnBookbtn.setText("Return Book");
        ReturnBookbtn.setBorder(null);
        ReturnBookbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ReturnBookbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnBookbtnActionPerformed(evt);
            }
        });
        jPanel1.add(ReturnBookbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 170, 40));

        LogOut.setBackground(new java.awt.Color(34, 0, 0));
        LogOut.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LogOut.setForeground(new java.awt.Color(255, 0, 0));
        LogOut.setText("Log Out");
        LogOut.setBorder(null);
        LogOut.setBorderPainted(false);
        LogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });
        jPanel1.add(LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 170, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.jpeg"))); // NOI18N
        jLabel1.setText(" ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        setVisible(false);
        new LoginPage().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_LogOutActionPerformed

    private void ViewBooksbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBooksbtnActionPerformed
          // TODO add your handling code here:
         
    }//GEN-LAST:event_ViewBooksbtnActionPerformed

    private void ViewBooksbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewBooksbtnMouseEntered
        CategoryPanel.setSize(100, 170);// TODO add your handling code here:
    }//GEN-LAST:event_ViewBooksbtnMouseEntered

    private void ViewBooksbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewBooksbtnMouseExited
        CategoryPanel.setSize(0,0);// TODO add your handling code here:
    }//GEN-LAST:event_ViewBooksbtnMouseExited

    private void CategoryPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryPanelMouseEntered
        CategoryPanel.setSize(100,170);// TODO add your handling code here:
    }//GEN-LAST:event_CategoryPanelMouseEntered

    private void CategoryPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryPanelMouseExited
        CategoryPanel.setSize(0,0);// TODO add your handling code here:
    }//GEN-LAST:event_CategoryPanelMouseExited

    private void Mathematics_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mathematics_btnMouseEntered
        CategoryPanel.setSize(100,170);// TODO add your handling code here:
    }//GEN-LAST:event_Mathematics_btnMouseEntered

    private void ComSci_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComSci_btnMouseEntered
        CategoryPanel.setSize(100,170);// TODO add your handling code here:
    }//GEN-LAST:event_ComSci_btnMouseEntered

    private void Physics_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Physics_btnMouseEntered
        CategoryPanel.setSize(100,170);// TODO add your handling code here:
    }//GEN-LAST:event_Physics_btnMouseEntered

    private void Accounting_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Accounting_btnMouseEntered
        CategoryPanel.setSize(100,170);// TODO add your handling code here:
    }//GEN-LAST:event_Accounting_btnMouseEntered

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        CategoryPanel.setSize(100,170);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseEntered

    
    private void Mathematics_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mathematics_btnActionPerformed
        MathematicsPanel.setSize(480,240);// TODO add your handling code here:
        LendBookPanel.setSize(200,240);
        
        ComSciPanel.setSize(0,0);
        PhysicsPanel.setSize(0,0);
        AccountingPanel.setSize(0,0);
        ReturnBookPanel.setSize(0,0);
    }//GEN-LAST:event_Mathematics_btnActionPerformed

    private void Math_ClosebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Math_ClosebtnActionPerformed
        MathematicsPanel.setSize(0,0);// TODO add your handling code here:
        LendBookPanel.setSize(0,0);
    }//GEN-LAST:event_Math_ClosebtnActionPerformed

    
    private void ComSci_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComSci_btnActionPerformed
        ComSciPanel.setSize(480,240);// TODO add your handling code here:
        LendBookPanel.setSize(200,240);
        
        MathematicsPanel.setSize(0,0);
        PhysicsPanel.setSize(0,0);
        AccountingPanel.setSize(0,0);
        ReturnBookPanel.setSize(0,0);
    }//GEN-LAST:event_ComSci_btnActionPerformed

    private void ComSci_ClosebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComSci_ClosebtnActionPerformed
        ComSciPanel.setSize(0,0);// TODO add your handling code here:
        LendBookPanel.setSize(0,0);
    }//GEN-LAST:event_ComSci_ClosebtnActionPerformed

    private void Physics_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Physics_btnActionPerformed
        PhysicsPanel.setSize(480,240);// TODO add your handling code here:
        LendBookPanel.setSize(200,240);
        
        ComSciPanel.setSize(0,0);
        MathematicsPanel.setSize(0,0);
        AccountingPanel.setSize(0,0);
        ReturnBookPanel.setSize(0,0);
    }//GEN-LAST:event_Physics_btnActionPerformed

    private void Physics_ClosebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Physics_ClosebtnActionPerformed
        PhysicsPanel.setSize(0,0);// TODO add your handling code here:
        LendBookPanel.setSize(0,0);
    }//GEN-LAST:event_Physics_ClosebtnActionPerformed

    private void Accounting_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Accounting_btnActionPerformed
        AccountingPanel.setSize(480,240);// TODO add your handling code here:
        LendBookPanel.setSize(200,240);
        
        ComSciPanel.setSize(0,0);
        MathematicsPanel.setSize(0,0);
        PhysicsPanel.setSize(0,0);
        ReturnBookPanel.setSize(0,0);
    }//GEN-LAST:event_Accounting_btnActionPerformed

    private void Accounting_ClosebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Accounting_ClosebtnActionPerformed
        AccountingPanel.setSize(0,0);// TODO add your handling code here:
        LendBookPanel.setSize(0,0);
    }//GEN-LAST:event_Accounting_ClosebtnActionPerformed

    private void ReturnBookbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnBookbtnActionPerformed
        ReturnBookPanel.setSize(380,200);// TODO add your handling code here:
        
        ComSciPanel.setSize(0,0);
        MathematicsPanel.setSize(0,0);
        PhysicsPanel.setSize(0,0);
        AccountingPanel.setSize(0,0);
        LendBookPanel.setSize(0,0);
    }//GEN-LAST:event_ReturnBookbtnActionPerformed

    private void ReturnBook_ClosebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnBook_ClosebtnActionPerformed
        ReturnBookPanel.setSize(0,0);// TODO add your handling code here:
        
    }//GEN-LAST:event_ReturnBook_ClosebtnActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AccountingPanel;
    private javax.swing.JTable AccountingTable;
    private javax.swing.JButton Accounting_Closebtn;
    private javax.swing.JButton Accounting_btn;
    private javax.swing.JTextField BookID;
    private javax.swing.JTextField BookName;
    private javax.swing.JPanel CategoryPanel;
    private javax.swing.JPanel ComSciPanel;
    private javax.swing.JTable ComSciTable;
    private javax.swing.JButton ComSci_Closebtn;
    private javax.swing.JButton ComSci_btn;
    private javax.swing.JPanel LendBookPanel;
    private javax.swing.JButton LendBook_btn;
    private javax.swing.JButton LogOut;
    private javax.swing.JButton Math_Closebtn;
    private javax.swing.JPanel MathematicsPanel;
    private javax.swing.JTable MathematicsTable;
    private javax.swing.JButton Mathematics_btn;
    private javax.swing.JPanel PhysicsPanel;
    private javax.swing.JTable PhysicsTable;
    private javax.swing.JButton Physics_Closebtn;
    private javax.swing.JButton Physics_btn;
    private javax.swing.JPanel ReturnBookPanel;
    private javax.swing.JButton ReturnBook_Closebtn;
    private javax.swing.JButton ReturnBook_btn;
    private javax.swing.JButton ReturnBookbtn;
    private javax.swing.JTextField Return_BookID;
    private javax.swing.JTextField Return_BookName;
    private javax.swing.JButton ViewBooksbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
