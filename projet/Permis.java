package projet;

import java.util.List;

public class Permis {
	private List<PermisCategorie> permisCategorie;
	private int numPermis;
	private int nbPoint;
	private Personne personne;
	
	public Permis(List<PermisCategorie> permisCategorie, int numPermis, int nbPoint, Personne personne) {
		this.permisCategorie = permisCategorie;
		this.numPermis = numPermis;
		this.nbPoint = nbPoint;
		this.personne = personne;
	}

	public List<PermisCategorie> getPermisCategorie() {
		return permisCategorie;
	}

	public int getNumPermis() {
		return numPermis;
	}

	public int getNbPoint() {
		return nbPoint;
	}

	public void setNbPoint(int nbPoint) {
		this.nbPoint = nbPoint;
	}

	public Personne getPersonne() {
		return personne;
	}

	@Override
	public String toString() {
		return "Permis No " + this.getNumPermis() + '\n' + "Titulaire: " + this.getPersonne().toString() + '\n' + "Catégorie(s): "
				+ this.getPermisCategorie().toString() + '\n' + "Nombre de points: " + this.getNbPoint();
	}

	
	
	
	
	
}
