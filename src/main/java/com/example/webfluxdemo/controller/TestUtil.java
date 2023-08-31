package com.example.webfluxdemo.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @program: webfluxdemo
 * @description:
 * @author: hons.chang
 * @since: 2023-08-08 16:47
 **/
public class TestUtil {

//    public static String db_url = "jdbc:mysql://10.20.3.20:65393/db_deployment_aecloud_test?useSSL=false&allowLoadLocalInfile=true";
    public static String db_url = "jdbc:mysql://127.0.0.1:3306/chs?useSSL=false&allowLoadLocalInfile=true";
    public static String db_user = "root";
    public static String db_pass = "123456";

    public static Connection getConn () {
        Connection conn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");//加载驱动
            conn = DriverManager.getConnection(db_url, db_user, db_pass);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;
    }

    /**
     * 关闭连接
     * @param state
     * @param conn
     */
    public static void close (PreparedStatement state, Connection conn) {
        if (state != null) {
            try {
                state.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close (ResultSet rs, PreparedStatement state, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (state != null) {
            try {
                state.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
