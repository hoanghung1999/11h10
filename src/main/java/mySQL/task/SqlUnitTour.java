package mySQL.task;

import mySQL.ConnectSQL.CreatConnector;
import oop.Unit;

import java.sql.*;
import java.util.List;

public class SqlUnitTour {
    // tra ve unit_tour_id
    public int search_utID(int tour_id,int unit_id){
        int result=0;
        CreatConnector con = new CreatConnector();
        Connection connection = con.getConnect();
        try {
            // tim unit_tour trong bang unit_tour
            String sql = "SELECT unit_tour_id\n" +
                                    "FROM unit_tour\n" +
                    "WHERE unit_tour.tour_id=" + tour_id + " AND unit_tour.unit_id=" + unit_id;
            PreparedStatement ps= connection.prepareStatement(sql);
            ResultSet rs= ps.executeQuery();
            if(rs.next()) result= rs.getInt(1);

            ps.close();
            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
                System.out.println("disconneted");
            } catch (SQLException e) {
                e.printStackTrace();
                result=-1;
            }
        }
        return result;//thanh cong kq>0, khong tim thay unit_tour_id mong muong kq=0, loi jdbc kq=-1
    }

    // Them vao bang Unit va unit_tour => cập nhập thông tin các đơn vị tham gia trong 1 tour
    public int insertUnitInTour(List<Integer> list_Id_Unit, int tourid) {
        int result=0;//them unit trong tour ko thanh cong
        CreatConnector con = new CreatConnector();
        Connection connection = con.getConnect();
        String sql_ut="INSERT INTO Unit_tour(unit_id,tour_id) values(?,?)";
        try {
            for(Integer i:list_Id_Unit){
                PreparedStatement ps=connection.prepareStatement(sql_ut);
                ps.setInt(1,i);
                ps.setInt(2,tourid);
                ps.execute();
                ps.close();
            }
            result= 1;//them các đơn vị tham gia trong một giải thành công

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
                System.out.println("disconnected");
            } catch (SQLException e) {
                e.printStackTrace();
                result=-1;// loi jdbc
            }

        }
        return result;// thêm unit va unit_tour thất bại
         }
}
