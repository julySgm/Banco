public class cuenta {

    private double saldo;
    private String numCuenta;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public cuenta(int numCuenta, double saldoInicial) {
        numCuenta=numCuenta;
        saldo= saldoInicial;
    }

    public double retirarDinero(double cantidad){
        saldo = saldo-cantidad;
        return saldo;
    }

    public double getSaldo() {

        return saldo;
    }

    public String getNumCuenta() {
        return numCuenta;
    }
}
