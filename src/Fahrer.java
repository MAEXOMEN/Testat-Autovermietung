import java.util.Date;

public class Fahrer extends Mensch {
	
	private String[] führerscheinklassen;
	private Mieter mieter;
	
	private Mietvertrag[] mietverträge;
	private int letzterIndex;

	{ this.führerscheinklassen = new String [10]; this.mieter = null; this.mietverträge = new Mietvertrag [100]; this.letzterIndex = 0; }
	
	public Fahrer (String vorname, String nachname, Date geburtsdatum, String[] führerscheinklassen) {
		super (vorname, nachname, geburtsdatum);
		this.führerscheinklassen = führerscheinklassen;
	}
	
	public boolean darfAutoFahren (Auto auto) {
		
		String benötigteFührerscheinklasse = auto.getBenötigteFührerscheinklasse ();
		
		for (int index = 0; index < führerscheinklassen.length; index ++)
			if (führerscheinklassen [index].equalsIgnoreCase(benötigteFührerscheinklasse))
				return true;
		
		return false;
	}

	public void addMietvertrag (Mietvertrag mietvertrag) {
		
		if (this.letzterIndex >= this.mietverträge.length) {
			System.out.println ("[INFORMATION]: Sie haben das Limit an Mietverträgen erreicht.");
			return;
		}
		
		this.mietverträge [letzterIndex] = mietvertrag;
		this.letzterIndex ++;
	}
	
	// getter:
	public String[] getFührerscheinklassen () { return this.führerscheinklassen; }
	public Mieter getMieter () {return this.mieter;}

	// setter:
	public void setFührerscheinklassen (String[] führerscheinklassen) { this.führerscheinklassen = führerscheinklassen; }
	public void setMieter (Mieter mieter) { this.mieter = mieter; }

}
