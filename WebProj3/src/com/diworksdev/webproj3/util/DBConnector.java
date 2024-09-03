package com.diworksdev.webproj3.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

    /**
     * JDBC ドライバー名
     */
    private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";;

    /**
     * データベース接続 URL
     */
    private static final String URL = "jdbc:mysql://localhost/testdb";

    /**
     * データベース接続ユーザ名
     */
    private static final String USER = "root";

    /**
     * データベース接続パスワード
     */
    private static final String PASSWORD = "mysql";

    /**
     * データベースへの接続を取得します。
     *
     * @return Connection データベース接続
     */
    public Connection getConnection() {
        Connection con = null;
        try {
            Class.forName(DRIVER_NAME);
            con = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}
