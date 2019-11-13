import java.util.Date;

public class Rechnung extends Dokument {
	
	private int preisInCent;
	private Date fälligkeitsdatum;
	private Date zahlungsdatum; // UNIX Timestamp
	private String empfängerIBAN;
	
	private Mietvertrag mietvertrag;
	
	{ this.preisInCent = 0; this.fälligkeitsdatum = new Date (); this.zahlungsdatum = new Date (); this.empfängerIBAN = null; }
	
	public Rechnung (int preisInCent, Date fälligkeitsdatum, Date zahlungsdatum, String empfängerIBAN, Mietvertrag mietvertrag) {
		
		super (new Date (), 10);
		
		this.preisInCent = preisInCent;
		this.fälligkeitsdatum = fälligkeitsdatum;
		this.zahlungsdatum = zahlungsdatum;
		this.empfängerIBAN = empfängerIBAN;
		
		this.mietvertrag = mietvertrag;
		this.mietvertrag.setRechnung (this);
		
	}
	
	public boolean fristgerechtBezahlt () {
		
		if (this.zahlungsdatum.getTime() <= this.fälligkeitsdatum.getTime())
			return true;
		
		return false;
	}

	// getter:
	public int getPreisInCent () { return this.preisInCent; }
	public Date getFälligkeitsdatum () { return this.fälligkeitsdatum; }
	public Date getZahlungsdatum () { return this.zahlungsdatum; }
	public String getEmpfängerIBAN () { return this.empfängerIBAN; }
	public Mietvertrag getMietvertrag () { return this.mietvertrag; }

	// setter:
	public void setPreisInCent (int preisInCent) { this.preisInCent = preisInCent; }
	public void setFälligkeitsdatum (Date fälligkeitsdatum) { this.fälligkeitsdatum = fälligkeitsdatum; }
	public void setZahlungsdatum (Date zahlungsdatum) { this.zahlungsdatum = zahlungsdatum; }
	public void setEmpfängerIBAN (String empfängerIBAN) { this.empfängerIBAN = empfängerIBAN; }
	public void setMietvertrag (Mietvertrag mietvertrag) { this.mietvertrag = mietvertrag; }
	
	

}
