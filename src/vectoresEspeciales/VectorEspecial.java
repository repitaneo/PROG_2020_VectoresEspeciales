package vectoresEspeciales;

public class VectorEspecial {

	
	private int datos[];
	private int contador;
	
	
	
	/**
	 * Constructor que permite inicializar el objeto con
	 * un vector del tamaño indicado y lo rellena
	 * de forma aleatoria
	 * 
	 * @param tamanio
	 */
	public VectorEspecial(int tamanio) {
		
		if(tamanio<1) {
			tamanio = 1;
		}
		
		datos = new int[tamanio];
		contador = 0;
	}
	
	
	
	
	
	
	public void add(int dato) {
		
		if(contador<datos.length) {
			
			datos[contador] = dato;
			contador++;
		}
	}
	
	
	
}
