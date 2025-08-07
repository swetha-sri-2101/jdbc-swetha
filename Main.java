import java.sql.Connection;
import java.sql.DriverManager;

public class Main{
    public static void  main(String[]args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root1234");
        if(conn!=null){
            System.out.println("Connection established successfully!");
        }else{
            System.out.println("Failed to establish connection.");
        }
        conn.close();
    } 
}