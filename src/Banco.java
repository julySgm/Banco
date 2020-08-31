public class Banco {

    public static void main(String[] args){
        System.out.println("BANCO");
        cuentaAhorro s = new cuentaAhorro(15641564,6000);
        double r = s.retirarDinero(2000);
        System.out.println("Su saldo es :"+ (r));
        double c = s.consignacion(300);
        System.out.println("Su saldo total es :"+ (c));



    }
}
