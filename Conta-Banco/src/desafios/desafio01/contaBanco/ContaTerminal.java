package desafios.desafio01.contaBanco;

import java.util.Random;

public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public ContaTerminal(){}

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int n){

            Random numAleatorio = new Random();
            if(n > 0){
                this.numero = n;
            }else{
                this.numero = numAleatorio.nextInt(6000) * 1;
            }
        

    
        
    }
    public String getAgencia(){
        return this.agencia;
    }

    public void setAgencia(String a){
        this.agencia = a;
    }

    public String getNomeCliente(){
        return this.nomeCliente;
    }

    public void setNomeCliente(String nome, String sobrenome){
        this.nomeCliente = nome.concat(" ").concat(sobrenome).toUpperCase();
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double s){
        if(s >= 0){
            this.saldo = s;
        }else{
            this.saldo = 0;
        }
        
    }

   public String darBoasVindas(){
    return "Ola " + this.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia e " + this.agencia + ", conta " + this.numero + " e seu saldo R$" + this.saldo + " ja esta disponivel para saque.";
   }
}
