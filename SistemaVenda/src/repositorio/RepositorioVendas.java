/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import java.util.ArrayList;
import dados.Vendas;

/**
 *
 * @author alunofavip
 */
public class RepositorioVendas {
    
  private static ArrayList<Vendas> listaVendas = new ArrayList();
   
  
public static void adicionarVenda(Vendas venda) {


listaVendas.add(venda);
}

public static double calcularLucro(Vendas v){
double  lucro = 0.0;
double pv = v.getProduto().getPrecoVenda();
double pc = v.getProduto().getPrecoCusto();
int qt = v.getQuantidade();
lucro = (pv - pc)*qt;
return lucro;
}
public static String imprimirResultado(Vendas venda){
String relatorio ="Funcionário: "+venda.getProduto().getFuncionario().getNome()
   +"\nVenda: "+venda.getProduto().getNome()+"\nPreço de venda: "+venda.getProduto().getPrecoVenda()+
   "\nPreço custo: "+venda.getProduto().getPrecoCusto()+"\nQuantidade: "+venda.getQuantidade()+"\nCliente: "+venda.getCliente().getUsuario()+
        "\nPagamento: "+venda.getPagamento()+
    "\nLucro: "+calcularLucro(venda);

return relatorio;
}
 public static String  deletar (Vendas venda){
  String mensagem  = "\nDeletado com sucesso";
 listaVendas.remove(venda);
 return mensagem;

}
 public static Vendas  pesquisarVendaPeloCodigo(int codigo) {
        Vendas venda = null;
        
        for (Vendas vendaAtual : listaVendas) {
            if (vendaAtual.getCodigo() == codigo) {
                
              venda = vendaAtual;
                break;
            }
        }

        
        return venda;
    }


}


