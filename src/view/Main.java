package view;

import javax.swing.JOptionPane;

import controller.InverterController;

/**
 * @author Lucas Batista
 * 2 de mar. de 2024
 */
public class Main {
	public static void main(String[] args) {
		String palavra = JOptionPane.showInputDialog("Digite uma palavra: ");
		
		InverterController iCont = new InverterController();
		String resultado = iCont.invertePalavra(palavra);
		System.out.println(palavra + " ao contrário é " + resultado);

	}

}
