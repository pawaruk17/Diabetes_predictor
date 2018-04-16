package classification_diabetes_predictor;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author UTKARSHA
 */
public class Diabetes_predictor extends javax.swing.JFrame {

    /**
     * Creates new form Diabetes_predictor
     */
    public Diabetes_predictor() {
        initComponents();
        init();
    }
    
    
    public void init() {
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
    }
    private void close() {
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
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
        jLabel1 = new javax.swing.JLabel();
        txtPreg = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtGluco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSkinThick = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtInsulin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPedigree = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtBmi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 4), "Diabetes Predictor", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe Script", 1, 24), new java.awt.Color(0, 0, 153))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("No. of preganencies patient had:");

        txtPreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPregActionPerformed(evt);
            }
        });
        txtPreg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPregKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Glucose Level:");

        txtGluco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGlucoKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Blood Pressure:");

        txtBp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBpKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Skin Thickness:");

        txtSkinThick.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSkinThickKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Insulin Level:");

        txtInsulin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInsulinKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Diabetes Pedigree Function:");

        txtPedigree.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPedigreeKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Age:");

        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAgeKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("BMI:");

        txtBmi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBmiKeyTyped(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SHOW ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 102));
        jButton2.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("CLOSE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addComponent(txtPreg, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtGluco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtBp, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtSkinThick, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtInsulin, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtBmi, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtPedigree, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(72, 72, 72))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPreg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInsulin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBmi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPedigree, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGluco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(txtSkinThick, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPregActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPregActionPerformed

    private void txtPregKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPregKeyTyped

        check(evt);
        
    }//GEN-LAST:event_txtPregKeyTyped

    private void txtGlucoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGlucoKeyTyped
        check(evt);
    }//GEN-LAST:event_txtGlucoKeyTyped

    private void txtBpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBpKeyTyped
       check(evt);
    }//GEN-LAST:event_txtBpKeyTyped

    private void txtSkinThickKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSkinThickKeyTyped
       check(evt);
    }//GEN-LAST:event_txtSkinThickKeyTyped

    private void txtInsulinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInsulinKeyTyped
        check(evt);
    }//GEN-LAST:event_txtInsulinKeyTyped

    private void txtBmiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBmiKeyTyped
        check(evt);
    }//GEN-LAST:event_txtBmiKeyTyped

    private void txtPedigreeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPedigreeKeyTyped
        check(evt);
    }//GEN-LAST:event_txtPedigreeKeyTyped

    private void txtAgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyTyped
        check(evt);
    }//GEN-LAST:event_txtAgeKeyTyped

   /*This is buttton after clicking on which it calcultes the posterior probabilities */
 private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double pc3 = count("diabetes1","1");
        double pc4 = count("diabetes1","0");
        
        double pc5 = count("diabetes2","1");
        double pc6 = count("diabetes2","0");
        
        double pc7 = count("diabetes3","1");
        double pc8 = count("diabetes3","0");
        
        double preg,gluco,bp,skinthick,insulin,bmi,pedigree,age;
        
        preg=Double.parseDouble(txtPreg.getText());
        gluco=Double.parseDouble(txtGluco.getText());
        bp=Double.parseDouble(txtBp.getText());
        skinthick=Double.parseDouble(txtSkinThick.getText());
        insulin=Double.parseDouble(txtInsulin.getText());
        bmi=Double.parseDouble(txtBmi.getText());
        pedigree=Double.parseDouble(txtPedigree.getText());
        age=Double.parseDouble(txtAge.getText());
        
        double pinc1=0,pinc2=0,pinc3=0,pinc4=0,pinc5=0,pinc6=0,pinc7=0,pinc8=0;
        
        pinc3 = pfind(preg,gluco,bp,skinthick,insulin,bmi,pedigree,age,"1","diabetes1");
        pinc4 = pfind(preg,gluco,bp,skinthick,insulin,bmi,pedigree,age,"0","diabetes1");
        
        pinc5 = pfind(preg,gluco,bp,skinthick,insulin,bmi,pedigree,age,"1","diabetes2");
        pinc6 = pfind(preg,gluco,bp,skinthick,insulin,bmi,pedigree,age,"0","diabetes2");
        
        pinc7 = pfind(preg,gluco,bp,skinthick,insulin,bmi,pedigree,age,"1","diabetes3");
        pinc8 = pfind(preg,gluco,bp,skinthick,insulin,bmi,pedigree,age,"0","diabetes3");
        
        pinc3 = pinc3 * pc3;
        pinc4 = pinc4 * pc4;
        
        pinc5 = pinc5 * pc5;
        pinc6 = pinc6 * pc6;
        
        pinc7 = pinc7 * pc7;
        pinc8 = pinc8 * pc8;
        /*Taking average of three to increase the accuracy*/
        pinc1 = (pinc3+pinc5+pinc7)/3;
        pinc2 = (pinc4+pinc6+pinc8)/3;
        
        System.out.println("pinc1="+pinc1+"   pinc2="+pinc2);
        if(pinc1 > pinc2)
            JOptionPane.showMessageDialog(rootPane, "Diabetes");
        else
            JOptionPane.showMessageDialog(rootPane, "No Diabetes"); 

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        close();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static double count(String table,String out){
        double pc1=0;
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/diabetes_testing_data");
            Statement s = con.createStatement();
            String query = null;
            ResultSet rs = null;
            int c1=0 ,c2=0 ,n=0;
            query ="SELECT COUNT(*) AS Expr1    FROM "+table+" WHERE (outcome ='"+out+"')";
            s.execute(query);
            rs= s.getResultSet();
            if(rs.next())
                
                c1=Integer.parseInt(rs.getString(1));
            
            query = "SELECT     COUNT(*) AS Expr1   FROM  "+table;
            s.execute(query);
            rs= s.getResultSet();
            if(rs.next())
                
                n = Integer.parseInt(rs.getString(1));
            pc1 = (double)c1/n;
            return pc1;
        } catch (SQLException ex) {
            Logger.getLogger(Diabetes_predictor.class.getName()).log(Level.SEVERE, null, ex);
        }
       return pc1;
    }
    /*Function to calculate normal distribution which gives the prior probability*/

    public static double normal_distribution(double attr,double sd,double mean){
        double ans=0;
        double temp = pow(sqrt(2*3.142*sd),-1);
        ans = temp*pow(2.71828,-pow(attr-mean,2)/2*pow(sd,2));
    return ans;
    }

