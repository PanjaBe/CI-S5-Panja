package personne;

import Connexion.Connexion;
import infos.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.*;

public class Personnel {
   public long idPersonnel;
   public String nomPersonnel;
   public String prenomPersonnel;
   public Date admission;
   public Date ajournement;
   public char sexe;
   public String naissance;
   public Poste poste;
   public int telephoneEmploye;
   public String adresseEmploye;
   public String mailEmploye;
   
   public Personnel(){}   
   
   public Personnel(long id)
   {
       idPersonnel=id;
   }
   
   public Personnel(int idPoste,String nom,String pre,char sex,String naiss,int tel,String addr,String mail)
   {
       poste=new Poste(idPoste,"wawa");
       nomPersonnel=nom;
       prenomPersonnel=pre;
       sexe=sex;
       naissance=naiss;
       telephoneEmploye=tel;
       adresseEmploye=addr;
       mailEmploye=mail;
   }
   
   public Personnel(String nom,String pre,char sex,String naiss,Poste p)
   {
       nomPersonnel=nom;
       prenomPersonnel=pre;
       sexe=sex;
       naissance=naiss;
       poste=p;
   }
   
   public void setId(long id)
   {
       idPersonnel=id;
   }
    public void insert() throws Exception
    {
        Connection conn=null;
        Statement s=null;
        try
        {
            int i=Connexion.getLastsequence("personnel_idpersonnel_seq");
            String req = "INSERT INTO personnel VALUES("+i+","+poste.idPoste+",'"+nomPersonnel+"','"+prenomPersonnel+"','now()',NULL,'"+sexe+"','"+naissance+"')";
            conn=Connexion.getConn();
            s=conn.createStatement();
            s.executeUpdate(req);
            ContactEmploye c=new ContactEmploye(i,telephoneEmploye,adresseEmploye,mailEmploye);
            c.insert();
        }
        catch(Exception e)
        {
        }
        finally
        {
            if(s!=null)
            {
                s.close();
            }
            if(conn!=null)
            {
                conn.close();
            }
        }
    }
    
    public void update() throws Exception
    {
        Connection conn=null;
        Statement s=null;
        try
        {
            String req = "UPDATE personnel SET idposte="+poste.idPoste+",nompersonnel='"+nomPersonnel+"',prenompersonnel='"+prenomPersonnel+"',sexe='"+sexe+"',naissance='"+naissance+"' where idPersonnel="+idPersonnel;
            conn=Connexion.getConn();
            s=conn.createStatement();
            s.executeUpdate(req);
        }
        catch(Exception e)
        {
        }
        finally
        {
            if(s!=null)
            {
                s.close();
            }
            if(conn!=null)
            {
                conn.close();
            }
        }
    }
    
    public static ArrayList find(String critere,String key) throws Exception
    {
        ArrayList ret=new ArrayList();
        Connection conn=null;
        Statement s=null;
        try
        {
            String condition;
            if(critere.length()==0 || key.length()==0)
            {
                condition="";
            }
            else if(critere.compareToIgnoreCase("naissance")==0 || critere.compareToIgnoreCase("idPersonnel")==0)
            {
                condition=" where "+critere+"='"+key+"'";
            }
            else
            {
                condition=" where "+critere+" ilike '%"+key+"%'";
            }
            String req = "select idPersonnel,nomPersonnel,prenomPersonnel,sexe,naissance,poste.idposte,designationposte from personnel join poste"
                    + " on personnel.idPoste=poste.idPoste"+condition;
            conn=Connexion.getConn();
            s=conn.createStatement();
            ResultSet res=s.executeQuery(req);
            Poste p;
            Personnel pe;
            while(res.next())
            {
                p=new Poste(res.getLong("idposte"),res.getString("designationposte"));
                pe=new Personnel(res.getString("nomPersonnel"),res.getString("prenomPersonnel"),res.getString("sexe").toCharArray()[0],res.getString("naissance"),p);
                pe.setId(res.getInt("idPersonnel"));
                ret.add(pe);
            }
            s.close();
            conn.close();
        }
        catch(Exception e)
        {
        }
        finally
        {
            if(s!=null)
            {
                s.close();
            }
            if(conn!=null)
            {
                conn.close();
            }
        }
        return ret;
    }
    
    public static ArrayList multiFind(String[] critere,String[] key) throws Exception
    {
        ArrayList ret=new ArrayList();
        Connection conn=null;
        Statement s=null;
        try
        {
            String condition="";
            for(int i=0;i<critere.length;i++)
            {
                if(key[i].compareTo("")!=0)
                {
                    if(critere[i].compareToIgnoreCase("naissance")==0 || critere[i].compareToIgnoreCase("idPersonnel")==0)
                    {
                        condition+=critere[i]+"='"+key[i]+"' AND ";
                    }
                    else
                    {
                        condition+=critere[i]+" ilike '%"+key[i]+"%' AND ";
                    }
                }
            }
            if(condition.length()>0)
            {
                condition=condition.substring(0,condition.length()-5);
                condition=" where "+condition;
            }
            String req = "select idPersonnel,nomPersonnel,prenomPersonnel,sexe,naissance,poste.idposte,designationposte from personnel join poste"
                    + " on personnel.idPoste=poste.idPoste"+condition;
            conn=Connexion.getConn();
            s=conn.createStatement();
            ResultSet res=s.executeQuery(req);
            int i=0;
            while(res.next())
            {
                Poste p=new Poste(res.getLong("idposte"),res.getString("designationposte"));
                Personnel pe=new Personnel(res.getString("nomPersonnel"),res.getString("prenomPersonnel"),res.getString("sexe").toCharArray()[0],res.getString("naissance"),p);
                ret.add(pe);
                pe.setId(res.getInt("idPersonnel"));
                i++;
            }
            s.close();
            conn.close();
        }
        catch(Exception e)
        {
        }
        finally
        {
            if(s!=null)
            {
                s.close();
            }
            if(conn!=null)
            {
                conn.close();
            }
        }
        return ret;
    }
    
    public static void delete(long id) throws Exception
    {
        Connection conn=null;
        Statement s=null;
        try
        {
            String req = "DELETE FROM personnel where idpersonnel="+id;
            conn=Connexion.getConn();
            s=conn.createStatement();
            s.executeUpdate(req);
        }
        catch(Exception e)
        {
            throw new Exception("Suppression impossible car il y a encore des contacts rattach&eacute;s &agrave; cet employ&eacute;!");
        }
        finally
        {
            if(s!=null)
            {
                s.close();
            }
            if(conn!=null)
            {
                conn.close();
            }
        }
    }
    
    public static void deleteContacts(long id) throws Exception
    {
        try
        {
            ArrayList contacts=ContactEmploye.findAll(id);
            ContactEmploye c;
            for(int i=0;i<contacts.size();i++)
            {
                c=(ContactEmploye)contacts.get(i);
                ContactEmploye.delete(c.idContactEmploye);
            }
        }
        catch(Exception e){}
    }
}