
public class apps extends javax.swing.JFrame {

    public apps() {
        initComponents();
    }
    
    //Method To Enable Checkboxes
    void enableCheckBoxes(String type, boolean enabled, int value)  //Parameters Take in String to Distinguish what CHBox to enable
    {
        switch(type)
        {
            //Single Serving of Wings
            case "single" :
                spin_single.setEnabled(enabled);
                spin_single.setValue(value);
                break;
                
            //Family Serving of Wings
            case "family" :
                spin_family.setEnabled(enabled);
                spin_family.setValue(value);
                break;
            
            //Party Serving
            case "party" :
                spin_party.setEnabled(enabled);
                spin_party.setValue(value);
                break;
                
            //Garlic Bread
            case "bread" :
                spin_bread.setEnabled(enabled);
                spin_bread.setValue(value);
                break;
                
            //Proscuitto Cups
            case "cups" :
                spin_cups.setEnabled(enabled);
                spin_cups.setValue(value);    
                break;
        }
    }
    
    //Method to Update Price
    public static void priceUpdate()
    {   
        float[] price = {9.99f, 24.99f, 39.99f, 9.99f, 7.99f};
        
        float singlePrice = (int) spin_single.getValue() * price[0];
        float familyPrice = (int) spin_family.getValue() * price[1];
        float partyPrice = (int) spin_party.getValue() * price[2];
        float wingPrice = singlePrice + familyPrice + partyPrice;
        lbl_wingPrice.setText("Price: $" + wingPrice);
        
        float breadPrice = (int) spin_bread.getValue() * price[3];
        lbl_breadPrice.setText("Price: $" + breadPrice);
        
        float cupPrice = (int) spin_cups.getValue() * price[4];
        lbl_cupPrice.setText("Price: $" + cupPrice);
        
        float totalPrice = wingPrice + breadPrice + cupPrice;
        lbl_totalPrice.setText("Total Price: $" + totalPrice);
        
        toggleSauceButton();
        
    }
    
