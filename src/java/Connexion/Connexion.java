package Connexion;

import java.sql.*;

public class Connexion implements Base
{
    public static Connection getConn()
    {
        Connection conn= null;
        try
        {
            Class.forName("org.postgresql.Driver");
            conn=DriverManager.getConnection(connURL,username,password);
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }
        return conn;
    }
   
    public static int getLastsequence(String nomseq)
    {
        String seq="select nextval('"+nomseq+"')";
        int ret=0;
        try{
            Connection conn = Connexion.getConn();
            Statement s = conn.createStatement();
            ResultSet sequence = s.executeQuery(seq);
            sequence.next();
            ret = sequence.getInt(1);
            s.close();
            conn.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return ret;
    }
   
    public static int getCurrsequence(String nomseq)
    {
        String seq="select currval('"+nomseq+"')";
        int ret=0;
        try{
            Connection conn = Connexion.getConn();
            Statement s = conn.createStatement();
            ResultSet sequence = s.executeQuery(seq);
            sequence.next();
            ret = sequence.getInt(1);
            s.close();
            conn.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return ret;
    }
   
    public static int getRecentsequence()
    {
        String seq="select lastval()";
        int ret=0;
        try{
            Connection conn = Connexion.getConn();
            Statement s = conn.createStatement();
            ResultSet sequence = s.executeQuery(seq);
            sequence.next();
            ret = sequence.getInt(1);
            s.close();
            conn.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return ret;
    }
}
