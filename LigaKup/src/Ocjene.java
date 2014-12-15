public class Ocjene {
	private double brzina;
	private double dodavanje;
	private double sut;
	private double sutGlavom;

	
	public Ocjene(double brzina, double dodavanje, double sut, double sutGlavom) {
		setBrzina(brzina);
		setDodavanje(dodavanje);
		setSut(sutGlavom);
		setSutGlavom(sutGlavom);
	}


	
	
	/**
	 * @return the brzina
	 */
	public double getBrzina() {
		return brzina;
	}


	/**
	 * @param brzina the brzina to set
	 */
	public void setBrzina(double brzina) {
		if(brzina>100 || brzina<0)
			throw new IllegalArgumentException("Ocjena nije u rangu 0-100");
		
		this.brzina = brzina;
	}


	/**
	 * @return the dodavanje
	 */
	public double getDodavanje() {
		return dodavanje;
	}


	/**
	 * @param dodavanje the dodavanje to set
	 */
	public void setDodavanje(double dodavanje) {
		if(dodavanje>100 || dodavanje<0)
			throw new IllegalArgumentException("Ocjena nije u rangu 0-100");
		
		this.dodavanje = dodavanje;
	}


	/**
	 * @return the sut
	 */
	public double getSut() {
		return sut;
	}


	/**
	 * @param sut the sut to set
	 */
	public void setSut(double sut) {
		if(sut>100 || sut<0)
			throw new IllegalArgumentException("Ocjena nije u rangu 0-100");
		
		this.sut = sut;
	}


	/**
	 * @return the sutGlavom
	 */
	public double getSutGlavom() {
		return sutGlavom;
	}


	/**
	 * @param sutGlavom the sutGlavom to set
	 */
	public void setSutGlavom(double sutGlavom) {
		if(sutGlavom>100 || sutGlavom<0)
			throw new IllegalArgumentException("Ocjena nije u rangu 0-100");
		
		this.sutGlavom = sutGlavom;
	}


	
	public String toString() {
		
		String ispisOcjena =  "\tBrzina: " + brzina + "\n\tDodavanje: " + dodavanje
				+ "\n\tSut: " + sut + "\n\tSutGlavom: " + sutGlavom + "\n";
		return ispisOcjena;
	}


}
