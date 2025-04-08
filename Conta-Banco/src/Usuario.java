import desafios.desafio01.contaBanco.ContaTerminal;

public class Usuario {
    public static void main(String[] args) throws Exception {
        ContaTerminal userA = new ContaTerminal();

        userA.setNumero(1021);
        userA.setAgencia("0678-8");
        userA.setNomeCliente("Mario Andrade");
        userA.setSaldo(237.48);

        System.out.println(userA.darBoasVindas());
    }
}
