import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    ContaCorrente cc = new ContaCorrente();
    ContaPoupanca poupanca = new ContaPoupanca();
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.println("== Digite a opção desejada: ==");
      System.out.println("1 - Conta Corrente");
      System.out.println("2 - Conta Poupança");
      System.out.println("0 - Sair");
      int nextStep = sc.nextInt();

      if (nextStep == 1) { // Conta corrente.
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Extrato");
        System.out.println("0 - Voltar ao menu");

        int nextstepcc = sc.nextInt();

        if (nextstepcc == 1) {
          System.out.println("Digite o valor do deposito:");
          double dpcc = sc.nextDouble();
          cc.depositar(dpcc);
          cc.setLimiteCredito();
          cc.ImprimirExtrato();
        } else if (nextstepcc == 2) {
          System.out.println("Digite o valor do saque:");
          double sqcc = sc.nextDouble();
          cc.sacar(sqcc);
          cc.setLimiteCredito();
          cc.ImprimirExtrato();

        } else if (nextstepcc == 3) {
          cc.ImprimirExtrato();

        }

      } else if (nextStep == 2) { // Aqui começa a poupanca.
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Extrato");
        System.out.println("0 - Voltar ao menu");

        int nextstepcpp = sc.nextInt();
        if (nextstepcpp == 1) {
          System.out.println("Digite o valor do deposito:");
          double dppp = sc.nextDouble();
          poupanca.depositar(dppp);
          poupanca.ImprimirExtrato();

        } else if (nextstepcpp == 2) {
          System.out.println("Digite o valor do saque:");
          double sacarpp = sc.nextDouble();
          poupanca.sacar(sacarpp);
          poupanca.ImprimirExtrato();


        } else if (nextstepcpp == 3) {
          poupanca.ImprimirExtrato();

        }

      } else if (nextStep == 0) {
        System.out.println("Até a proxima!!!");

        break;
      }
    }

  }
}
