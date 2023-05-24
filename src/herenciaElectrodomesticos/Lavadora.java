package herenciaElectrodomesticos;

public class Lavadora extends Electrodomestico{
	protected int carga=5;

	public Lavadora(int carga, int peso){
		super(peso);
		this.carga = carga;
	}
	public Lavadora(int peso,int carga,char consumoEnergetico) {
		super(peso, consumoEnergetico);
		this.carga = carga;		
	}
	
	@Override
	protected int precioFinal() {
		int precio=super.precioFinal();
		if(carga>30) {
			precio=50+super.precioBase;
		}else {
			precio=super.precioBase;
		}
		System.out.println("Precio final Lavadora "+precio);
		return precio;
	
	}
	

}
