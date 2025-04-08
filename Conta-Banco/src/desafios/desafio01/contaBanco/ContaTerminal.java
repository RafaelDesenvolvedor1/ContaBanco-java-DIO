package desafios.desafio01.contaBanco;

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
        this.numero = n;
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

    public void setNomeCliente(String nc){
        this.nomeCliente = nc;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double s){
        this.saldo = s;
    }

   public String darBoasVindas(){
    return "Olá " + this.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " + this.agencia + ", conta " + this.numero + " já está disponível para saque.";
   }
}
