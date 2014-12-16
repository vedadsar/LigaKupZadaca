
public class TestnaKlasa {
public static void main(String[] args) {
	//Ocjene ocjenaIgraca1 = new Ocjene(15.23, 11.13, 66, 78);
	Liga premierLiga = new Liga("Premier Liga");
	Igrac igracJedan = new Igrac("Vedad", "Zornic", 10, 1,21,21,1);
	
	Tim sarajevo = new Tim("FK Sarajevo");
	sarajevo.dodajIgraca("vedad", "Hmm", 10, 15, 76, 69, 88);
	sarajevo.dodajIgraca("vedad", "Hmm", 10, 15, 76, 69, 88);
	sarajevo.dodajIgraca("vedad", "Hmm", 10, 15, 76, 69, 88);
	sarajevo.dodajIgraca("vedad", "Hmm", 10, 15, 76, 69, 88);
	sarajevo.dodajIgraca("vedad", "Hmm", 10, 15, 76, 69, 88);
	sarajevo.dodajIgraca("vedad", "Hmm", 10, 15, 76, 69, 88);
	sarajevo.dodajIgraca("vedad", "Hmm", 10, 15, 76, 69, 88);
	sarajevo.dodajIgraca("vedad", "Hmm", 10, 15, 76, 69, 88);
	sarajevo.dodajIgraca("vedad", "Hmm", 10, 15, 76, 69, 88);
	sarajevo.dodajIgraca("vedad", "Hmm", 10, 15, 76, 69, 88);
	sarajevo.dodajIgraca("vedad", "Hmm", 10, 15, 76, 69, 88);

	
    sarajevo.dodajOsobu("vedad","zornic", "vedad.zornic@bitcamp.ba", "trener");
    sarajevo.dodajOsobu("vedad","zornic", "vedad.zornic@bitcamp.ba", "trener");
    sarajevo.dodajOsobu("vedad","zornic", "vedad.zornic@bitcamp.ba", "trener");
    
    premierLiga.dodajTim(sarajevo);
    
    Tim zeljeznicar = new Tim("FK Zeljeznicar");
	zeljeznicar.dodajIgraca("Haris", "Krk", 19, 75, 71, 91, 18);
	zeljeznicar.dodajIgraca("Haris", "Krk", 19, 75, 71, 91, 18);
	zeljeznicar.dodajIgraca("Haris", "Krk", 19, 75, 71, 91, 18);
	zeljeznicar.dodajIgraca("Haris", "Krk", 19, 75, 71, 91, 18);
	zeljeznicar.dodajIgraca("Haris", "Krk", 19, 75, 71, 91, 18);
	zeljeznicar.dodajIgraca("Haris", "Krk", 19, 75, 71, 91, 18);
	zeljeznicar.dodajIgraca("Haris", "Krk", 19, 75, 71, 91, 18);
	zeljeznicar.dodajIgraca("Haris", "Krk", 19, 75, 71, 91, 18);
	zeljeznicar.dodajIgraca("Haris", "Krk", 19, 75, 71, 91, 18);
	zeljeznicar.dodajIgraca("Haris", "Krk", 19, 75, 71, 91, 18);
	zeljeznicar.dodajIgraca("Haris", "Krk", 19, 75, 71, 91, 18);
	
	zeljeznicar.dodajOsobu("Gorjan","k", "vedad.zornic@bitcamp.ba", "trener");
	zeljeznicar.dodajOsobu("Gorjan","k", "vedad.zornic@bitcamp.ba", "trener");
	zeljeznicar.dodajOsobu("Gorjan","k", "vedad.zornic@bitcamp.ba", "trener");
    
    premierLiga.dodajTim(zeljeznicar);
    
    System.out.println(premierLiga.toString());
    
  }
}
