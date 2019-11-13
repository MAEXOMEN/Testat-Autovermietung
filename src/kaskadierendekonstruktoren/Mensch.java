package kaskadierendekonstruktoren;

import java.util.Date;

public class Mensch {

	private String vorname;
	private String nachname;
	private Date geburtsdatum;
	
	public Mensch (String vorname, String nachname, Date geburtsdatum) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtsdatum = geburtsdatum;
	}
	
	@SuppressWarnings("deprecation")
	public boolean isVolljährig () {
		
		Date volljährig = new Date (this.geburtsdatum.getDate());
		volljährig.setYear(volljährig.getYear() + 18);
		
		if (new Date ().getTime() > volljährig.getTime())
			return true;
		
		return false;
		
	}
	
	public String getUnterschrift () {
		return this.vorname.substring(0, 1) + ". " + this.nachname;
	}
	
}
