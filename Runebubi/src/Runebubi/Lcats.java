package Runebubi;

/**
 * Lista que ira receber os dados dos personagens 
 * @author Bee
 *
 */

public class Lcats 
{
/**
 * 	Metodo contrutor 
 */
	public Lcats(){
	   
		
	}

/**
 *  Atributos da classe	
 */
	private String nome;
	private String descricao;
	private int vida;

/**
 * Metodos acessores get e set 	
 * @return
 */
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
		
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
	       this.descricao = descricao;
	}

	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
	       this.vida = vida;
	}	
}
