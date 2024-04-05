/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Application;

import Entities.Hospedagem;
import Entities.PacoteViagem;
import Entities.Transporte;
import Entities.Venda;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Matheus Leal
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("----- Agência de viagens -----");
        System.out.println("");
        System.out.println("----- Transporte -----");
        System.out.println("Aereo | Rodoviario | Maritimo");
        System.out.print("Informe o tipo de transporte que o senhor deseja utilizar: ");
        String transporte = sc.nextLine();
        System.out.print("Informe o valor do transporte: $");
        double transporteValor = sc.nextDouble();
        Transporte trransporte = new Transporte(transporte, transporteValor);
       
        System.out.println();
        
        System.out.println("----- Hospedagem -----");
        System.out.println("Suite | Quarto Duplo | Quarto Standard | Quarto Familiar | Quarto Adaptado para Deficientes ");
        System.out.print("Informe o tipo de quarto desejado: ");
        sc.nextLine();
        String quarto = sc.nextLine();
        System.out.print("Informe o valor do quarto: $");
        double quartoValor = sc.nextDouble();
        Hospedagem hospedagem = new Hospedagem(quarto, quartoValor);
        
        System.out.println();
        
        System.out.println("----- Destino -----");
        System.out.print("Informe de destino da viagem: ");
        sc.nextLine();
        String destino = sc.nextLine();
        System.out.print("Quantidade de dias dessa vaigem: ");
        int dias = sc.nextInt();
        PacoteViagem pacote = new PacoteViagem(destino, dias, trransporte, hospedagem);
        
        System.out.println();
        
        pacote.informacaoPacote();
        
        System.out.println();
        
        System.out.println("----- Adicionais -----");
        System.out.print("Informe a porcertagem de lucro: ");
        double lucro = sc.nextDouble();
        pacote.calcularLucro(lucro);
        System.out.print("Informe o valor das taxas adicionais: $");
        double taxas = sc.nextDouble();
        pacote.calcularValorTotal(lucro, taxas);
        
        System.out.println();
        
        System.out.println("----- Finalizar a venda -----");
        System.out.print("Informe o nome do cliente: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("Forma de pagamento: ");
        String formaPagamento = sc.nextLine();
        Venda venda = new Venda(nome, formaPagamento, pacote);
        
        System.out.print("Informe a cotação do dólar: $");
        double cotacao = sc.nextDouble();
        
        System.out.println();
        
        venda.mostrarInformacoes(lucro, taxas, cotacao);
        
        sc.close();
    }
    
}
