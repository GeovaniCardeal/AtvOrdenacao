/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade.de.ordenaçao;

/**
 *
 * @author aluno
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Cliente cliente = new Cliente();

        // Criando 3 objetos Conta
        Conta conta1 = new Conta(123, "Alice", 5000, 1000);
        Conta conta2 = new Conta(456, "Bob", 3000, 1500);
        Conta conta3 = new Conta(789, "Carlos", 7000, 2000);

        // Adicionando as contas ao cliente
        cliente.adicionarConta(conta1);
        cliente.adicionarConta(conta2);
        cliente.adicionarConta(conta3);

        // Ordenando as contas pelo número
        System.out.println("Contas ordenadas por número:");
        cliente.ordenarContasPorNumero();
        cliente.mostrarContas();

        // Ordenando as contas pelo titular
        System.out.println("\nContas ordenadas por titular:");
        cliente.ordenarContasPorTitular();
        cliente.mostrarContas();
    }
}

    
    

