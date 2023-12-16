package banaonam.view;

import banaonam.model.taikhoan;
import banaonam.sevice.nhanvienservice;
import banaonam.sevice.taikhoanservice;
import static banaonam.view.DangNhapJFrame.txtUser;
import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class manhinhchinhJFrame extends javax.swing.JFrame {

    Color maugoc, mauclick;

    taikhoanservice serviceTK = new taikhoanservice();
    nhanvienservice serviceNV = new nhanvienservice();

    public manhinhchinhJFrame() {
        initComponents();
        maugoc = new Color(255, 255, 255);
        mauclick = new Color(255, 102, 0);
        ngaythangnamGio();
        lblMaNV.setText(serviceTK.getMaTK(txtUser.getText()) + "");
        int maNV = Integer.parseInt(lblMaNV.getText());
        lblTenNV.setText(serviceNV.tenNV(maNV));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        plThongKe = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        plSanPham = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        plbanhang = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        plhoadon = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        plnhanvienn = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        plkhuyenmai = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lbgio = new javax.swing.JLabel();
        lbngaythang = new javax.swing.JLabel();
        pldoimatkhau = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        plDangXuat = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblMaNV = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblTenNV = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        plThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plThongKeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                plThongKeMousePressed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setText("Thống Kê");

        javax.swing.GroupLayout plThongKeLayout = new javax.swing.GroupLayout(plThongKe);
        plThongKe.setLayout(plThongKeLayout);
        plThongKeLayout.setHorizontalGroup(
            plThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plThongKeLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(43, 43, 43))
        );
        plThongKeLayout.setVerticalGroup(
            plThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plThongKeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(13, 13, 13))
        );

        plSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plSanPhamMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                plSanPhamMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setText("Sản Phẩm");

        javax.swing.GroupLayout plSanPhamLayout = new javax.swing.GroupLayout(plSanPham);
        plSanPham.setLayout(plSanPhamLayout);
        plSanPhamLayout.setHorizontalGroup(
            plSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plSanPhamLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(49, 49, 49))
        );
        plSanPhamLayout.setVerticalGroup(
            plSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        plbanhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plbanhangMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                plbanhangMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setText("Bán Hàng");

        javax.swing.GroupLayout plbanhangLayout = new javax.swing.GroupLayout(plbanhang);
        plbanhang.setLayout(plbanhangLayout);
        plbanhangLayout.setHorizontalGroup(
            plbanhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plbanhangLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(41, 41, 41))
        );
        plbanhangLayout.setVerticalGroup(
            plbanhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plbanhangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        plhoadon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plhoadonMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                plhoadonMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setText("Hóa Đơn");

        javax.swing.GroupLayout plhoadonLayout = new javax.swing.GroupLayout(plhoadon);
        plhoadon.setLayout(plhoadonLayout);
        plhoadonLayout.setHorizontalGroup(
            plhoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plhoadonLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(44, 44, 44))
        );
        plhoadonLayout.setVerticalGroup(
            plhoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plhoadonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        plnhanvienn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plnhanviennMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                plnhanviennMousePressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel10.setText("Nhân Viên");

        javax.swing.GroupLayout plnhanviennLayout = new javax.swing.GroupLayout(plnhanvienn);
        plnhanvienn.setLayout(plnhanviennLayout);
        plnhanviennLayout.setHorizontalGroup(
            plnhanviennLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plnhanviennLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        plnhanviennLayout.setVerticalGroup(
            plnhanviennLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plnhanviennLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        plkhuyenmai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plkhuyenmaiMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                plkhuyenmaiMousePressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel9.setText("Khuyến Mãi");

        javax.swing.GroupLayout plkhuyenmaiLayout = new javax.swing.GroupLayout(plkhuyenmai);
        plkhuyenmai.setLayout(plkhuyenmaiLayout);
        plkhuyenmaiLayout.setHorizontalGroup(
            plkhuyenmaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plkhuyenmaiLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );
        plkhuyenmaiLayout.setVerticalGroup(
            plkhuyenmaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plkhuyenmaiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        lbgio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banaonam/icon/image icon/Image/Hinh/Clock.png"))); // NOI18N

        lbngaythang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banaonam/icon/image icon/Image/Hinh/Calendar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbgio)
                    .addComponent(lbngaythang))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbgio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbngaythang)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pldoimatkhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pldoimatkhauMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pldoimatkhauMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setText("Đổi Mật Khẩu");

        javax.swing.GroupLayout pldoimatkhauLayout = new javax.swing.GroupLayout(pldoimatkhau);
        pldoimatkhau.setLayout(pldoimatkhauLayout);
        pldoimatkhauLayout.setHorizontalGroup(
            pldoimatkhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pldoimatkhauLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(47, 47, 47))
        );
        pldoimatkhauLayout.setVerticalGroup(
            pldoimatkhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pldoimatkhauLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        plDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plDangXuatMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                plDangXuatMousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel7.setText("Đăng Xuất");

        javax.swing.GroupLayout plDangXuatLayout = new javax.swing.GroupLayout(plDangXuat);
        plDangXuat.setLayout(plDangXuatLayout);
        plDangXuatLayout.setHorizontalGroup(
            plDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plDangXuatLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(64, 64, 64))
        );
        plDangXuatLayout.setVerticalGroup(
            plDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(plkhuyenmai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pldoimatkhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(plThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(plSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(plbanhang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(plhoadon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(plnhanvienn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(plDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(plThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plbanhang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plhoadon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plnhanvienn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plkhuyenmai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pldoimatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(plDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 210, 460));

        jPanel3.setBackground(new java.awt.Color(238, 109, 14));

        jPanel4.setBackground(new java.awt.Color(255, 51, 51));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel8.setText("X");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8)
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banaonam/icon/image icon/Image/Hinh/Unknown person.png"))); // NOI18N

        lblTenNV.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblTenNV.setText("jLabel11");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(945, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(15, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTenNV)
                        .addGap(26, 26, 26))))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 90));

        jDesktopPane1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 900, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1109, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void plThongKeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plThongKeMousePressed
        plbanhang.setBackground(maugoc);
        plkhuyenmai.setBackground(maugoc);
        pldoimatkhau.setBackground(maugoc);
        plnhanvienn.setBackground(maugoc);
        plThongKe.setBackground(mauclick);
        plhoadon.setBackground(maugoc);
        plSanPham.setBackground(maugoc);


    }//GEN-LAST:event_plThongKeMousePressed

    private void plSanPhamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plSanPhamMousePressed
        plbanhang.setBackground(maugoc);
        plkhuyenmai.setBackground(maugoc);
        pldoimatkhau.setBackground(maugoc);
        plnhanvienn.setBackground(maugoc);
        plThongKe.setBackground(maugoc);
        plhoadon.setBackground(maugoc);
        plSanPham.setBackground(mauclick);


    }//GEN-LAST:event_plSanPhamMousePressed

    private void plbanhangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plbanhangMousePressed
        plbanhang.setBackground(mauclick);
        plkhuyenmai.setBackground(maugoc);
        pldoimatkhau.setBackground(maugoc);
        plnhanvienn.setBackground(maugoc);
        plThongKe.setBackground(maugoc);
        plhoadon.setBackground(maugoc);
        plSanPham.setBackground(maugoc);
    }//GEN-LAST:event_plbanhangMousePressed

    private void plhoadonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plhoadonMousePressed
        plbanhang.setBackground(maugoc);
        plkhuyenmai.setBackground(maugoc);
        pldoimatkhau.setBackground(maugoc);
        plnhanvienn.setBackground(maugoc);
        plThongKe.setBackground(maugoc);
        plhoadon.setBackground(mauclick);
        plSanPham.setBackground(maugoc);
    }//GEN-LAST:event_plhoadonMousePressed

    private void plnhanviennMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plnhanviennMouseClicked
        manhinhnhanvien manhinhnv = new manhinhnhanvien();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(manhinhnv).setVisible(true);
    }//GEN-LAST:event_plnhanviennMouseClicked

    private void plnhanviennMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plnhanviennMousePressed
        plbanhang.setBackground(maugoc);
        plkhuyenmai.setBackground(maugoc);
        pldoimatkhau.setBackground(maugoc);
        plnhanvienn.setBackground(mauclick);
        plThongKe.setBackground(maugoc);
        plhoadon.setBackground(maugoc);
        plSanPham.setBackground(maugoc);
    }//GEN-LAST:event_plnhanviennMousePressed

    private void plkhuyenmaiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plkhuyenmaiMousePressed
        plbanhang.setBackground(maugoc);
        plkhuyenmai.setBackground(mauclick);
        pldoimatkhau.setBackground(maugoc);
        plnhanvienn.setBackground(maugoc);
        plThongKe.setBackground(maugoc);
        plhoadon.setBackground(maugoc);
        plSanPham.setBackground(maugoc);
    }//GEN-LAST:event_plkhuyenmaiMousePressed

    private void plSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plSanPhamMouseClicked
        manhinhSanpham manhinhSP = new manhinhSanpham();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(manhinhSP).setVisible(true);
    }//GEN-LAST:event_plSanPhamMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void plThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plThongKeMouseClicked
        manhinhthongke manhinhtk = new manhinhthongke();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(manhinhtk).setVisible(true);
    }//GEN-LAST:event_plThongKeMouseClicked

    private void plbanhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plbanhangMouseClicked
        manhinhhoadon manhinhhd = new manhinhhoadon();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(manhinhhd).setVisible(true);
    }//GEN-LAST:event_plbanhangMouseClicked

    private void plhoadonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plhoadonMouseClicked
        manhinhdanhsachhd manhinhhd = new manhinhdanhsachhd();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(manhinhhd).setVisible(true);
    }//GEN-LAST:event_plhoadonMouseClicked

    private void plDangXuatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plDangXuatMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_plDangXuatMousePressed

    private void pldoimatkhauMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pldoimatkhauMousePressed
        manhinhdoimatkhau manhinhdmt = new manhinhdoimatkhau();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(manhinhdmt).setVisible(true);
    }//GEN-LAST:event_pldoimatkhauMousePressed

    private void plkhuyenmaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plkhuyenmaiMouseClicked
        khuyenmailFrame manhinhkm = new khuyenmailFrame();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(manhinhkm).setVisible(true);
    }//GEN-LAST:event_plkhuyenmaiMouseClicked

    private void pldoimatkhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pldoimatkhauMouseClicked
        plbanhang.setBackground(maugoc);
        plkhuyenmai.setBackground(maugoc);
        pldoimatkhau.setBackground(mauclick);
        plnhanvienn.setBackground(maugoc);
        plThongKe.setBackground(maugoc);
        plhoadon.setBackground(maugoc);
        plSanPham.setBackground(maugoc);
    }//GEN-LAST:event_pldoimatkhauMouseClicked

    private void plDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plDangXuatMouseClicked
        int chon = JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng xuất không ? ");
        if (chon != JOptionPane.YES_OPTION) {
            return;
        } else {
            setVisible(false);
            new DangNhapJFrame().setVisible(true);
        }
    }//GEN-LAST:event_plDangXuatMouseClicked

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
            java.util.logging.Logger.getLogger(manhinhchinhJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manhinhchinhJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manhinhchinhJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manhinhchinhJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manhinhchinhJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbgio;
    public static javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblTenNV;
    private javax.swing.JLabel lbngaythang;
    private javax.swing.JPanel plDangXuat;
    private javax.swing.JPanel plSanPham;
    private javax.swing.JPanel plThongKe;
    private javax.swing.JPanel plbanhang;
    private javax.swing.JPanel pldoimatkhau;
    private javax.swing.JPanel plhoadon;
    private javax.swing.JPanel plkhuyenmai;
    private javax.swing.JPanel plnhanvienn;
    // End of variables declaration//GEN-END:variables

    public void ngaythangnamGio() {
        new Thread() {
            public void run() {
                while (true) {
                    LocalDate today = LocalDate.now();
                    lbngaythang.setText(today.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                    Calendar ca = new GregorianCalendar();
                    int hour = ca.get(Calendar.HOUR);
                    int min = ca.get(Calendar.MINUTE);
                    int sec = ca.get(Calendar.SECOND);
                    int AM_PM = ca.get(Calendar.AM_PM);
                    String day_night;
                    if (AM_PM == 1) {
                        day_night = "PM";
                    } else {
                        day_night = "AM";
                    }
                    lbgio.setText(hour + ":" + min + ":" + sec + ":" + day_night);
                }
            }
        }.start();
    }

}
