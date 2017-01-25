package metier;

/***********************************************************************
 * Module:  Reservation.java
 * Author:  ITU
 * Purpose: Defines the Class Reservation
 ***********************************************************************/

import java.util.*;
import materiels.Chambre;
import personne.*;

/** @pdOid aae4b2cf-942f-48ec-a47d-81dda36e6716 */
public class Reservation {
   /** @pdOid fc668a76-d4ab-48a6-86c8-aa24995b287a */
   public long idReservation;
   /** @pdOid c88e2a93-68a6-40d2-a840-bbbb5f5fb2e7 */
   public java.util.Date dateReservation;
   /** @pdOid 699c3e59-92c6-4db5-a96e-434e78cc294e */
   public java.util.Date debutReservation;
   /** @pdOid d4ef7be5-88eb-4a65-a1b6-351e6c46eeb0 */
   public java.util.Date finReservation;
   /** @pdOid 2e0c1063-586f-41ee-b04c-ca794faab474 */
   public boolean estConfirme;
   
   /** @pdRoleInfo migr=no name=PayementClient assc=payementReservation coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<PayementClient> payementClient;
   /** @pdRoleInfo migr=no name=Chambre assc=reservationChambre mult=1..1 side=A */
   public Chambre chambre;
   /** @pdRoleInfo migr=no name=Client assc=reservationClient mult=1..1 side=A */
   public Client client;
   /** @pdRoleInfo migr=no name=Personnel assc=receptioniste mult=1..1 side=A */
   public Personnel personnel;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<PayementClient> getPayementClient() {
      if (payementClient == null)
         payementClient = new java.util.HashSet<PayementClient>();
      return payementClient;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorPayementClient() {
      if (payementClient == null)
         payementClient = new java.util.HashSet<PayementClient>();
      return payementClient.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newPayementClient */
   public void setPayementClient(java.util.Collection<PayementClient> newPayementClient) {
      removeAllPayementClient();
      for (java.util.Iterator iter = newPayementClient.iterator(); iter.hasNext();)
         addPayementClient((PayementClient)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newPayementClient */
   public void addPayementClient(PayementClient newPayementClient) {
      if (newPayementClient == null)
         return;
      if (this.payementClient == null)
         this.payementClient = new java.util.HashSet<PayementClient>();
      if (!this.payementClient.contains(newPayementClient))
      {
         this.payementClient.add(newPayementClient);
         newPayementClient.setReservation(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldPayementClient */
   public void removePayementClient(PayementClient oldPayementClient) {
      if (oldPayementClient == null)
         return;
      if (this.payementClient != null)
         if (this.payementClient.contains(oldPayementClient))
         {
            this.payementClient.remove(oldPayementClient);
            oldPayementClient.setReservation((Reservation)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllPayementClient() {
      if (payementClient != null)
      {
         PayementClient oldPayementClient;
         for (java.util.Iterator iter = getIteratorPayementClient(); iter.hasNext();)
         {
            oldPayementClient = (PayementClient)iter.next();
            iter.remove();
            oldPayementClient.setReservation((Reservation)null);
         }
      }
   }
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
            oldChambre.removeReservation(this);
         }
         if (newChambre != null)
         {
            this.chambre = newChambre;
            this.chambre.addReservation(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Client getClient() {
      return client;
   }
   
   /** @pdGenerated default parent setter
     * @param newClient */
   public void setClient(Client newClient) {
      if (this.client == null || !this.client.equals(newClient))
      {
         if (this.client != null)
         {
            Client oldClient = this.client;
            this.client = null;
            oldClient.removeReservation(this);
         }
         if (newClient != null)
         {
            this.client = newClient;
            this.client.addReservation(this);
         }
      }
   }
   
   public Personnel getPersonnel() {
      return personnel;
   }
}