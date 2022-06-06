package App;

import java.util.Scanner;

/**
 * @author estudiante
 */
public class AdminPaquetes {

    private String[] paquetes;
    private String[] detalles;
    private Double[] costo;
    private String[] decoraciones;

    public AdminPaquetes() {
        this.paquetes = new String[3];
        this.detalles = new String[3];
        this.costo = new Double[3];
        this.decoraciones = new String[6];
        
        this.setDecoraciones();
        this.setDescripcion();
        this.setPaquetes();
        this.setPrecio();
    }

    public void setPaquetes() {
        this.paquetes[0] = "Paquete A";
        this.paquetes[1] = "Paquete B";
        this.paquetes[2] = "Paquete C";
    }

    public void setDescripcion() {
        this.detalles[0] = "- Dulce\n- Canastitas\n- Refresco\n- Hasta 50 invitados\n- 1 hora";
        this.detalles[1] = "- Dulce\n- Canastitas\n- Refresco\n- 1 Animador\n- Hasta 50 invitados\n- 1 hora";
        this.detalles[2] = "- Dulce\n- Canastitas\n- Refresco\n- 1 Animador\n- Regalo sorpresa para el cumpleañero\n- Hasta 100 invitados";
    }

    public void setPrecio() {
        this.costo[0] = 300.00;
        this.costo[1] = 450.00;
        this.costo[2] = 550.00;
    }

    public void setDecoraciones() {
        this.decoraciones[0] = "Cenicienta";
        this.decoraciones[1] = "Rapunzel";
        this.decoraciones[2] = "Pepa Pig";
        this.decoraciones[3] = "Paw Patrol";
        this.decoraciones[4] = "Cars";
        this.decoraciones[5] = "Batman";
    }

    public String[] getPaquetes() {
        return this.paquetes;
    }

    public String[] getDescripcion() {
        return this.detalles;
    }

    public Double[] getPrecio() {
        return this.costo;
    }

    public String[] getDecoraciones() {
        return this.decoraciones;
    }

    public int MenuPrincipal() {
        int opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Registrar la venta del paquete de cumpleaños");
        System.out.println("2. Registrar cancelaciones");
        System.out.println("3. Listar las ventas realizadas por paquete");
        System.out.println("4. Listar las cancelaciones realizadas");
        System.out.println("5. Listar todas las ventas realizadas y el gran total");
        System.out.println("0. Salir");
        System.out.println("\n\nSeleccione una opcion:");
        opcion = sc.nextInt();
        return opcion;
    }
    
    public int MenuPaquetes(){
        int opcion;
        Scanner sc = new Scanner(System.in);
        String [] paquete = this.getPaquetes();
        for (int i = 0; i < paquete.length; i++) {
            System.out.println(i+1 + ". " + paquete[i]);
        }
        System.out.println("\n\nSeleccione una opcion:");
        opcion = sc.nextInt();
        return opcion;
    }
}
