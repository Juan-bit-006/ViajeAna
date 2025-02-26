import java.util.Scanner;

public class ViajeAna {

    public static void main(String[] args) {

    double precio_tiquete = 1000000;
    Scanner sc = new Scanner(System.in);

    while (true) { 
    System.out.println("Ingrese la edad de Ana: ");
    int edad = sc.nextInt();
    double precioFinal = 0;

if (edad < 2) { 
System.out.println("Ana no puede viajar si es menor de 2 años");
}

if (edad >= 2 && edad < 5) { 
System.out.println("El ticket de Ana es gratis");
}


if (edad >=5 && edad < 11) { 
    precioFinal= precio_tiquete / 2;
System.out.println("El precio del ticket para Ana es " +precioFinal);
}

if (edad >= 11 && edad < 15) { 
precioFinal = precio_tiquete * 0.75;
System.out.println("El precio del Ticket para Ana es " +precioFinal);
}

if (edad >=15) { 
precioFinal = precio_tiquete;
System.out.println("El precio del ticket para Ana es  " +precioFinal );
}

        }   
    
}
}