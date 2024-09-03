/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade.de.ordenaçao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Main {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();

        contas.add(new Conta(123, "João Silva", 1000.0, 500.0));
        contas.add(new Conta(456, "Maria Santos", 1500.0, 800.0));
        contas.add(new Conta(789, "Pedro Oliveira", 2000.0, 1200.0));

        Collections.sort(contas, Comparator.comparingInt(Conta::getNumero));
        System.out.println("Contas ordenadas por número:");
        for (Conta conta : contas) {
            System.out.println("Número: " + conta.getNumero() + ", Titular: " + conta.getTitular());
        }

        Collections.sort(contas, Comparator.comparing(Conta::getTitular));
        System.out.println("\nContas ordenadas por nome do titular:");
        for (Conta conta : contas) {
            System.out.println("Número: " + conta.getNumero() + ", Titular: " + conta.getTitular());
        }
    }
}
