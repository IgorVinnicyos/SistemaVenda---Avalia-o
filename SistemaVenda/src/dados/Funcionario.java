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
public class Funcionario {
    
 private String nome ;
 private String rg;
 private String cpf;
 private int cod;
 private static int codAuto = 1;

    public Funcionario(String nome, String rg, String cpf) {
        cod = codAuto;
        codAuto++;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Funcionario" + "\nnome: " + nome + ", \nrg: " + rg + ", \ncpf: " + cpf + ", \nCodigo: " + cod ;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
 
 
    
}
