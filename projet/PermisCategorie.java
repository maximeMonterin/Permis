package projet;

public class PermisCategorie {
	private CategorieVehicule categorieVehicule;
	private String dateReussite;
	
	public PermisCategorie(CategorieVehicule categorieVehicule, String dateReussite) {
		this.categorieVehicule = categorieVehicule;
		this.dateReussite = dateReussite;
	}

	@Override
	public String toString() {
		return categorieVehicule + " (" + dateReussite + ")";
	}
	
	
	
	
}
