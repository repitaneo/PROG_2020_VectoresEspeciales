package vectoresEspeciales;

public class Start {

	public static void main(String[] args) {


		VectorEspecial informacion = new VectorEspecial(4);
		
		informacion.add(0);
		informacion.add(0);
		informacion.imprimir();

		System.out.println("*********************");
		
		informacion.add(90);
		informacion.add(50);
		informacion.add(62);
		informacion.imprimir();
		
		System.out.println("todo ok");
		

	}

}
