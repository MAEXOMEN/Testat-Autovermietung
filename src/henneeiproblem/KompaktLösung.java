package henneeiproblem;

public class KompaktLösung {
	
	private class Kunde {
		
		private Vertrag vertrag;
		private String name;
		
		public Kunde (String name) {
			this.name = name;
		}
		
		public void setVertrag (Vertrag v) { this.vertrag = v; }
		
	}
	
	private class Vertrag {
		
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
	
	public static class Builder {
		
		private String mitarbeitername;
		private String vertragstitel;
		private String kundenname;
		
		public Builder (String mitarbeitername) {
			this.mitarbeitername = mitarbeitername;
		}
		
		public Builder setVertragstitel (String titel) {
			this.vertragstitel = titel;
			return this;
		}
		
		public Builder setKundenname (String name) {
			this.kundenname = name;
			return this;
		}
		
		public KompaktLösung build () {
			
			return new KompaktLösung(this.vertragstitel, this.mitarbeitername, this.kundenname);
			
		}
		
	}
	
	private Vertrag vertrag;
	private Kunde kunde;
	
	public KompaktLösung(String vertragstitel, String mitarbeitername, String kundenname) {
		this.vertrag = new Vertrag (vertragstitel, mitarbeitername);
		this.kunde = new Kunde (kundenname);
		
		this.vertrag.setKunde(this.kunde);
		this.kunde.setVertrag(this.vertrag);
	}

	public Vertrag getVertrag () {
		return this.vertrag;
	}
	
	public Kunde getKunde () {
		return this.kunde;
	}

}
