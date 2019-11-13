

public class Dokument {

	private long erstellungsdatum;
	private int seitenanzahl;
	private long enddatumarchivierung;
	
	{ this.erstellungsdatum = 0; this.seitenanzahl = 1; this.enddatumarchivierung = 0; }
	
	public Dokument () {
		
	}
	
	public boolean kannEntsorgtWerden () {
		
		long jetzt = System.currentTimeMillis ();
		
		if (jetzt > this.enddatumarchivierung)
			return true;
		
		return false;
		
	}

	public long getErstellungsdatum() {
		return erstellungsdatum;
	}

	public void setErstellungsdatum(long erstellungsdatum) {
		this.erstellungsdatum = erstellungsdatum;
	}

	public int getSeitenanzahl() {
		return seitenanzahl;
	}

	public void setSeitenanzahl(int seitenanzahl) {
		this.seitenanzahl = seitenanzahl;
	}

	public long getEnddatumarchivierung() {
		return enddatumarchivierung;
	}

	public void setEnddatumarchivierung(long enddatumarchivierung) {
		this.enddatumarchivierung = enddatumarchivierung;
	}
	
	

}
