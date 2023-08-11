package CuentaM;

public class Main {
    public static void main(String[] args) {

        Cuenta cuenta1 =new Cuenta();
        cuenta1.setTitular("Maria");
        cuenta1.setCantidad(8898);
        cuenta1.mostrar();

        cuenta1.ingresar(8);
        cuenta1.retirar(78);
    }
}