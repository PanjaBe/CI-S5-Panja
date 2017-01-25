package infos;

/***********************************************************************
 * Module:  TypeMateriel.java
 * Author:  ITU
 * Purpose: Defines the Class TypeMateriel
 ***********************************************************************/

import java.util.*;
import materiels.Materiel;

/** @pdOid 50db565c-ef8a-4576-bb0b-0e32a27fcd27 */
public class TypeMateriel {
   /** @pdOid ea0922d3-da58-4153-ac03-f84e83ee7213 */
   public long idTypeMateriel;
   /** @pdOid fab9e964-c68f-42c8-a724-dbc2998d4033 */
   public java.lang.String designationTypeMateriel;
   
   /** @pdRoleInfo migr=no name=Materiel assc=materielType coll=java.util.Collection impl=java.util.HashSet mult=0..* */
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
         newMateriel.setTypeMateriel(this);      
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
            oldMateriel.setTypeMateriel((TypeMateriel)null);
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
            oldMateriel.setTypeMateriel((TypeMateriel)null);
         }
      }
   }

}