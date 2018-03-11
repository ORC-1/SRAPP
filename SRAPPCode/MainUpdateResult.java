/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SRAPPCode;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ORC1
 */
public class MainUpdateResult extends javax.swing.JFrame {
    private Connection con;
    private PreparedStatement prs;
    private ResultSet rs;
    public String T;
    public String G;
    public int GS;
    public String PR;
    public int SE;
    private int rowsAffected;

    /**
     * Creates new form MainUpdateResult
     */
    public MainUpdateResult() {
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
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        SID = new javax.swing.JTextField();
        SNA = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        SSNA = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(42, 148, 251));

        jComboBox1.setEditable(true);
        jComboBox1.setMaximumRowCount(25);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Math", "English", "Biology", "Physic", "Chemistry", "Commerce", "Account", "Igbo", "Yoruba", "Hausa", "French", "Government", "Agricultural Science", "Geography", "Economics", "Literature", "Computer Studies", "CRS", "IRS", "Further mathematics" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jComboBox2.setEditable(true);
        jComboBox2.setMaximumRowCount(40);
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "5", "10", "20", "25", "30", "35", "40", "45", "50", "55", "60", "65", "70", "75", "80", "85", "90", "95", "100" }));
        jComboBox2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/filesave.png"))); // NOI18N
        jButton1.setText("Lock");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search24.png"))); // NOI18N
        jLabel1.setText("    Subjects");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btn3.png"))); // NOI18N
        jLabel2.setText("Score");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jComboBox3.setEditable(true);
        jComboBox3.setMaximumRowCount(20);
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A1", "A2", "A3", "A4", "B1", "B2", "B3", "B4", "C1", "C2", "C3", "C4", "C5", "C6", "C7", "D7", "F9" }));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/editnew.png"))); // NOI18N
        jLabel3.setText("Grade");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3" }));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        jLabel4.setText("Semester");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Promoted", "Promoted On Trial", "Failed" }));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        jLabel5.setText("Promotion");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        jLabel6.setText("Date");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "System Generated" }));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        SID.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        SID.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        SNA.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        SNA.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 12)); // NOI18N
        jLabel9.setText("Student ID");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 12)); // NOI18N
        jLabel8.setText("Student Name");

        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 12)); // NOI18N
        jLabel10.setText("Student Sur-Name");

        SSNA.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        SSNA.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(SNA, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SSNA, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(SID, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(SNA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(SSNA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(SID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jButton3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/2leftarrow.png"))); // NOI18N
        jButton3.setText("Return");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox6)
                    .addComponent(jComboBox4)
                    .addComponent(jComboBox5))
                .addGap(43, 43, 43)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jButton3))
        );

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel7.setText("     UpDate Result");
        jLabel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel7.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(239, 239, 239))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        
        if (jComboBox1.getSelectedItem().equals ("Math")){
     String Topic= "Math";
  this.T = Topic;
  }
  else if (jComboBox1.getSelectedItem().equals ("English")){
     String Topic= "English";
  this.T = Topic;
  }
        else if (jComboBox1.getSelectedItem().equals ("Biology")){
     String Topic= "Biology";
  this.T = Topic;
  }
         else if (jComboBox1.getSelectedItem().equals ("Physic")){
     String Topic= "Physic";
  this.T = Topic;
  }
        else if (jComboBox1.getSelectedItem().equals ("Chemistry")){
     String Topic= "Chemistry";
  this.T = Topic;
  }
   
         else if (jComboBox1.getSelectedItem().equals ("Commerce")){
     String Topic= "Commerce";
  this.T = Topic;
  }
         else if (jComboBox1.getSelectedItem().equals ("Account")){
     String Topic= "Account";
  this.T = Topic;
  }
        else if (jComboBox1.getSelectedItem().equals ("Igbo")){
     String Topic= "Igbo";
  this.T = Topic;
  }
        else if (jComboBox1.getSelectedItem().equals ("Yoruba")){
     String Topic= "Yoruba";
  this.T = Topic;
  }
           else if (jComboBox1.getSelectedItem().equals ("Hausa")){
     String Topic= "Hausa";
  this.T = Topic;
  }
               else if (jComboBox1.getSelectedItem().equals ("French")){
     String Topic= "French";
  this.T = Topic;
  }
        
              else if (jComboBox1.getSelectedItem().equals ("Government")){
     String Topic= "Government";
  this.T = Topic;
  }
          else if (jComboBox1.getSelectedItem().equals ("Agricultural Science")){
     String Topic= "Agricultural Science";
  this.T = Topic;
  }
         else if (jComboBox1.getSelectedItem().equals ("Geography")){
     String Topic= "Geography";
  this.T = Topic;
  }
        else if (jComboBox1.getSelectedItem().equals ("Economics")){
     String Topic= "Economics";
  this.T = Topic;
  }
        
           else if (jComboBox1.getSelectedItem().equals ("Literature")){
     String Topic= "Literature";
  this.T = Topic;
  }
        
        else if (jComboBox1.getSelectedItem().equals ("Computer Studies")){
     String Topic= "Computer Studies";
  this.T = Topic;
  }
           else if (jComboBox1.getSelectedItem().equals ("CRS")){
     String Topic= "CRS";
  this.T = Topic;
  }
         else if (jComboBox1.getSelectedItem().equals ("IRS")){
     String Topic= "IRS";
  this.T = Topic;
  }
          else if (jComboBox1.getSelectedItem().equals ("Further mathematics")){
     String Topic= "Further mathematics";
  this.T = Topic;
  }
     
      
        
        
