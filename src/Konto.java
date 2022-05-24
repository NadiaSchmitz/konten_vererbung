
public class Konto {

	private long kontonummer;
	private double kontostand;
	
	public Konto(long kontonummer, double kontostand) {
		this.kontonummer = kontonummer;
		this.kontostand = kontostand;
	}
	
	public long getKontonummer() {
		return kontonummer;
	}
	public void setKontonummer(long kontonummer) {
		this.kontonummer = kontonummer;
	}
	public double getKontostand() {
		return kontostand;
	}
	public void setKontostand(double kontostand) {
		this.kontostand = kontostand;
	}
	
	
	
}
