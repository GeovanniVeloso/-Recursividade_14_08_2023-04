package controller;

public class RecursivaFatorial2{
	public RecursivaFatorial2() {
		super();
	}
	
	
	/*Explica��o: Utiliza o mesmo m�todo do exerc�cio 3 de recursividade da tarefa passada, tendo como condi��o de parada o n�mero 1 por ser o final de qualquer fatorial.
	 * Passa como parametro a pr�pria fun��o, por�m com n-2 ao inv�s de n-1*/
	public int FFAT2(int n){
	       int fat;	       
		       if(n!=1&&n%2!=0){
		          fat = n * FFAT2(n-2);
		       }else{
		           return n;
		       }
		       return fat;
		   }
}

