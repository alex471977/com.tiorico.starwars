import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);
        PedidoPelicula pedido1 = new PedidoPelicula();
        System.out.println("introducir el numero de la pelicula:");
        try {
            int numero =Integer.parseInt( scanner.nextLine());

            System.out.println( pedido1.numeroPelicula(numero));
            CrearArchivo archivo = new CrearArchivo();
            archivo.creaArchivo( pedido1.numeroPelicula(numero));
        } catch (NumberFormatException e) {
            System.out.println("pelicula no existe!");
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
        }
        // fin del programa

    }
}
