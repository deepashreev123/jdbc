package com.stackroute;

import com.stackroute.db.*;
//import com.stackroute.db.RowSetDemo;

public class Main {
    public static void main(String[] args) {
        CrudOperation crudOperation = new CrudOperation();
 // crudOperation.displayData();
        crudOperation.displayCustomrerByName("Aditya");
        ResultSetMetaDataDemo result=new ResultSetMetaDataDemo();
        result.display();
       // RowSetDemo result1=new RowSetDemo();
        //result1.display1();
        DatabaseMetaDataDemo result2=new DatabaseMetaDataDemo();
        result2.display2();
        JdbcBatchProcessingDemo result3=new JdbcBatchProcessingDemo();
        result3.display3();
        JdbcTransactionDemo jdbctransactiondemo=new JdbcTransactionDemo();
        jdbctransactiondemo.display4();

    }
}
