/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;
import java.util.ArrayList;
import dados.Cliente;
import dados.Produto;
/**
 *
 * @author alunofavip
 */
public class RepositorioCliente {
    
    private static ArrayList<Cliente> listaClientes = new ArrayList();
    
 public static void adicionarCliente(Cliente c) {
        
       
        listaClientes.add(c);
    }
public static String deletar(Cliente remova){
String mensagem ="\nCliente deletado com sucesso!";
listaClientes.remove(remova);
return mensagem;   
}
 public static void inicializandoDados() {
        
      
       Cliente c1 = new Cliente("João", "117.543.765-36","9.567.587","12/05/1996","123");
       Cliente c2 = new Cliente("Maria", "122.323.965-02","5.300.590","17/09/1970","m123");
      Cliente c3 = new Cliente("Igor", "122.458.974-01","9.539.326","06/06/1997","i123");
        
     
        
        
        listaClientes.add(c1);
        listaClientes.add(c2);
        listaClientes.add(c3);
    }
 /*public static Cliente pesquisarProdutoPeloNome(String nome) {
        Cliente cliente = null;
        
        for (Cliente clienteAtual : listaClientes) {
            if (clienteAtual.getUsuario().equals(nome)) {
                
                cliente = clienteAtual;
                break;
            }
        }

        
        return cliente;
    }*/
 
 public static boolean temEspaco() {
        


        // com a estrutura dinamica nao é necessário chevar o tamanho MAXIMO
        return listaClientes != null; 
    }
 public static Cliente pesquisarClientePeloId(int id) {
       Cliente cliente = null;
        
       
        for (Cliente clienteAtual: listaClientes) {
            if (clienteAtual.getId() == id) {
               
                cliente = clienteAtual;
                break;
            }
        }


        
        return cliente;
    }
  public static void editarCliente(Cliente cliente) {
        
        for (Cliente c : listaClientes) {
            if (c.getId() == cliente.getId()) {
                c = cliente;
                break;
            }
        }
        

    }

}
