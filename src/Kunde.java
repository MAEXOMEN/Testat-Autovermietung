
public class Kunde extends Mensch {
	
	private String anschrift;
	private String IBAN;
	
	{ this.anschrift = null; this.IBAN = null; }

	public Kunde (String vorname, String nachname, long geburtsdatum, String anschrift, String IBAN) {
		super (vorname, nachname, geburtsdatum);
		this.anschrift = anschrift;
		this.IBAN = IBAN;
	}
	
	public Kunde (String vorname, String nachname, long geburtsdatum, String anschrift) {
		this (vorname, nachname, geburtsdatum, anschrift, null);
	}

	
}
