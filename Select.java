import java.sql.*;
  class Select{
      public static void main (String[]args)
      try {
       Class.forName("com.mysql.jdbc.Driver");
       Connection cnxn= DriverManager.getConnection("jdbc:mysql/://localhost3306/testdb","root", 15791);
       Statement S = cnxn.createStatement();
       String query="SELECT *FROM employee";
       ResultSet rs= S.executeQuery(query);


       while(rs.next()){

        System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getString(3)+""+rs.getString(4));

       }
       cnxn.close();
      }
    catch(SQLException e){
        
       
    

    }



      }
  