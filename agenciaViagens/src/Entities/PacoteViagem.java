/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author Matheus Leal
 */
public class PacoteViagem {
    
    private String destino;
    private Integer dias;
    Transporte transporte;
    Hospedagem hospedagem;
    
    public PacoteViagem(){
        
    }

    public PacoteViagem(String destino, Integer dias, Transporte transporte, Hospedagem hospedagem) {
        this.destino = destino;
        this.dias = dias;
        this.transporte = transporte;
        this.hospedagem = hospedagem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }
    
    public Double calcularHospedagem(){
        return dias * hospedagem.getValorDiaria();
    }
     public Double calcularLucro(double lucro){
        return (calcularHospedagem()+ transporte.getValor()) * (lucro/100);
    }
    
    public Double calcularValorTotal(double lucro, double taxasAdicionais){
        double valorTransporte = transporte.getValor();
        double valorTotal = calcularHospedagem() + valorTransporte;

        return valorTotal + taxasAdicionais + calcularLucro(lucro);
    }
   
    
   public void informacaoPacote(){
        System.out.println("Informações do Pacote:");
        System.out.println("Destino: " + destino);
        System.out.println("Dias: " + dias);
        System.out.println("Transporte: " + transporte.getTipo() + " | Valor $" + String.format("%.2f",transporte.getValor()));
        System.out.println("Hospedagem: " + hospedagem.getDescricao() + " | Valor $" + String.format("%.2f", hospedagem.getValorDiaria()));
        System.out.println("Valor total: $" + String.format("%.2f", calcularValorTotal(0, 0)));
        
   }

   
}
