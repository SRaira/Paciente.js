package br.uniesp.poo.ted01;

public class main {


    public static void main(String[] args) {

        Produto produto = new Produto("999999", "Moto POP 110", 1000.00, 700.00, false);
        Vendedor vendedor = new Vendedor("112233", "Raira Lira", "Rua Armando Afonso", 5.00);

        Venda venda = new Venda();

        venda.setProduto(produto);
        venda.setVendedor(vendedor);
        venda.setQuantidade(2);
        venda.calcularValor(venda.getQuantidade(), produto.getValorVenda());
        venda.efetuarDesconto(10.00);
        if (produto.getPromocao()) {
            venda.calcularComissao(venda.getValor(), produto.getPromocao());
        }
        venda.imprimir();

    }
}
