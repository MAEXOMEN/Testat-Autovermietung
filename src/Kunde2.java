
public class Kunde2 extends Mensch {
	
	private String anschrift;
	private String IBAN;
	
	{ this.anschrift = null; this.IBAN = null; }

	public Kunde2 (String vorname, String nachname, long geburtsdatum, String anschrift) {
		super (vorname, nachname, geburtsdatum);
		this.anschrift = anschrift;
	}
	
	public Kunde2 (String vorname, String nachname, long geburtsdatum, String anschrift, String IBAN) {
		this (vorname, nachname, geburtsdatum, anschrift);
		this.IBAN = IBAN;
	}
}
