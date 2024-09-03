/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade.de.ordenaçao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
/**
 *
 * @author aluno
 */
public class Cliente {
private List<Conta> contas;

    public Cliente() {
        contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void ordenarContasPorNumero() {
        Collections.sort(contas);
    }

    public void ordenarContasPorTitular() {
        contas.sort(Comparator.comparing(Conta::getTitular));
    }

    public void mostrarContas() {
        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }
}
