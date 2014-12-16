public class Igrac {
	private String ime;
	private String prezime;
	private int brojDresa;
	private Ocjene ocjeneIgraca;

	public Igrac(String ime, String prezime, int brojDresa, Ocjene ocjeneIgraca) {

		setIme(ime);
		setPrezime(prezime);
		setBrojDresa(brojDresa);
		this.ocjeneIgraca = ocjeneIgraca;

	}
public Igrac(Igrac other){
	this.ime = other.ime;
	this.prezime=other.prezime;
	this.brojDresa=other.brojDresa;
	this.ocjeneIgraca=other.ocjeneIgraca;
}
	
	public Igrac(String ime, String prezime, int brojDresa,
			double ocjenaBrzina, double ocjenaDodavanje, double ocjenaSut,
			double ocjenaSutGlavom) {

		this.ime = ime;
		this.prezime = prezime;
		this.brojDresa = brojDresa;
		// Postavljanje
		this.ocjeneIgraca = new Ocjene(ocjenaBrzina, ocjenaDodavanje, ocjenaSut, ocjenaSutGlavom);
	}

	/**
	 * @return the ime
	 */
	public String getIme() {
		return ime;
	}

	/**
	 * @param ime
	 *            the ime to set
	 */
	public void setIme(String ime) {
		if (ime.length() < 1)
			throw new IllegalArgumentException("Neispravno ime");
		this.ime = ime;
	}

	/**
	 * @return the prezime
	 */
	public String getPrezime() {
		return prezime;
	}

	/**
	 * @param prezime
	 *            the prezime to set
	 */
	public void setPrezime(String prezime) {
		if (prezime.length() < 1)
			throw new IllegalArgumentException("Neispravno prezime");
		this.prezime = prezime;
	}

	/**
	 * @return the brojDresa
	 */
	public int getBrojDresa() {
		return brojDresa;
	}

	/**
	 * @param brojDresa
	 *            the brojDresa to set
	 */
	public void setBrojDresa(int brojDresa) {
		if (brojDresa < 0 || brojDresa > 99)
			throw new IllegalArgumentException("Neispravan broj dresa");
		this.brojDresa = brojDresa;
	}

	/**
	 * @return the ocjeneIgraca
	 */
	public Ocjene getOcjeneIgraca() {
		return ocjeneIgraca;
	}

	/**
	 * @param ocjeneIgraca
	 *            the ocjeneIgraca to set
	 */
	public void setOcjeneIgraca(Ocjene ocjeneIgraca) {
		this.ocjeneIgraca = ocjeneIgraca;
	}

	/**
	 * toString metoda
	 */
	public String toString() {
		String igracToString = "Ime: " + ime + "\nPrezime: " + prezime
				+ "\nBrojDresa: " + brojDresa + "\nOcjeneIgraca: \n "
				+ ocjeneIgraca.toString() + "\n";
		return igracToString;
	}
/**
 * Equals metoda za igrace.
 * @param other
 * @return
 */
	public boolean equals(Igrac other){
	if (this.ime.equals(other.ime) && this.prezime.equals(other.prezime) && this.brojDresa == other.brojDresa && this.ocjeneIgraca.equals(other.ocjeneIgraca))
	    return true;
	return false;
	}
	
	
}
