public class Main {
    public static void main(String[] args) {
        
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        cc.depositar(100);

        cc.transferir(25, cp);

        cp.imprimirExtrato();
        cc.imprimirExtrato();
    }
}
