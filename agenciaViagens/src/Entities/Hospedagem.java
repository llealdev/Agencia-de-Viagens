/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author Matheus Leal
 */
public class Hospedagem {
    
    private String descricao;
    private Double valorDiaria;
    
    
    public Hospedagem(){
        
    }
    
    public Hospedagem(String descricao, Double valorDiaria){
        this.descricao = descricao;
        this.valorDiaria = valorDiaria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(Double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
    
   
}
