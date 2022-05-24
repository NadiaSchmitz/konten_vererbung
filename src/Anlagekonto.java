
public class Anlagekonto extends Konto {
	
	private double zinsensatz;
	
	public Anlagekonto(long kontonummer, double kontozustand) {
		super(kontonummer, kontozustand);
	}
	
	public Anlagekonto(long kontonummer, double kontozustand, double zinsensatz) {
		super(kontonummer, kontozustand);
		this.zinsensatz = zinsensatz;
	}

	public double getZinsensatz() {
		return zinsensatz;
	}

	public void setZinsensatz(double zinsensatz) {
		this.zinsensatz = zinsensatz;
	}
	
	

}
