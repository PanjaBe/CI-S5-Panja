package metier;

/***********************************************************************
 * Module:  PayementClient.java
 * Author:  ITU
 * Purpose: Defines the Class PayementClient
 ***********************************************************************/

import java.util.*;
import personne.Personnel;

/** @pdOid b90be3bb-7bd6-4d25-9db1-bee8e72860f9 */
public class PayementClient {
   /** @pdOid faeb89e6-98b7-48f0-bf65-22187e4ca4da */
   public long idPayementClient;
   /** @pdOid 6daf7dc2-a77f-4db7-b665-f765769973b4 */
   public float valeurPayement;
   /** @pdOid 7d0f9415-9692-42c4-a4c1-5bc2400dfb62 */
   public java.util.Date datePayement;
   
   /** @pdRoleInfo migr=no name=Reservation assc=payementReservation mult=1..1 side=A */
   public Reservation reservation;
   /** @pdRoleInfo migr=no name=Personnel assc=association19 mult=1..1 side=A */
   public Personnel personnel;
   
   
   /** @pdGenerated default parent getter */
   public Reservation getReservation() {
      return reservation;
   }
   
   /** @pdGenerated default parent setter
     * @param newReservation */
   public void setReservation(Reservation newReservation) {
      if (this.reservation == null || !this.reservation.equals(newReservation))
      {
         if (this.reservation != null)
         {
            Reservation oldReservation = this.reservation;
            this.reservation = null;
            oldReservation.removePayementClient(this);
         }
         if (newReservation != null)
         {
            this.reservation = newReservation;
            this.reservation.addPayementClient(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Personnel getPersonnel() {
      return personnel;
   }
}