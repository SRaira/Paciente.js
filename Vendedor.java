package br.uniesp.poo.ted01;


public class Vendedor {

    private String codigo;
    private String nome;
    private Double comissao;
    private String endereco;

    public Vendedor(String codigo, String nome, String endereco, Double comissao) {
        this.codigo = codigo;
        this.nome = nome;
        this.comissao = comissao;
        this.endereco = endereco;

    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}



