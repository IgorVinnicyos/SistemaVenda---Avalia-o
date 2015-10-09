/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;
import dados.Funcionario;
import java.util.ArrayList;

/**
 *
 * @author alunofavip
 */
public class RepositorioFuncionario {
    
   
    
    public static ArrayList<Funcionario> listaFuncionarios = new ArrayList();
    
 public static void adicionarFuncionario(Funcionario f) {
        
       
        listaFuncionarios.add(f);
    }
 /*
 public static void inicializandoDados() {
        
      
     8  Funcionario f1 = new Funcionario("Mauro", "8.680.300","123.456.787-03");
       Funcionario f2 = new Funcionario("Vinicyos", "7.567.322","119.734.967-01");
      Funcionario f3 = new Funcionario("Lucas", "9.648.367","117.478.967-02");
        
     
        
        // povoar estrutura dinamica (se tiver muitos itens pode-se usar laço)
        listaFuncionarios.add(f1);
        listaFuncionarios.add(f2);
        listaFuncionarios.add(f3);
 }
 */
 public static boolean temEspaco() {
        
//        return posicaoLivre < MAXIMO;

        // com a estrutura dinamica nao é necessário chevar o tamanho MAXIMO
        return listaFuncionarios != null; 
    }
 
  public static String  deletar (Funcionario func){
  String mensagem  = "\nDeletado com sucesso";
 listaFuncionarios.remove(func);
 return mensagem;

}
 public static Funcionario pesquisarFuncionarioPelocod(int cod) {
       Funcionario funcionario = null;
        
       
        for (Funcionario funcionarioAtual: listaFuncionarios) {
            if (funcionarioAtual.getCod()== cod) {
               
                funcionario = funcionarioAtual;
                break;
            }
        }


        
        return funcionario;
    }
  public static void editarFuncionario(Funcionario funcionario) {
        
        for (Funcionario f : listaFuncionarios) {
            if (f.getCod()== funcionario.getCod()) {
                f = funcionario;
                break;
            }
        }
        

    } 
    
}
