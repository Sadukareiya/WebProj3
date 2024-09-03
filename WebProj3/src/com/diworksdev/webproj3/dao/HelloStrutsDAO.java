package com.diworksdev.webproj3.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.diworksdev.webproj3.dto.HelloStrutsDTO;
import com.diworksdev.webproj3.util.DBConnector;

public class HelloStrutsDAO {

    /**
     * データベースからユーザー情報を取得し、接続結果をDTOに設定します。
     *
     * @return HelloStrutsDTO データベース接続結果を含むDTO
     */
    public HelloStrutsDTO select() {
        DBConnector db = new DBConnector();
        Connection con = null;
        HelloStrutsDTO dto = new HelloStrutsDTO();
        String sql = "SELECT * FROM users";

        try {
            con = db.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                dto.setResult("MySQL と接続できます。");
            } else {
                dto.setResult("MySQL と接続できません。");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return dto;
    }
}