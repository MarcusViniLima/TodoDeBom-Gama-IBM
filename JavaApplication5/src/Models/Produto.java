/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author marcu
 */
public class Produto {
    
    private int id;
    private String nomeProduto;
    private String marcaProduto; 
    private double valorProduto;
    private int quantidadeProduto;
    private String flag_medicamento;
    private String flag_generico;

    public Produto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getMarcaProduto() {
        return marcaProduto;
    }

    public void setMarcaProduto(String marcaProduto) {
        this.marcaProduto = marcaProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public String getFlag_medicamento() {
        return flag_medicamento;
    }

    public void setFlag_medicamento(String flag_medicamento) {
        this.flag_medicamento = flag_medicamento;
    }

    public String getFlag_generico() {
        return flag_generico;
    }

    public void setFlag_generico(String flag_generico) {
        this.flag_generico = flag_generico;
    }
    
    
}
