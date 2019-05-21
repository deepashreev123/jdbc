/*package com.stackroute.db;

import javax.sql.RowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class RowSetDemo {
    private Connection con;
      //  public static void main(String[] args) throws Exception {
      public void display1() {

          try {
              Class.forName("com.mysql.cj.jdbc.Driver");
              Connection con = DriverManager.getConnection(
                      "jdbc:mysql://localhost:3306/sessiondemo", "root", "Root@123");

              JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();

              rowSet.setCommand("select * from customer");
            rowSet.execute();

            while (rowSet.next()) {
                // Generating cursor Moved event
                System.out.println("Id: " + rowSet.getInt(1));
                System.out.println("Name: " + rowSet.getString(2));
                System.out.println("Salary: " + rowSet.getInt(3));

            }} catch (ClassNotFoundException e) {
              e.printStackTrace();
          } catch (SQLException e) {
              e.printStackTrace();
          }}}*/