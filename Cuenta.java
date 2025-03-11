
public class Cuenta {

    private String titular;
    private double total; 
    private double cantidad;

   
    public Cuenta(String titular) {
        this.titular = titular;
        this.total = 5000;
        this.cantidad = 0;
    }

   
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.total = 5000; 
        this.cantidad = cantidad;
    }

   
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

  
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            total += cantidad; 
        }
    }

    
    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (total - cantidad < 0) {
                total = 0; 
            } else {
                total -= cantidad;
            }
        }
    }


    public void mostrarInformacion() {
        System.out.println("Titular: " + titular);
        System.out.println("Total: $" + total);
        System.out.println("Cantidad: $" + cantidad);
    }

   
    public static void main(String[] args) {
 
        Cuenta cuenta1 = new Cuenta("Juan Pérez");
        cuenta1.mostrarInformacion();

   
        cuenta1.ingresar(1500);
        System.out.println("Después de ingresar $1500:");
        cuenta1.mostrarInformacion();

        cuenta1.retirar(2000);
        System.out.println("Después de retirar $2000:");
        cuenta1.mostrarInformacion();

        cuenta1.retirar(10000);
        System.out.println("Después de intentar retirar $10000:");
        cuenta1.mostrarInformacion();
    }
}

