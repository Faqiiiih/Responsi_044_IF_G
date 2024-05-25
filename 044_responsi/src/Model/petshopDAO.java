
package Model;

import java.sql.*;
import java.util.arraylist;
import java.util.List;

public class petshopDAO {
    public void addpetshop(petshop petshop)throws SQLException {
        string sql = "INSERT INTO petshop(nama_hewan,jenis_hewan,nama_pemilik,kontak,durasi)VALUES(?,?,?,?,?)";
        try (Connection conn = DBConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, petshop.getnama_hewan());
            stmt.setString(2, petshop.getjenis_hewan());
            stmt.setString(3, petshop.getnama_pemilik());
            stmt.setString(4, petshop.getkontak());
            stmt.setId(5, petshop.getdurasi());
            stmt.executeUpdate();
        }
    }
}
