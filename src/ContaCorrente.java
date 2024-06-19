public class ContaCorrente extends Conta {

    private double limiteCredito;

    @Override
    public void ImprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ==="); 
        super.imprimirInfosComuns();   
        System.out.println("Seu limite de crédito é: " + limiteCredito);    

    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito() {
        this.limiteCredito = (saldo / 2);
    }
    

 
    
}
