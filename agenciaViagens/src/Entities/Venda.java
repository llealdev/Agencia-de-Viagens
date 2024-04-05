/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author Matheus Leal
 */
public class Venda {
    
    private String nome;
    private String pagamento;
    PacoteViagem pacoteViagem;

    public Venda() {
    }

     public Venda(String nome, String pagamento, PacoteViagem pacoteViagem) {
        this.nome = nome;
        this.pagamento = pagamento;
        this.pacoteViagem = pacoteViagem;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }
   
    public void mostrarInformacoes(double lucro,double taxasAdicionais, double cotacaoDolar) {
        double valorTotalDolar = pacoteViagem.calcularValorTotal(lucro,taxasAdicionais);
        double valorTotalReais = converter(valorTotalDolar, cotacaoDolar);

        System.out.println("Informações da venda:");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Destino: " + pacoteViagem.getDestino());
        System.out.println("Dias: " + pacoteViagem.getDias());
        System.out.println("Forma de pagamento: " + pagamento);
        System.out.println("Total em dólar: $" + String.format("%.2f", valorTotalDolar));
        System.out.println("Total em reais: R$" + String.format("%.2f",valorTotalReais));
        System.out.println("Lucro: $" + String.format("%.2f", pacoteViagem.calcularLucro(lucro)));
        
    }
    
    public Double converter(double valorDolar, double cotacaoDolar) {
        return valorDolar * cotacaoDolar;
    }
}
