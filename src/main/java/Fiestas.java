
/**
 *
 * @author estudiante
 */
import java.util.Scanner;
import App.AdminPaquetes;

public class Fiestas {

    public static void main(String[] args) {
        AdminPaquetes ap = new AdminPaquetes();

        int opt = 0;
        Scanner sc = new Scanner(System.in);
        boolean status = true;
        while (status) {
            System.out.println("\n=============================================");
            System.out.println("\t Administración de Paquetes");
            System.out.println("=============================================");
            opt = ap.MenuPrincipal();

            switch (opt) {
                case 1:
                    System.out.println("\n=============================================");
                    System.out.println("\t Selección de Paquetes");
                    System.out.println("=============================================");

                    // Selecciona paquete
                    int id_paquete;
                    System.out.println("\nSeleccione una opcion:");

                    id_paquete = ap.MenuPaquetes();
                    String[] descripcion_paquetes = ap.getDescripcion();
                    Double[] precio_paquetes = ap.getPrecio();
                    String[] nombre_paquetes = ap.getPaquetes();
                    String[] decoracion_paquetes = ap.getDecoraciones();

                    // define los datos de el paquete
                    String descripcion_paquete = descripcion_paquetes[id_paquete];
                    Double precio_paquete = precio_paquetes[id_paquete];
                    String nombre_paquete = nombre_paquetes[id_paquete];

                    switch (id_paquete) {
                        case 1:
                            System.out.println("Este paquete contiene lo siguiente: ");
                            System.out.println(descripcion_paquete);

                            // invitados adicionales
                            System.out.println("\nPor cada invitado adicional tiene un costo de B/.25");
                            System.out.println("Desea agregar invitados ADICIONALES?");
                            System.out.println("1. Si");
                            System.out.println("2. No");
                            int agrega_invitados;
                            agrega_invitados = sc.nextInt();

                            if (agrega_invitados == 1) {
                                System.out.println("Cuantos invitados ADICIONALES desea agregar?");
                                int invitados_extra = sc.nextInt();
                                precio_paquete = precio_paquete + (invitados_extra * 25.00);
                            }

                            // Tiempo adicional
                            System.out.println("\nSi desea 30 minutos adicionales tiene un costo de B/.50.00");
                            System.out.println("Desea extender la duración del evento 30 minutos más de lo descrito en el plan?");
                            System.out.println("1. Si");
                            System.out.println("2. No");
                            int extencion = sc.nextInt();
                            if (extencion == 1) {
                                System.out.println("Cuantos intervalos de 30 minutos desea agregar?");
                                int tiempo_extra = sc.nextInt();
                                if (tiempo_extra > 2) {
                                    System.out.println("El tiempo para el cumpleaños no puede exceder a las 2 horas");
                                } else {
                                    precio_paquete = precio_paquete + (tiempo_extra * 50.00);
                                }
                            }

                            // Seleccion de decoracion
                            System.out.println("\nSi el cliente desea una decoración con un tema diferente a los que se tienen en la lista de temas tiene un costo de B/.20.00");
                            for (int i = 0; i < decoracion_paquetes.length; i++) {
                                System.out.println(i + 1 + ". " + decoracion_paquetes[i]);
                            }
                            System.out.println("0. Personalizar decoración");
                            System.out.println("\n\nSeleccione una opcion:");
                            int decoracion_id = sc.nextInt();
                            String decoracion_paquete = decoracion_paquetes[decoracion_id];
                            
                            if(decoracion_id == 0 ){
                                System.out.println("Ingrese el nombre de la decoración");
                                decoracion_paquete = sc.nextLine();
                                precio_paquete = precio_paquete + 20.00;
                            }

                            System.out.println("--> Confirmación de Paquete <--");
                            System.out.println("Paquete a obtener\t\t\t- " + nombre_paquete);
                            System.out.println("Decoración a utilizar\t\t- " + decoracion_paquete);
                            System.out.println("Precio del paquete\t\t\t- $. " + precio_paquete);
                            System.out.println("Impuestos a cargar\t\t\t- $. " + precio_paquete * 0.07);
                            System.out.println("Precio total del paquete\t\t- $. " + precio_paquete * 1.07);
                            
                            break;
                        case 2:
                            System.out.println("Paquete B");
                            break;
                        case 3:
                            System.out.println("Paquete C");
                            break;
                        case 0:
                            System.out.println("<= VOLVER");
                            break;
                        default:
                            throw new AssertionError();
                    }
                    break;

                case 2:
                    System.out.println("\n> Se ha seleccionado la opcion Cancelar Paquete\n");
                    break;

                case 3:
                    System.out.println("\n> Se ha seleccionado la opcion Listar Ventas\n");
                    break;

                case 4:
                    System.out.println("\n> Se ha seleccionado la opcion Listar Cancelaciones\n");
                    break;

                case 5:
                    System.out.println("\n> Se ha seleccionado la opcion Reporte de Ventas\n");
                    break;

                case 0:
                    System.out.println("\n> Se ha seleccionado la opcion SALIR!!!!\n");
                    status = false;
                    break;

                default:
                    System.err.println("\n>> Opción no disponible, seleccione una de las opciones listadas!!!");
            }
        }
    }
}
