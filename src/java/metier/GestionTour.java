package metier;

/***********************************************************************
 * Module:  GestionTour.java
 * Author:  ITU
 * Purpose: Defines the Class GestionTour
 ***********************************************************************/

import java.util.*;

/** @pdOid 37576f77-4ccc-4fc4-9dcc-dbe9560d93ed */
public class GestionTour {
   /** @pdOid 6eb6ffc1-14d1-4842-a829-15ab71cab934 */
   public long idGestionTour;
   /** @pdOid b004c916-5aed-4ce7-8b13-624d9e06516b */
   public java.lang.String jourTour;
   /** @pdOid 2ff14b0d-8894-468b-84fa-c84c2863f6d7 */
   public java.util.Date heureDebutTour;
   /** @pdOid a6ce04e8-d47c-48d6-8a3f-31454b2a1c26 */
   public java.util.Date heureFinTour;
   
   /** @pdRoleInfo migr=no name=TourService assc=elaborationTour coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<TourService> tourService;
   /** @pdRoleInfo migr=no name=HistoriqueTour assc=gestionHistoriaue coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<HistoriqueTour> historiqueTour;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<TourService> getTourService() {
      if (tourService == null)
         tourService = new java.util.HashSet<TourService>();
      return tourService;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorTourService() {
      if (tourService == null)
         tourService = new java.util.HashSet<TourService>();
      return tourService.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newTourService */
   public void setTourService(java.util.Collection<TourService> newTourService) {
      removeAllTourService();
      for (java.util.Iterator iter = newTourService.iterator(); iter.hasNext();)
         addTourService((TourService)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTourService */
   public void addTourService(TourService newTourService) {
      if (newTourService == null)
         return;
      if (this.tourService == null)
         this.tourService = new java.util.HashSet<TourService>();
      if (!this.tourService.contains(newTourService))
      {
         this.tourService.add(newTourService);
         newTourService.setGestionTour(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldTourService */
   public void removeTourService(TourService oldTourService) {
      if (oldTourService == null)
         return;
      if (this.tourService != null)
         if (this.tourService.contains(oldTourService))
         {
            this.tourService.remove(oldTourService);
            oldTourService.setGestionTour((GestionTour)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTourService() {
      if (tourService != null)
      {
         TourService oldTourService;
         for (java.util.Iterator iter = getIteratorTourService(); iter.hasNext();)
         {
            oldTourService = (TourService)iter.next();
            iter.remove();
            oldTourService.setGestionTour((GestionTour)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<HistoriqueTour> getHistoriqueTour() {
      if (historiqueTour == null)
         historiqueTour = new java.util.HashSet<HistoriqueTour>();
      return historiqueTour;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorHistoriqueTour() {
      if (historiqueTour == null)
         historiqueTour = new java.util.HashSet<HistoriqueTour>();
      return historiqueTour.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newHistoriqueTour */
   public void setHistoriqueTour(java.util.Collection<HistoriqueTour> newHistoriqueTour) {
      removeAllHistoriqueTour();
      for (java.util.Iterator iter = newHistoriqueTour.iterator(); iter.hasNext();)
         addHistoriqueTour((HistoriqueTour)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newHistoriqueTour */
   public void addHistoriqueTour(HistoriqueTour newHistoriqueTour) {
      if (newHistoriqueTour == null)
         return;
      if (this.historiqueTour == null)
         this.historiqueTour = new java.util.HashSet<HistoriqueTour>();
      if (!this.historiqueTour.contains(newHistoriqueTour))
      {
         this.historiqueTour.add(newHistoriqueTour);
         newHistoriqueTour.setGestionTour(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldHistoriqueTour */
   public void removeHistoriqueTour(HistoriqueTour oldHistoriqueTour) {
      if (oldHistoriqueTour == null)
         return;
      if (this.historiqueTour != null)
         if (this.historiqueTour.contains(oldHistoriqueTour))
         {
            this.historiqueTour.remove(oldHistoriqueTour);
            oldHistoriqueTour.setGestionTour((GestionTour)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllHistoriqueTour() {
      if (historiqueTour != null)
      {
         HistoriqueTour oldHistoriqueTour;
         for (java.util.Iterator iter = getIteratorHistoriqueTour(); iter.hasNext();)
         {
            oldHistoriqueTour = (HistoriqueTour)iter.next();
            iter.remove();
            oldHistoriqueTour.setGestionTour((GestionTour)null);
         }
      }
   }

}