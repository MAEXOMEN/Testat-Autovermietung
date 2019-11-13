import java.util.Date;

public class Mietvertrag extends Dokument {

	private int mietdauerInTagen;
	private Date mietStartdatum;
	private Date kündigbarBisDatum;
	
	private Auto auto;
	private Mieter mieter;
	
	private Fahrer [] fahrer;
	private int letzterIndex;
	
	private Rechnung rechnung;
	
	{ this.mietdauerInTagen = 0; this.mietStartdatum = new Date (); this.kündigbarBisDatum = new Date (); this.fahrer = new Fahrer [100]; this.letzterIndex = 0; }
	
	public Mietvertrag (Auto auto, Mieter mieter, Fahrer[] fahrer, int mietdauerInTagen, Date mietStartdatum, Date kündigbarBisDatum) {
		
		super (new Date (), 10);
		
		this.mietStartdatum = mietStartdatum;
		this.mietdauerInTagen = mietdauerInTagen;
		this.kündigbarBisDatum = kündigbarBisDatum;
		
		this.auto = auto;
		this.auto.setMietvertrag (this);
		
		this.mieter = mieter;
		this.mieter.addMietvertrag (this);
		
		for (int index = 0; index < fahrer.length; index++) {
			this.fahrer [this.letzterIndex] = fahrer [index];
			this.fahrer [this.letzterIndex].addMietvertrag (this);
			this.letzterIndex ++;
		}
			
		
	}
	
	public boolean kannGekündigtWerden () {
		
		long jetzt = System.currentTimeMillis();
		
		if (jetzt < this.kündigbarBisDatum.getTime()) 
			return true;
		
		if (jetzt > this.mietStartdatum.getTime() + this.mietdauerInTagen * 24 * 60 * 60 * 1000) 
			return true;
		
		return false;
		
	}

	// getter:
	public Auto getAuto() { return this.auto; }
	public Fahrer[] getFahrer() { return this.fahrer; }
	public Mieter getMieter () { return this.mieter; }
	public int getMietdauerInTagen () { return this.mietdauerInTagen; }
	public Date getMietStartdatum () { return this.mietStartdatum; }
	public Date getKündigbarBisDatum() { return this.kündigbarBisDatum; }
	public Rechnung getRechnung () { return this.rechnung; }
	
	// setter:
	public void setAuto(Auto auto) { 
		
		// den Mietvertrag aus dem alten Auto nehmen
		this.auto.setMietvertrag(null);
		
		// neues Auto setzen
		this.auto = auto; 
		
		// den Mietvertrag in das neue Auto setzen
		this.auto.setMietvertrag(this); 
	}
	
	public void addFahrer(Fahrer[] fahrer) { 
		
		for (int index = 0; index < fahrer.length; index++) {
			
			if (this.letzterIndex >= this.fahrer.length) {
				System.out.println ("[INFORMATION]: Sie haben das Limit an Fahrern erreicht.");
				return;
			}
			
			this.fahrer [this.letzterIndex] = fahrer [index];
			this.fahrer [this.letzterIndex].addMietvertrag (this);
			this.letzterIndex ++;
		}
		
	}
	
	public void setRechnung (Rechnung rechnung) { this.rechnung = rechnung; }
	public void setMietdauerInTagen (int mietdauerInTagen) { this.mietdauerInTagen = mietdauerInTagen; }
	public void setMietStartdatum (Date mietStartdatum) { this.mietStartdatum = mietStartdatum; }
	public void setKündigbarBisDatum (Date kündigbarBisDatum) { this.kündigbarBisDatum = kündigbarBisDatum; }
	
	
}
