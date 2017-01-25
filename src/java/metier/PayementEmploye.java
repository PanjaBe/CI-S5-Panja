package metier;

/***********************************************************************
 * Module:  PayementEmploye.java
 * Author:  ITU
 * Purpose: Defines the Class PayementEmploye
 ***********************************************************************/

import java.util.*;
import personne.Personnel;

/** @pdOid 186d71b1-59b5-4f25-af59-e4414e30c40d */
public class PayementEmploye {
   /** @pdOid 47960ce9-68ad-48d6-bdb7-c7b1f7b99987 */
   public long idPayementEmploye;
   /** @pdOid ec881628-edbe-4052-b29c-99a9d9c041d1 */
   public float valeurSalaire;
   /** @pdOid b84c059d-cb49-40bc-9be4-a86a350275ff */
   public java.util.Date dateReglement;
   
   /** @pdRoleInfo migr=no name=Personnel assc=reglementSalaire mult=1..1 side=A */
   public Personnel personnel;
   
   /** @pdGenerated default parent getter */
   public Personnel getPersonnel() {
      return personnel;
   }
}