//        Math, 'English', 'Biology','Physic','Chemistry', 'Commerce', 'Account', 
//'Igbo','Yoruba', 'Hausa',' French', 'Government','Agricultural Science', 
//'Geography', 'Economics','Literature', 'Computer Studies',
// 'CRS', 'IRS','Further mathematics
//        
        
          if (jComboBox3.getSelectedItem().equals ("A1")){
     String Grade= "A1";
  this.G = Grade;
  }
   
          else if (jComboBox3.getSelectedItem().equals ("A2")){
     String Grade= "A2";
  this.G = Grade;
  }
          else if (jComboBox3.getSelectedItem().equals ("A3")){
     String Grade= "A3";
  this.G = Grade;
  }
          else if (jComboBox3.getSelectedItem().equals ("A4")){
     String Grade= "A4";
  this.G = Grade;
  }
          else if (jComboBox3.getSelectedItem().equals ("B1")){
     String Grade= "B1";
  this.G = Grade;
  }
          else if (jComboBox3.getSelectedItem().equals ("B2")){
     String Grade= "B2";
  this.G = Grade;
  }
               else if (jComboBox3.getSelectedItem().equals ("B3")){
     String Grade= "B3";
  this.G = Grade;
  }
               else if (jComboBox3.getSelectedItem().equals ("B4")){
     String Grade= "B4";
  this.G = Grade;
  }
               else if (jComboBox3.getSelectedItem().equals ("C1")){
     String Grade= "C1";
  this.G = Grade;
  }
                     else if (jComboBox3.getSelectedItem().equals ("C2")){
     String Grade= "C2";
  this.G = Grade;
  }
                     else if (jComboBox3.getSelectedItem().equals ("C2")){
     String Grade= "C2";
  this.G = Grade;
  }
                     else if (jComboBox3.getSelectedItem().equals ("C3")){
     String Grade= "C4";
  this.G = Grade;
  }
                     else if (jComboBox3.getSelectedItem().equals ("C4")){
     String Grade= "C4";
  this.G = Grade;
  }
                     else if (jComboBox3.getSelectedItem().equals ("C5")){
     String Grade= "C5";
  this.G = Grade;
  }
                     else if (jComboBox3.getSelectedItem().equals ("C6")){
     String Grade= "C6";
  this.G = Grade;
  }
                     else if (jComboBox3.getSelectedItem().equals ("C7")){
     String Grade= "C7";
  this.G = Grade;
  }
                     else if (jComboBox3.getSelectedItem().equals ("D7")){
     String Grade= "D7";
  this.G = Grade;
  }
                     else if (jComboBox3.getSelectedItem().equals ("F9")){
     String Grade= "F9";
  this.G = Grade;
  }
       else{
                    String U2 = (String)jComboBox3.getSelectedItem().toString();
                    this.G = U2;
                     
                     }
//        A1, A2, A3, A4, B1, B2, B3, B4, C1, C2, C3, C4, C5, C6, C7, D7, F9
          String AS = this.jComboBox2.getSelectedItem().toString();

        this.GS = Integer.parseInt(AS);
        
        String SEM = this.jComboBox4.getSelectedItem().toString();

        this.SE = Integer.parseInt(SEM);
        
        String PRO = this.jComboBox5.getSelectedItem().toString();
        this.PR = PRO;
        
        
        try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName= SRAPP DB ", "SA", "ohmslaw");
            prs = con.prepareStatement("insert into ReportCard (StudentId,Subjects,Grade,GradeScore,Semester,PromotionStatus) values(?,?,?,?,?,?)");
//        rs.next();
           
            prs.setInt(1, Integer.parseInt(SID.getText()));
             prs.setString(2, T);
              prs.setString(3, G);
             prs.setInt(4, GS);
             prs.setInt(5, SE);
             prs.setString(6, PR);
              rs = prs.executeQuery();
              
              
         rowsAffected = prs.executeUpdate();
         
            if (rowsAffected > 0)
                
            {
            JOptionPane.showMessageDialog(null, "Details Inserted Successfully", "SuccessFully", JOptionPane.INFORMATION_MESSAGE );
            }
        //prs.next();
        //acctNoCha.setText(rs.getString("iacno"));
//      jTextField2.setText(Integer.toString(rs.getInt("StudentID")));
//       jTextField1.setText(rs.getString("StudentName"));
//        jTextField3.setText(rs.getString("StudentSurname"));
            
        }
        catch(ClassNotFoundException | SQLException | NumberFormatException | HeadlessException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE );
        };
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//       
        dispose();
        PortalWindow PW = new PortalWindow();
        PW.setVisible(true);




//        if (StudentId.getText().equals("")) {
//
//            dispose();
//            PortalWindow PW = new PortalWindow();
//            PW.setVisible(true);
//        } else {
//            // JOptionPane.showConfirmDialog(this,"Would You Like To Update First",  JOptionPane.YES_NO_OPTION,
//            //        JOptionPane.WARNING_MESSAGE;
////            if (JOptionPane.YES_OPTION )
////            {
////                PortalWindow PW = new PortalWindow();
////               PW.setVisible(true);
////            });
//            //JOptionPane.showConfirmDialog(rootPane, "Would You Like To Update First",null, WIDTH, WIDTH, null);
////            int JB3 = JOptionPane.showConfirmDialog(null,);
////            JOptionPane.showConfirmDialog(rootPane, evt, null, WIDTH);
//            int JB3 = JOptionPane.showConfirmDialog(null, "Discard Data?", "Discard Data?", JOptionPane.YES_OPTION);
//
//            if (JB3 == 0) {
//
//                dispose();
//                PortalWindow PW = new PortalWindow();
//                PW.setVisible(true);
//            }
//
//        }}
//        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainUpdateResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUpdateResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUpdateResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUpdateResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainUpdateResult().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField SID;
    public javax.swing.JTextField SNA;
    public javax.swing.JTextField SSNA;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
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
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
