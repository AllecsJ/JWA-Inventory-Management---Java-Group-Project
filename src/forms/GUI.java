/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import entities.Cars;
import entities.Customer;
import java.util.ArrayList;
import java.util.List;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author rjbro
 */
public class GUI extends javax.swing.JFrame {

    Connection con;
    Statement stmt;
    ResultSet rs;
    int curRow = 0;
    
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }

    public void DoConnect() {
    }
    
    private List<Cars> getCars() {
        List<Cars> carList = new ArrayList();
        Cars car;
        
        car = new Cars();
        car.setCarName("Aston Martin Vanquish");
        car.setPhotoPath("/images/Aston_Martin-Vanquish.jpg");
        car.setCarPrice(290475);
        car.setCarDescripton("Aston Martin calls the Vanquish a “super grand touring” machine, not a super sports car, but it’s so beautiful that we don’t care what Aston calls it.");
        car.setInstock(2);
        car.setYear(2018);
        car.setMileage(0);
        car.setStatus("NEW");
        car.setPrev_owners(0);
        
        carList.add(car);
        
        car = new Cars();
        car.setCarName("Audi R8 V10 Plus");
        car.setPhotoPath("/images/Audi_R8.jpg");
        car.setCarPrice(166150);
        car.setCarDescripton("Audi’s luscious R8 is beautiful to behold, easy to live with, and simply marvelous to drive—everything you’d want in a sports car.");
        car.setInstock(5);
        car.setYear(2017);
        car.setMileage(0);
        car.setStatus("NEW");
        car.setPrev_owners(0);
        carList.add(car);
        
        car = new Cars();
        car.setCarName("Ferrari 488 GTB");
        car.setPhotoPath("/images/Ferrari_488GTB.jpg");
        car.setCarPrice(256550);
        car.setCarDescripton("With a twin-turbo 3.9-liter V-8 located just behind the driver’s seat, the 488GTB generates a sonorous wail and ferocious acceleration all the way to 8000 rpm, where it makes 661 hp.");
        car.setInstock(1);
        car.setYear(2017);
        car.setMileage(0);
        car.setStatus("NEW");
        car.setPrev_owners(0);
        carList.add(car);
        
        car = new Cars();
        car.setCarName("Mazda MX-5 Miata");
        car.setPhotoPath("/images/Mazda_MX-5_Miata.jpg");
        car.setCarPrice(25790);
        car.setCarDescripton("For pure driving bliss, the Miata is tops in many people's book. This legendary two-seater has a 155-hp 2.0-liter four with a six-speed manual; a six-speed automatic is optional. Its use of aluminum helps keep weight down, so the Miata remains eminently flingable in the twists and turns that you’ll surely seek when you hit the road.");
        car.setInstock(5);
        car.setYear(2017);
        car.setMileage(0);
        car.setStatus("NEW");
        car.setPrev_owners(0);
        carList.add(car);
        
        car = new Cars();
        car.setCarName("McLaren 720S");
        car.setPhotoPath("/images/McLaren_720S.jpg");
        car.setCarPrice(288845);
        car.setCarDescripton("McLaren’s know-how with lightweight, aerodynamic, ferocious supercars is undeniable, and the 720S is proof.");
        car.setInstock(2);
        car.setYear(2017);
        car.setMileage(0);
        car.setStatus("NEW");
        car.setPrev_owners(0);
        carList.add(car);
        
        car = new Cars();
        car.setCarName("Mercedes AMG GT C");
        car.setPhotoPath("/images/Mercedes-AMG_GT_C.jpg");
        car.setCarPrice(145995);
        car.setCarDescripton("Sporting an adaptive adjustable suspension, active aerodynamics, and trick rear-axle steering, the track-focused variants of the GT are mesmerizing and marvelous machines.");
        car.setInstock(1);
        car.setYear(2017);
        car.setMileage(0);
        car.setStatus("NEW");
        car.setPrev_owners(0);
        carList.add(car);
        
        car = new Cars();
        car.setCarName("Porsche Cayman GT4");
        car.setPhotoPath("/images/caymangt4.jpg");
        car.setCarPrice(85595);
        car.setCarDescripton("With its race-bred suspension, snarling engine, and aggressive aero add-ons, the Cayman GT4 is the track-day toy we always hoped Porsche would build. Lowered by 1.2 inches with dynamic transmission mounts, the 385-hp 3.8-liter flat-six is offered only with an enthusiast-pleasing six-speed manual");
        car.setInstock(7);
        car.setYear(2017);
        car.setMileage(0);
        car.setStatus("NEW");
        car.setPrev_owners(0);
        carList.add(car);

        car = new Cars();
        car.setCarName("Mitsubishi Lancer Evolution");
        car.setPhotoPath("/images/evo.jpg");
        car.setCarPrice(21595);
        car.setCarDescripton("You don't need a pricey luxury sedan to go fast in a practical four-door. You need an Evo. This particular Evo is custom tuned with over 500hp, so its even more vicious than the original.");
        car.setInstock(1);
        car.setYear(2007);
        car.setMileage(72364);
        car.setStatus("USED");
        car.setPrev_owners(2);
        carList.add(car);
               
        car = new Cars();
        car.setCarName("Jaguar F-Type R");
        car.setPhotoPath("/images/ftype.jpg");
        car.setCarPrice(494195);
        car.setCarDescripton("From its seductively long hood to its steeply raked windshield and wide rear haunches, the F-type is a stunner. Powered by a 296-hp 2.0-liter turbo four-cylinder or a snarling 3.0-liter supercharged V-6 pumping out 340 hp to the rear wheels through a 6-speed manual or an 8-speed automatic.");
        car.setInstock(4);
        car.setYear(2017);
        car.setMileage(0);
        car.setStatus("NEW");
        car.setPrev_owners(0);
        carList.add(car);

        car = new Cars();
        car.setCarName("BMW M3");
        car.setPhotoPath("/images/m3.jpg");
        car.setCarPrice(66495);
        car.setInstock(6);
        car.setYear(2017);
        car.setMileage(0);
        car.setStatus("NEW");
        car.setPrev_owners(0);
        car.setCarDescripton("The M3 is a legend in the world of performance cars, causing enthusiasts to gush when given the chance. Under the hood is a twin-turbo 3.0-liter inline-six that makes 425 hp and 406 lb-ft of torque; it makes glorious sounds all the way to its 7500-rpm redline.");
        carList.add(car);
            
        car = new Cars();
        car.setCarName("Audi RS7");
        car.setPhotoPath("/images/rs7.jpg");
        car.setCarPrice(114875);
        car.setInstock(2);
        car.setYear(2017);
        car.setMileage(0);
        car.setStatus("NEW");
        car.setPrev_owners(0);
        car.setCarDescripton("With a sleek, fastback body, 20-inch wheels and aggressive styling mods, the RS7 could get by on looks alone—but as an RS model, that’s not necessary. This bahn-burner packs a spectacular twin-turbo 4.0-liter V-8 that makes 560 hp, a performance-tuned eight-speed automatic, all-wheel drive, and a lowered suspension.");
        carList.add(car);
        
        return carList;
    }
    
     private List<Customer> getCustomers() {
        List<Customer> custList = new ArrayList();

        try {
            String host = "jdbc:derby://localhost:1527/Bling Bling Cars";
            String uName = "project";
            String uPass = "admin";
            
            con = DriverManager.getConnection(host, uName, uPass);            
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String SQL = "SELECT * FROM Customers";
            rs = stmt.executeQuery(SQL);

            while(rs.next()){
            
                String fname = rs.getString("F_NAME");
                String lname = rs.getString("L_NAME");
                String email = rs.getString("EMAIL");
                String gender = rs.getString("GENDER");
                String tel = rs.getString("PHONE");

                Customer A;

                A = new Customer();
                A.setFname(fname);
                A.setLname(lname);
                A.setEmail(email);
                A.setGender(gender);
                A.setPhone(tel);
                custList.add(A);
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(GUI.this, err.getMessage());
        }

        //return custListA;
        return custList;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        carListSales = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        photoLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descArea = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        unitsInStock = new javax.swing.JTextField();
        totalCost = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        invSales = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        unitCost = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        l_name_r = new javax.swing.JTextField();
        gender_r = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        phone_r = new javax.swing.JTextField();
        f_name_r = new javax.swing.JTextField();
        spinner_r = new javax.swing.JSpinner();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        custList = new javax.swing.JList<>();
        custDB = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        email_r = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        carBuyList = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        descArea2 = new javax.swing.JTextArea();
        container2 = new javax.swing.JPanel();
        photoLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        unitCost2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        totalCost2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        invBuy = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        unitsInStock2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        carListSales.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        carListSales.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        carListSales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carListSalesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(carListSales);

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel3.setText("Inventory");

        container.setBorder(javax.swing.BorderFactory.createTitledBorder("Car Photo"));

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(photoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(photoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        descArea.setEditable(false);
        descArea.setColumns(20);
        descArea.setLineWrap(true);
        descArea.setRows(5);
        descArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Description"));
        jScrollPane2.setViewportView(descArea);

        jLabel4.setText("Units In Stock");

        jLabel15.setText("Total Costs");

        invSales.setText("Begin");
        invSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invSalesActionPerformed(evt);
            }
        });

        jLabel16.setText("Unit Cost");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(invSales)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel16))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(unitsInStock)
                                    .addComponent(totalCost)
                                    .addComponent(unitCost))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(invSales))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(unitsInStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(unitCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(totalCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 109, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Sales", jPanel1);

        jLabel17.setText("First Name");

        jLabel18.setText("Last Name");

        jLabel19.setText("Gender");

        l_name_r.setEditable(false);

        gender_r.setEditable(false);

        jLabel20.setText("Phone:");

        phone_r.setEditable(false);

        f_name_r.setEditable(false);

        spinner_r.setModel(new javax.swing.SpinnerNumberModel(0, null, 10, 1));

        jLabel21.setText("Rate (1-10)");

        custList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        custList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                custListMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(custList);

        custDB.setText("Begin");
        custDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custDBActionPerformed(evt);
            }
        });

        jLabel23.setText("Email:");

        email_r.setEditable(false);
        email_r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_rActionPerformed(evt);
            }
        });

        jLabel22.setText("Last Purchase");

        jTextField1.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(42, 42, 42)
                        .addComponent(jTextField1)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(52, 52, 52)
                                .addComponent(spinner_r))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(phone_r)
                                    .addComponent(gender_r)
                                    .addComponent(l_name_r)
                                    .addComponent(f_name_r, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(253, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(email_r, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(custDB)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(custDB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(f_name_r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(l_name_r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(gender_r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(phone_r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(email_r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinner_r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(208, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Customer Support", jPanel2);

        carBuyList.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        carBuyList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        carBuyList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carBuyListMousePressed(evt);
            }
        });
        jScrollPane5.setViewportView(carBuyList);

        descArea2.setEditable(false);
        descArea2.setColumns(20);
        descArea2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        descArea2.setLineWrap(true);
        descArea2.setRows(5);
        descArea2.setBorder(javax.swing.BorderFactory.createTitledBorder("Description"));
        jScrollPane6.setViewportView(descArea2);

        container2.setBorder(javax.swing.BorderFactory.createTitledBorder("Car Photo"));

        javax.swing.GroupLayout container2Layout = new javax.swing.GroupLayout(container2);
        container2.setLayout(container2Layout);
        container2Layout.setHorizontalGroup(
            container2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(photoLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addContainerGap())
        );
        container2Layout.setVerticalGroup(
            container2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container2Layout.createSequentialGroup()
                .addComponent(photoLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel6.setText("Unit Cost");

        jLabel7.setText("Unit Quantity");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel8.setText("Total Cost");

        jButton1.setText("Purchase");

        jLabel9.setText("Email");

        jLabel10.setText("Last Name");

        jLabel11.setText("First Name");

        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });

        jLabel12.setText("Gender");

        jLabel13.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel13.setText("Inventory");

        jLabel14.setText("Phone");

        invBuy.setText("Begin");
        invBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invBuyActionPerformed(evt);
            }
        });

        jLabel5.setText("Units In Stock");

        unitsInStock2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitsInStock2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addGap(9, 9, 9))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(37, 37, 37)
                                    .addComponent(unitCost2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(totalCost2)
                                            .addComponent(unitsInStock2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel14))
                                    .addGap(30, 30, 30)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField9)
                                        .addComponent(fname)
                                        .addComponent(jTextField7)
                                        .addComponent(jTextField8)
                                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(container2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(invBuy)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(invBuy))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(container2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(unitCost2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(unitsInStock2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(totalCost2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(95, 95, 95))
        );

        jTabbedPane1.addTab("Buy", jPanel4);

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel1.setText("Bling Bling Cars");

        jLabel2.setText("The most prestigious way from point A to B...");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void invSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invSalesActionPerformed
        // TODO add your handling code here:
        DefaultListModel cListModel = new DefaultListModel();

        for (int i = 0; i < getCars().size(); i++) {
            cListModel.addElement(getCars().get(i).getCarName());
        }
        carListSales.setModel(cListModel);
    }//GEN-LAST:event_invSalesActionPerformed

    private void carListSalesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carListSalesMousePressed
        // TODO add your handling code here:
        String carName = carListSales.getSelectedValue();
        for (int i = 0; i < getCars().size(); i++) {

            if (getCars().get(i).getCarName().equals(carName)) {
                String path = getCars().get(i).getPhotoPath();
                photoLabel.setIcon(new ImageIcon(getClass().getResource(path)));

                descArea.setText(getCars().get(i).getCarDescripton());

                unitCost.setText(Integer.toString(getCars().get(i).getCarPrice()));   
                unitsInStock.setText(Integer.toString(getCars().get(i).getInstock()));
                totalCost.setText(Integer.toString((getCars().get(i).getInstock())*(getCars().get(i).getCarPrice())));
            }
        }
    }//GEN-LAST:event_carListSalesMousePressed

    private void invBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invBuyActionPerformed
        // TODO add your handling code here:
        DefaultListModel cListModel = new DefaultListModel();

        for (int i = 0; i < getCars().size(); i++) {
            cListModel.addElement(getCars().get(i).getCarName());
        }
        carBuyList.setModel(cListModel);
    }//GEN-LAST:event_invBuyActionPerformed

    private void carBuyListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carBuyListMousePressed
        // TODO add your handling code here:
        String carName = carBuyList.getSelectedValue();
        for (int i = 0; i < getCars().size(); i++) {

            if (getCars().get(i).getCarName().equals(carName)) {
                String path = getCars().get(i).getPhotoPath();
                photoLabel2.setIcon(new ImageIcon(getClass().getResource(path)));

                descArea2.setText(getCars().get(i).getCarDescripton());

                unitCost2.setText(Integer.toString(getCars().get(i).getCarPrice()));   
                unitsInStock.setText(Integer.toString(getCars().get(i).getInstock()));
                totalCost.setText(Integer.toString((getCars().get(i).getInstock())*(getCars().get(i).getCarPrice())));
            }
        }
    }//GEN-LAST:event_carBuyListMousePressed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void unitsInStock2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitsInStock2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitsInStock2ActionPerformed

    private void custListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_custListMousePressed
        // TODO add your handling code here:
        String custName = custList.getSelectedValue();
        for (int i = 0; i < getCustomers().size(); i++) {

            if (getCustomers().get(i).getFname().equals(custName)) {

                f_name_r.setText(getCustomers().get(i).getFname());
                l_name_r.setText(getCustomers().get(i).getLname());
                gender_r.setText(getCustomers().get(i).getGender());
                phone_r.setText(getCustomers().get(i).getPhone());
                email_r.setText(getCustomers().get(i).getEmail());

            }
        }
    }//GEN-LAST:event_custListMousePressed

    private void custDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custDBActionPerformed
        // TODO add your handling code here:
        DoConnect();

        DefaultListModel custListModel = new DefaultListModel();

        for (int i = 0; i < getCustomers().size(); i++) {
            custListModel.addElement(getCustomers().get(i).getFname());
        }
        custList.setModel(custListModel);
    }//GEN-LAST:event_custDBActionPerformed

    private void email_rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_rActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_rActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> carBuyList;
    private javax.swing.JList<String> carListSales;
    private javax.swing.JPanel container;
    private javax.swing.JPanel container2;
    private javax.swing.JButton custDB;
    private javax.swing.JList<String> custList;
    private javax.swing.JTextArea descArea;
    private javax.swing.JTextArea descArea2;
    private javax.swing.JTextField email_r;
    private javax.swing.JTextField f_name_r;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField gender_r;
    private javax.swing.JButton invBuy;
    private javax.swing.JButton invSales;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField l_name_r;
    private javax.swing.JTextField phone_r;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JLabel photoLabel2;
    private javax.swing.JSpinner spinner_r;
    private javax.swing.JTextField totalCost;
    private javax.swing.JTextField totalCost2;
    private javax.swing.JTextField unitCost;
    private javax.swing.JTextField unitCost2;
    private javax.swing.JTextField unitsInStock;
    private javax.swing.JTextField unitsInStock2;
    // End of variables declaration//GEN-END:variables
}
