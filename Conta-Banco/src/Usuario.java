import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import desafios.desafio01.contaBanco.ContaTerminal;

public class Usuario {
    public static void main(String[] args) throws Exception {
    try{
        ContaTerminal userA = new ContaTerminal();

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scan.nextLine();

        userA.setNomeCliente(nome, sobrenome);

        System.out.println("Insiria o numero da sua agencia no formato xxx-x.");
        userA.setAgencia(scan.nextLine());

        System.out.println("Informe o número da conta: ");
        userA.setNumero(scan.nextInt());

        System.out.println("Informe seu saldo: ");
        userA.setSaldo(scan.nextDouble());
           

        System.out.println(userA.darBoasVindas());

        scan.close();

      } catch ( InputMismatchException e){
        System.out.println("Campo numero da conta e saldo, recebem apenas numeros");
      }
      
    }
}
