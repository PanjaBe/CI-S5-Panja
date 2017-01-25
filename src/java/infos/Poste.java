package infos;

/***********************************************************************
 * Module:  Poste.java
 * Author:  ITU
 * Purpose: Defines the Class Poste
 ***********************************************************************/

import java.util.*;
import personne.Personnel;
import Connexion.Connexion;
import java.sql.*;
import java.text.*;
import java.util.Date;

/** @pdOid cff7a3ea-18f3-4c04-a629-9e679cfbc80c */
public class Poste {
    /** @pdOid 36171457-9baa-481d-8597-105e8546adf2 */
    public long idPoste;
    /** @pdOid 045e6329-eb58-4d8e-8cc6-aaa5aafb9ef6 */
    public String designationPoste;
    /** @pdOid 0b2c1c9c-8c67-499b-8671-f7884011a820 */
    public float salaire;
    /** @pdOid 250bfa4a-da61-4dab-8dc0-8bf33dbd6f21 */
    public int permission;
    /** @pdOid ba347c5a-8e3f-4d99-8817-7d7ff41d3d6c */
    public java.util.Date modificationPoste;

    /** @pdRoleInfo migr=no name=Personnel assc=posteEmploye coll=java.util.Collection impl=java.util.HashSet mult=0..* */
    public java.util.Collection<Personnel> personnel;

    public Poste(){}
    
    public Poste(long id,String des)
    {
        idPoste=id;
        designationPoste=des;
    }
   
    public Poste(String des,float sal,int perm)
    {
        designationPoste=des;
        salaire=sal;
        permission=perm;
    }
   
   public void insert()
   {
        try
        {
            Connection conn=Connexion.getConn();
            int i=Connexion.getLastsequence("poste_idposte_seq");
            String req = "INSERT INTO poste VALUES("+i+",'"+designationPoste+"',"+salaire+","+permission+",'now()')";
            Statement s=conn.createStatement();
            s.executeUpdate(req);
            conn.commit();
            s.close();
            conn.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
   }
   
   public ArrayList getPostes()
   {
       ArrayList ret=new ArrayList();
       try
        {
            String req = "select idposte,designationposte from poste";
            Connection conn=Connexion.getConn();
            Statement s=conn.createStatement();
            ResultSet res=s.executeQuery(req);
            int i=0;
            while(res.next())
            {
                Poste p=new Poste(res.getLong("idposte"),res.getString("designationposte"));
                ret.add(p);
                i++;
            }
            s.close();
            conn.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
       return ret;
   }
   
   /** @pdGenerated default getter */
   public java.util.Collection<Personnel> getPersonnel() {
      if (personnel == null)
         personnel = new java.util.HashSet<Personnel>();
      return personnel;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorPersonnel() {
      if (personnel == null)
         personnel = new java.util.HashSet<Personnel>();
      return personnel.iterator();
   }
}