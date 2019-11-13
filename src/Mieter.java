import java.util.Date;

public class Mieter extends Mensch {

	private String IBAN;
	
	private Mietvertrag[] mietverträge;
	private int letzterIndex;
	
	private Fahrer fahrer;
	
	{ this.IBAN = null; this.letzterIndex = 0; this.mietverträge = new Mietvertrag [100]; }
	
	public Mieter(String vorname, String nachname, Date geburtsdatum) {
		super(vorname, nachname, geburtsdatum);
	}
	
	public Mieter (String vorname, String nachname, Date geburtsdatum, String IBAN) {
		this (vorname, nachname, geburtsdatum);
		this.IBAN = IBAN;
	}

	public Mieter (String vorname, String nachname, Date geburtsdatum, String IBAN, Fahrer fahrer) {
		this (vorname, nachname, geburtsdatum, IBAN);
		this.fahrer = fahrer;
		this.fahrer.setMieter (this);
	}
	
	public void addMietvertrag (Mietvertrag mietvertrag) {
		
		if (this.letzterIndex >= this.mietverträge.length) {
			System.out.println ("[INFORMATION]: Sie haben das Limit an Mietverträgen erreicht.");
			return;
		}
		
		this.mietverträge [letzterIndex] = mietvertrag;
		this.letzterIndex ++;
	}
	
	public String generiereUnterschrift () { return this.getVorname().substring(0, 1) + ". " + this.getNachname(); }

	// getter:
	public String getIBAN () { return this.IBAN; }
	public Fahrer getFahrer () { return this.fahrer; }

	// setter:
	public void setIBAN (String IBAN) { this.IBAN = IBAN; }
	// es gibt keinen setter für den Fahrer, weil der Mieter und der Fahrer ja eigentlich die selbe Person sind und damit ist es unnötig.

}
