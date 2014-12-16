

public class Liga {
private Tim[] timoviLige;
 private String imeLige;
 private int brojTimova;
 
public Liga (String imeLige){
	timoviLige = new Tim[8];
	brojTimova = 0;
}

public void dodajTim(Tim noviTim) {
	 if(brojTimova >8)
		 throw new ArrayIndexOutOfBoundsException("Liga mora imat 8 timova");

	timoviLige[brojTimova] = new Tim(noviTim);
	brojTimova++;
	
	}

   public String toString() {
    String ligaToString = "";
    System.out.println("Timovi nase lige su: \n");
    for(int i=0; i<brojTimova;i++){
        ligaToString += timoviLige[i].getImeTima();	
        ligaToString +="\n";
    }
    return ligaToString;
}
}

