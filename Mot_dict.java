package td1ex9;

public class Mot_dict {

    private String mot;
    private String definition;
	public Mot_dict(String mot, String definition) {
		this.mot = mot;
		this.definition = definition;
	}

	public String getMot() {
		return mot;
	}

	public String getDefinition() {
		return definition;
	}

	public void setMot(String mot) {
		this.mot = mot;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}
	public boolean synonyme(Mot_dict m ) {
		return this.mot.equals(m.mot);
	}
	
	public String toString() {
	    return "Mot : " + mot + ", Definition : " + definition;
	}
	

	
	
	

}
