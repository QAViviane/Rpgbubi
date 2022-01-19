package Runebubi;

import java.util.Random;

public class Play extends Lcats {
   private int mob;
	
   private int miniboss;
   
   private int boss ;

   private int dado;
   
/**
 * Metodo construtor    
 * @param mob
 * @param miniboss
 * @param boss
 * @param vida
 */
   public Play(int mob,int miniboss,int boss,int vida)   {
	  setMob(mob); 
	  setMiniboss(miniboss);
	  setBoss(boss); 
      setVida(vida);
   }
   
/**
 * Metodos acessores get e set   
 * @return
 */
  public int getMob() 
  {
	return mob;
  }

  public void setMob(int mob) 
  {
	this.mob = mob;
  }

  public int getMiniboss() 
  {
	return miniboss;
  }

  public void setMiniboss(int miniboss) 
  {
	this.miniboss = miniboss;
  }

  public int getBoss() 
  {
	return boss;
  }

  public void setBoss(int boss) 
  {
	this.boss = boss;
  }

  public int getDado() 
  {
	return dado;
  }

  public void setDado(int dado) 
  {
	this.dado = dado;
  }

/**
 * Metodo para rodar o dado   
 * @return
 */
   public int Dado(int numerodedados) {
	  Random dad = new Random();
	  setDado(dad.nextInt(numerodedados));
	  
	  System.out.println(" Voce rodou o dado ");
	  System.out.println(" O dado caiu no numero "+getDado());
	   	   
	  int retonarvalor = 0;	   
	  return retonarvalor;
   }
   
/**
 * Metodo de combate da primeira fase 
 * @return
 */
   public int Combatem() {
	   System.out.println( " Voce encontrou o mob do papa " );
	   System.out.println( " poder de ataque = 2 " );
	   System.out.println( " Vida do mob = 4 " );
	   System.out.println( " Sua Vida "+getVida() );
	   
	   if(getVida() >= 1)  {
			   
			   if(getDado() >= getMob() )  {
				   
				   System.out.println( " Voce matou o mob " );
				  
			   }
			   else  {
				   
				   System.out.println( " voce não matou o mob e sofreu um ataque " );
				   int dano = 2;
				   int vid = getVida(); 
				   setVida(vid - dano );		   
				   Perder();
				   setDado(0);		   
			  
			   }
			   		   
	   }
	   else  {
		
		   System.out.println(" Sua vida esta em zero jogue novamente ");
		   
	   }
	   		    
	 int retonarvalor = 0;	   
	 return retonarvalor;
   }

/**
 * Metodo de combate segunda fase   
 * @return
 */
   public int Combatemini() {
	 	      
	   System.out.println( " Voce encontrou o miniboss white cat " );
	   System.out.println( " poder de ataque = 5 " );
	   System.out.println( " Vida do mob = 5 " );
	   System.out.println( " Sua Vida "+getVida() );
	   
	   if(getVida() >= 1) {
		   		   
			   if(getDado() >= getMiniboss() )  {
				   
				   System.out.println( " Voce matou a white cat " );
				  
			   }
			   else {
				   
				   System.out.println( " voce não matou a white cat e sofreu um ataque " );
				   int dano = 4;
				   int vid = getVida(); 
				   setVida(vid - dano );
				   Perder();
				   setDado(0);
				   
			   }		    
			   	   	  	 	   
	   }
	   else {
		
		   System.out.println(" Sua vida esta em zero jogue novamente ");
		   
	   }
		   	   
	   int retonarvalor = 0;	   
	   return retonarvalor;
   }

/**
 * Metodo de combate terceira fase   
 * @return
 */
   public int Combateboss() {
	      
	   System.out.println( " Voce encontrou o Papa " );
	   System.out.println( " poder de ataque = 7 " );
	   System.out.println( " Vida do mob = 6 " );
	   System.out.println( " Sua Vida "+getVida() );
	   
	   if(getVida() >= 1) 
	   {
			   
			   if(getDado() >= getBoss() )  {
				   
				   System.out.println( " Voce matou o papa " );
				   System.out.println( " O grande papa foi derrotado  " );
				   System.out.println( " Agora todos estão livres Parabens voce ganhou  " );
			   }
			   else  {
				   
				   System.out.println( " voce não matou o papa " );
				   System.out.println( " Papa diz HAHAHA " );
				   int dano = 6;
				   int vid = getVida(); 
				   setVida(vid - dano );
				   Perder();
				   setDado(0);
				   
			   }
			   		   	   		   
	   }
	   else  {
		
		   System.out.println(" Sua vida esta em zero jogue novamente ");
		   
	   }
	      	   	   
	   int retonarvalor = 0;	   
	   return retonarvalor;
   }

/**
 * Metodo ganhar sera chamado toda vez que o jogador vencer    
 */
   public void Perder() {
	
	   if(getVida() <= 0 ) {
		
		   System.out.println( " Voce perdeu jogue novamente " );
		   
	   }
	     
   }
  
/**
 * Metodo jogar novamente sera chamado toda vez que o jogador apertar jogar novamente
 */
   public void JogarN() {	
	  setVida(10);
   
   }
}

  
 