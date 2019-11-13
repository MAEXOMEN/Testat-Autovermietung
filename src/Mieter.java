
public class Mieter extends Mensch {

	private String IBAN;
	
	{ this.IBAN = null; }
	
	public Mieter(String vorname, String nachname, long geburtsdatum) {
		super(vorname, nachname, geburtsdatum);
	}
	
	public Mieter(String vorname, String nachname, long geburtsdatum, String IBAN) {
		this (vorname, nachname, geburtsdatum);
		this.IBAN = IBAN;
	}
	
	public String generiereUnterschrift () { return this.getVorname().substring(0, 1) + ". " + this.getNachname(); }

	// getter:
	public String getIBAN() {
		return IBAN;
	}

	// setter:
	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}

}
