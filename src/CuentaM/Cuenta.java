package CuentaM;

public class Cuenta {
    private String titular;
    private double cantidad;

    // Constructor vacío
    public Cuenta() {
    }

    // Constructor con todos los atributos
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    // Métodos getters
    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    // Métodos setters
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    // Método para mostrar los datos de la cuenta
    public void mostrar() {
        System.out.println("Titular: " + titular);
        System.out.println("Cantidad: " + cantidad);
    }

    // Método para ingresar saldo a la cuenta
    public void ingresar(double saldoIngresado) {
        if (saldoIngresado > 0) {
            cantidad += saldoIngresado;
            System.out.println("Se ha ingresado " + saldoIngresado + " a la cuenta.");
        } else {
            System.out.println("El saldo a ingresar debe ser mayor que cero.");
        }
    }

    // Método para retirar saldo de la cuenta
    public void retirar(double saldoRetirar) {
        if (saldoRetirar > 0) {
            if (cantidad >= saldoRetirar) {
                cantidad -= saldoRetirar;
                System.out.println("Se ha retirado " + saldoRetirar + " de la cuenta.");
            } else {
                System.out.println("Fondos insuficientes.");
            }
        } else {
            System.out.println("El saldo a retirar debe ser mayor que cero.");
        }
    }
}
