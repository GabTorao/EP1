package com.isil.ep1;

import javafx.beans.binding.When;

import java.sql.*;

public class Aplicacion {

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/primeraep",
                "root",
                "root"
        );

        //1.Mostramos la Lista de registros con CallableStatement
        CallableStatement cs= con.prepareCall("{call TodosPers()}");

        ResultSet resultadoSP3 = cs.executeQuery();
        while (resultadoSP3.next()){
            System.out.println(resultadoSP3.getString("idPerso"));
            System.out.println(resultadoSP3.getString("name"));
            System.out.println(resultadoSP3.getString("poder"));
            System.out.println(resultadoSP3.getString("arma"));
            System.out.println(resultadoSP3.getString("city"));
        }

        //2.Agregamos un nuevo registro con Statement y consultamos con PreparedStatement

        //Statement stcreate =con.createStatement();
        //int filasAfectadas =
                //stcreate.executeUpdate("INSERT INTO PERSONAJES VALUES(7,'Katherine','Multi','Habla','Genshin')");
        //System.out.println("Filas Afectadas: " + filasAfectadas);

       // PreparedStatement preparedStatement =
               // con.prepareStatement("select * from Personajes where name=?");

       // preparedStatement.setString(1,"Katherine");

       //ResultSet resultSet2 = preparedStatement.executeQuery();

        //while (resultSet2.next()){
           // System.out.println(resultSet2.getString("name") + "\n"+
             //       resultSet2.getString("poder") + "\n"+
            //        resultSet2.getString("arma") + "\n"+
             //      resultSet2.getString("city"));
       // }

        //3.Actualizamos una lista con PreparedStatement
        //PreparedStatement preparedStatement =
                //con.prepareStatement("UPDATE PERSONAJES set arma=? WHERE idPerso=?");
        //preparedStatement.setString(1,"Librito");
        //preparedStatement.setInt(2,7);

        //int filasAfectadad = preparedStatement.executeUpdate();
       // System.out.println("Filas Afectadas: " + filasAfectadad);


       // PreparedStatement preparedStatement1 = con.prepareStatement("SELECT * FROM PERSONAJES WHERE idPerso=?");
        //preparedStatement1.setInt(1,7);

       // ResultSet rs = preparedStatement1.executeQuery();

       // while (rs.next()){
            //System.out.println(rs.getString("idPerso") + "\n" +
           //         rs.getString("name") + "\n" +
           //         rs.getString("poder") + "\n" +
            //        rs.getString("arma") + "\n" +
            //        rs.getString("city"));
       // }

    }
}
