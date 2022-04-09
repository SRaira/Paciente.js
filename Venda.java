package br.uniesp.poo.ted01;


public class Venda {

    private Produto produto;
    private Vendedor vendedor;
    private Double desconto;
    private Integer quantidade;
    private Double valor;
    private Double comissao;

    public Venda () {

    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }


    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public void  calcularValor(Integer quantidade, Double valor) {
        this.setValor(valor * quantidade);
    }

    public void calcularComissao(Double valorVenda, Boolean promocao) {
        if (promocao) {
            this.comissao = ( (valorVenda * 10) / 100) / 2;
        } else {
            this.comissao = (valorVenda * 10) / 100;
        }
    }

    public void  efetuarDesconto(Double porcentagem) {
        this.desconto = (this.getValor() * porcentagem) / 100;
    }

    public void imprimir() {
        System.out.println("Código: "+ vendedor.getCodigo() +" ---- Vendedor: "+ vendedor.getNome()+" ---- Endereço: "+vendedor.getEndereco()+" ---- Valor de comissão: "+vendedor.getComissao()+"%");
        System.out.println("Quantidade de Itens: "+ this.quantidade);
        System.out.println("Código: "+produto.getCodigo()+" ---- Produto: "+produto.getDescricao());
        System.out.println("Preço de Venda: R$"+produto.getValorVenda());
        if (produto.getPromocao()) {
            System.out.println("Produto em promoção: Sim");
        } else {
            System.out.println("Promoção em promoção: Não");
        }
        System.out.println("Valor Desconto: R$"+this.getDesconto());
        System.out.println("Valor total venda: R$"+this.getValor());
    }

}

