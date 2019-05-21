package com.stackroute.db;
import java.sql.*;


public class DatabaseMetaDataDemo {
        private Connection con;
        //public static void main(String args[]){
        public void display2(){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");

                con= DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/sessiondemo","root","Root@123");
                DatabaseMetaData dbmd=con.getMetaData();

                System.out.println("Driver Name: "+dbmd.getDriverName());
                System.out.println("Driver Version: "+dbmd.getDriverVersion());
                System.out.println("UserName: "+dbmd.getUserName());
                System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());
                System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());

                con.close();
            }catch(Exception e){ System.out.println(e);}
        }
    }


