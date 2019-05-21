package com.stackroute.db;
import java.sql.*;
import java.io.*;


public class JdbcBatchProcessingDemo {
    private Connection con;

        public void display3(){
            try{

                Class.forName("com.mysql.cj.jdbc.Driver");
                con= DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/sessiondemo","root","Root@123");
                //create statement object
                System.out.println("got connected");

                PreparedStatement ps=con.prepareStatement("insert into customer values(?,?,?,?)");

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                while(true){

                    System.out.println("enter id");
                    String s1=br.readLine();
                    int id=Integer.parseInt(s1);

                    System.out.println("enter name");
                    String name=br.readLine();

                    System.out.println("enter age");
                    String s3=br.readLine();
                    int age=Integer.parseInt(s3);

                    System.out.println("enter gender");
                    String gender=br.readLine();

                    ps.setInt(1,id);
                    ps.setString(2,name);
                    ps.setInt(3,age);
                    ps.setString(4,gender);





                    ps.addBatch();
                    System.out.println("Want to add more records y/n");
                    String ans=br.readLine();
                    if(ans.equals("n")){
                        break;
                    }

                }
                ps.executeBatch();

                System.out.println("record successfully saved");

                con.close();
            }catch(Exception e){System.out.println(e);}

        }}


