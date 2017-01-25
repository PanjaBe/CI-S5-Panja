package materiels;

/***********************************************************************
 * Module:  Chambre.java
 * Author:  ITU
 * Purpose: Defines the Class Chambre
 ***********************************************************************/

import infos.*;
import java.util.*;
import metier.Reservation;

/** @pdOid 2f561820-2078-483c-9ebe-d667dcb5563a */
public class Chambre {
   /** @pdOid de03b8b8-e193-481f-8e55-7274d0b8f131 */
   public long idChambre;
   /** @pdOid b88ccf68-f2ae-4695-9c1a-006a8e4842c0 */
   public int numero;
   
   /** @pdRoleInfo migr=no name=Materiel assc=materielChambre coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Materiel> materiel;
   /** @pdRoleInfo migr=no name=Reservation assc=reservationChambre coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Reservation> reservation;
   /** @pdRoleInfo migr=no name=TypeChambre assc=chambreType mult=1..1 side=A */
   public TypeChambre typeChambre;
   /** @pdRoleInfo migr=no name=EtatChambre assc=chambreEtat mult=1..1 side=A */
   public EtatChambre etatChambre;
   
   
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
         newMateriel.setChambre(this);      
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
            oldMateriel.setChambre((Chambre)null);
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
            oldMateriel.setChambre((Chambre)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Reservation> getReservation() {
      if (reservation == null)
         reservation = new java.util.HashSet<Reservation>();
      return reservation;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorReservation() {
      if (reservation == null)
         reservation = new java.util.HashSet<Reservation>();
      return reservation.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newReservation */
   public void setReservation(java.util.Collection<Reservation> newReservation) {
      removeAllReservation();
      for (java.util.Iterator iter = newReservation.iterator(); iter.hasNext();)
         addReservation((Reservation)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newReservation */
   public void addReservation(Reservation newReservation) {
      if (newReservation == null)
         return;
      if (this.reservation == null)
         this.reservation = new java.util.HashSet<Reservation>();
      if (!this.reservation.contains(newReservation))
      {
         this.reservation.add(newReservation);
         newReservation.setChambre(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldReservation */
   public void removeReservation(Reservation oldReservation) {
      if (oldReservation == null)
         return;
      if (this.reservation != null)
         if (this.reservation.contains(oldReservation))
         {
            this.reservation.remove(oldReservation);
            oldReservation.setChambre((Chambre)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllReservation() {
      if (reservation != null)
      {
         Reservation oldReservation;
         for (java.util.Iterator iter = getIteratorReservation(); iter.hasNext();)
         {
            oldReservation = (Reservation)iter.next();
            iter.remove();
            oldReservation.setChambre((Chambre)null);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public TypeChambre getTypeChambre() {
      return typeChambre;
   }
   
   /** @pdGenerated default parent setter
     * @param newTypeChambre */
   public void setTypeChambre(TypeChambre newTypeChambre) {
      if (this.typeChambre == null || !this.typeChambre.equals(newTypeChambre))
      {
         if (this.typeChambre != null)
         {
            TypeChambre oldTypeChambre = this.typeChambre;
            this.typeChambre = null;
            oldTypeChambre.removeChambre(this);
         }
         if (newTypeChambre != null)
         {
            this.typeChambre = newTypeChambre;
            this.typeChambre.addChambre(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public EtatChambre getEtatChambre() {
      return etatChambre;
   }
   
   /** @pdGenerated default parent setter
     * @param newEtatChambre */
   public void setEtatChambre(EtatChambre newEtatChambre) {
      if (this.etatChambre == null || !this.etatChambre.equals(newEtatChambre))
      {
         if (this.etatChambre != null)
         {
            EtatChambre oldEtatChambre = this.etatChambre;
            this.etatChambre = null;
            oldEtatChambre.removeChambre(this);
         }
         if (newEtatChambre != null)
         {
            this.etatChambre = newEtatChambre;
            this.etatChambre.addChambre(this);
         }
      }
   }

}