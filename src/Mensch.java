

public class Mensch {

	private String vorname;
	private String nachname;
	private long geburtsdatum;
	
	{ this.vorname = null; this.nachname = null; this.geburtsdatum = 0; }
	
	public Mensch (String vorname, String nachname, long geburtsdatum) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtsdatum = geburtsdatum;
	}
	
	public boolean isVolljährig () {
		
		long jetzt = System.currentTimeMillis();
		
		if (jetzt - this.geburtsdatum > (18 /* Jahre */ * 365 /* Tage */ * 24 /* Strunden */ * 60 /* Minuten */ * 60 /* Sekunden */ * 1000 /* Millisekunden */))
			return true;
		
		return false;
		
	}

	// getter:
	public String getVorname () { return vorname; }
	public String getNachname () { return nachname; }
	public long getGeburtsdatum () { return geburtsdatum; }

	// setter:
	public void setVorname (String vorname) { this.vorname = vorname; }
	public void setNachname (String nachname) { this.nachname = nachname; }
	public void setGeburtsdatum (long geburtsdatum) { this.geburtsdatum = geburtsdatum; }
	
	

}
