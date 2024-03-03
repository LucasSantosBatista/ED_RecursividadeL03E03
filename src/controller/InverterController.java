package controller;

public class InverterController {

	public InverterController() {
		super();
	}

	public String invertePalavra(String palavra) {
		//Condição de parada = tamanho é zero, percorrido toda a palavra
		int tamanho = palavra.length() - 1;
		if (tamanho == 0) {
			return palavra;
		} else {
			//Chama função recursiva levando palavra(tamanho - 1) e concatena com ultima ultima letra
			return invertePalavra(palavra.substring(1)) + palavra.substring(0, 1);
		}		
	}

}
