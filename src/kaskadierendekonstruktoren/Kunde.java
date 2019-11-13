package kaskadierendekonstruktoren;
import java.util.Date;

public class Kunde extends Mensch {
	
	private String anschrift;
	private String IBAN;
	
	{ this.anschrift = null; this.IBAN = null; }

	public Kunde (String vorname, String nachname, Date geburtsdatum, String anschrift) {
		super (vorname, nachname, geburtsdatum);
		this.anschrift = anschrift;
	}
	
	public Kunde (String vorname, String nachname, Date geburtsdatum, String anschrift, String IBAN) {
		this (vorname, nachname, geburtsdatum, anschrift);
		this.IBAN = IBAN;
	}

	public String getAnschrift () {
		return anschrift;
	}

	public void setAnschrift (String anschrift) {
		this.anschrift = anschrift;
	}

	public String getIBAN () {
		return IBAN;
	}

	public void setIBAN (String iBAN) {
		IBAN = iBAN;
	}
	
	
}