    public static void wingCount()
    {
        int pounds = (int) spin_single.getValue() + ((int) spin_family.getValue()*3) + ((int) spin_party.getValue()*5);
        lbl_wingCount.setText("Total Number of Pounds: " + pounds);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabpane_menu = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        check_single = new javax.swing.JCheckBox();
        check_bread = new javax.swing.JCheckBox();
        check_cups = new javax.swing.JCheckBox();
        check_family = new javax.swing.JCheckBox();
        check_party = new javax.swing.JCheckBox();
        spin_single = new javax.swing.JSpinner();
        spin_family = new javax.swing.JSpinner();
        spin_party = new javax.swing.JSpinner();
        lbl_wingCount = new javax.swing.JLabel();
        spin_bread = new javax.swing.JSpinner();
        spin_cups = new javax.swing.JSpinner();
        lbl_breadCount = new javax.swing.JLabel();
        lbl_cupCount = new javax.swing.JLabel();
        btn_flavours = new javax.swing.JButton();
        lbl_wingPrice = new javax.swing.JLabel();
        lbl_breadPrice = new javax.swing.JLabel();
        lbl_cupPrice = new javax.swing.JLabel();
        lbl_totalPrice = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        check_spizza = new javax.swing.JCheckBox();
        check_mpizza = new javax.swing.JCheckBox();
        check_lpizza = new javax.swing.JCheckBox();
        check_xlpizza = new javax.swing.JCheckBox();
        spin_small = new javax.swing.JSpinner();
        spin_medium = new javax.swing.JSpinner();
        spin_large = new javax.swing.JSpinner();
        spin_xl = new javax.swing.JSpinner();
        btn_toppings = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        jSpinner2 = new javax.swing.JSpinner();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        check_poutine = new javax.swing.JCheckBox();
        btn_con = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Select Your Food");
        setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        tabpane_menu.setBackground(new java.awt.Color(255, 255, 255));
        tabpane_menu.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        check_single.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        check_single.setText("Chicken Wings $9.99 - 1 lb");
        check_single.setOpaque(false);
        check_single.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_singleActionPerformed(evt);
            }
        });

        check_bread.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        check_bread.setText("Roasted Garlic Bread $9.99 / 5 Peices");
        check_bread.setOpaque(false);
        check_bread.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_breadActionPerformed(evt);
            }
        });

        check_cups.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        check_cups.setText("Prosciutto Cups $7.99 / 10 peices");
        check_cups.setOpaque(false);
        check_cups.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_cupsActionPerformed(evt);
            }
        });

        check_family.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        check_family.setText("Family Serving $24.99 - 3 lbs");
        check_family.setOpaque(false);
        check_family.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_familyActionPerformed(evt);
            }
        });

        check_party.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        check_party.setText("Party Serving $39.99 - 5 lbs");
        check_party.setOpaque(false);
        check_party.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_partyActionPerformed(evt);
            }
        });

        spin_single.setModel(new javax.swing.SpinnerNumberModel(0, null, 99, 1));
        spin_single.setEnabled(false);
        spin_single.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spin_singleStateChanged(evt);
            }
        });

        spin_family.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));
        spin_family.setEnabled(false);
        spin_family.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spin_familyStateChanged(evt);
            }
        });

        spin_party.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));
        spin_party.setEnabled(false);
        spin_party.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spin_partyStateChanged(evt);
            }
        });

        lbl_wingCount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbl_wingCount.setText("Total Number of Pounds: ");

        spin_bread.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));
        spin_bread.setEnabled(false);
        spin_bread.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spin_breadStateChanged(evt);
            }
        });

        spin_cups.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));
        spin_cups.setEnabled(false);
        spin_cups.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spin_cupsStateChanged(evt);
            }
        });

        lbl_breadCount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbl_breadCount.setText("Total Number of Slices: ");

        lbl_cupCount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbl_cupCount.setText("Total Number of Peices:");

        btn_flavours.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_flavours.setText("Select Flavours");
        btn_flavours.setEnabled(false);
        btn_flavours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_flavoursActionPerformed(evt);
            }
        });

        lbl_wingPrice.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbl_wingPrice.setText("Price: $0.00");

        lbl_breadPrice.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbl_breadPrice.setText("Price: $0.00");

        lbl_cupPrice.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbl_cupPrice.setText("Price: $0.00");

        lbl_totalPrice.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        lbl_totalPrice.setText("Total Price: $0.00");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\emale\\OneDrive\\Desktop\\NetBeans Menu\\prosciutto cups.jpg")); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\emale\\OneDrive\\Desktop\\NetBeans Menu\\crispy wings.jpg")); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\emale\\OneDrive\\Desktop\\NetBeans Menu\\roastedGBread.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbl_totalPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                        .addComponent(lbl_cupCount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btn_flavours, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl_wingPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_wingCount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(check_single)
                                .addGap(18, 18, 18)
                                .addComponent(spin_single))
                            .addComponent(check_bread, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(check_cups, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(check_family)
                                .addGap(18, 18, 18)
                                .addComponent(spin_family, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(check_party)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spin_party, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spin_bread, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spin_cups, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(12, 12, 12))))
                    .addComponent(lbl_breadCount, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_breadPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cupPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check_single)
                    .addComponent(check_family)
                    .addComponent(check_party)
                    .addComponent(spin_single, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spin_family, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spin_party, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_wingCount)
                                .addGap(18, 18, 18)
                                .addComponent(btn_flavours)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_wingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(check_bread)
                                    .addComponent(spin_bread, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(lbl_breadCount)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_breadPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(check_cups)
                                    .addComponent(spin_cups, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(lbl_cupCount)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_cupPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_totalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        tabpane_menu.addTab("Appetizers", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        check_spizza.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        check_spizza.setText("Small Pizza $6.99 +");
        check_spizza.setOpaque(false);

        check_mpizza.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        check_mpizza.setText("Medium Pizza $8.99 +");
        check_mpizza.setOpaque(false);

        check_lpizza.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        check_lpizza.setText("Large Pizza $9.99 +");
        check_lpizza.setOpaque(false);

        check_xlpizza.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        check_xlpizza.setText("X/L Pizza $12.99 + ");
        check_xlpizza.setOpaque(false);

        btn_toppings.setText("Select Toppings");

        jCheckBox2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jCheckBox2.setText("Mac'n Cheese");
        jCheckBox2.setOpaque(false);

        jCheckBox1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jCheckBox1.setText("Small Fries $2.99");
        jCheckBox1.setOpaque(false);

        jCheckBox3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jCheckBox3.setText("Medium Fries $3.49");
        jCheckBox3.setOpaque(false);

        jCheckBox4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jCheckBox4.setText("Large Fries $4.99");
        jCheckBox4.setOpaque(false);

        check_poutine.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        check_poutine.setText("Poutine $5.99");
        check_poutine.setOpaque(false);

        btn_con.setText("Select Condements");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(check_mpizza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(check_spizza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(check_lpizza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(check_xlpizza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spin_small, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                            .addComponent(spin_medium)
                            .addComponent(spin_large)
                            .addComponent(spin_xl)))
                    .addComponent(btn_toppings, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(149, 149, 149)
                        .addComponent(jCheckBox2)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4)
                    .addComponent(check_poutine)
                    .addComponent(btn_con, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(436, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check_spizza)
                    .addComponent(spin_small, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check_mpizza)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spin_medium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check_lpizza)
                    .addComponent(spin_large, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox4))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check_xlpizza)
                    .addComponent(spin_xl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check_poutine))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_toppings)
                    .addComponent(btn_con))
                .addContainerGap(360, Short.MAX_VALUE))
        );

        tabpane_menu.addTab("Mains", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabpane_menu))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabpane_menu)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1321, 781));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_flavoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_flavoursActionPerformed
        sauces.Start();
    }//GEN-LAST:event_btn_flavoursActionPerformed

    private void spin_cupsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spin_cupsStateChanged
        int cupCount = (int) spin_cups.getValue() * 10;
        lbl_cupCount.setText("Total Number of Peices: " + cupCount);
        priceUpdate();
    }//GEN-LAST:event_spin_cupsStateChanged

    private void spin_breadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spin_breadStateChanged
        int breadCount = (int) spin_bread.getValue() * 5;
        lbl_breadCount.setText("Total Number of Slices: " + breadCount);
        priceUpdate();
    }//GEN-LAST:event_spin_breadStateChanged

    private void spin_partyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spin_partyStateChanged
        wingCount();
        priceUpdate();
    }//GEN-LAST:event_spin_partyStateChanged

    private void spin_familyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spin_familyStateChanged
        wingCount();
        priceUpdate();
    }//GEN-LAST:event_spin_familyStateChanged

    private void spin_singleStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spin_singleStateChanged
        wingCount();
        priceUpdate();
    }//GEN-LAST:event_spin_singleStateChanged

    private void check_partyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_partyActionPerformed
        String type = "party";
        boolean enabled;
        int value;

        if(check_party.isSelected() == false)
        {
            enabled = false;
            value = 0;
        }else
        {
            enabled = true;
            value = 1;
        }

        enableCheckBoxes(type, enabled, value);
    }//GEN-LAST:event_check_partyActionPerformed

    private void check_familyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_familyActionPerformed
        String type = "family";
        boolean enabled;
        int value;

        if(check_family.isSelected() == false)
        {
            enabled = false;
            value = 0;
        }else
        {
            enabled = true;
            value = 1;
        }

        enableCheckBoxes(type, enabled, value);
    }//GEN-LAST:event_check_familyActionPerformed

    private void check_cupsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_cupsActionPerformed
        String type = "cups";
        boolean enabled;
        int value;

        if(check_cups.isSelected() == false)
        {
            enabled = false;
            value = 0;
        }else
        {
            enabled = true;
            value = 1;
        }

        enableCheckBoxes(type, enabled, value);
    }//GEN-LAST:event_check_cupsActionPerformed

    private void check_breadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_breadActionPerformed
        String type = "bread";
        boolean enabled;
        int value;

        if(check_bread.isSelected() == false)
        {
            enabled = false;
            value = 0;
        }else
        {
            enabled = true;
            value = 1;
        }

        enableCheckBoxes(type, enabled, value);
    }//GEN-LAST:event_check_breadActionPerformed

    private void check_singleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_singleActionPerformed
        String type = "single";
        boolean enabled;
        int value;

        if(check_single.isSelected() == false)
        {
            enabled = false;
            value = 0;
        }else
        {
            enabled = true;
            value = 1;
        }

        enableCheckBoxes(type, enabled, value);
    }//GEN-LAST:event_check_singleActionPerformed

    protected static void toggleSauceButton()
    {
        if(check_single.isSelected() || check_family.isSelected() || check_party.isSelected())
        {
            btn_flavours.setEnabled(true);
        } else btn_flavours.setEnabled(false);
    }
    public static void main(String args[]) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(apps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(apps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(apps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(apps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new apps().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_con;
    public static javax.swing.JButton btn_flavours;
    private javax.swing.JButton btn_toppings;
    public static javax.swing.JCheckBox check_bread;
    public static javax.swing.JCheckBox check_cups;
    public static javax.swing.JCheckBox check_family;
    private javax.swing.JCheckBox check_lpizza;
    private javax.swing.JCheckBox check_mpizza;
    public static javax.swing.JCheckBox check_party;
    public static javax.swing.JCheckBox check_poutine;
    public static javax.swing.JCheckBox check_single;
    private javax.swing.JCheckBox check_spizza;
    private javax.swing.JCheckBox check_xlpizza;
    public static javax.swing.JCheckBox jCheckBox1;
    public static javax.swing.JCheckBox jCheckBox2;
    public static javax.swing.JCheckBox jCheckBox3;
    public static javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JLabel lbl_breadCount;
    public static javax.swing.JLabel lbl_breadPrice;
    private javax.swing.JLabel lbl_cupCount;
    public static javax.swing.JLabel lbl_cupPrice;
    public static javax.swing.JLabel lbl_totalPrice;
    public static javax.swing.JLabel lbl_wingCount;
    public static javax.swing.JLabel lbl_wingPrice;
    public static javax.swing.JSpinner spin_bread;
    public static javax.swing.JSpinner spin_cups;
    public static javax.swing.JSpinner spin_family;
    private javax.swing.JSpinner spin_large;
    private javax.swing.JSpinner spin_medium;
    public static javax.swing.JSpinner spin_party;
    public static javax.swing.JSpinner spin_single;
    private javax.swing.JSpinner spin_small;
    private javax.swing.JSpinner spin_xl;
    private javax.swing.JTabbedPane tabpane_menu;
    // End of variables declaration//GEN-END:variables
}