package td1ex9;

public class main {
	 public static void main(String[] args) {
		 Mot_dict m1 = new Mot_dict("Cercle", "Forme circulaire");
	     Mot_dict m2 = new Mot_dict("Rectangle", "Forme rectangulaire");
	     
	     Mot_dict[] tab = new Mot_dict[5];
	     Dictionnaire d = new Dictionnaire(0, tab, "Dictionnaire");

	     d.Ajouter_Mot(m1);
	     d.Ajouter_Mot(m2);
	     d.Lister_dictionnaire();
	     System.out.println(d.Recherche_dicho("Cercle"));
	     d.Supprimer_Mot(m2);
	     d.Lister_dictionnaire();
	     System.out.println("nombre de synonymes");
	     System.out.println(d.Nombre_synonyme(m1));
	     
	     
	     
		 
	 }

}
