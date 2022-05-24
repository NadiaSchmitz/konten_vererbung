
public class Girokonto extends Konto {

	protected double kreditrahmen;
	protected boolean karte;
	protected double bonuszahlung;
		
	public Girokonto(String kontonummer, double kontostand) {
		super(kontonummer, kontostand);
	}
	
	public Girokonto(String kontonummer, double kontostand, double kreditrahmen, boolean karte, double bonuszahlung) {
		super(kontonummer, kontostand);
		this.kreditrahmen = kreditrahmen;
		this.karte = karte;
		this.bonuszahlung = bonuszahlung;
	}
	
	public void girokontoInfo() {
		System.out.printf(" %-15s %-15s %-15s %-15s %-15s %-15s", "Kontonummer", "Kontozustand", "Kontotyp", "Kreditrahmen", "Karte", "Bonuszahlung");
		System.out.println();
		System.out.printf(" %-15s %-15s %-15s %-15s %-15s %-15s", kontonummer, kontostand, "Girokonto", kreditrahmen, karte, bonuszahlung);
		System.out.println();
		System.out.println();
	}
	
}
