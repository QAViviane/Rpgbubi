package Runebubi;

import java.util.Scanner;

public class Runebubi {

	public static void main(String[] args) {
	        Scanner Lerlinha= new Scanner(System.in);
		
		//Instaciando a classe personagem 
		Personagens p = new Personagens();	
		
		//Colocando os valores no contrutor da classe play
		Play p1 = new Play(4,5,6,10);
		
	        //instanciando o metodo menu 
	        Menu m = new Menu();
	  
		 int resp = 0;
	         int dificuldade = 6;
		 int facil = 12;
	         int dificil = 6;
	         int opcao = 0;
		
		
		  while(resp != 8) {
		  resp = m.menu();
			
		  
		   if( resp == 1 )  {
		        System.out.println(" Exibindo ");
		        p.Exibirl();		   
		   }
		   if( resp == 2 )    {
			 System.out.println(" Seleção de personagens ");
			 p.Escolher();		   		   
		   }					 			
		   if( resp == 3 ) {  
			  System.out.println(" jogo esta na dificuldade padrão dificiul para alterar aperte 6 no menu ");
			  System.out.println(" Fase 1 iniciada ");
			  p1.Dado(dificuldade);
		          p1.Combatem();				   		 		 
		   }			
		
		   if( resp == 4 )  {  
			  System.out.println(" jogo esta na dificuldade padrão dificiul para alterar aperte 6 no menu ");
			  System.out.println(" Fase 2 iniciada ");
			  p1.Dado(dificuldade);
		          p1.Combatemini();				   		 		 
		   }			
		   if( resp == 5 ) { 
			  System.out.println(" jogo esta na dificuldade padrão dificiul para alterar aperte 6 no menu ");
			  System.out.println(" Fase 3 iniciada ");
			  p1.Dado(dificuldade);
		          p1.Combateboss();		   		 		 
		   }
	           if( resp == 6 ) { 
			  System.out.println(" Escolha Dificuldade ");
			  opcao = Lerlinha.nextInt();	  
		          if(opcao == 1) {				  
			  dificuldade = facil;
			  System.out.println(" Dificuldade facil escolhida ");
		          }
                          if(opcao == 2) {
			  dificuldade = dificil;
			  System.out.println(" dificuldade dificil escolhida "); 
		          }   		 		 
	           }		   
                   if( resp == 7 ) { 
	                  System.out.println(" jogo resetado ");
			  p1.JogarN();
					   		 		 
		   }
		   
		   if( resp == 8 ) { 
			  System.out.println(" Encerrando ");
			  break;				    
		   }
			  		  
	     }				     		
      }
}
