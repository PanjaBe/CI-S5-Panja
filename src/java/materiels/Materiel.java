package materiels;

/***********************************************************************
 * Module:  Materiel.java
 * Author:  ITU
 * Purpose: Defines the Class Materiel
 ***********************************************************************/

import infos.*;
import java.util.*;

/** @pdOid e7f95e3b-61ee-4a3a-aa0e-0969fb5891a9 */
public class Materiel {
   /** @pdOid b97b9e5c-1ead-437d-939a-9109a5f5ac67 */
   public long idMateriel;
   /** @pdOid 092b642a-5c66-4f4d-9c34-fbdec91c3054 */
   public java.lang.String marque;
   /** @pdOid 38e01cc7-85df-4299-9852-760868581a34 */
   public float prixMateriel;
   /** @pdOid 0d98a550-5590-42ad-87ac-0e5537f0ca0c */
   public java.util.Date aquisition;
   
   /** @pdRoleInfo migr=no name=Chambre assc=materielChambre mult=0..1 side=A */
   public Chambre chambre;
   /** @pdRoleInfo migr=no name=Fournisseur assc=fournisseurMateriel mult=1..1 side=A */
   public Fournisseur fournisseur;
   /** @pdRoleInfo migr=no name=TypeMateriel assc=materielType mult=1..1 side=A */
   public TypeMateriel typeMateriel;
   
   
   /** @pdGenerated default parent getter */
   public Chambre getChambre() {
      return chambre;
   }
   
   /** @pdGenerated default parent setter
     * @param newChambre */
   public void setChambre(Chambre newChambre) {
      if (this.chambre == null || !this.chambre.equals(newChambre))
      {
         if (this.chambre != null)
         {
            Chambre oldChambre = this.chambre;
            this.chambre = null;
            oldChambre.removeMateriel(this);
         }
         if (newChambre != null)
         {
            this.chambre = newChambre;
            this.chambre.addMateriel(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Fournisseur getFournisseur() {
      return fournisseur;
   }
   
   /** @pdGenerated default parent setter
     * @param newFournisseur */
   public void setFournisseur(Fournisseur newFournisseur) {
      if (this.fournisseur == null || !this.fournisseur.equals(newFournisseur))
      {
         if (this.fournisseur != null)
         {
            Fournisseur oldFournisseur = this.fournisseur;
            this.fournisseur = null;
            oldFournisseur.removeMateriel(this);
         }
         if (newFournisseur != null)
         {
            this.fournisseur = newFournisseur;
            this.fournisseur.addMateriel(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public TypeMateriel getTypeMateriel() {
      return typeMateriel;
   }
   
   /** @pdGenerated default parent setter
     * @param newTypeMateriel */
   public void setTypeMateriel(TypeMateriel newTypeMateriel) {
      if (this.typeMateriel == null || !this.typeMateriel.equals(newTypeMateriel))
      {
         if (this.typeMateriel != null)
         {
            TypeMateriel oldTypeMateriel = this.typeMateriel;
            this.typeMateriel = null;
            oldTypeMateriel.removeMateriel(this);
         }
         if (newTypeMateriel != null)
         {
            this.typeMateriel = newTypeMateriel;
            this.typeMateriel.addMateriel(this);
         }
      }
   }

}