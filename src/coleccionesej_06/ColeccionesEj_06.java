/*
 * @author NeuenMartinez
 */
package ColeccionesEj_06;

import Servicios06.ProductoService;
import java.util.Locale;
import java.util.Scanner;

public class ColeccionesEj_06 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        ProductoService ps = new ProductoService();
        boolean exit = false;
        do {
            System.out.println("Menu: ");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("1. Crear un Producto.\n"
                    + "2. Modificar un Precio.\n"
                    + "3. Eliminar un Producto. \n"
                    + "pantalla.\n"
                    + "4. Mostrar los Productos. \n"
                    + "5. Salir.");
            System.out.println("Ingrese el numero de la opcion a seleccionar: ");
            int eleccion = leer.nextInt();
            switch (eleccion) {
                case 1:
                    ps.crearProducto();
                    break;
                case 2:
                    ps.modificarPrecio();
                    break;
                case 3:
                    ps.eliminarProducto();
                    break;
                case 4:
                    ps.mostrarProductos();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("La opcion ingresada es incorrecta, intente nuevamente...");
            }
        } while (exit == false);

    }

}
