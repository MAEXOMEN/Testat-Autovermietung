package henneeiproblem;

public class KundenVertragsBuilder {

	private String mitarbeitername;
	private String vertragstitel;
	private String kundenname;
	
	public KundenVertragsBuilder (String mitarbeitername) {
		this.mitarbeitername = mitarbeitername;
	}
	
	public KundenVertragsBuilder setVertragstitel (String titel) {
		this.vertragstitel = titel;
		return this;
	}
	
	public KundenVertragsBuilder setKundenname (String name) {
		this.kundenname = name;
		return this;
	}
	
	public Vertrag build () {
		
		Vertrag v = new Vertrag(this.vertragstitel, this.mitarbeitername);
		Kunde k = new Kunde (this.kundenname);
		
		v.setKunde(k);
		k.setVertrag(v);
		
		return v;
		
	}
	
	
	
}
