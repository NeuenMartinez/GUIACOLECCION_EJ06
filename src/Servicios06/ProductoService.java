package Servicios06;

import Entidades06.Producto;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author NeuenMartinez
 */
public class ProductoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    HashMap<String, Double> ListaPrecios = new HashMap();
    String res = "";

    public void crearProducto() {
        do {
            System.out.println("Ingresar el nombre del Producto: ");
            String nom = leer.next();
            System.out.println("Ingresar el precio del Producto: ");
            Double prec = leer.nextDouble();
            ListaPrecios.put(nom, prec);
            System.out.println("¿Desea agregar un nuevo Producto? (pulse cualquier tecla para seguir agregando, o pulse n para terminar)");
            res = leer.next();
        } while (!res.equalsIgnoreCase("n"));

    }

    public void modificarPrecio() {
        System.out.println("¿De que producto le gustaria modificar el precio?: ");
        String nom = leer.next();
        System.out.println("¿Cual es el nuevo precio del producto?");
        ListaPrecios.replace(nom, leer.nextDouble());
    }

    public void eliminarProducto() {
        System.out.println("¿Que producto desea eliminar?: ");
        String nom = leer.next();
        if (ListaPrecios.remove(nom) == null) {
            System.out.println("El producto ingresado no existe");
            System.out.println("");
        }

    }

    public void mostrarProductos() {
        System.out.println("Lista De Productos:");
        System.out.println("----------------------");
        for (Map.Entry<String, Double> entry : ListaPrecios.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println("Producto: " + key + " Precio: " + value);
        }
    }

}
