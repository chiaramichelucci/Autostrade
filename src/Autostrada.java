public class Autostrada {
	public static void main (String [] args) {

		Veicoli uno=new Veicoli("Tipo", "Fiat", "ps215ui", 2018, 2, 200, 120);
		System.out.println("La classe del veicolo 1 è: " +uno.getClasse());
		System.out.println("Il suo modello è: " +uno.getModello());
		System.out.println("Con marca " +uno.getMarca());
		System.out.println("Targa: " +uno.getTarga());
		System.out.println("Veicolo dell'anno " +uno.getAnno());
		System.out.println("Con numero di assi " +uno.getAssi());
		System.out.println("Un peso di: " +uno.getPeso());
		System.out.println("Altezza (cm): " +uno.getAltezza());
		System.out.println("La tariffa unitaria applicabile è: " +uno.getTariffaUnitaria());
		double t=uno.getTariffaUnitaria(); 

		Pedaggio uno1 = new Pedaggio(22, t, 120, 250);
		System.out.println("Il pedaggio è pari a: " +uno1.getPedaggio());
		System.out.println("I Km percorsi sono " +uno1.kmPercorsi());
		System.out.println("La tariffa applicata è pari a: " +uno1.getTariffa());
		System.out.println("L'iva applicata è pari a " +uno1.getIva()+ "%");
		System.out.println("Km entrata: " +uno1.getKm1());
		System.out.println("Km uscita: " +uno1.getKm2());
		
		Casello uno2 = new Casello ("LAquila_Ovest", 320);
		Casello due2 = new Casello ("Colledara", 290);
		System.out.println("Casello1: " +uno2.nome()+ " al km " +uno2.getKm());
		System.out.println("Casello2:" +due2.nome()+ " al km " +due2.getKm());
		

	}

}
