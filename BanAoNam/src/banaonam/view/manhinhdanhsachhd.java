package banaonam.view;

import banaonam.model.hoadon;
import banaonam.model.hoadonchitiet;
import banaonam.model.nhanvien;
import banaonam.sevice.hoadonchitietservice;
import banaonam.sevice.hoadonservice;
import banaonam.sevice.khachhangservice;
import banaonam.sevice.khuyenmaiService;
import banaonam.sevice.nhanvienservice;
import static banaonam.view.BillThanhToanJPanel.lblGiam;
import static banaonam.view.BillThanhToanJPanel.lblKhachHang;
import static banaonam.view.BillThanhToanJPanel.lblMaHD1;
import static banaonam.view.BillThanhToanJPanel.lblNgayTao;
import static banaonam.view.BillThanhToanJPanel.lblNhanVien;
import static banaonam.view.BillThanhToanJPanel.lblTenKhuyenMai;
import static banaonam.view.BillThanhToanJPanel.lblTongTien;
import static banaonam.view.BillThanhToanJPanel.lblTongTien1;
import static banaonam.view.BillThanhToanJPanel.tblDSSanPham;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class manhinhdanhsachhd extends javax.swing.JInternalFrame {

    nhanvienservice serviceNV = new nhanvienservice();
    khachhangservice serviceKH = new khachhangservice();
    hoadonservice serviceHD = new hoadonservice();
    hoadonchitietservice serviceHDCT = new hoadonchitietservice();
    khuyenmaiService serviceKM = new khuyenmaiService();
    nhanvienservice serNV = new nhanvienservice();
    int index;

    public manhinhdanhsachhd() {
        initComponents();
        setlaiborder();
        fillTableHD(serviceHD.getAllHDByQLHD());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHoaDOn = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblMaHD = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTenNV = new javax.swing.JLabel();
        lblTenKH = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtTenNV = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMaHD = new javax.swing.JTextField();
        jToggleButton2 = new javax.swing.JToggleButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách hóa đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        tblHoaDOn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MaHD", "Ngày tạo", "Tên nhân viên", "Tên khách hàng", "Trạng thái", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHoaDOn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoaDOnMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHoaDOn);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblMaHD.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Tên nhân viên");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Tên khách hàng: ");

        lblTenNV.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblTenKH.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jToggleButton1.setBackground(new java.awt.Color(0, 0, 0));
        jToggleButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setText("Chi tiết");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton1)
                            .addComponent(lblTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblTenKH, lblTenNV});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(lblTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(lblTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jToggleButton1)
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, lblTenKH, lblTenNV});

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã SP", "Tên SP", "Màu sắc", "Chất liệu", "Size", "Giá", "Số lượng", "Tổng tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblSanPham);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Tìm kiếm");

        txtTenNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenNVActionPerformed(evt);
            }
        });
        txtTenNV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTenNVKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Theo tên NV");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Mã hóa đơn");

        txtMaHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMaHDMouseClicked(evt);
            }
        });
        txtMaHD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMaHDKeyReleased(evt);
            }
        });

        jToggleButton2.setBackground(new java.awt.Color(0, 0, 0));
        jToggleButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jToggleButton2.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton2.setText("Clear");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(24, 24, 24)
                            .addComponent(txtMaHD))
                        .addComponent(jLabel5)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jToggleButton2)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(258, 258, 258))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        // TODO add your handling code here:
        index = tblSanPham.getSelectedRow();
        showDetailSP(index);

    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void tblHoaDOnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDOnMouseClicked
        // TODO add your handling code here:
        index = tblHoaDOn.getSelectedRow();
        showDetailHD(index);
        fillTableSanPham(serviceHDCT.getHDByMAHDByQLHD(Integer.parseInt(lblMaHD.getText())));
    }//GEN-LAST:event_tblHoaDOnMouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        index = tblHoaDOn.getSelectedRow();
        hoadon hd = serviceHD.getAllHDByQLHD().get(index);

        if (hd.getTrangThai().equalsIgnoreCase("Chờ thanh toán")) {
            JOptionPane.showMessageDialog(this, "Chưa có thông tin chi tiết cho hóa đơn này");
        } else {
            JDialog p = new JDialog();
            p.add(new BillThanhToanJPanel());
            p.setSize(500, 650);
            p.setVisible(true);
            p.setLocationRelativeTo(null);

            lblMaHD1.setText(hd.getMaHD() + "");
            lblNgayTao.setText(hd.getNgayTao() + "");
            lblNhanVien.setText(serviceNV.tenNV(hd.getMaNV()));

            if (hd.getMaKH() == 1) {
                lblKhachHang.setText("");
            } else {
                lblKhachHang.setText(serviceKH.getTenKHByMA(hd.getMaKH()));
            }
            if (serviceHD.getMaKM(hd.getMaHD()) != 0) {
                String tenKM = serviceKM.getMaKM(serviceHD.getMaKM(hd.getMaHD()));
                lblTenKhuyenMai.setText(tenKM);
                if (serviceKM.FindMaTheoPhanTram(lblTenKhuyenMai.getText()) != null) {
                    System.out.println("" + serviceKM.FindMaTheoPhanTram(lblTenKhuyenMai.getText()));
                    System.out.println("" + (lblTenKhuyenMai.getText()));
                    System.out.println("" + serviceKM.FindPhanTram(lblTenKhuyenMai.getText()));
                    int PhanTramGiam = Integer.parseInt(serviceKM.FindPhanTram(lblTenKhuyenMai.getText()));

                    lblGiam.setText("" + PhanTramGiam + "%");
                    lblTongTien.setText("" + hd.getThanhTien());

                } else {

                }
            } else {
                lblTenKhuyenMai.setText("Không có");
                lblTongTien.setText("" + hd.getThanhTien());
                System.out.println("check" + hd.getThanhTien());
            }
            DefaultTableModel model = new DefaultTableModel();
            model = (DefaultTableModel) tblDSSanPham.getModel();
            model.setRowCount(0);
            int i = 1;
            for (hoadonchitiet x : serviceHDCT.getHDByMAHD(Integer.parseInt(lblMaHD1.getText()))) {
                model.addRow(new Object[]{
                    i++,
                     x.getTenSP(), x.getSoLuong(), x.getGia(), x.getSoLuong() * x.getGia()});
            }
            lblTongTien1.setText(serviceHDCT.getTT(hd.getMaHD()) + "");
        }


    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void txtTenNVKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenNVKeyReleased
        // TODO add your handling code here:
        int maNV = serviceNV.getMaNV(txtTenNV.getText());
        if (txtMaHD.getText().isEmpty()) {
            fillTableHD(serviceHD.getAllHDByNhanVien(maNV));
        } else {
            fillTableHD(serviceHD.getAllHDByHDVaNV(Integer.parseInt(txtMaHD.getText()), maNV));
        }

    }//GEN-LAST:event_txtTenNVKeyReleased

    private void txtMaHDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaHDKeyReleased
        // TODO add your handling code here:
        int maNV = serviceNV.getMaNV(txtTenNV.getText());
        if (maNV == 0) {
            fillTableHD(serviceHD.getAllHDByMaHD(Integer.parseInt(txtMaHD.getText())));
            System.out.println("check 1");
        } else {
            fillTableHD(serviceHD.getAllHDByHDVaNV(Integer.parseInt(txtMaHD.getText()), maNV));
            System.out.println("check 2");
        }
    }//GEN-LAST:event_txtMaHDKeyReleased

    private void txtMaHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMaHDMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaHDMouseClicked

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        txtMaHD.setText("");
        txtTenNV.setText("");
        fillTableHD(serviceHD.getAllHDByQLHD());
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void txtTenNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenNVActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JLabel lblMaHD;
    private javax.swing.JLabel lblTenKH;
    private javax.swing.JLabel lblTenNV;
    private javax.swing.JTable tblHoaDOn;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtTenNV;
    // End of variables declaration//GEN-END:variables

    private void fillTableHD(List<hoadon> list) {
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel) tblHoaDOn.getModel();
        model.setRowCount(0);
        for (hoadon x : list) {
            if (x.getMaKH() == 1) {
                x.setMaKH(0);
            }
            model.addRow(new Object[]{x.getMaHD(), x.getNgayTao(),
                serviceNV.tenNV(x.getMaNV()),
                serviceKH.getTenKHByMA(x.getMaKH()),
                x.getTrangThai(), x.getThanhTien()});
        }
    }

    private void fillTableSanPham(List<hoadonchitiet> list) {
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel) tblSanPham.getModel();
        model.setRowCount(0);
        int i = 1;
        for (hoadonchitiet x : list) {
            model.addRow(new Object[]{i++, x.getMaSP(),
                x.getTenSP(),
                x.getMau(),
                x.getCl(),
                x.getSize(),
                x.getGia(),
                x.getSoLuong(),
                x.getThanhTien(x.getGia(), x.getSoLuong())});
        }
    }

    private void showDetailHD(int index) {

        hoadon hd = serviceHD.getAllHDByQLHD().get(index);
        lblMaHD.setText(hd.getMaHD() + "");
        if (hd.getMaKH() == 1) {
            lblTenKH.setText("");
        } else {
            lblTenKH.setText(serviceKH.getTenKHByMA(hd.getMaKH()));
        }
        lblTenNV.setText(serviceNV.tenNV(hd.getMaNV()));

    }

    private void showDetailSP(int index) {

    }

    private void setlaiborder() {
        setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        setSize(900, 460);
    }
}
