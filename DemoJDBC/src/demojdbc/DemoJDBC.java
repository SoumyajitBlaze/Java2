/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojdbc;


 import java.sql.*;
 
 
public class DemoJDBC {

   
    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/kiit","root","");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from stud");
		while(rs.next())
			System.out.println(rs.getString(1)+"\t"+rs.getInt(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));
		con.close();
		
        }
        catch(Exception e)
        {
            
        }
    }
    
}
