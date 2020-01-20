package vectoresEspeciales;

public class Start {

	public static void main(String[] args) {


		VectorEspecial informacion = new VectorEspecial(4);
		
		informacion.add(7);
		informacion.add(9);
		informacion.imprimir();

		System.out.println("*********************");
		
		informacion.add(90);
		informacion.add(50);
		informacion.add(62);
		informacion.imprimir();
		
		
		System.out.println("Pares: "+informacion.getCuantosPares());
		System.out.println("Max: "+informacion.getValorMaximo());
		System.out.println("Min: "+informacion.getValorMinimo());
		
		System.out.println("todo ok");
		

	}

}
