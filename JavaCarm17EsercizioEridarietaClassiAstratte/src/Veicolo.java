
public abstract class Veicolo {
private String numTelaio;
private String modello;
private String alimentazione;
private String targa;

public void setTarga(String targa) {
	this.targa = targa;
}
public String getNumTelaio() {
	return numTelaio;
}
public String getModello() {
	return modello;
}
public String getAlimentazione() {
	return alimentazione;
}
public String getTarga() {
	return targa;
}

public Veicolo(String numTelaio, String modello, String alimentazione,
		String targa) {
	super();
	this.numTelaio = numTelaio;
	this.modello = modello;
	this.alimentazione = alimentazione;
	this.targa = targa;
}

public abstract boolean controllaTarga();

@Override
public String toString() {
	return "Telaio = " + numTelaio + ", Modello = " + modello
			+ ", Alimentazione = " + alimentazione + ", Targa = " + targa ;
}

}
