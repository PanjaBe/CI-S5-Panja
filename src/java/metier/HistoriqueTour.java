package metier;

/***********************************************************************
 * Module:  HistoriqueTour.java
 * Author:  ITU
 * Purpose: Defines the Class HistoriqueTour
 ***********************************************************************/

import java.util.*;
import personne.Personnel;

/** @pdOid cf8d3c99-9de3-40e2-b689-9b12db72329e */
public class HistoriqueTour {
   /** @pdOid deec8138-7507-43c0-8e35-114703fed622 */
   public long idHistoriqueTour;
   /** @pdOid 28af8a56-27d7-4e50-a351-a407bd890dcc */
   public java.util.Date debutTour;
   /** @pdOid 02ad8d4d-f362-4a17-b62e-2ff07ac60d9d */
   public java.util.Date finTour;
   
   /** @pdRoleInfo migr=no name=Personnel assc=historique mult=1..1 side=A */
   public Personnel personnel;
   /** @pdRoleInfo migr=no name=GestionTour assc=gestionHistoriaue mult=1..1 side=A */
   public GestionTour gestionTour;
   
   
   /** @pdGenerated default parent getter */
   public Personnel getPersonnel() {
      return personnel;
   }
   
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
            oldGestionTour.removeHistoriqueTour(this);
         }
         if (newGestionTour != null)
         {
            this.gestionTour = newGestionTour;
            this.gestionTour.addHistoriqueTour(this);
         }
      }
   }

}