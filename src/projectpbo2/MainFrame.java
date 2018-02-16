/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projectpbo2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class MainFrame extends javax.swing.JFrame {


    
    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSex = new javax.swing.ButtonGroup();
        bgStatus = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfNIKAdd = new javax.swing.JTextField();
        tfNamaAdd = new javax.swing.JTextField();
        rbLAdd = new javax.swing.JRadioButton();
        rbPAdd = new javax.swing.JRadioButton();
        tfTempatAdd = new javax.swing.JTextField();
        tfTanggalAdd = new javax.swing.JTextField();
        cbAgamaAdd = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        taAlamatAdd = new javax.swing.JTextArea();
        buttonTambah = new javax.swing.JButton();
        rbMAdd = new javax.swing.JRadioButton();
        rbBmAdd = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        tfEmailAdd = new javax.swing.JTextField();
        tfTelpAdd = new javax.swing.JTextField();
        tfPekerjaanAdd = new javax.swing.JTextField();
        tfKeteranganAdd = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableOutput = new javax.swing.JTable();
        buttonAll = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        cbCari = new javax.swing.JComboBox();
        tfSearch = new javax.swing.JTextField();
        buttonCari = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tfNIKEdit = new javax.swing.JTextField();
        tfNamaEdit = new javax.swing.JTextField();
        rbLEdit = new javax.swing.JRadioButton();
        rbPEdit = new javax.swing.JRadioButton();
        tfTempatEdit = new javax.swing.JTextField();
        tfTanggalEdit = new javax.swing.JTextField();
        cbAgamaEdit = new javax.swing.JComboBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        taAlamatEdit = new javax.swing.JTextArea();
        buttonEdit = new javax.swing.JButton();
        rbMEdit = new javax.swing.JRadioButton();
        rbBmEdit = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        tfEmailEdit = new javax.swing.JTextField();
        tfTelpEdit = new javax.swing.JTextField();
        tfPekerjaanEdit = new javax.swing.JTextField();
        tfKeteranganEdit = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        tfNIKDelete = new javax.swing.JTextField();
        buttonDelete = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MainMenu = new javax.swing.JMenu();
        MenuExport = new javax.swing.JMenuItem();
        MenuTestKoneksi = new javax.swing.JMenuItem();
        MenuAbout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Project PBO");
        setName("mainFrame"); // NOI18N

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("NIK");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Jenis Kelamin");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Tempat Lahir");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Agama");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Tanggal Lahir");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Status Pernikahan");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Alamat");

        tfNIKAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tfNamaAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        bgSex.add(rbLAdd);
        rbLAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbLAdd.setText("Laki - Laki");

        bgSex.add(rbPAdd);
        rbPAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbPAdd.setText("Perempuan");

        tfTempatAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tfTanggalAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfTanggalAdd.setText("DD-MM-YYYY");
        tfTanggalAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTanggalAddActionPerformed(evt);
            }
        });

        cbAgamaAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbAgamaAdd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Islam", "Katholik", "Kristen", "Hindu", "Budha", "KongHuChu", "Lainya" }));

        taAlamatAdd.setColumns(20);
        taAlamatAdd.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        taAlamatAdd.setRows(5);
        jScrollPane2.setViewportView(taAlamatAdd);

        buttonTambah.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonTambah.setText("Tambah");
        buttonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahActionPerformed(evt);
            }
        });

        bgStatus.add(rbMAdd);
        rbMAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbMAdd.setText("Menikah");

        bgStatus.add(rbBmAdd);
        rbBmAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbBmAdd.setText("Belum Menikah");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Email");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText("Nomor Telepon");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("Pekerjaan");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("Keterangan");

        tfEmailAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tfTelpAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tfPekerjaanAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tfKeteranganAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rbBmAdd)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cbAgamaAdd, javax.swing.GroupLayout.Alignment.LEADING, 0, 250, Short.MAX_VALUE)
                                .addComponent(tfTanggalAdd, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfTempatAdd, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfNamaAdd, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfNIKAdd, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbLAdd)
                        .addGap(18, 18, 18)
                        .addComponent(rbPAdd))
                    .addComponent(rbMAdd)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfEmailAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addComponent(tfTelpAdd)
                        .addComponent(tfPekerjaanAdd)
                        .addComponent(tfKeteranganAdd)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(tfNIKAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19))
                    .addComponent(tfEmailAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfNamaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rbLAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfPekerjaanAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(rbPAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfKeteranganAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addGap(3, 3, 3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfTelpAdd)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfTempatAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTanggalAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbAgamaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(0, 353, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(buttonTambah))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rbMAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbBmAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(229, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Add", null, jPanel1, "");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tableOutput.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIK", "NAMA", "JENIS KELAMIN", "TEMPAT LAHIR", "TANGGAL LAHIR", "ALAMAT", "STATUS PERKAWINAN", "AGAMA", "NOMOR TELPON", "EMAIL", "PEKERJAAN", "KETERANGAN"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableOutput);

        buttonAll.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonAll.setText("All");
        buttonAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAllActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setText("Cari Berdasarkan");

        cbCari.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbCari.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NIK", "NAMA", "TANGGAL_LAHIR", "TEMPAT_LAHIR", "JENIS_KELAMIN", "AGAMA", "NOMOR_TELPON" }));

        tfSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        buttonCari.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonCari.setText("Cari");
        buttonCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonAll, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCari, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(cbCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCari))
                .addGap(27, 27, 27)
                .addComponent(buttonAll)
                .addContainerGap(226, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("NIK");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Nama");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Jenis Kelamin");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Tempat Lahir");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Agama");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Tanggal Lahir");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Status Pernikahan");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Alamat");

        tfNIKEdit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfNIKEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNIKEditActionPerformed(evt);
            }
        });

        tfNamaEdit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        bgSex.add(rbLEdit);
        rbLEdit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbLEdit.setText("Laki - Laki");

        bgSex.add(rbPEdit);
        rbPEdit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbPEdit.setText("Perempuan");

        tfTempatEdit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tfTanggalEdit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        cbAgamaEdit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbAgamaEdit.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Islam", "Katholik", "Kristen", "Hindu", "Budha", "KongHuChu", "Lainya" }));

        taAlamatEdit.setColumns(20);
        taAlamatEdit.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        taAlamatEdit.setRows(5);
        jScrollPane4.setViewportView(taAlamatEdit);

        buttonEdit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonEdit.setText("Edit");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        bgStatus.add(rbMEdit);
        rbMEdit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbMEdit.setText("Menikah");

        bgStatus.add(rbBmEdit);
        rbBmEdit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbBmEdit.setText("Belum Menikah");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Data Baru :");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setText("Email");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setText("Nomor Telepon");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setText("Pekerjaan");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel26.setText("Keterangan");

        tfEmailEdit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tfTelpEdit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tfPekerjaanEdit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tfKeteranganEdit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(198, 198, 198)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(tfNIKEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfTempatEdit)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(rbLEdit)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbPEdit))
                                    .addComponent(tfNamaEdit)
                                    .addComponent(tfTanggalEdit)
                                    .addComponent(cbAgamaEdit, 0, 250, Short.MAX_VALUE))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                        .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(rbMEdit)
                                .addGap(18, 18, 18)
                                .addComponent(rbBmEdit))
                            .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfEmailEdit)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfPekerjaanEdit)
                                    .addComponent(tfTelpEdit)
                                    .addComponent(tfKeteranganEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(jScrollPane4))
                                .addGap(0, 4, Short.MAX_VALUE)))))
                .addGap(116, 116, 116))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel17))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNIKEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(tfNamaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel23))
                    .addComponent(tfEmailEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rbLEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rbPEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfTelpEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfTempatEdit)
                            .addComponent(jLabel12)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPekerjaanEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTanggalEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(tfKeteranganEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(cbAgamaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(rbMEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbBmEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonEdit)))
                .addGap(218, 218, 218))
        );

        jTabbedPane1.addTab("Edit", null, jPanel3, "");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("NIK Yang Akan dihapus");

        tfNIKDelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        buttonDelete.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonDelete.setText("Hapus");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 184, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNIKDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(201, 201, 201))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNIKDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonDelete)
                .addContainerGap(391, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Delete", null, jPanel4, "");

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        MainMenu.setBackground(new java.awt.Color(255, 255, 255));
        MainMenu.setText("Menu");

        MenuExport.setText("Export Data");
        MenuExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuExportActionPerformed(evt);
            }
        });
        MainMenu.add(MenuExport);

        MenuTestKoneksi.setText("Tes Koneksi Database");
        MenuTestKoneksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuTestKoneksiActionPerformed(evt);
            }
        });
        MainMenu.add(MenuTestKoneksi);

        jMenuBar1.add(MainMenu);

        MenuAbout.setBackground(new java.awt.Color(255, 255, 255));
        MenuAbout.setText("About");
        MenuAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuAboutMouseClicked(evt);
            }
        });
        jMenuBar1.add(MenuAbout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Edit");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahActionPerformed
        // TODO add your handling code here:
         Penduduk p = new Penduduk();
         DatabaseManager  db = new DatabaseManager();
         try{
                
                p.setNIK(this.getNIK(1));
                p.setTanggalLahir(this.getTanggal(1));
                p.setEmail(this.getEmail(1));
                p.setTelepon(this.getTelp(1));
                
                this.cekAll(1);
                p.setNama(this.tfNamaAdd.getText());
                p.setTempatLahir(this.tfTempatAdd.getText());
                p.setAgama((String) this.cbAgamaAdd.getSelectedItem());
                if (this.rbLAdd.isSelected()) {
                    p.setJenisKelamin(rbLAdd.getText());
                }
                else{
                    p.setJenisKelamin(rbPAdd.getText());
                }
                if (this.rbBmAdd.isSelected()) {
                    p.setStatus(this.rbBmAdd.getText());
                }
                else{
                    p.setStatus(this.rbMAdd.getText());
                }
                p.setAlamat(this.taAlamatAdd.getText());
                p.setKeterangan(this.tfKeteranganAdd.getText());
                p.setPekerjaan(this.tfPekerjaanAdd.getText());
                JOptionPane.showMessageDialog(null, db.inputData(p), null, JOptionPane.INFORMATION_MESSAGE);               
                this.clearForm(1);
                
            }
            
                catch (Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                
            }
         
         
    }//GEN-LAST:event_buttonTambahActionPerformed

    private void buttonAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAllActionPerformed
        DatabaseManager db = new DatabaseManager();
        Penduduk p[] = db.selectData();
        this.clearTable();
        
        for (int i = 0; i < p.length; i++) {
            tableOutput.getModel().setValueAt(p[i].getNIK(), i, 0);
            tableOutput.getModel().setValueAt(p[i].getNama(), i, 1);
            tableOutput.getModel().setValueAt(p[i].getJenisKelamin(), i, 2);
            tableOutput.getModel().setValueAt(p[i].getTempatLahir(), i, 3);
            tableOutput.getModel().setValueAt(p[i].getTanggalLahir(), i, 4);
            tableOutput.getModel().setValueAt(p[i].getAlamat(), i, 5);
            tableOutput.getModel().setValueAt(p[i].getStatus(), i, 6);
            tableOutput.getModel().setValueAt(p[i].getAgama(), i, 7);
            tableOutput.getModel().setValueAt(p[i].getTelepon(), i, 8);
            tableOutput.getModel().setValueAt(p[i].getEmail(), i, 9);
            tableOutput.getModel().setValueAt(p[i].getPekerjaan(), i, 10);
            tableOutput.getModel().setValueAt(p[i].getKeterangan(), i, 11);
        }
        
    }//GEN-LAST:event_buttonAllActionPerformed

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        
         Penduduk p = new Penduduk();
         DatabaseManager  db = new DatabaseManager();
         try{
                
                p.setNIK(this.getNIK(2));
                p.setTanggalLahir(this.getTanggal(2));
                p.setEmail(this.getEmail(2));
                p.setTelepon(this.getTelp(2));
                
                this.cekAll(2);
                p.setNama(this.tfNamaEdit.getText());
                p.setTempatLahir(this.tfTempatEdit.getText());
                p.setAgama((String) this.cbAgamaEdit.getSelectedItem());
                if (this.rbLEdit.isSelected()) {
                    p.setJenisKelamin(rbLEdit.getText());
                }
                else{
                    p.setJenisKelamin(rbPEdit.getText());
                }
                if (this.rbBmEdit.isSelected()) {
                    p.setStatus(this.rbBmEdit.getText());
                }
                else{
                    p.setStatus(this.rbMEdit.getText());
                }
                p.setAlamat(this.taAlamatEdit.getText());
                p.setKeterangan(this.tfKeteranganEdit.getText());
                p.setPekerjaan(this.tfPekerjaanEdit.getText());
                JOptionPane.showMessageDialog(null, db.updateData(p), null, JOptionPane.INFORMATION_MESSAGE);               
                this.clearForm(2);
                
            }
            
                catch (Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                
            }
    }//GEN-LAST:event_buttonEditActionPerformed

    private void MenuAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuAboutMouseClicked
        // TODO add your handling code here:
        this.about();
    }//GEN-LAST:event_MenuAboutMouseClicked

    private void MenuTestKoneksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuTestKoneksiActionPerformed
        // TODO add your handling code here:
        DatabaseManager db = new DatabaseManager();
        Connection con = db.getConnection();
        if (con!=null) {
            JOptionPane.showMessageDialog(null, "KONEKSI BERHASIL", "TEST CONNECTION", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "KONEKSI GAGAL", "TEST CONNECTION", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_MenuTestKoneksiActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        // TODO add your handling code here:
        
        String nik = this.tfNIKDelete.getText();
        DatabaseManager db = new DatabaseManager();
        JOptionPane.showMessageDialog(null, db.hapusData(nik));
        this.tfNIKDelete.setText(null);
        

    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void tfNIKEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNIKEditActionPerformed
        DatabaseManager db = new DatabaseManager();
        Penduduk p = db.showData(tfNIKEdit.getText());
        
        tfNamaEdit.setText(p.getNama());
        tfTempatEdit.setText(p.getTempatLahir());
        tfTanggalEdit.setText(p.getTanggalLahir());
        tfEmailEdit.setText(p.getEmail());
        tfTelpEdit.setText(p.getTelepon());
        tfPekerjaanEdit.setText(p.getPekerjaan());
        tfKeteranganEdit.setText(p.getKeterangan());
        taAlamatEdit.setText(p.getAlamat());
        
        
    }//GEN-LAST:event_tfNIKEditActionPerformed

    private void buttonCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCariActionPerformed
        // TODO add your handling code here:
        String column = (String) cbCari.getSelectedItem();
        String search = this.tfSearch.getText();
        
        DatabaseManager db = new DatabaseManager();
        Penduduk p[] = db.selectData(column,search);
        this.clearTable();
        for (int i = 0; i < p.length; i++) {
            tableOutput.getModel().setValueAt(p[i].getNIK(), i, 0);
            tableOutput.getModel().setValueAt(p[i].getNama(), i, 1);
            tableOutput.getModel().setValueAt(p[i].getJenisKelamin(), i, 2);
            tableOutput.getModel().setValueAt(p[i].getTempatLahir(), i, 3);
            tableOutput.getModel().setValueAt(p[i].getTanggalLahir(), i, 4);
            tableOutput.getModel().setValueAt(p[i].getAlamat(), i, 5);
            tableOutput.getModel().setValueAt(p[i].getStatus(), i, 6);
            tableOutput.getModel().setValueAt(p[i].getAgama(), i, 7);
            tableOutput.getModel().setValueAt(p[i].getTelepon(), i, 8);
            tableOutput.getModel().setValueAt(p[i].getEmail(), i, 9);
            tableOutput.getModel().setValueAt(p[i].getPekerjaan(), i, 10);
            tableOutput.getModel().setValueAt(p[i].getKeterangan(), i, 11);
        }
        
    }//GEN-LAST:event_buttonCariActionPerformed

    private void MenuExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuExportActionPerformed
        
        JFileChooser chooser = new JFileChooser();
        if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            DatabaseManager db = new DatabaseManager();
            Penduduk p[] = db.selectData();
            
             try{
                File file = chooser.getSelectedFile();
                FileWriter fw = new FileWriter(file.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);
                   
                bw.write("NIK|NAMA|JENIS KELAMIN|TEMPAT LAHIR|TANGGAL LAHIR|ALAMAT|STAUS PERKAWINAN|"
                           + "AGAMA|NOMOR TELEPON|EMAIL|PEKERJAAN|KETERANGAN\n");
                   
                    for (int i = 0; i < p.length; i++) {
                        bw.write(p[i].getNIK()+" | "+p[i].getNama()+" | "+p[i].getJenisKelamin()+
                                " | "+p[i].getTempatLahir()+" | "+p[i].getTanggalLahir()+
                                " | "+p[i].getAlamat()+" | "+p[i].getStatus()+" | "+p[i].getAgama()+
                                " | "+p[i].getTelepon()+" | "+p[i].getEmail()+" | "+p[i].getPekerjaan()+
                                " | "+p[i].getKeterangan()+"\n");
                    }                   
                    bw.close();
                    fw.close();
                    JOptionPane.showMessageDialog(null, "Data di export");
               }catch(Exception ex){
                   ex.printStackTrace();
               }             
            }
    }//GEN-LAST:event_MenuExportActionPerformed

    private void tfTanggalAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTanggalAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTanggalAddActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MainMenu;
    private javax.swing.JMenu MenuAbout;
    private javax.swing.JMenuItem MenuExport;
    private javax.swing.JMenuItem MenuTestKoneksi;
    private javax.swing.ButtonGroup bgSex;
    private javax.swing.ButtonGroup bgStatus;
    private javax.swing.JButton buttonAll;
    private javax.swing.JButton buttonCari;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonTambah;
    private javax.swing.JComboBox cbAgamaAdd;
    private javax.swing.JComboBox cbAgamaEdit;
    private javax.swing.JComboBox cbCari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rbBmAdd;
    private javax.swing.JRadioButton rbBmEdit;
    private javax.swing.JRadioButton rbLAdd;
    private javax.swing.JRadioButton rbLEdit;
    private javax.swing.JRadioButton rbMAdd;
    private javax.swing.JRadioButton rbMEdit;
    private javax.swing.JRadioButton rbPAdd;
    private javax.swing.JRadioButton rbPEdit;
    private javax.swing.JTextArea taAlamatAdd;
    private javax.swing.JTextArea taAlamatEdit;
    private javax.swing.JTable tableOutput;
    private javax.swing.JTextField tfEmailAdd;
    private javax.swing.JTextField tfEmailEdit;
    private javax.swing.JTextField tfKeteranganAdd;
    private javax.swing.JTextField tfKeteranganEdit;
    private javax.swing.JTextField tfNIKAdd;
    private javax.swing.JTextField tfNIKDelete;
    private javax.swing.JTextField tfNIKEdit;
    private javax.swing.JTextField tfNamaAdd;
    private javax.swing.JTextField tfNamaEdit;
    private javax.swing.JTextField tfPekerjaanAdd;
    private javax.swing.JTextField tfPekerjaanEdit;
    private javax.swing.JTextField tfSearch;
    private javax.swing.JTextField tfTanggalAdd;
    private javax.swing.JTextField tfTanggalEdit;
    private javax.swing.JTextField tfTelpAdd;
    private javax.swing.JTextField tfTelpEdit;
    private javax.swing.JTextField tfTempatAdd;
    private javax.swing.JTextField tfTempatEdit;
    // End of variables declaration//GEN-END:variables
    public String getNIK(int a) throws Exception{
        JTextField tf;
        if (a == 1){
            tf = this.tfNIKAdd;
        }
        
        else{
            tf = this.tfNIKEdit;
        }
               
        try{
          Double.parseDouble(tf.getText());
            
        }
        catch (Exception e){
            throw new Exception("NIK harus berupa angka");
        }
        String out = tf.getText();
        if (out.length()!=16) {
            throw new Exception("NIK harus 16 angka");
        }
       return out;
    }
    
    public String getTanggal(int a) throws Exception{
        String tanggal; 
        if (a == 1) {
            tanggal = this.tfTanggalAdd.getText();
        }
        
        else{
            tanggal = this.tfTanggalEdit.getText();
        }
        
        try{
            Integer.parseInt(tanggal.substring(0, 2));
            Integer.parseInt(tanggal.substring(3, 5));
            Integer.parseInt(tanggal.substring(6, 10));                     
        }
        catch(Exception e){
            throw new Exception("Tanggal harus berupa angka");
        }
        
        
        if ((tanggal.charAt(2)=='-') && (tanggal.charAt(5)=='-')) {
            return tanggal;
        }
        else{
            throw new Exception("format tanggal lahir salah");
        }
    }

    public String getTelp(int a) throws Exception{
        JTextField tf;
        if (a == 1) {
            tf = this.tfTelpAdd;
        }
        else {
            tf = this.tfTelpEdit;
        }
               
        try{
          Double.parseDouble(tf.getText());
            
        }
        catch (Exception e){
            throw new Exception("Nomor Telepon harus berupa angka");
        }
        String out = tf.getText();
        if (out.length()>12) {
            throw new Exception("Nomor Telpon tidak lebih dari 12 angka");
        }        
        return out;
    }

    public String getEmail(int a) throws Exception{
        JTextField tf;
        boolean b1 = false, b2 = false;
        if (a == 1) {
            tf = this.tfEmailAdd;
        }
        else{
            tf = this.tfEmailEdit;
        }
        String out = tf.getText();
        int index = 0;
        while (index<out.length()){
            if (out.charAt(index)=='@') {
                b1 = true;
            }
            index++;
        }
        index = 0;
        while (index<out.length()){
            if (out.charAt(index)=='.') {
                b2 = true;
            }
            index++;
        }
        
        if (!(b1&&b2)) {
            throw new Exception("Format email salah");
        }
        
        return out;
        
    }
    
    public void about(){
        JOptionPane.showMessageDialog(null, "PROYEK PBO II"
                + "\n\nRafelino Claudius Kelen\t145314010"
                + "\nMichael Donny Kusuma\t145314031"
                + "\nKrisna Ardian\t145314032", "ABOUT", JOptionPane.INFORMATION_MESSAGE);
    
    }
    
    public void cekAll(int a) throws Exception{
        String[] cek = new String[7];
        
        if (a == 1) {
            cek[0] = this.tfNamaAdd.getText();
            cek[1] = this.tfTempatAdd.getText();
            if (this.rbLAdd.isSelected()) {
                cek[2] = rbLAdd.getText();
            }
            else if(this.rbPAdd.isSelected()){
                cek[2] = this.rbPAdd.getText();
            }
            else {
                cek[2] = null;
            }
            if (this.rbBmAdd.isSelected()) {
                cek[3] = this.rbBmAdd.getText();
            }
            else if(this.rbMAdd.isSelected()){
                cek[3] = this.rbMAdd.getText();
            }
            else{
                cek[3] = null;
            }
            cek[4] = this.taAlamatAdd.getText();
            cek[5] = this.tfKeteranganAdd.getText();
            cek[6] = this.tfPekerjaanAdd.getText();
        }
        else{
            cek[0] = this.tfNamaEdit.getText();
            cek[1] = this.tfTempatEdit.getText();
            if (this.rbLEdit.isSelected()) {
                cek[2] = rbLEdit.getText();
            }
            else if(this.rbPEdit.isSelected()){
                cek[2] = this.rbPEdit.getText();
            }
            else {
                cek[2] = null;
            }
            if (this.rbBmEdit.isSelected()) {
                cek[3] = this.rbBmEdit.getText();
            }
            else if(this.rbMEdit.isSelected()){
                cek[3] = this.rbMEdit.getText();
            }
            else{
                cek[3] = null;
            }
            cek[4] = this.taAlamatEdit.getText();
            cek[5] = this.tfKeteranganEdit.getText();
            cek[6] = this.tfPekerjaanEdit.getText();                   
        }
        
        for (int i = 0; i < cek.length; i++) {
            if (cek[i]==null || cek[i].isEmpty()) {
                throw new Exception("Data Belum Lengkap");
            }
        }
    }

    public void clearTable(){
        for (int i = 0; i < 40; i++) {
            tableOutput.getModel().setValueAt(null, i, 0);
            tableOutput.getModel().setValueAt(null, i, 1);
            tableOutput.getModel().setValueAt(null, i, 2);
            tableOutput.getModel().setValueAt(null, i, 3);
            tableOutput.getModel().setValueAt(null, i, 4);
            tableOutput.getModel().setValueAt(null, i, 5);
            tableOutput.getModel().setValueAt(null, i, 6);
            tableOutput.getModel().setValueAt(null, i, 7);
            tableOutput.getModel().setValueAt(null, i, 8);
            tableOutput.getModel().setValueAt(null, i, 9);
            tableOutput.getModel().setValueAt(null, i, 10);
            tableOutput.getModel().setValueAt(null, i, 11);
        }
    }

    public void clearForm(int a){
        if (a==1) {
            tfNIKAdd.setText(null);
            tfNamaAdd.setText(null);
            tfTempatAdd.setText(null);
            tfTanggalAdd.setText("DD-MM-YYYY");
            taAlamatAdd.setText(null);
            tfEmailAdd.setText(null);
            tfTelpAdd.setText(null);
            tfPekerjaanAdd.setText(null);
            tfKeteranganAdd.setText(null);
            rbBmAdd.setSelected(false);
            rbMAdd.setSelected(false);
            rbLAdd.setSelected(false);
            rbPAdd.setSelected(false);
        }
        else{
            tfNIKEdit.setText(null);
            tfNamaEdit.setText(null);
            tfTempatEdit.setText(null);
            tfTanggalEdit.setText("DD-MM-YYYY");
            taAlamatEdit.setText(null);
            tfEmailEdit.setText(null);
            tfTelpEdit.setText(null);
            tfPekerjaanEdit.setText(null);
            tfKeteranganEdit.setText(null);
            rbBmEdit.setSelected(false);
            rbMEdit.setSelected(false);
            rbLEdit.setSelected(false);
            rbPEdit.setSelected(false);
        }
        
    }
}
