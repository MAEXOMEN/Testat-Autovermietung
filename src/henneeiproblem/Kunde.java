package henneeiproblem;

public class Kunde {

	private Vertrag vertrag;
	private String name;
	
	public Kunde (String name) {
		this.name = name;
	}
	
	public void setVertrag (Vertrag v) { this.vertrag = v; }
	
}
