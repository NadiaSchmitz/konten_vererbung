
public class Main {

	public static void main(String[] args) {
	
		Girokonto girokonto_1 = new Girokonto("260099999", 200, 1000.00, true, 5.0);
		girokonto_1.girokontoInfo();
		
		Tagesgeldkonto tagesgeldkonto_1 = new Tagesgeldkonto("260011177", 10000.12, 1.3);
		tagesgeldkonto_1.kontoInfo();
		
		Festgeldkonto festgeldkonto_1 = new Festgeldkonto("260078879", 3200.90, 2.2, 24);
		festgeldkonto_1.kontoInfo();

	}

}
