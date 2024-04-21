package fecha;
/**
 * Este es el examen en el cual vamos a modificar cosas importantes
 * se llama fecha porque es un ejecicio donde trabajaremos con las fechas.
 */
public class Fecha {
<<<<<<< HEAD
	public static final int DIEZ = 10;
	private int diaUsar; //d�a
	private int mesUsar; //mes
	private int anioUsar; //a�o
=======
	private int d; //d�a
	private int m; //mes
	private int a; //a�o
>>>>>>> Javadoc

	
	public Fecha() {

	}

	
	public Fecha(int dia, int mes, int anio) {
		this.diaUsar = dia;
		this.mesUsar = mes;
		this.anioUsar = anio;
	}

	
	/**
	 * Este es el metodo de chaCorrecta en donde se escargara de verificar si la fecha
	 * introducida es la correcta
	 * @return devuelve diaCoorecto mesCorrecto y añoCorrecto
	 */
	public boolean fechaCorrecta() {
		boolean diaC;
		boolean mesC;
		boolean anioC;
		anioC = anioUsar > 0;
		mesC = mesUsar >= 1 && mesUsar <= 12;
		boolean diaMayor1 = diaUsar >= 1;
		switch (mesUsar) {
		case 2:
			if (esBisiesto()) {
				diaC = diaMayor1 && diaUsar <= 29;
			} else {
				diaC = diaMayor1 && diaUsar <= 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diaC = diaMayor1 && diaUsar <= 30;
			break;
		default:
			diaC = diaMayor1 && diaUsar <= 31;
		}
		return diaC && mesC && anioC;
	}

<<<<<<< HEAD
	// M�todo esBisiesto. Solo lo usa fechaCorrecta, por eso es privado
=======
	
	/**
	 *  M�todo esBisiesto. Solo lo usa fechaCorrecta, por eso es privado
	 * @return devuelve esBinario
	 */
>>>>>>> Javadoc
	private boolean esBisiesto() {
		boolean esBisiesto;
		esBisiesto = (anioUsar % 4 == 0 && anioUsar % 100 != 0 || anioUsar % 400 == 0);
		return esBisiesto;
	}

<<<<<<< HEAD
	// M�todo diaSiguiente
	public void nexDay() {
		diaUsar++;
=======
	/**
	 * M�todo diaSiguiente donde nos dara el dia siguien sumando uno al que tenemos
	 */
	public void diaSiguiente() {
		d++;
>>>>>>> Javadoc
		if (!fechaCorrecta()) {
			diaUsar = 1;
			mesUsar++;
			if (!fechaCorrecta()) {
				mesUsar = 1;
				anioUsar++;
			}
		}
	}

<<<<<<< HEAD
	// M�todo toString
=======
	/**
	 * M�todo toString donde nos mostrara la informacion segun vaya cambiando
	 */
>>>>>>> Javadoc
	public String toString() {
		String resultado= "";
		if (diaUsar < DIEZ && mesUsar < 10) {
			resultado = "0" + diaUsar + "-0" + mesUsar + "-" + anioUsar;
		} else if (diaUsar < 10 && mesUsar >= 10) {
			resultado = "0" + diaUsar + "-" + mesUsar + "-" + anioUsar;
		} else if (diaUsar >= 10 && mesUsar < 10) {
			resultado = diaUsar + "-0" + mesUsar + "-" + anioUsar;
		} else {
			resultado = diaUsar + "-" + mesUsar + "-" + anioUsar;
		}
		
		return resultado;
	}

}
