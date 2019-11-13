import java.util.Date;

public class Dokument {

	private Date erstellungsdatum;
	private Date enddatumarchivierung;
	
	{ this.erstellungsdatum = new Date (); this.enddatumarchivierung = new Date (); }
	
	@SuppressWarnings("deprecation")
	public Dokument (Date erstellungsdatum, int archivierungsJahreAnzahl) {
	
		this.erstellungsdatum = erstellungsdatum;
		this.enddatumarchivierung = new Date (erstellungsdatum.getTime());
		this.enddatumarchivierung.setYear(this.enddatumarchivierung.getYear() + archivierungsJahreAnzahl);
		
	}
	
	public boolean kannEntsorgtWerden () {
		
		long jetzt = System.currentTimeMillis ();
		
		if (jetzt > this.enddatumarchivierung.getTime())
			return true;
		
		return false;
		
	}

	public Date getErstellungsdatum() {
		return erstellungsdatum;
	}

	public void setErstellungsdatum(Date erstellungsdatum) {
		this.erstellungsdatum = erstellungsdatum;
	}

	public Date getEnddatumarchivierung() {
		return enddatumarchivierung;
	}

	public void setEnddatumarchivierung(Date enddatumarchivierung) {
		this.enddatumarchivierung = enddatumarchivierung;
	}
	
	

}
