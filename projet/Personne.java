package projet;

public class Personne {
	private String prenom;
	private String nom;
	private String dateNaissance;
	
	public Personne(String prenom, String nom, String dateNaissance) {
		this.prenom = prenom;
		this.nom = nom;
		this.dateNaissance = dateNaissance;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getNom() {
		return nom;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	@Override
	public String toString() {
		return this.getNom() + ", " + this.getPrenom() + ", " + this.getDateNaissance();
	}
	
	
	
	
}
