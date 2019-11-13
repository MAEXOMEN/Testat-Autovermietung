
public class Rechnung extends Dokument {
	
	private int preisInCent;
	private long fälligkeitsdatum;
	private long zahlungsdatum;
	private String empfängerIBAN;
	
	{
		this.preisInCent = 0;
		this.fälligkeitsdatum = 0;
		this.zahlungsdatum = 0;
		this.empfängerIBAN = null;
	}
	
	public Rechnung (int preisInCent, long fälligkeitsdatum, long zahlungsdatum, String empfängerIBAN) {
		
		this.preisInCent = preisInCent;
		this.fälligkeitsdatum = fälligkeitsdatum;
		this.zahlungsdatum = zahlungsdatum;
		this.empfängerIBAN = empfängerIBAN;
		
	}
	
	public boolean fristgerechtBezahlt () {
		
		if (this.zahlungsdatum <= this.fälligkeitsdatum)
			return true;
		
		return false;
	}

	public int getPreisInCent() {
		return preisInCent;
	}

	public void setPreisInCent(int preisInCent) {
		this.preisInCent = preisInCent;
	}

	public long getFälligkeitsdatum() {
		return fälligkeitsdatum;
	}

	public void setFälligkeitsdatum(long fälligkeitsdatum) {
		this.fälligkeitsdatum = fälligkeitsdatum;
	}

	public long getZahlungsdatum() {
		return zahlungsdatum;
	}

	public void setZahlungsdatum(long zahlungsdatum) {
		this.zahlungsdatum = zahlungsdatum;
	}

	public String getEmpfängerIBAN() {
		return empfängerIBAN;
	}

	public void setEmpfängerIBAN(String empfängerIBAN) {
		this.empfängerIBAN = empfängerIBAN;
	}
	
	

}
