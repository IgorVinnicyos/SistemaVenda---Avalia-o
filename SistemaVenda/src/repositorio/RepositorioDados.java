/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;
import dados.Produto;
import dados.Funcionario;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author Igor
 */
public class RepositorioDados {
    
    public static ArrayList<Produto> listaProdutos = new ArrayList();
    
    
    /**
     * Estrutura para carregar dados FAKE na memória
     */
    public static void inicializandoDados() {
        Funcionario f1 = new Funcionario("Mauro", "8.680.300","123.456.787-03");
       Funcionario f2 = new Funcionario("Vinicyos", "7.567.322","119.734.967-01");
      Funcionario f3 = new Funcionario("Lucas", "9.648.367","117.478.967-02");
        // criando os objetos diretamente
        Produto p1 = new Produto("Iphone 6s" , "Smartphone top de linha apple", 4000.0, 500.0,f1);
        Produto p2 = new Produto("Galaxy s6 edge+" , "Smartphone top de linha Samsung ", 4000.0, 1500,f2);
        Produto p3 = new Produto("Sony Xperia z5 premiun" , "Smartphone top de linha Sony", 4000.0, 700.0,f2);
        
        RepositorioFuncionario.listaFuncionarios.add(f1);
         RepositorioFuncionario.listaFuncionarios.add(f2);
          RepositorioFuncionario.listaFuncionarios.add(f3);
        listaProdutos.add(p1);
        listaProdutos.add(p2);
        listaProdutos.add(p3);
    }
    
    
    /**
     * Permite adicionar um objeto Produto.
     * 
     * @param p um objeto Produto para ser adicionado.
     */
    public static void adicionarProduto(Produto p) {
        
        /* LOGICA USADA PARA ARRAY estático
         adiciona o objeto Produto para o array
//        listaProdutos[posicaoLivre] = p;
         atualizar o valor do contador livre
//        posicaoLivre++;
       */
        listaProdutos.add(p);
    }
    
    /**
     * Verifica se ainda tem espaço
     * @return true se tem espaço ou falso, caso contrário.
     * 
     * @deprecated Esse método tornou-se obsoleto usando Collection de Java. 
     */
    public static boolean temEspaco() {
        
//        return posicaoLivre < MAXIMO;

        // com a estrutura dinamica nao é necessário chevar o tamanho MAXIMO
        return listaProdutos != null; 
    }
    
    /**
     * Esse método faz a busca na lista de produtos.
     * @param codigo o codigo a ser pesquisado
     * @return um objeto Produto se o codigo foi encontrado, 
     * caso contrario, retorna null.
     */
    public static Produto pesquisarProdutoPeloCodigo(int codigo) {
        Produto produto = null;
        
        // usando laço For each: 
        // http://www.javaprogressivo.net/2012/09/o-laco-for-para-arrays.html
        for (Produto produtoAtual : listaProdutos) {
            if (produtoAtual.getCodigo() == codigo) {
                // achei o produto com o codigo correspondente
                produto = produtoAtual;
                break;
            }
        }

//        // pesquisar na lista de Produtos 
//        for (int i = 0; i < listaProdutos.length; i++) {
//            // recuperar o Produto atual e comparar o codigo
//            Produto p = listaProdutos[i];
//            if (p != null && p.getCodigo() == codigo) {
//                // achei o produto com o codigo correspondente
//                
//                produto = p;
//                break;
//            }
//        } // fim laco for
        
        return produto;
    }
 public static String  deletar (Produto prod){
  String mensagem  = "\nDeletado com sucesso";
 listaProdutos.remove(prod);
 return mensagem;

}
    /**
     * Permite atualizar o valor do objeto
     * 
     * @param produto  objeto Produto a ser editado.
     */
    public static void editarProduto(Produto produto) {
        
        for (Produto p : listaProdutos) {
            if (p.getCodigo() == produto.getCodigo()) {
                p = produto;
                break;
            }
        }
        
//        for (int i = 0; i < listaProdutos.length; i++) {
//            if (listaProdutos[i].getCodigo() == produto.getCodigo()) {
//                listaProdutos[i] = produto;
//                break;
//            }
//        }
        
    }  
}
