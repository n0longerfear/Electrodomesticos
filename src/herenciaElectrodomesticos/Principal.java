package herenciaElectrodomesticos;

import java.util.ArrayList;

public class Principal {
	public static int precioElectrodomesticos=0;
	
	public static void calcularPrecioTotal(Electrodomestico elec) {
		if(elec.comprobarConsumoEnergetico()) {
			System.out.println("Precio electrodomestico: "+elec.precioFinal());
			precioElectrodomesticos+=elec.precioFinal();
		}else {
			System.out.println("*** Electrodoméstico con consumo energético no aceptado ***");
		}
		
		
	}
	public static void main(String[] args) {
		ArrayList<Electrodomestico>electros=new ArrayList<>();
		electros.add(new Lavadora(60, 30,'B'));
		electros.add(new Television(30, 35, 'B'));
		electros.add(new Lavadora(45, 30, 'F'));
		electros.add(new Television(50, 20, 'A'));
		electros.add(new Television(50, 20, 'E'));
		for(int i=0;i<electros.size();i++) {
			calcularPrecioTotal(electros.get(i));
		}
		System.out.println();
		System.out.println("Precio de todos los electrodomésticos: " + precioElectrodomesticos);
		System.out.println("Número de electrodomésticos: " + Electrodomestico.numeroElectrodomesticos);
		System.out.println("Bye");
		
	}

}
