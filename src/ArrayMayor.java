
public class ArrayMayor {
	private int [] Mayor;

	public ArrayMayor(int[] mayor) {
		this.Mayor = mayor;
	}
	
	public String numeros () {
		String resultado;
		int num = 0;
		if (Mayor == null) {
			resultado = "Array nulo";
		}else if (Mayor.length == 0) {
			resultado = "Array vacio";
		}else {
			for(int i = 0; i < Mayor.length ; i++) {
				if (Mayor [i] > num) {
					num = Mayor[i];
				}
			}
			resultado= "El numero mayor es " + num;
		}
		return resultado;
	}
	
	
}
