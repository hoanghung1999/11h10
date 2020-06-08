package mySQL.ConnectSQL;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreatConnector {
    public Connection getConnect(){
        Connection con=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://54.169.72.137:3306/vovitour","vovitour","thanhtuanhung123");
            System.out.println("connected");
        return con;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("error connect");
        }
        return con;
    }
}
