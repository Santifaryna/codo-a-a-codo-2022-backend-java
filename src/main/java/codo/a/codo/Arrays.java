package codo.a.codo;

public class Arrays {

	public static void main(String[] args) {
		int[] array = new int[4];
		array[0] = 10;
		array[1] = 11;
		array[2] = 12;
		array[3] = 13;
		
        System.out.println("FIN");
        
        for(int i=0; i <array.length;i++) {
        	System.out.println(array[i]);
        }
        
        System.out.println("Mostrando valor del indice3:" + array[3]);
        
        for(int aux : array) {
        	System.out.println(aux);
        }
	}

}