/*Function to calculate mean*/

    private static double mean(String attr, String out, String table) {
        double ans=0,sum=0;
        int n=0;
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/diabetes_testing_data");
            Statement s = con.createStatement();
            String query = null;
            ResultSet rs = null;
            query ="SELECT COUNT(*) AS Expr1    FROM "+table+" WHERE (outcome ='"+out+"')";
			s.execute(query);
			rs= s.getResultSet();
			if(rs.next())
                            n=Integer.parseInt(rs.getString(1));

            query ="SELECT     SUM("+attr+") AS Expr1    FROM  "+table+" WHERE (outcome ='"+out+"')";
			s.execute(query);
			rs= s.getResultSet();
			if(rs.next())
                           sum=rs.getDouble(1);
                        
                        ans = sum/n;
             
            return ans;
        } catch (SQLException ex) {
            System.out.println("Exception in mean");
        }
        return ans;
    }

/*Function to calculate standard deviation*/

    private static double sd(String attr, double temp, String out, String table) {
       double ans=0,sum=0,base=0;
       int n=0;
        try {
            
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/diabetes_testing_data");
            Statement s = con.createStatement();
            String query = null;
            ResultSet rs = null;
            query ="SELECT COUNT(*) AS Expr1    FROM   "+table+" WHERE (outcome ='"+out+"')";
			s.execute(query);
			rs= s.getResultSet();
			if(rs.next())
				n=Integer.parseInt(rs.getString(1));
                        
            query ="SELECT  "+attr+" AS Expr1 FROM  "+table+" WHERE (outcome ='"+out+"')";
			s.execute(query);
			rs= s.getResultSet();
                        while(rs.next()){
					
					sum=pow(rs.getDouble(1)-temp,2);
                                        
                        }
                        base=sum/(n-1);
                        ans=sqrt(base);
            
            
        } catch (SQLException ex) {
            System.out.println("Exception in sd");
        }
        return ans;
    }
    

	public static double pfind(double preg,double gluco,double bp,double skinthick,double insulin,double bmi,double pedigree,double age,String outcome,String table)
	{
		double ans = 0;
		try{
			double a,b,c,d,e,f,g,h,temp;
                        
                        temp=mean("preg",outcome,table);
                        a=normal_distribution(preg,sd("preg",temp,outcome,table),temp);
                        
                        if(a==0)
                            a=a+1;
                        
                        temp=mean("gluco",outcome,table);
                        b=normal_distribution(gluco,sd("gluco",temp,outcome,table),temp);
                        
                        if(b==0)
                            b=b+1;
                        
                        temp=mean("bp",outcome,table);
                        c=normal_distribution(bp,sd("bp",temp,outcome,table),temp);
                        
                        if(c==0)
                            c=c+1;
			
                        temp=mean("skinthick",outcome,table);
                        d=normal_distribution(skinthick,sd("skinthick",temp,outcome,table),temp);
                        
                        if(d==0)
                            d=d+1;
                        
                        temp=mean("insulin",outcome,table);
                        e=normal_distribution(insulin,sd("insulin",temp,outcome,table),temp);
                        
                        if(e==0)
                            e=e+1;
                        
                        temp=mean("bmi",outcome,table);
                        f=normal_distribution(bmi,sd("bmi",temp,outcome,table),temp);
                        
                        if(f==0)
                            f=f+1;
                        
                        temp=mean("pedigree",outcome,table);
                        g=normal_distribution(pedigree,sd("pedigree",temp,outcome,table),temp);
                        
                        if(g==0)
                            g=g+1;
                        
                        temp=mean("age",outcome,table);
                        h=normal_distribution(age,sd("age",temp,outcome,table),temp);
			
                        if(h==0)
                            h=h+1;

			ans=a*b*c*d*e*f*g*h;
			
			System.out.println(ans);
		}
		catch(Exception e)
		{
			System.out.println("Exception:"+ e);
                        System.out.println("Exception in pfind");
                        e.printStackTrace();
		}
		return ans;
	}
    
    
    private void check(java.awt.event.KeyEvent evt){
    char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_PERIOD)){
            getToolkit().beep();
            evt.consume();
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(Diabetes_predictor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Diabetes_predictor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Diabetes_predictor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Diabetes_predictor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Diabetes_predictor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBmi;
    private javax.swing.JTextField txtBp;
    private javax.swing.JTextField txtGluco;
    private javax.swing.JTextField txtInsulin;
    private javax.swing.JTextField txtPedigree;
    private javax.swing.JTextField txtPreg;
    private javax.swing.JTextField txtSkinThick;
    // End of variables declaration//GEN-END:variables
}
