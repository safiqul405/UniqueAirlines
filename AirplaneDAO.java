
package UniqueAirlines;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AirplaneDAO implements CommonInterface<Airplane> {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public int save(Airplane t) {
        int status = 0;
        String sql = "INSERT into airplane (plane_code,plane_name,plane_total_seat,common_seat_price,business_seat_price,premium_seat_price) VALUES (?,?,?,?,?,?)";
        try {
            con = AirlinesConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getPlaneCode());
            ps.setString(2, t.getPlaneName());
            ps.setInt(3, t.getTotalSeats());
            ps.setDouble(4, t.getCommonSeatPrice());
            ps.setDouble(5, t.getBusinessSeatPrice());
            ps.setDouble(6, t.getPremiumSeatPrice());
            status = ps.executeUpdate();
        } catch (Exception e) {
        }finally{
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(AirplaneDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

    @Override
    public Airplane edit(Airplane t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Airplane t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(Airplane t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Airplane getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public List<Airplane> getAll(){
    List<Airplane> planes = new ArrayList<>();
        try {
            String sql = "select * from airplane";
            ps = AirlinesConnection.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
            Airplane plane = new Airplane();
            plane.setPlaneCode(rs.getString("plane_code"));
            plane.setPlaneName(rs.getString("plane_name"));
            plane.setTotalSeats(rs.getInt("plane_total_seat"));
            plane.setCommonSeatPrice(rs.getDouble("common_seat_price"));
            plane.setBusinessSeatPrice(rs.getDouble("business_seat_price"));
            plane.setPremiumSeatPrice(rs.getDouble("premium_seat_price"));
            planes.add(plane);
        }
        } catch (Exception e) {
        }
        return planes;
    }
     
     public Airplane getByCode(String airplaneCode){
         Airplane plane = new Airplane();
        try {
            String sql = "select * from airplane where plane_code  = ? ";
            ps = AirlinesConnection.getConnection().prepareStatement(sql);
            ps.setString(1, airplaneCode);
            rs = ps.executeQuery();
            
            while(rs.next()){
            
            plane.setPlaneCode(rs.getString("plane_code"));
            plane.setPlaneName(rs.getString("plane_name"));
            plane.setTotalSeats(rs.getInt("plane_total_seat"));
            plane.setCommonSeatPrice(rs.getDouble("common_seat_price"));
            plane.setBusinessSeatPrice(rs.getDouble("business_seat_price"));
            plane.setPremiumSeatPrice(rs.getDouble("premium_seat_price"));
        }
        } catch (Exception e) {
        }
        return plane;
    }

}
