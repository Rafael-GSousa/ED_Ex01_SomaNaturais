package view;
import javax.swing.JOptionPane;

//Importando a classe de controle do Fatorial
import controller.Controller;

public class Main {

	public static void main(String[] args) {
		//Metodo construtor
		Controller fatSoma = new Controller();
		//Definindo um valor para a soma
		int somaNat = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero desejado: "));
		//variavel que recebe o resultado
		int somaNaturais = fatSoma.resultado(somaNat);
		System.out.println("Resultado: "+somaNaturais);
	}

}