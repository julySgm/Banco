public class cuentaAhorro {
    private String numCuenta;
    private double saldo;

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public double getSaldo() {

        return saldo;
    }


    //constructor
    public cuentaAhorro(int numCuenta, double saldoInicial) {
        numCuenta=numCuenta;
        saldo= saldoInicial;
    }

    //Metodos
    public void consultaSaldo(){

    }

    public double consignacion(double deposito){
        saldo = saldo+deposito;
        return saldo;
    }
    public double retirarDinero(double cantidad){
        saldo = saldo-cantidad;
        return saldo;
    }

    public void trasnferencia(){

    }

}
