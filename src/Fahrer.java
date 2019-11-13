
public class Fahrer extends Mensch {

	private String[] führerscheinklassen;
	private String ausweisnummer;
	
	public Fahrer (String vorname, String nachname, long geburtsdatum) {
		super (vorname, nachname, geburtsdatum);
	}
	
	public Fahrer (String vorname, String nachname, long geburtsdatum, String ausweisnummer) {
		this (vorname, nachname, geburtsdatum);
		this.ausweisnummer = ausweisnummer;
	}
	
	public Fahrer (String vorname, String nachname, long geburtsdatum, String[] führerscheinklassen) {
		this (vorname, nachname, geburtsdatum);
		this.führerscheinklassen = führerscheinklassen;
	}
	
	public Fahrer (String vorname, String nachname, long geburtsdatum, String[] führerscheinklassen, String ausweisnummer) {
		this (vorname, nachname, geburtsdatum, führerscheinklassen);
		this.ausweisnummer = ausweisnummer;
	}
	
	
	
	public boolean darfAutoFahren (Auto auto) {
		
		String benötigteFührerscheinklasse = auto.getBenötigteFührerscheinklasse ();
		
		for (int index = 0; index < führerscheinklassen.length; index ++)
			if (führerscheinklassen [index].equalsIgnoreCase(benötigteFührerscheinklasse))
				return true;
		
		return false;
	}

	// getter:
	public String[] getFührerscheinklassen () { return führerscheinklassen; }
	public String getAusweisnummer () { return ausweisnummer; }

	// setter:
	public void setFührerscheinklassen (String[] führerscheinklassen) { this.führerscheinklassen = führerscheinklassen; }
	public void setAusweisnummer (String ausweisnummer) { this.ausweisnummer = ausweisnummer; }

	
}
