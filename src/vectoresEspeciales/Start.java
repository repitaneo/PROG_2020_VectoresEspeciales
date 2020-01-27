package vectoresEspeciales;

public class Start {

	public static void main(String[] args) {


		VectorEspecial vector1 = new VectorEspecial(10);
		VectorEspecial vector2 = new VectorEspecial(10);

		vector1.addOrdenado(2);
		vector1.addOrdenado(5);
		vector1.addOrdenado(10);
		vector1.addOrdenado(20);
		
		
		vector2.addOrdenado(7);
		vector2.addOrdenado(9);
		vector2.addOrdenado(15);
		vector2.addOrdenado(18);
		vector2.addOrdenado(20);
		vector2.addOrdenado(22);
		
		vector1.imprimir();
		vector2.imprimir();
		
		
		VectorEspecial resultado = vector1.combinar(vector2);
		resultado.imprimir();
		//resultado = vector2.combinar(vector1);

	}

}
