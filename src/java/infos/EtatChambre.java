package infos;

/***********************************************************************
 * Module:  EtatChambre.java
 * Author:  ITU
 * Purpose: Defines the Class EtatChambre
 ***********************************************************************/

import java.util.*;
import materiels.Chambre;

/** @pdOid 4b6d545d-f1a0-4606-87ce-601505688d06 */
public class EtatChambre {
   /** @pdOid f1531cbf-8768-457b-ad8d-2d58ec8c0327 */
   public long idEtatChambre;
   /** @pdOid 514c06bc-186c-4a72-bc7d-682904db7f25 */
   public java.lang.String designationEtatChambre;
   
   /** @pdRoleInfo migr=no name=Chambre assc=chambreEtat coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Chambre> chambre;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Chambre> getChambre() {
      if (chambre == null)
         chambre = new java.util.HashSet<Chambre>();
      return chambre;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorChambre() {
      if (chambre == null)
         chambre = new java.util.HashSet<Chambre>();
      return chambre.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newChambre */
   public void setChambre(java.util.Collection<Chambre> newChambre) {
      removeAllChambre();
      for (java.util.Iterator iter = newChambre.iterator(); iter.hasNext();)
         addChambre((Chambre)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newChambre */
   public void addChambre(Chambre newChambre) {
      if (newChambre == null)
         return;
      if (this.chambre == null)
         this.chambre = new java.util.HashSet<Chambre>();
      if (!this.chambre.contains(newChambre))
      {
         this.chambre.add(newChambre);
         newChambre.setEtatChambre(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldChambre */
   public void removeChambre(Chambre oldChambre) {
      if (oldChambre == null)
         return;
      if (this.chambre != null)
         if (this.chambre.contains(oldChambre))
         {
            this.chambre.remove(oldChambre);
            oldChambre.setEtatChambre((EtatChambre)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllChambre() {
      if (chambre != null)
      {
         Chambre oldChambre;
         for (java.util.Iterator iter = getIteratorChambre(); iter.hasNext();)
         {
            oldChambre = (Chambre)iter.next();
            iter.remove();
            oldChambre.setEtatChambre((EtatChambre)null);
         }
      }
   }

}