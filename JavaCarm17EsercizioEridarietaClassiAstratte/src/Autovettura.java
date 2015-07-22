
public class Autovettura extends Veicolo{
	private int numeroPosti;

	public int getNumeroPosti() {
		return numeroPosti;
		
		
	}

	public Autovettura(String numTelaio, String modello, String alimentazione,
			String targa, int numeroPosti) {
		super(numTelaio, modello, alimentazione, targa);
		this.numeroPosti = numeroPosti;
	}

	@Override
	public boolean controllaTarga() {
		String targa=super.getTarga();
		if(targa.length()==7 &&
		   Character.isLetter(targa.charAt(0)) && Character.isLetter(targa.charAt(1)) &&
		   Character.isDigit(targa.charAt(2)) && Character.isDigit(targa.charAt(3)) &&
		   Character.isDigit(targa.charAt(4)) && Character.isLetter(targa.charAt(5)) &&
		   Character.isLetter(targa.charAt(6)) 
				){
			return true;
		}
		else return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+", Numero posti = " + numeroPosti + "\n";
	}

}
