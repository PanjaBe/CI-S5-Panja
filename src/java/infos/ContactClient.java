package infos;

import personne.Client;

public class ContactClient {
   public long idContactClient;
   public java.util.Date modificationContactC;
   public int telephoneClient;
   public java.lang.String adresseClient;
   public java.lang.String mailClient;
   public Client client;
   
   
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
            oldClient.removeContactClient(this);
         }
         if (newClient != null)
         {
            this.client = newClient;
            this.client.addContactClient(this);
         }
      }
   }

}