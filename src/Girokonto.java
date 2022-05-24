
public class Girokonto extends Konto {

	private double kreditrahmen;
	private boolean karte;
	private double bonuszahlung;
		
	public Girokonto(long kontonummer, double kontostand) {
		super(kontonummer, kontostand);
	}
	
	public Girokonto(long kontonummer, double kontostand, double kreditrahmen, boolean karte, double bonuszahlung) {
		super(kontonummer, kontostand);
		this.kreditrahmen = kreditrahmen;
		this.karte = karte;
		this.bonuszahlung = bonuszahlung;
	}
	
	public double getKreditrahmen() {
		return kreditrahmen;
	}
	
	public void setKreditrahmen(double kreditrahmen) {
		this.kreditrahmen = kreditrahmen;
	}
	public boolean isKarte() {
		return karte;
	}
	public void setKarte(boolean karte) {
		this.karte = karte;
	}
	public double getBonuszahlung() {
		return bonuszahlung;
	}
	public void setBonuszahlung(double bonuszahlung) {
		this.bonuszahlung = bonuszahlung;
	}
	
	
	
}
