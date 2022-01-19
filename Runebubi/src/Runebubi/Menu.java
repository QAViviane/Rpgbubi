package Runebubi;

import java.util.Scanner;

public class Menu 
{
  // variavel para receber o valor digitado pelo usuario
  int resp = 0;
 
  // Classe Scanner para capturar a informação passada pelo usuario 
  Scanner pegar = new Scanner(System.in);
  // Scanner recebe System.in que ira informa - lo que ira receber uma informação do teclado 
 
/**
 * Metodo menu para selecionar as opicoes do jogo   
 * @return
 */
 public int menu() {
	
	 System.out.println( " ---------------------------------------------- ");
	 System.out.println( " Main menu ");
	 System.out.println( " ---------------------------------------------- ");
	 System.out.println( " 1 para exibir os personagens ");
	 System.out.println( " 2 para escolher ");
	 System.out.println( "  3 Fase 1 ");
	 System.out.println( "  4 Fase 2 ");
	 System.out.println( "  5 Fase 3 ");
	 System.out.println( "  6 Alterar dificuldade ");
	 System.out.println( "  7 para jogar novamente ");
	 System.out.println( "  8 para sair ");	 
	 resp = pegar.nextInt();	 
	 return resp;
   }
		
}
