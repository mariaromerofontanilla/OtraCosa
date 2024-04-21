package fecha;

public class Fecha {
	public static final int DIEZ = 10;
	private int diaUsar; //d�a
	private int mesUsar; //mes
	private int anioUsar; //a�o

	
	public Fecha() {

	}

	
	public Fecha(int dia, int mes, int anio) {
		this.diaUsar = dia;
		this.mesUsar = mes;
		this.anioUsar = anio;
	}

	
	
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

	// M�todo esBisiesto. Solo lo usa fechaCorrecta, por eso es privado
	private boolean esBisiesto() {
		boolean esBisiesto;
		esBisiesto = (anioUsar % 4 == 0 && anioUsar % 100 != 0 || anioUsar % 400 == 0);
		return esBisiesto;
	}

	// M�todo diaSiguiente
	public void nexDay() {
		diaUsar++;
		if (!fechaCorrecta()) {
			diaUsar = 1;
			mesUsar++;
			if (!fechaCorrecta()) {
				mesUsar = 1;
				anioUsar++;
			}
		}
	}

	// M�todo toString
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
