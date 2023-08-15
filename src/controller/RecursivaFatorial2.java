package controller;

public class RecursivaFatorial2{
	public RecursivaFatorial2() {
		super();
	}
	
	
	/*Explicação: Utiliza o mesmo método do exercício 3 de recursividade da tarefa passada, tendo como condição de parada o número 1 por ser o final de qualquer fatorial.
	 * Passa como parametro a própria função, porém com n-2 ao invés de n-1*/
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

