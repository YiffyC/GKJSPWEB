package bibliotheque;

public class Livre
{
	String titre;
	double prix;
	String ref;
	Auteur auteur;
	
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public Auteur getAuteur() {
		return auteur;
	}
	public void setAuteur(Auteur a) {
		this.auteur = a;
	}
	
	
	
}
