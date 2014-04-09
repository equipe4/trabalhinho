package ex04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(true){
	    System.out.println("Para sair digite FIM");
		System.out.println("Número:");
		String comando = sc.next();
		if(comando.equalsIgnoreCase("fim")){
			System.out.println("Aplicação encerrada.");
			break;
		} else {
			int n = 0;
		try{	
		n = Integer.parseInt(comando);
		} catch (Exception e){
			System.out.println("Número inválido, aplicação encerrada.");
			System.exit(0);
		}
		int cont=0;
		if(n<5){
			n=5;
			System.out.println("Atribuído valor 5.");
		} else {
			System.out.println("Atribuído valor "+n+".");
		}
		
		for(int i = 1 ; i <= 10 ; i++){
			int resultado = n*i;			 
			  for (int j=1 ; j<=resultado ; j++ ){
				  if(resultado%j == 0)
					  cont=cont+1;
			  	  }
			  	  if (cont==2){
			  		  System.out.println(resultado+ " - É primo");
			      }else{
			    	  System.out.println(resultado+ " - Não é primo");
			      }
		}
		}
		}
	}

}
