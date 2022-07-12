package codo.a.codo;

public class While {

	public static void main(String[] args) {
		
		int contador = 10;
		
		while(contador >= 0) {
			System.out.println("contador:" + contador);
			contador --;
			
			if(contador == 3) {
				break;
			}
			
		}

	}

}
