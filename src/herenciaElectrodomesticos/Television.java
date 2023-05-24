package herenciaElectrodomesticos;

public class Television extends Electrodomestico{
	protected int resolucion=20;//resolucion por defecto
	
	public Television(int resolucion,int peso) {
		super(peso);
		this.resolucion=resolucion;		
	}
	
	public Television(int resolucion,int peso, char consumoEnergetico) {
		super(peso, consumoEnergetico);
		this.resolucion=resolucion;
	}
	/**
	 * Si tiene una resolución mayor  de 40 pulgadas, se incrementara el precio un 30%
	 */

	@Override
	protected int precioFinal() {
		int precio = super.precioFinal();
		if(resolucion>40) {
			precio=(int) (super.precioBase*1.30);
		}else {
			precio=super.precioBase;
		}
		System.out.println("Precio final Television "+precio);
		return precio;
	}
	
	

}
