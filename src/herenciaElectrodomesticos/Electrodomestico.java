package herenciaElectrodomesticos;

public class Electrodomestico {
	protected int precioBase = 100;
	protected char consumoEnergetico = 'D';
	protected int peso = 5;
	protected static int numeroElectrodomesticos;

	public Electrodomestico(int peso) {
		this.peso=peso;
		numeroElectrodomesticos++;
	}

	public Electrodomestico(int peso, char consumoEnergetico) {
		this.peso = peso;
		this.consumoEnergetico = consumoEnergetico;
		numeroElectrodomesticos++;
	}

	protected boolean comprobarConsumoEnergetico() {
		if (consumoEnergetico == 'A' || consumoEnergetico == 'B' || consumoEnergetico == 'C'|| consumoEnergetico == 'D') {
			return true;
		}else {
			
		}
		return false;
	}
	protected int precioFinal() {
		int precio=0;
		char letra = 0;
//		precio=(precioBase+(peso/10)*30+letra);
		if(letra=='A') {
			precio=(precioBase+(peso/10)*30)+100;
		}else if(letra=='B'){
			precio=(precioBase+(peso/10)*30)+80;
		}else if(letra=='C') {
			precio=(precioBase+(peso/10)*30)+60;
		}else if(letra=='D') {
			precio=(precioBase+(peso/10)*30)+40;
		}
		return precio;
		
	}

}
