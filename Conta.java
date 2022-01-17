public abstract class Conta implements IConta  {
    
    private static final int AGENCIA_PADRAO = 1;
    
    private static int SEQUENCIAL = 1;
  

    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta()
    {
        this.agencia=Conta.AGENCIA_PADRAO;
        this.numero=SEQUENCIAL++;
    }  

    public int getAgencia() {
        return this.agencia;
    }

    public int getConta() {
        return this.numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public void depositar(double valor) {
        saldo+=valor;
        
    }

    @Override
    public void sacar(double valor) {
        saldo-=valor;
        
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        
    }

    protected void imprimirInfoComuns()
    {
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

   
}
