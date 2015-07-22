
public class Moto extends Veicolo{
	private boolean guidaLibera;

	public boolean isGuidaLibera() {
		return guidaLibera;
	}

	public Moto(String numTelaio, String modello, String alimentazione,
			String targa, boolean guidaLibera) {
		super(numTelaio, modello, alimentazione, targa);
		this.guidaLibera = guidaLibera;
	}

	@Override
	public boolean controllaTarga() {
		String targa=super.getTarga();
		if(targa.length()==7 &&
		   Character.isLetter(targa.charAt(0)) && Character.isLetter(targa.charAt(1)) &&
		   Character.isDigit(targa.charAt(2)) && Character.isDigit(targa.charAt(3)) &&
		   Character.isDigit(targa.charAt(4)) && Character.isDigit(targa.charAt(5)) &&
		   Character.isDigit(targa.charAt(6)) 
				){
			return true;
		}
		else return false;
	}

	@Override
	public String toString() {
		return super.toString()+", Guida libera = " + guidaLibera + "\n";
	}
	
}
