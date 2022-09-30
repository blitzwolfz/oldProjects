


public class sauces extends javax.swing.JFrame 
{
    int num = 1;
    public static int pounds = (int) apps.spin_single.getValue() + ((int) apps.spin_family.getValue()*3) + ((int) apps.spin_party.getValue()*5);
    
    public static String[] flavours = new String[10000];
    public static int i = 0;
    
    public static boolean[] boned = new boolean[10000];
    public static boolean[] fried = new boolean[10000];
    
    public static int n = 0;
        
    public sauces() 
    {
        initComponents();
    }

    public static void Start() 
    {
        new sauces().setVisible(true);
    }
    
    protected void update()
    {
        String[] sauces = {};
        if(num < pounds)
        {
            reset();
            num++;
            lbl_order.setText("Order Number " + num + ":");
        }
        else this.dispose();
        
        if(i == pounds)
        {
            this.dispose();
        }
    }
    
    protected static void reset()
    {
        boolean f = false;
        check_mild.setSelected(f);
        check_medium.setSelected(f);
        check_hot.setSelected(f);
        check_ohBoy.setSelected(f);
        check_honey.setSelected(f);
        check_bbq.setSelected(f);
        check_buffalo.setSelected(f);
        check_none.setSelected(f);
        check_random.setSelected(f);
//        check_same.setSelected(f);
    }
    
    
    public static void sauceSelect()
    {
        
        if(check_mild.isSelected())
        {
            flavours[i] = " Mild ";
            i++;
            
        }
        
        if(check_medium.isSelected())
        {
            flavours[i] = " Medium ";
            i++;
        }
        
        if(check_hot.isSelected())
        {
            flavours[i] = " Hot ";
            i++;
        }
        
        if(check_ohBoy.isSelected())
        {
            flavours[i] = " OH BOY! ";
        }
        if(check_honey.isSelected())
        {
            flavours[i] = " Honey Garlic ";
            i++;
        }
        
        if(check_bbq.isSelected())
        {
            flavours[i] = " Smokey BBQ ";
            i++;
        }
        
        if(check_same.isSelected())
        {
            while (i < pounds)
            {
                flavours[i] = flavours[0];
                i++;
            }
        }
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pnl_sauceTitle = new javax.swing.JPanel();
        lbl_sauceTitle = new javax.swing.JLabel();
        check_none = new javax.swing.JCheckBox();
        lbl_order = new javax.swing.JLabel();
        check_mild = new javax.swing.JCheckBox();
        check_medium = new javax.swing.JCheckBox();
        check_hot = new javax.swing.JCheckBox();
        check_buffalo = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        check_ohBoy = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        check_honey = new javax.swing.JCheckBox();
        check_bbq = new javax.swing.JCheckBox();
        check_same = new javax.swing.JCheckBox();
        check_random = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        btn_next = new javax.swing.JButton();
        lbl_select = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\emale\\OneDrive\\Desktop\\NetBeans Menu\\sauce_heat1.png")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Select Your Sauces");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pnl_sauceTitle.setBackground(new java.awt.Color(255, 255, 255));
        pnl_sauceTitle.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_sauceTitle.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        lbl_sauceTitle.setText("Select The Sauces For The Wings");
        lbl_sauceTitle.setToolTipText("");
        lbl_sauceTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnl_sauceTitleLayout = new javax.swing.GroupLayout(pnl_sauceTitle);
        pnl_sauceTitle.setLayout(pnl_sauceTitleLayout);
        pnl_sauceTitleLayout.setHorizontalGroup(
            pnl_sauceTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_sauceTitleLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(lbl_sauceTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_sauceTitleLayout.setVerticalGroup(
            pnl_sauceTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_sauceTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_sauceTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        check_none.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        check_none.setText("No Sauce");
        check_none.setOpaque(false);
        check_none.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_noneActionPerformed(evt);
            }
        });

        lbl_order.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        lbl_order.setText("Order Number 1:");

