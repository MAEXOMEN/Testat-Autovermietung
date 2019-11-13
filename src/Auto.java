
public class Auto {

	private double kilometerstand;
	private int tankvolumentInLiter;
	private double aktuellerTankfüllstand;
	private String benötigteFührerscheinklasse;
	private double verbrauchPro100KmInLiter;
	
	private Mietvertrag mietvertrag;
	
	{
		this.kilometerstand = 0;
		this.tankvolumentInLiter = 0;
		this.aktuellerTankfüllstand = 0;
		this.benötigteFührerscheinklasse = null;
		this.mietvertrag = null;
		this.verbrauchPro100KmInLiter = 0;
		
	}
	
	public Auto (long kilometerstand, int tankvolumentInLiter, int aktuellerTankfüllstand, double verbrauchPro100KmInLiter, String benötigteFührerscheinklasse) {
		this.kilometerstand = kilometerstand;
		this.tankvolumentInLiter = tankvolumentInLiter;
		this.aktuellerTankfüllstand = aktuellerTankfüllstand;
		this.verbrauchPro100KmInLiter = verbrauchPro100KmInLiter;
		this.benötigteFührerscheinklasse = benötigteFührerscheinklasse;
	}
	
	public void fahren (double geschwindigkeitInKMH, long dauerInStunden) {
		
		double gefahreneKilometer = geschwindigkeitInKMH * dauerInStunden;
		double verbrauchterSprit = (gefahreneKilometer * this.verbrauchPro100KmInLiter) / 100d;
		
		boolean fehlerNachrichtAusgegeben = false;
		
		if (this.aktuellerTankfüllstand - verbrauchterSprit < 0) {
			
			double möglicheKilometer = (this.aktuellerTankfüllstand * 100d) / this.verbrauchPro100KmInLiter;
			System.out.println ("[INFORMATION]: Ihr Auto ist nach " + möglicheKilometer + "km liegengeblieben. Bitte rufen Sie den ADAC an.");
			
			verbrauchterSprit = this.aktuellerTankfüllstand;
			gefahreneKilometer = möglicheKilometer;
			
			fehlerNachrichtAusgegeben = true;
			
		}
		
		this.aktuellerTankfüllstand -= verbrauchterSprit;
		this.kilometerstand += gefahreneKilometer;
		
		if (!fehlerNachrichtAusgegeben && this.aktuellerTankfüllstand < this.tankvolumentInLiter * 0.25)
			System.out.println ("[INFORMATION]: Sie haben weniger als 25% im Tank. Bitte halten Sie an der nächsten Tankstelle.");
		
	}
	
	
	// getter:
	public double getVerbrauchPro100KmInLiter() { return verbrauchPro100KmInLiter; }
	public String getBenötigteFührerscheinklasse () { return this.benötigteFührerscheinklasse; }
	public double getKilometerstand() { return kilometerstand; }
	public int getTankvolumentInLiter() { return tankvolumentInLiter; }
	public double getAktuellerTankfüllstand() { return aktuellerTankfüllstand; }
	public Mietvertrag getMietvertrag() { return mietvertrag; }
	
	// setter:
	public void setVerbrauchPro100KmInLiter(double verbrauchPro100KmInLiter) { this.verbrauchPro100KmInLiter = verbrauchPro100KmInLiter; }
	public void setKilometerstand(double kilometerstand) { this.kilometerstand = kilometerstand; }
	public void setTankvolumentInLiter(int tankvolumentInLiter) { this.tankvolumentInLiter = tankvolumentInLiter; }
	public void setAktuellerTankfüllstand(double aktuellerTankfüllstand) { this.aktuellerTankfüllstand = aktuellerTankfüllstand; }
	public void setBenötigteFührerscheinklasse(String benötigteFührerscheinklasse) { this.benötigteFührerscheinklasse = benötigteFührerscheinklasse; }
	public void setMietvertrag(Mietvertrag mietvertrag) { this.mietvertrag = mietvertrag; }
	
	
	
	
	
}
