package infos;

/***********************************************************************
 * Module:  Fournisseur.java
 * Author:  ITU
 * Purpose: Defines the Class Fournisseur
 ***********************************************************************/

import java.util.*;
import materiels.Materiel;

/** @pdOid dc938a4f-d684-4feb-8b5d-f0ef5db4e4f6 */
public class Fournisseur {
   /** @pdOid c6450dd2-420d-49a5-96e5-9010f19aa159 */
   public long idFournisseur;
   /** @pdOid b80b3cbd-144f-4677-95ad-39983939eea3 */
   public java.lang.String nomFournisseur;
   /** @pdOid 0b115e5a-d25c-4a77-9ae5-e8b28444e7e0 */
   public java.util.Date debutCollaboration;
   
   /** @pdRoleInfo migr=no name=Materiel assc=fournisseurMateriel coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Materiel> materiel;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Materiel> getMateriel() {
      if (materiel == null)
         materiel = new java.util.HashSet<Materiel>();
      return materiel;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorMateriel() {
      if (materiel == null)
         materiel = new java.util.HashSet<Materiel>();
      return materiel.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newMateriel */
   public void setMateriel(java.util.Collection<Materiel> newMateriel) {
      removeAllMateriel();
      for (java.util.Iterator iter = newMateriel.iterator(); iter.hasNext();)
         addMateriel((Materiel)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMateriel */
   public void addMateriel(Materiel newMateriel) {
      if (newMateriel == null)
         return;
      if (this.materiel == null)
         this.materiel = new java.util.HashSet<Materiel>();
      if (!this.materiel.contains(newMateriel))
      {
         this.materiel.add(newMateriel);
         newMateriel.setFournisseur(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldMateriel */
   public void removeMateriel(Materiel oldMateriel) {
      if (oldMateriel == null)
         return;
      if (this.materiel != null)
         if (this.materiel.contains(oldMateriel))
         {
            this.materiel.remove(oldMateriel);
            oldMateriel.setFournisseur((Fournisseur)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllMateriel() {
      if (materiel != null)
      {
         Materiel oldMateriel;
         for (java.util.Iterator iter = getIteratorMateriel(); iter.hasNext();)
         {
            oldMateriel = (Materiel)iter.next();
            iter.remove();
            oldMateriel.setFournisseur((Fournisseur)null);
         }
      }
   }

}