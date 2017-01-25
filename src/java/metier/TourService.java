package metier;

/***********************************************************************
 * Module:  TourService.java
 * Author:  ITU
 * Purpose: Defines the Class TourService
 ***********************************************************************/

import java.util.*;
import personne.Personnel;

/** @pdOid 5d2da689-66ef-4988-9b1b-d1ce5d816fe3 */
public class TourService {
   /** @pdOid ff600de5-f9ab-4ee3-abd7-911634d31863 */
   public long idTourService;
   /** @pdOid e79d1668-ab4a-493c-9e90-b8415f0bac7e */
   public java.util.Date debutService;
   /** @pdOid 9aa6203c-ee7a-49d4-ad1a-788b5d5b7894 */
   public java.util.Date finService;
   
   /** @pdRoleInfo migr=no name=Personnel assc=tourPersonnel mult=1..1 side=A */
   public Personnel personnel;
   /** @pdRoleInfo migr=no name=GestionTour assc=elaborationTour mult=1..1 side=A */
   public GestionTour gestionTour;
   
   
   /** @pdGenerated default parent getter */
   public Personnel getPersonnel() {
      return personnel;
   }
   /** @pdGenerated default parent getter */
   public GestionTour getGestionTour() {
      return gestionTour;
   }
   
   /** @pdGenerated default parent setter
     * @param newGestionTour */
   public void setGestionTour(GestionTour newGestionTour) {
      if (this.gestionTour == null || !this.gestionTour.equals(newGestionTour))
      {
         if (this.gestionTour != null)
         {
            GestionTour oldGestionTour = this.gestionTour;
            this.gestionTour = null;
            oldGestionTour.removeTourService(this);
         }
         if (newGestionTour != null)
         {
            this.gestionTour = newGestionTour;
            this.gestionTour.addTourService(this);
         }
      }
   }

}