package henneeiproblem;

public class Vertrag {

	private String titel;
	private String mitarbeitername;
	private Kunde kunde;
	
	public Vertrag (String titel, String mitarbeitername) {
		this.titel = titel;
		this.mitarbeitername = mitarbeitername;
	} 
	
	public void setKunde (Kunde kunde) {
		this.kunde = kunde;
	}
	
}
