package td1ex9;

public class Dictionnaire {
	  private int nb_mots;
	    private Mot_dict[] dict;
	    private String nom;
		public Dictionnaire(int nb_mots, Mot_dict[] dict, String nom) {
			this.nb_mots = nb_mots;
			this.dict = dict;
			this.nom = nom;
		}
		public void Ajouter_Mot(Mot_dict m) {
			if(nb_mots<dict.length) {
				dict[nb_mots]=m;
				nb_mots++;
				Trier();
			}
			
		}
		 public void Trier() {
			 for (int i = 0; i < nb_mots - 1; i++) {
				 for (int j = i + 1; j < nb_mots; j++) {
					 if(dict[i].getMot().compareTo(dict[j].getMot()) > 0) {
						 Mot_dict temp = dict[i];
			             dict[i] = dict[j];
			             dict[j] = temp;
						 
					 }
					 
				 }
				 
			 }
			 
		 }
		  public void Supprimer_Mot(Mot_dict m) {

		        for (int i = 0; i < nb_mots; i++) {

		            if (dict[i].getMot().equals(m.getMot())) {

		                for (int j=i;j< nb_mots-1;j++) {
		                    dict[j] = dict[j + 1];
		                }

		                dict[nb_mots - 1] = null;
		                nb_mots--;

		                break;
		            }
		        }
		    }
		  public String Recherche_dicho(String mot) {

		        int debut=0;
		        int fin=nb_mots-1;
		        while (debut<=fin) {

		            int milieu=(debut+fin)/2;
		            int comparaison = dict[milieu].getMot().compareTo(mot);
		            if (comparaison==0) {
		                return dict[milieu].getDefinition();
		            }
		            if (comparaison < 0) {
		                debut=milieu+1;
		            } else {
		                fin=milieu-1;
		            }
		        }

		        return "Mot non trouvé";
		    }
		  public void Lister_dictionnaire() {
			  for (int i = 0; i < nb_mots; i++) {
				  System.out.println("Mot : " + dict[i].getMot());
				  System.out.println("Définition : " + dict[i].getDefinition());
			  }
			  
		  }
		  public int Nombre_synonyme(Mot_dict m) {

		        int compteur=0;
		        for (int i = 0; i < nb_mots; i++) {

		            if (dict[i].synonyme(m)) {
		                compteur++;
		            }
		        }
		        return compteur;
		    }
	    
	    
	

}
