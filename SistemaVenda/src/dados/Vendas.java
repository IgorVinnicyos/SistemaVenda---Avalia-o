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
public class Vendas {
    private int codigo;
   
    private Cliente cliente;
    private Produto produto;
    private int quantidade;
    private String data;
    private String pagamento;
    private static int codAuto = 1;

    public Vendas(Cliente cliente, Produto produto, String data, int quantidade, String pagamento) {
        codigo = codAuto;
        codAuto++;
        
        this.cliente = cliente;
        this.produto = produto;
        this.data = data;
        this.quantidade = quantidade;
        this.pagamento = pagamento;
    }

    @Override
    public String toString() {
        return  "\nCodigo: " + codigo + "\nCliente: " + cliente.getUsuario()+
"\nCpf: "+cliente.getCpf()+"\nRg: "+cliente.getRg() + " \nProduto: " + produto.getNome() +"\nDescrição: "+
     produto.getDesc()+"\nPreço: "+produto.getPrecoVenda()+
  " \nQuantidade: " + quantidade + " \nData: " + data + " \nPagamento: " + pagamento ;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

  

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
        
        
     
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }
    
    
}
