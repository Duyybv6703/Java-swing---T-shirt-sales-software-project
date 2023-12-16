
package banaonam.view;

import banaonam.model.hoadon;
import banaonam.model.hoadonchitiet;
import banaonam.model.sanphamchitiet;
import banaonam.sevice.hoadonchitietservice;
import banaonam.sevice.hoadonservice;
import banaonam.sevice.khachhangservice;
import banaonam.sevice.khuyenmaiService;
import banaonam.sevice.nhanvienservice;
import banaonam.sevice.sanphamchitietService;
import banaonam.sevice.sanphamservice;
import banaonam.sevice.taikhoanservice;
import static banaonam.view.DangNhapJFrame.txtUser;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import static banaonam.view.manhinhchinhJFrame.lblMaNV;


public class manhinhhoadon extends javax.swing.JInternalFrame {

   
    sanphamchitietService serviceSPCT = new sanphamchitietService();
    hoadonservice serviceHD = new hoadonservice();
    taikhoanservice serviceTK = new taikhoanservice();
    nhanvienservice serviceNV = new nhanvienservice();
    hoadonchitietservice serviceHDCT = new hoadonchitietservice();
    sanphamservice serviceSP = new sanphamservice();
    khachhangservice serviceKH = new khachhangservice();
    khuyenmaiService serKM = new khuyenmaiService();

    int index;
    int tongTien = 0;
    int soSP = serviceSPCT.getCount();

    int trang = 1, tongTrang;

