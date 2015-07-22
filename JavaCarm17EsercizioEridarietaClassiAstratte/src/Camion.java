
public class Camion extends Veicolo{


	private int numeroAssi;

	public int getNumeroAssi() {
		return numeroAssi;
	}

	public Camion(String numTelaio, String modello, String alimentazione,
			String targa, int numeroAssi) {
		super(numTelaio, modello, alimentazione, targa);
		this.numeroAssi = numeroAssi;
	}

	@Override
	public boolean controllaTarga() {
		String targa=super.getTarga();
		if(targa.length()==8 &&
		   Character.isLetter(targa.charAt(0)) && Character.isLetter(targa.charAt(1)) &&
		   Character.isDigit(targa.charAt(2)) && Character.isDigit(targa.charAt(3)) &&
		   Character.isDigit(targa.charAt(4)) && Character.isDigit(targa.charAt(5)) &&
		   Character.isDigit(targa.charAt(6)) && Character.isDigit(targa.charAt(7)) 
				){
			return true;
		}
		else return false;
	}
	@Override
	public String toString() {
		return super.toString()+", NumeroAssi = " + numeroAssi + "\n";
	}


	

}