        check_mild.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        check_mild.setText("Mild");
        check_mild.setOpaque(false);
        check_mild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_mildActionPerformed(evt);
            }
        });

        check_medium.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        check_medium.setText("Medium");
        check_medium.setOpaque(false);
        check_medium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_mediumActionPerformed(evt);
            }
        });

        check_hot.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        check_hot.setText("Hot");
        check_hot.setOpaque(false);
        check_hot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_hotActionPerformed(evt);
            }
        });

        check_buffalo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        check_buffalo.setText("Buffalo");
        check_buffalo.setOpaque(false);
        check_buffalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_buffaloActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Heat:");

        check_ohBoy.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        check_ohBoy.setText("Oh Boy!");
        check_ohBoy.setOpaque(false);
        check_ohBoy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_ohBoyActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Flavours:");

        check_honey.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        check_honey.setText("Honey Garlic");
        check_honey.setOpaque(false);
        check_honey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_honeyActionPerformed(evt);
            }
        });

        check_bbq.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        check_bbq.setText("Smokey BBQ");
        check_bbq.setOpaque(false);
        check_bbq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_bbqActionPerformed(evt);
            }
        });

        check_same.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        check_same.setText("Same For All Orders");
        check_same.setOpaque(false);

        check_random.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        check_random.setText("Surprise Me");
        check_random.setOpaque(false);
        check_random.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_randomActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("NOTE: Select One Sauce Per Order of Wings");

        btn_next.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_next.setText("Next");
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });

        lbl_select.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_select.setForeground(new java.awt.Color(255, 0, 0));
        lbl_select.setText("      ");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\emale\\OneDrive\\Desktop\\NetBeans Menu\\sauce_heat1.png")); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\emale\\OneDrive\\Desktop\\NetBeans Menu\\sauce_heat1.png")); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\emale\\OneDrive\\Desktop\\NetBeans Menu\\sauce_heat1.png")); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\emale\\OneDrive\\Desktop\\NetBeans Menu\\sauce_heat1.png")); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\emale\\OneDrive\\Desktop\\NetBeans Menu\\sauce_heat1.png")); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\emale\\OneDrive\\Desktop\\NetBeans Menu\\sauce_heat1.png")); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\emale\\OneDrive\\Desktop\\NetBeans Menu\\sauce_heat1.png")); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\emale\\OneDrive\\Desktop\\NetBeans Menu\\sauce_heat1.png")); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\emale\\OneDrive\\Desktop\\NetBeans Menu\\sauce_heat1.png")); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\emale\\OneDrive\\Desktop\\NetBeans Menu\\sauce_heat1.png")); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/honey garlic wings.jpg"))); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\emale\\OneDrive\\Desktop\\NetBeans Menu\\HOT_WINGS.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(check_none, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pnl_sauceTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lbl_order, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(check_ohBoy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel11))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(check_hot, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel8))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(check_medium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel6))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(check_mild)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel1)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel9)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jLabel10))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel12)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jLabel13)))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel14)
                                    .addGap(102, 102, 102)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(check_buffalo)
                                        .addComponent(jLabel3)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(check_random, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(check_bbq, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(check_honey, javax.swing.GroupLayout.Alignment.LEADING))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(112, 112, 112)
                                    .addComponent(lbl_select)))
                            .addGap(83, 83, 83)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(check_same, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnl_sauceTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_order)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(check_mild)
                            .addComponent(check_buffalo)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(check_medium)
                                .addComponent(check_honey))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(check_hot)
                        .addComponent(check_bbq))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(check_ohBoy)
                        .addComponent(check_random))
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addComponent(check_none)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(check_same)
                        .addGap(37, 37, 37)
                        .addComponent(btn_next)))
                .addGap(39, 39, 39)
                .addComponent(lbl_select)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        sauceSelect();
        update();
        if (check_random.isSelected())
        {
            
        }
    }//GEN-LAST:event_btn_nextActionPerformed

    private void check_noneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_noneActionPerformed
        reset();
        check_none.setSelected(true);
    }//GEN-LAST:event_check_noneActionPerformed

    private void check_mildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_mildActionPerformed
        reset();
        check_mild.setSelected(true);
    }//GEN-LAST:event_check_mildActionPerformed

    private void check_mediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_mediumActionPerformed
        reset();
        check_medium.setSelected(true);
    }//GEN-LAST:event_check_mediumActionPerformed

    private void check_hotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_hotActionPerformed
        reset();
        check_hot.setSelected(true);
    }//GEN-LAST:event_check_hotActionPerformed

    private void check_ohBoyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_ohBoyActionPerformed
        reset();
        check_ohBoy.setSelected(true);
    }//GEN-LAST:event_check_ohBoyActionPerformed

    private void check_buffaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_buffaloActionPerformed
        reset();
        check_buffalo.setSelected(true);
    }//GEN-LAST:event_check_buffaloActionPerformed

    private void check_honeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_honeyActionPerformed
        reset();
        check_honey.setSelected(true);
    }//GEN-LAST:event_check_honeyActionPerformed

    private void check_bbqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_bbqActionPerformed
        reset();
        check_bbq.setSelected(true);
    }//GEN-LAST:event_check_bbqActionPerformed

    private void check_randomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_randomActionPerformed
        reset();
        check_random.setSelected(true);
    }//GEN-LAST:event_check_randomActionPerformed

    
    public static void main(String args[]) {
    
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(sauces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sauces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sauces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sauces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sauces().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_next;
    public static javax.swing.JCheckBox check_bbq;
    public static javax.swing.JCheckBox check_buffalo;
    public static javax.swing.JCheckBox check_honey;
    public static javax.swing.JCheckBox check_hot;
    public static javax.swing.JCheckBox check_medium;
    public static javax.swing.JCheckBox check_mild;
    public static javax.swing.JCheckBox check_none;
    public static javax.swing.JCheckBox check_ohBoy;
    public static javax.swing.JCheckBox check_random;
    public static javax.swing.JCheckBox check_same;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lbl_order;
    private javax.swing.JLabel lbl_sauceTitle;
    public static javax.swing.JLabel lbl_select;
    private javax.swing.JPanel pnl_sauceTitle;
    // End of variables declaration//GEN-END:variables
}
