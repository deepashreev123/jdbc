package com.stackroute.db;

import java.sql.*;

public class ResultSetMetaDataDemo {
    private Connection con;
    public void display() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sessiondemo", "root", "Root@123");

            PreparedStatement ps = con.prepareStatement("select * from customer");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();

            System.out.println("Total columns: " + rsmd.getColumnCount());
            System.out.println("Column Name of 1st column: " + rsmd.getColumnName(2));
            System.out.println("Column Type Name of 1st column: " + rsmd.getColumnTypeName(2));

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }}