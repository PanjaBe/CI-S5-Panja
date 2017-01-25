package personne;

/***********************************************************************
 * Module:  Client.java
 * Author:  ITU
 * Purpose: Defines the Class Client
 ***********************************************************************/

import infos.ContactClient;
import java.util.*;
import metier.Reservation;

/** @pdOid ce16c112-6aca-4afd-a887-5a954d555a7e */
public class Client {
   /** @pdOid 18b43729-f246-4cf7-87ab-67cb0cd94ce2 */
   public long idClient;
   /** @pdOid 3bf1108b-5f35-425f-b6c2-ea345e31d19c */
   public java.lang.String nomClient;
   /** @pdOid 17bfd570-84a6-40fa-b0c8-00a08405832c */
   public java.lang.String prenomClient;
   
   /** @pdRoleInfo migr=no name=Reservation assc=reservationClient coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Reservation> reservation;
   /** @pdRoleInfo migr=no name=ContactClient assc=contactClient coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<ContactClient> contactClient;
   
   
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
         newReservation.setClient(this);      
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
            oldReservation.setClient((Client)null);
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
            oldReservation.setClient((Client)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<ContactClient> getContactClient() {
      if (contactClient == null)
         contactClient = new java.util.HashSet<ContactClient>();
      return contactClient;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorContactClient() {
      if (contactClient == null)
         contactClient = new java.util.HashSet<ContactClient>();
      return contactClient.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newContactClient */
   public void setContactClient(java.util.Collection<ContactClient> newContactClient) {
      removeAllContactClient();
      for (java.util.Iterator iter = newContactClient.iterator(); iter.hasNext();)
         addContactClient((ContactClient)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newContactClient */
   public void addContactClient(ContactClient newContactClient) {
      if (newContactClient == null)
         return;
      if (this.contactClient == null)
         this.contactClient = new java.util.HashSet<ContactClient>();
      if (!this.contactClient.contains(newContactClient))
      {
         this.contactClient.add(newContactClient);
         newContactClient.setClient(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldContactClient */
   public void removeContactClient(ContactClient oldContactClient) {
      if (oldContactClient == null)
         return;
      if (this.contactClient != null)
         if (this.contactClient.contains(oldContactClient))
         {
            this.contactClient.remove(oldContactClient);
            oldContactClient.setClient((Client)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllContactClient() {
      if (contactClient != null)
      {
         ContactClient oldContactClient;
         for (java.util.Iterator iter = getIteratorContactClient(); iter.hasNext();)
         {
            oldContactClient = (ContactClient)iter.next();
            iter.remove();
            oldContactClient.setClient((Client)null);
         }
      }
   }

}