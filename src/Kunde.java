
public class Kunde {

	private String name;
	private String vorname;
	private String adresse;
	private long telefonnummer;
	
	public Kunde() {
		
	}
	
	public Kunde(String name, String vorname, String adresse) {
		this.name = name;
		this.vorname = vorname;
		this.adresse = adresse;
	}
	
	public Kunde(String name, String vorname, String adresse, long telefonnummer) {
		this.name = name;
		this.vorname = vorname;
		this.adresse = adresse;
		this.telefonnummer = telefonnummer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public long getTelefonnummer() {
		return telefonnummer;
	}

	public void setTelefonnummer(long telefonnummer) {
		this.telefonnummer = telefonnummer;
	}
	
	
	
}
