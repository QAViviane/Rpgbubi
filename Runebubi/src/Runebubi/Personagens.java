package Runebubi;

import java.util.ArrayList;
import java.util.Scanner;

public class Personagens 
{
/**
 * Metodo contrustor
 */
	public Personagens() {	
	  
	   inicializar();		
	}
	
/**
 * Lista de personagens 
 */
        public ArrayList<Lcats> Lc1 = new ArrayList<Lcats>();
	Scanner in = new Scanner(System.in);

/**
 *  Metodo para criar os personagens e adiciona-los a lista 		
 */
	public void inicializar()     {	    
        	Lcats Lc = new Lcats(); 
	        Lc.setNome(" Abu ");
                Lc.setDescricao(" Dorminhoco ");
                Lc.setVida(10);
                Lc1.add(Lc);
		
                Lcats Lc2 = new Lcats();
	        Lc2.setNome(" Coin ");
                Lc2.setDescricao(" Bagunceiro ");
                Lc2.setVida(10);
                Lc1.add(Lc2);
        
                Lcats Lc3 = new Lcats();
	        Lc3.setNome(" Abua ");
                Lc3.setDescricao(" Carinhosa ");
                Lc3.setVida(10);
                Lc1.add(Lc3);
     }   

/**
 * Metodo para exbir as informações da lista 
 */
	public void Exibirl() {
	
		for(int i = 0; i < Lc1.size();i++) {
		   System.out.println(" ====================================");
		   System.out.println(" Nome :"+Lc1.get(i).getNome());
		   System.out.println(" descricao:"+Lc1.get(i).getDescricao());
		   System.out.println(" Vida: "+Lc1.get(i).getVida());
		   System.out.println(" ====================================");
		}			
	}
/**
 * Metodo para escolher os personagens da lista 
 */
	public void  Escolher () {
	
		int n = Lc1.size();
		for(int i = 0; i < n; i++) {	   
		 System.out.println(Lc1.get(i).getNome()+i);
		
		}
		System.out.println(" Informe qual personagem ira escolher ");
		int i = in.nextInt();
		System.out.println(" Voce escolheu :"+Lc1.get(i).getNome());
	}			
}
