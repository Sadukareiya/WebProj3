package com.diworksdev.webproj3.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.diworksdev.webproj3.util.DBConnector;

public class InquiryCompleteDAO {

    // お問い合わせ情報をデータベースに挿入するメソッド
    public int insert(String name, String qtype, String body) {
        int ret = 0;

        // DBConnector を使ってデータベース接続を取得
        DBConnector db = new DBConnector();
        Connection con = db.getConnection();

        // SQL クエリ
        String sql = "insert into inquiry values(?,?,?)";

        try {
            // PreparedStatement を使って SQL クエリを準備
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, qtype);
            ps.setString(3, body);

            // クエリを実行し、更新された行数を取得
            int i = ps.executeUpdate();

            // 行数が 0 より大きければ、登録成功とみなす
            if (i > 0) {
                System.out.println(i + "件登録されました");
                ret = i;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 接続を閉じる
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return ret;
    }
}