    public manhinhhoadon() {
        initComponents();

        setlaiborder();
        if (soSP / 3 == 0) {
            tongTrang = soSP / 3;
        } else {
            tongTrang = soSP / 3 + 1;
        }

        fillTableSP(serviceSPCT.getallsanphamchitiet(1));
        lblPage.setText("1" + "/" + tongTrang);
        fillHoaDon(serviceHD.getAllHD());
        lblMaNV.setText(serviceTK.getMaTK(txtUser.getText()) + "");

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        tblHoaDOn = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        lblTrang = new javax.swing.JLabel();
        lblPage = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblGioHang = new javax.swing.JTable();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        btnThanhToan = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        txtMaHD = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTenKH = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txttenNV = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNgayTao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTienKhachDua = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTienThua = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtKhuyenMai = new javax.swing.JTextField();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();

        tblHoaDOn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã HD", "Mã NV", "Trạng thái", "Ngày tạo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
        jScrollPane3.setViewportView(tblHoaDOn);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã SP", "Tên SP", "Màu sắc", "Chất liệu", "Size", "Giá", "Số lượng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
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
        jScrollPane1.setViewportView(tblSanPham);

        jToggleButton5.setForeground(new java.awt.Color(238, 109, 14));
        jToggleButton5.setText("|<");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        jToggleButton6.setForeground(new java.awt.Color(238, 109, 14));
        jToggleButton6.setText(">|");
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPage, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton6)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton6)
                            .addComponent(lblPage, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton5))
                        .addGap(5, 5, 5)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Giỏ hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        tblGioHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ma HDCT", "Mã SP", "Tên SP", "Màu sắc", "Chất liệu", "Size", "Số lượng", "Giá", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGioHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGioHangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblGioHang);

        jToggleButton2.setBackground(new java.awt.Color(0, 0, 0));
        jToggleButton2.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton2.setText("Sửa");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jToggleButton3.setBackground(new java.awt.Color(0, 0, 0));
        jToggleButton3.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton3.setText("Xóa");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButton2)
                .addGap(31, 31, 31)
                .addComponent(jToggleButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton2)
                    .addComponent(jToggleButton3)))
        );

        jToggleButton1.setBackground(new java.awt.Color(51, 51, 51));
        jToggleButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setText("Tạo");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hóa đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        btnThanhToan.setBackground(new java.awt.Color(0, 0, 0));
        btnThanhToan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnThanhToan.setForeground(new java.awt.Color(255, 255, 255));
        btnThanhToan.setText("Thanh toán");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Mã HD");

        txtMaHD.setEditable(false);
        txtMaHD.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtMaHD.setPreferredSize(new java.awt.Dimension(8, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Tên khách hàng");

        txtTenKH.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtTenKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenKHActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Tên nhân viên");

        txttenNV.setEditable(false);
        txttenNV.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txttenNV.setPreferredSize(new java.awt.Dimension(8, 20));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Ngày tạo");

        txtNgayTao.setEditable(false);
        txtNgayTao.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtNgayTao.setPreferredSize(new java.awt.Dimension(8, 20));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Tổng tiền");

        txtTongTien.setEditable(false);
        txtTongTien.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtTongTien.setPreferredSize(new java.awt.Dimension(8, 20));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Tiền khách đưa");

        txtTienKhachDua.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtTienKhachDua.setPreferredSize(new java.awt.Dimension(8, 20));
        txtTienKhachDua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTienKhachDuaMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Tiền thừa");

        txtTienThua.setEditable(false);
        txtTienThua.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtTienThua.setPreferredSize(new java.awt.Dimension(8, 20));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Số điện thoại");

        txtSDT.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtSDT.setPreferredSize(new java.awt.Dimension(8, 20));
        txtSDT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSDTMouseClicked(evt);
            }
        });
        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("khuyến mãi");

        txtKhuyenMai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtKhuyenMaiMouseClicked(evt);
            }
        });
        txtKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKhuyenMaiActionPerformed(evt);
            }
        });
        txtKhuyenMai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtKhuyenMaiKeyReleased(evt);
            }
        });

        jToggleButton7.setBackground(new java.awt.Color(0, 0, 0));
        jToggleButton7.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton7.setText("Áp");
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThanhToan)
                    .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTienKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 29, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(52, 52, 52)
                        .addComponent(txtTienThua, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(47, 47, 47)
                            .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtKhuyenMai, txtMaHD, txtNgayTao, txtSDT, txtTenKH, txtTienKhachDua, txtTienThua, txtTongTien, txttenNV});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTienKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton7))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTienThua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(20, 20, 20)
                .addComponent(btnThanhToan)
                .addGap(23, 23, 23))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jToggleButton7, txtKhuyenMai, txtMaHD, txtNgayTao, txtSDT, txtTenKH, txtTienKhachDua, txtTienThua, txtTongTien, txttenNV});

        jToggleButton4.setBackground(new java.awt.Color(0, 0, 0));
        jToggleButton4.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton4.setText("+");
        jToggleButton4.setPreferredSize(new java.awt.Dimension(39, 25));
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(67, Short.MAX_VALUE)
                        .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        // TODO add your handling code here:
        if (!txtMaHD.getText().isEmpty()) {
            int nhapSL = Integer.parseInt(JOptionPane.showInputDialog("Mời nhập số lượng"));
            index = tblSanPham.getSelectedRow();

            sanphamchitiet spct = serviceSPCT.getallsanphamchitiet(trang).get(index);
            int soluong = spct.getSOLUONG();

            // Thêm số lượng, check và fill lên
            if (nhapSL <= soluong && nhapSL > 0) {

                hoadonchitiet hdct = new hoadonchitiet();
                int maSPCT = serviceSPCT.getMaSPCT(spct.getMau(), spct.getChatlieu(), spct.getSIZE(),
                        spct.getMASP());
                int maHD = Integer.parseInt(txtMaHD.getText());
                int tongTienSP = spct.getThanhTien(spct.getGIA(), nhapSL);
                int soLuong = nhapSL;

                hdct.setMaCTSP(maSPCT);
                System.out.println("" + maSPCT);
                System.out.println("" +tongTienSP);

                hdct.setMaHD(maHD);
                hdct.setTongTien(tongTienSP);
                hdct.setSoLuong(soLuong);
                System.out.println("" + soLuong);
                hdct.setTrangThai("Chưa thanh toán");

                if (serviceHDCT.checkTrungCTSP(maHD, maSPCT) != null) {
                    hoadonchitiet hdct1 = serviceHDCT.checkTrungCTSP(maHD, maSPCT);
                    serviceHDCT.upfateSL(hdct1, hdct1.getSoLuong() + nhapSL);
                    fillTableGioHang(serviceHDCT.getHDByMAHD(maHD));
                    serviceSPCT.updateSL(maSPCT, soluong - nhapSL);
                    System.out.println(" check 1");
                    System.out.println(" " + hdct1.getMaHDCT());
                    //serviceSPCT.updateSL(maSPCT, soluong - nhapSL);
                    fillTableSP(serviceSPCT.getallsanphamchitiet(trang));

                } else {
                    if (serviceHDCT.addHDCT(hdct) != 0) {

                        fillTableGioHang(serviceHDCT.getHDByMAHD(maHD));
                        serviceSPCT.updateSL(maSPCT, soluong - nhapSL);
                        fillTableSP(serviceSPCT.getallsanphamchitiet(trang));

                    } else {
                        JOptionPane.showMessageDialog(this, "Lỗi");
                    }
                }

                // Thêm sản phẩm vào hóa đơn chi tiết
                /*for (sanphamchitiet x : listGioHang) {
                hoadonchitiet hdct = new hoadonchitiet();
                int maSPCT = serviceSPCT.getMaSPCT(x.getMau(), x.getChatlieu(), x.getSIZE(), x.getMASP());
                int maHD = Integer.parseInt(txtMaHD.getText());
                double tongTienSP = x.getThanhTien(x.getGIA(), x.getSOLUONG());
                int soLuong = x.getSOLUONG();

                hdct.setMaCTSP(maSPCT);
                System.out.println("" + maSPCT);
                hdct.setMaHD(maHD);
                hdct.setTongTien(tongTienSP);
                hdct.setSoLuong(soLuong);
                System.out.println("" + soLuong);
                hdct.setTrangThai("Chưa thanh toán");
                hdct.setGia(Double.valueOf(x.getGIA()));
                serviceHDCT.addHDCT(hdct);
                int soLuongGoc = serviceSPCT.getSLSPCT(maSPCT);
                serviceSPCT.updateSL(maSPCT, soLuongGoc - soLuong);
                System.out.println("" + maSPCT);
                System.out.println("" + soLuongGoc);
                System.out.println("" + soLuong);
            } */
                // Tinh tien
                tinhTien();
            } else {
                JOptionPane.showMessageDialog(this, "Số lượng không hợp lệ");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn hóa đơn");
        }


    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        // Tạo 1 hóa đơn rỗng
        hoadon hd = new hoadon();
        DangNhapJFrame dangNhap = new DangNhapJFrame();

        int maTK = Integer.parseInt(lblMaNV.getText());
        int maNV = serviceNV.getMaNV(maTK);
        LocalDate now = LocalDate.now();

        String trangThai = "Chờ thanh toán";
        int maKH = 1;

        // THêm  các dữ liệu vào hóa đơn
        hd.setMaKH(maKH);
        System.out.println("" + maKH);
        hd.setMaNV(maNV);
        System.out.println("" + maNV);
        hd.setNgayTao(now + "");
        System.out.println("" + now);
        hd.setTrangThai(trangThai);
        System.out.println("" + trangThai);

        if (serviceHD.getAllHD().size() < 5) {
            if (serviceHD.addHD(hd) != 0) {
                fillHoaDon(serviceHD.getAllHD());
            } else {
                JOptionPane.showMessageDialog(this, "Lỗi");
            }
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        // TODO add your handling code here:
        if (checkFormHD()) {
            if (serviceKH.getBySDT(txtSDT.getText()) == null) {
                JOptionPane.showMessageDialog(this, "Khách hàng chưa tồn tại, hãy thêm khách hàng");

            } else {

                JOptionPane.showMessageDialog(this, "Thanh toán thành công");
                for (hoadonchitiet x : serviceHDCT.getHDByMAHD(Integer.parseInt(txtMaHD.getText()))) {
                    serviceHDCT.updateTrangThai(x, "Đã thanh toán");
                }
                if (serKM.FindGiam(txtKhuyenMai.getText()) != null) {
                    serviceHD.updateHD(serviceKH.getMaKH(txtSDT.getText()), Integer.parseInt(txtMaHD.getText()),
                            Double.parseDouble(txtTongTien.getText()));
                    txtNgayTao.setText("");
                    txtMaHD.setText("");
                    txtTienKhachDua.setText("");
                    txtTienThua.setText("");
                    txttenNV.setText("");
                    txtTongTien.setText("");
                    txtTenKH.setText("");
                    txtSDT.setText("");
                } else {
                    serviceHD.updateHD(serviceKH.getMaKH(txtSDT.getText()), Integer.parseInt(txtMaHD.getText()),
                            Double.parseDouble(txtTongTien.getText()));
                    txtNgayTao.setText("");
                    txtMaHD.setText("");
                    txtTienKhachDua.setText("");
                    txtTienThua.setText("");
                    txttenNV.setText("");
                    txtTongTien.setText("");
                    txtTenKH.setText("");
                    txtSDT.setText("");
                }

                System.out.println("" + serviceKH.getMaKH(txtSDT.getText()));
                fillTableGioHang(serviceHDCT.getHDByMAHD(0));
                fillHoaDon(serviceHD.getAllHD());

            }
        }


    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void tblHoaDOnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDOnMouseClicked
        // TODO add your handling code here:
        index = tblHoaDOn.getSelectedRow();
        hoadon hd = serviceHD.getAllHD().get(index);

        txtMaHD.setText(hd.getMaHD() + "");
        txtNgayTao.setText(hd.getNgayTao());
        txttenNV.setText(serviceNV.tenNV(hd.getMaNV()));
        fillTableGioHang(serviceHDCT.getHDByMAHD(Integer.parseInt(txtMaHD.getText())));

        if (serviceHDCT.getHDByMAHD(hd.getMaHD()).size() > 0) {
            for (hoadonchitiet x : serviceHDCT.getHDByMAHD(hd.getMaHD())) {
                tongTien += x.getThanhTien(x.getGia(), x.getSoLuong());

            }
            txtTongTien.setText("" + tongTien);
            tongTien = 0;
        } else {
            txtTongTien.setText("" + 0);
        }

    }//GEN-LAST:event_tblHoaDOnMouseClicked

    private void txtTienKhachDuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTienKhachDuaMouseClicked
        // TODO add your handling code here:
        if (!txtTienKhachDua.getText().isEmpty()) {
            if (Double.parseDouble(txtTienKhachDua.getText()) >= Double.parseDouble(txtTongTien.getText())) {
                String tienThua = String.valueOf(Double.parseDouble(txtTienKhachDua.getText()) - Double.parseDouble(txtTongTien.getText()));
                txtTienThua.setText(tienThua);
            } else {
                JOptionPane.showMessageDialog(this, "Số tiền không đủ");
            }
        }
    }//GEN-LAST:event_txtTienKhachDuaMouseClicked

    private void tblGioHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGioHangMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_tblGioHangMouseClicked

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:

        int slSua = Integer.parseInt(JOptionPane.showInputDialog("Mời nhập số lượng").toString());
        // Vị trí click trên table Giỏ hàng
        index = tblGioHang.getSelectedRow();
        // Lấy ra hoadonchitiet đuợc click
        hoadonchitiet hdct = serviceHDCT.getHDByMAHD(Integer.parseInt(txtMaHD.getText())).get(index);

        // sanphamchitiet của hoadonchitiet trên
        sanphamchitiet spct = serviceSPCT.getMaSPCT(serviceHDCT.getMaCTSP(hdct.getMaHDCT()));

        if (slSua <= spct.getSOLUONG() + hdct.getSoLuong() && slSua > 0) {
            serviceSPCT.updateSL(serviceHDCT.getMaCTSP(hdct.getMaHDCT()), (hdct.getSoLuong() + spct.getSOLUONG()) - slSua);
            serviceHDCT.upfateSL(hdct, slSua, spct.getGIA() * slSua);

            fillTableSP(serviceSPCT.getallsanphamchitiet(trang));
            fillTableGioHang(serviceHDCT.getHDByMAHD(Integer.parseInt(txtMaHD.getText())));
            tinhTien();
        } else {
            JOptionPane.showMessageDialog(this, "Nhập quá số lượng");
        }


    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        // TODO add your handling code here:

        // Vị trí click trên table Giỏ hàng
        index = tblGioHang.getSelectedRow();
        // Lấy ra hoadonchitiet đuợc click
        hoadonchitiet hdct = serviceHDCT.getHDByMAHD(Integer.parseInt(txtMaHD.getText())).get(index);

        // sanphamchitiet của hoadonchitiet trên
        sanphamchitiet spct = serviceSPCT.getMaSPCT(serviceHDCT.getMaCTSP(hdct.getMaHDCT()));

        // Cập nhật lại số lượng trong table sanphamchitiet
        serviceSPCT.updateSL(serviceHDCT.getMaCTSP(hdct.getMaHDCT()), spct.getSOLUONG() + hdct.getSoLuong());
        ///System.out.println(" "+serviceHDCT.getMaCTSP(hdct.getMaHDCT()));
        // Nếu xóa thành công
        if (serviceHDCT.deleteHDCT(hdct.getMaHDCT()) != 0) {
            fillTableGioHang(serviceHDCT.getHDByMAHD(Integer.parseInt(txtMaHD.getText())));
            // serviceSPCT.updateSL(serviceHDCT.getMaCTSP(hdct.getMaHDCT()), 10);
            int maHDCT = hdct.getMaHDCT();
            System.out.println("" + maHDCT);
            fillTableSP(serviceSPCT.getallsanphamchitiet(trang));
            tinhTien();

        } else {
            JOptionPane.showMessageDialog(this, "Looix");
            /*System.out.println("" + hdct.getMaHDCT());
            System.out.println("" + hdct.getMaSP());
            System.out.println("" + hdct.getTenSP());
            System.out.println("" + hdct.getSoLuong());
            System.out.println("" + hdct.getGia()); */
        }

    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    private void txtSDTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSDTMouseClicked
        // TODO add your handling code here:
        if (!txtSDT.getText().isEmpty()) {
            String tenKH = serviceKH.getTenKH(txtSDT.getText());
            txtTenKH.setText(tenKH);
        }

    }//GEN-LAST:event_txtSDTMouseClicked

    private void txtTenKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenKHActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTenKHActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
        JDialog p = new JDialog();
        p.setSize(400, 400);
        p.add(new themNhanhKH());
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        // TODO add your handling code here:       

        if (trang < tongTrang) {
            trang = 1;
        } else {
            trang--;
        }

        fillTableSP(serviceSPCT.getallsanphamchitiet(trang));
        lblPage.setText("" + trang + "/" + tongTrang);
        System.out.println("" + trang);
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        // TODO add your handling code here:

        if (trang >= tongTrang) {
            trang = tongTrang;
        } else {
            trang++;
        }
        lblPage.setText("" + trang + "/" + tongTrang);
        fillTableSP(serviceSPCT.getallsanphamchitiet(trang));
        System.out.println("" + tongTrang);
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void txtKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKhuyenMaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKhuyenMaiActionPerformed

    private void txtKhuyenMaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtKhuyenMaiMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_txtKhuyenMaiMouseClicked

    private void txtKhuyenMaiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKhuyenMaiKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtKhuyenMaiKeyReleased

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        // TODO add your handling code here:

        if (serKM.getByID(txtKhuyenMai.getText()) != serviceHD.getMaKM(Integer.parseInt(txtMaHD.getText()))) {
            if (serKM.FindGiam(txtKhuyenMai.getText()) != null) {

                if (serviceHD.updateHDKM(serKM.getByID(txtKhuyenMai.getText()), Integer.parseInt(txtMaHD.getText())) != 0) {
                    ApVoucher();
                } else {
                    JOptionPane.showMessageDialog(this, "Không thể áp dụng khuyến mại này");
                }

                /*if (serKM.FindMaTheoPhanTram(txtKhuyenMai.getText()) != null) {
                System.out.println("" + serKM.FindMaTheoPhanTram(txtKhuyenMai.getText()));
                System.out.println("" + (txtKhuyenMai.getText()));
                System.out.println("" + serKM.FindPhanTram(txtKhuyenMai.getText()));
                int PhanTramGiam = Integer.parseInt(serKM.FindPhanTram(txtKhuyenMai.getText()));

                txtTongTien.setText("" + (tt - (tt * PhanTramGiam) / 100));
                JOptionPane.showMessageDialog(this, "Áp dụng thành công, giảm " + PhanTramGiam + "% tổng tiền hóa đơn");
            } else {
                txtTongTien.setText("" + (tt - Integer.parseInt(serKM.FindGiam(txtKhuyenMai.getText()))));
                JOptionPane.showMessageDialog(this, "Áp dụng thành công, giảm " + serKM.FindGiam(txtKhuyenMai.getText()) + " VND");
            } */
            } else {
                JOptionPane.showMessageDialog(this, "Không thành công");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Mã khuyến mại đã đc áp dụng cho hóa đơn này");
        }


    }//GEN-LAST:event_jToggleButton7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnThanhToan;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JLabel lblPage;
    private javax.swing.JLabel lblTrang;
    private javax.swing.JTable tblGioHang;
    private javax.swing.JTable tblHoaDOn;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtKhuyenMai;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtNgayTao;
    public static javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtTienKhachDua;
    private javax.swing.JTextField txtTienThua;
    private javax.swing.JTextField txtTongTien;
    private javax.swing.JTextField txttenNV;
    // End of variables declaration//GEN-END:variables

    private void fillTableSP(List<sanphamchitiet> list) {
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel) tblSanPham.getModel();
        model.setRowCount(0);
        int i = 1;
        for (sanphamchitiet x : list) {

            Object obj[] = {
                i++,
                x.getMASP(),
                x.getTensp(),
                x.getSIZE(),
                x.getMau(),
                x.getChatlieu(),
                x.getGIA(),
                x.getSOLUONG(),};
            model.addRow(obj);

        }

    }

    private void fillTableGioHang(List<hoadonchitiet> list) {
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel) tblGioHang.getModel();
        model.setRowCount(0);
        for (hoadonchitiet x : list) {
            
            model.addRow(new Object[]{x.getMaHDCT(), x.getMaSP(),
                x.getTenSP(),
                x.getMau(),
                x.getCl(),
                x.getSize(),
                x.getSoLuong(),
                x.getGia(),
                x.getThanhTien(x.getGia(), x.getSoLuong())
                });
        }
    }

    private void fillHoaDon(List<hoadon> list) {
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel) tblHoaDOn.getModel();
        model.setRowCount(0);
        int i = 1;
        for (hoadon x : list) {
            model.addRow(new Object[]{
                i++, x.getMaHD(), serviceNV.tenNV(x.getMaNV()), x.getTrangThai(), x.getNgayTao()});
        }

    }

    private boolean checkFormHD() {
        if (txtMaHD.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chưa có hóa đơn cho thanh toán này");
            return false;
        }
        if (txtSDT.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chưa có khách hàng cho thanh toán này");
            txtSDT.requestFocus();
            return false;
        }
        if (txtTienKhachDua.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập tiền khách đưa");
            txtTienKhachDua.requestFocus();
            return false;
        }
        try {
            Double.parseDouble(txtTienKhachDua.getText());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Tiền phải là số");
            txtTienKhachDua.requestFocus();
            return false;
        }
        if (txtTienThua.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Hệ thống đang tính, vui lòng chờ");
            txtTienKhachDua.requestFocus();
            return false;
        }

        return true;

    }

    private void tinhTien() {
        if (serviceHDCT.getHDByMAHD(Integer.parseInt(txtMaHD.getText())).size() > 0) {
            for (hoadonchitiet x : serviceHDCT.getHDByMAHD(Integer.parseInt(txtMaHD.getText()))) {
                tongTien += x.getThanhTien(x.getGia(), x.getSoLuong());

            }

            txtTongTien.setText("" + tongTien);
            System.out.println("" + txtTongTien.getText());
            tongTien = 0;

        } else {
            txtTongTien.setText("" + 0);
        }
    }

    private double ApVoucher() {
        double tt = Double.parseDouble(txtTongTien.getText());
        if (serKM.FindMaTheoPhanTram(txtKhuyenMai.getText()) != null) {
            System.out.println("" + serKM.FindMaTheoPhanTram(txtKhuyenMai.getText()));
            System.out.println("" + (txtKhuyenMai.getText()));
            System.out.println("" + serKM.FindPhanTram(txtKhuyenMai.getText()));
            int PhanTramGiam = Integer.parseInt(serKM.FindPhanTram(txtKhuyenMai.getText()));

            txtTongTien.setText("" + (tt - (tt * PhanTramGiam/ 100) ));
            JOptionPane.showMessageDialog(this, "Áp dụng thành công, giảm " + PhanTramGiam + "% tổng tiền hóa đơn");
            return (tt - (tt * PhanTramGiam/ 100) );
        } else {
            txtTongTien.setText("" + (tt - Integer.parseInt(serKM.FindGiam(txtKhuyenMai.getText()))));
            JOptionPane.showMessageDialog(this, "Áp dụng thành công, giảm " + serKM.FindGiam(txtKhuyenMai.getText()) + " VND");
            return (tt - Integer.parseInt(serKM.FindGiam(txtKhuyenMai.getText())));
        }
    }

    private void setlaiborder() {
        setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        setSize(900, 460);
    }
}
