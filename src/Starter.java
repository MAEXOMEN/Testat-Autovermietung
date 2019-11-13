import java.sql.Date;

public class Starter {

	@SuppressWarnings({ "deprecation", "unused" })
	public static void main(String[] args) {
		Auto vw = new Auto(90000, 45, 20, 6.7, "B");
		Mieter peter = new Mieter("Peter", "Bauer", new Date(2000, 2, 4), "DE78 0000 9876 1234 56");
		Fahrer gunter = new Fahrer("Gunter", "Schmidt", new Date(2000, 2, 4), new String []{"A1","AB"});
		Mietvertrag mietvertrag = new Mietvertrag(vw, peter, new Fahrer[] {gunter}, 365, new Date(2018, 2, 4), new Date(2019, 1, 1));
		Rechnung rechnung = new Rechnung(500089, new Date(2019, 10, 10), new Date(2019, 10, 10), "DE78 0000 98976 9876 98", mietvertrag);
		

		System.out.println (mietvertrag.kannGekündigtWerden());
	}

}
