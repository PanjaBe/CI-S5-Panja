package infos;

/***********************************************************************
 * Module:  TypeChambre.java
 * Author:  ITU
 * Purpose: Defines the Class TypeChambre
 ***********************************************************************/

import java.util.*;
import materiels.Chambre;

/** @pdOid a2746ec1-7335-4c13-acd7-23b116466c36 */
public class TypeChambre {
   /** @pdOid cdc0c16c-970f-49e3-b348-bca6bdf99ce2 */
   public long idTypeChambre;
   /** @pdOid ea336e8f-0d00-4a71-a6bf-1e8c5905bd51 */
   public java.lang.String designationChambre;
   /** @pdOid 6ccbc319-4094-4785-869f-58ed3717458f */
   public int places;
   /** @pdOid 7533232c-4730-4065-883d-2de40e35455a */
   public float tarif;
   /** @pdOid e0b4a6f5-382d-4b85-9cf7-7e495be529be */
   public int lits;
   /** @pdOid 58917cc1-10e0-4eda-a182-4ace350dab36 */
   public java.util.Date dateModification;
   
   /** @pdRoleInfo migr=no name=Chambre assc=chambreType coll=java.util.Collection impl=java.util.HashSet mult=0..* */
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
         newChambre.setTypeChambre(this);      
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
            oldChambre.setTypeChambre((TypeChambre)null);
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
            oldChambre.setTypeChambre((TypeChambre)null);
         }
      }
   }

}