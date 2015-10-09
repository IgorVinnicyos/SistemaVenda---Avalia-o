/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

/**
 *
 * @author alunofavip
 */
public class Cliente {
    
    private String usuario;
    private String cpf;
    private String rg;
    
    private int id;
    private String nascimento;
    private String senha;
    private static int idAutomatico = 1;

    public Cliente(String usuario, String cpf, String rg, String nascimento, String senha) {
      id = idAutomatico;
      idAutomatico++;
      
        this.usuario = usuario;
        this.cpf = cpf;
        this.rg = rg;
        this.nascimento = nascimento;
        this.senha = senha;
    }

    @Override
    public String toString() {
      String relatorio = "";  
      relatorio += "ID: "+id;
      relatorio += "\nUsuario: "+usuario; 
      relatorio += "\nCPF: "+cpf; 
      relatorio += "\nRG: "+rg; 
      relatorio += "\nData de nascimento: "+nascimento; 
     
        
   
        return relatorio;
    }
     public void imprimirClientes() {
        
        System.out.println(toString() );
    }
    

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
    
    
    
    
}
