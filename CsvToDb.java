package csvtodb;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author UTKARSHA
 */
public class CsvToDb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       String sql = " INSERT INTO diabetes3(preg,gluco,bp,skinthick,insulin,bmi,pedigree,age,outcome) VALUES(?,?,?,?,?,?,?,?,?) ";
          

try { 
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/diabetes_testing_data");//add your database connection URL
        BufferedReader bReader = new BufferedReader(new FileReader("diabetes3.csv"));//add your csv file name
        String line = ""; 
        while ((line = bReader.readLine()) != null) {
            if (line != null)
            {
                String[] array1 = line.split(",+"); 
                int n= array1.length;
               double[] array =new double[n-1] ;
               for(int i=0;i<n-1;i++){
               
               array[i] =Double.parseDouble(array1[i]);
               
               }
              
                    
                    PreparedStatement s = con.prepareStatement(sql);
                    s.setDouble(1,array[0]);
                    s.setDouble(2,array[1]);
                    s.setDouble(3,array[2]);
                    s.setDouble(4,array[3]);
                    s.setDouble(5,array[4]);
                    s.setDouble(6,array[5]);
                    s.setDouble(7,array[6]);
                    s.setDouble(8,array[7]);
                    s.setString(9,array1[8]);
                    s.executeUpdate();
                    s.close();
                    
                    
                
            }
            if (bReader == null)
            {
                bReader.close();
            }
        }
    } catch (FileNotFoundException ex) {
        ex.printStackTrace();
    }   catch (SQLException ex) {
            Logger.getLogger(CsvToDb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
