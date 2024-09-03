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
public class Conta implements Comparable<Conta> {
    private int numero;
    private String titular;
    private double limiteCredito;
    private double saldo;

    public Conta(int numero, String titular, double limiteCredito, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.limiteCredito = limiteCredito;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public double getSaldo() {
        return saldo;
    }
    
    @Override
	public int compareTo(Conta oConta) {
		return Integer.compare(this.numero, oConta.numero);
  
}
    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", titular='" + titular + '\'' +
                ", limite=" + limiteCredito +
                ", saldo=" + saldo +
                '}';
    }

       
}
