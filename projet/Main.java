package projet;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Personne albertBrenaman = new Personne("Albert", "Brenaman", "01/01/1980");
		
		PermisCategorie permisCategorieAlbertMoto = new PermisCategorie(CategorieVehicule.MOTO, "01/01/2022");
		PermisCategorie permisCategorieAlbertVoiture = new PermisCategorie(CategorieVehicule.VOITURE, "01/03/2022");
		
		List<PermisCategorie> permisCategorieAlbert = new ArrayList<>();
		permisCategorieAlbert.add(permisCategorieAlbertMoto);
		permisCategorieAlbert.add(permisCategorieAlbertVoiture);
		
		Permis permisAlbert = new Permis(permisCategorieAlbert, 100014, 12, albertBrenaman);
		
		System.out.println(permisAlbert);
	}

}
