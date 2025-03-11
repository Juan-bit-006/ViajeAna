

public class Vehiculo {
    // Atributos
    private String empresaPropietaria;
    private int numeroPasajeros;
    private double capacidadCombustible;
    private double consumoCombustible;

    public Vehiculo(String empresaPropietaria, int numeroPasajeros, double capacidadCombustible, double consumoCombustible) {
        this.empresaPropietaria = empresaPropietaria;
        this.numeroPasajeros = numeroPasajeros;
        this.capacidadCombustible = capacidadCombustible;
        this.consumoCombustible = consumoCombustible;
    }

    public double calcularRango() {
        return capacidadCombustible * consumoCombustible; 
    }

    public void mostrarInformacion() {
        System.out.println("Empresa Propietaria: " + empresaPropietaria);
        System.out.println("Número de Pasajeros: " + numeroPasajeros);
        System.out.println("Capacidad de Combustible: " + capacidadCombustible + " galones");
        System.out.println("Consumo de Combustible: " + consumoCombustible + " millas por galón");
        System.out.println("Rango (millas): " + calcularRango());
        System.out.println();
    }

    public static void main(String[] args) {

        Vehiculo minivan = new Vehiculo("Cootranar", 11, 29, 22);
        Vehiculo duobus = new Vehiculo("Trans Arauca", 40, 28, 35);

        System.out.println("Información del Minivan:");
        minivan.mostrarInformacion();

        System.out.println("Información del Duobus:");
        duobus.mostrarInformacion();
    }
}