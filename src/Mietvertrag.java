
public class Mietvertrag extends Dokument {

	private int mietdauerInTagen;
	private long mietStartdatum;
	private boolean vorzeitigGekündigt;
	private long kündigbarBisDatum;
	
	{ this.mietdauerInTagen = 0; this.mietStartdatum = 0; this.vorzeitigGekündigt = false; this.kündigbarBisDatum = 0; }
	
	public Mietvertrag (int mietdauerInTagen, long mietStartdatum, long kündigbarBisDatum) {
		this.mietStartdatum = mietStartdatum;
		this.mietdauerInTagen = mietdauerInTagen;
		this.vorzeitigGekündigt = false;
		this.kündigbarBisDatum = kündigbarBisDatum;
	}
	
	public boolean kannGekündigtWerden () {
		
		long jetzt = System.currentTimeMillis();
		
		if (jetzt < this.kündigbarBisDatum) 
			return true;
		
		if (jetzt > this.mietStartdatum + this.mietdauerInTagen * 24 * 60 * 60 * 1000) 
			return true;
		
		return false;
		
	}

	public int getMietdauerInTagen() {
		return mietdauerInTagen;
	}

	public void setMietdauerInTagen(int mietdauerInTagen) {
		this.mietdauerInTagen = mietdauerInTagen;
	}

	public long getMietStartdatum() {
		return mietStartdatum;
	}

	public void setMietStartdatum(long mietStartdatum) {
		this.mietStartdatum = mietStartdatum;
	}

	public boolean isVorzeitigGekündigt() {
		return vorzeitigGekündigt;
	}

	public void setVorzeitigGekündigt(boolean vorzeitigGekündigt) {
		this.vorzeitigGekündigt = vorzeitigGekündigt;
	}

	public long getKündigbarBisDatum() {
		return kündigbarBisDatum;
	}

	public void setKündigbarBisDatum(long kündigbarBisDatum) {
		this.kündigbarBisDatum = kündigbarBisDatum;
	}
	
}
