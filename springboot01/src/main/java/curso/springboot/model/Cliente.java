package curso.springboot.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity//Criar tabela Banco de Dados
public class Cliente implements Serializable{

	 
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)//Gerador de Chave Primária
    private String cpf;
	private Long id;
	
	private String nome;
	
	private String endereco;
	
    private String telefone;
    
    private String email;

    //private String cpf;

     private String dataNasc;

	
	public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEndereco() {
        return endereco;
    }
	 public String getTelefone() {
         return telefone;
     }
	
	 public void setTelefone(String telefone) {
         this.telefone = telefone;
     }
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
   public void setEmail(String email) {
       this.email = email;
   }
   public String getEmail() {
       return email;
   }
  public void setCpf(String cpf) {
      this.cpf = cpf;
  }
  public String getCpf() {
      return cpf;
  }
  public String getDataNasc() {
      return dataNasc;
  }
	 
 public void setDataNasc(String dataNasc) {
     this.dataNasc = dataNasc;
    }
	
	
	
	
	
	
	
	
	

}
