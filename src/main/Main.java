package main;

import db.utils.Connector;
import java.sql.*;

public class Main {
   public static void main(String[] args){
       String url = "";
       String statemet = "";
       
       try{
            ResultSet rs =  Connector.select(url, statemet);
            while(rs.next()){
                System.out.println(rs.getString(1));
            }
       } catch(SQLException e){
            System.out.println(e.getMessage());
       }
       
   }
}
