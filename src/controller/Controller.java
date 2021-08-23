package controller;

public class Controller {

	public Controller() {
		super();
		}
		
		public int resultado(int fatSoma) {
			//Condicao de parada =  0 se a entrada for igual ou menor que 0, devera retornar 0
		 if (fatSoma <= 0) {
	      return 0;	
	      //Caso seja maior que 0, deverá somar fatSoma + (fatSoma - 1)..
		 }else {
			 
			 return fatSoma + resultado(fatSoma - 1);
		 }
		 
	}
	}