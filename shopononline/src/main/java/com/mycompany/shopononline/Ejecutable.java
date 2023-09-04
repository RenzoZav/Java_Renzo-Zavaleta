package com.mycompany.shopononline;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ejecutable {

    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now(); 
        String nombreCliente = JOptionPane.showInputDialog("Ingrese su nombre del cliente:");
        Cliente cliente = new Cliente(nombreCliente);
        Venta venta = new Venta(hoy, cliente);
        cargarProductos(venta);
        mostrarFactura(venta);
        mostrarDespedida(nombreCliente);
    }
    
    public static int elegirProducto() {
        String[] opciones = {
            "Un pantalón",
            "Una remera",
            "Un accesorio",     
            "No deseo agregar mas productos"
        };
        
        return JOptionPane.showOptionDialog(
            null,
            "¿Qué desea agregar?",
            "Panel de control",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opciones,
            opciones[0]
        );
    }

    public static void cargarProductos(Venta v) {
        int opcionProd = elegirProducto();
        
        while (opcionProd != 3) {
            String desc;
            int id;
            double precio;
            Producto p = null;
            
            if (opcionProd == 0) {
                desc = JOptionPane.showInputDialog("Ingrese la descripción del pantalón:");
                id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del pantalón:"));
                int talle = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el talle del pantalón:"));
                String modelo = JOptionPane.showInputDialog("Ingrese el modelo del pantalón(Recto, Oxford o Skinny):");
                precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del pantalón:"));

                p = new Pantalon(desc, id, talle, modelo, precio);
            } else if (opcionProd == 1) {
                desc = JOptionPane.showInputDialog("Ingrese la descripción de la remera:");
                id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la remera:"));
                TalleRopa talle = TalleRopa.valueOf(JOptionPane.showInputDialog("Ingrese el talle de la remera (S, M, L, XL):"));
                precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de la remera:"));

                p = new Remera(desc, id, talle, precio);
            } else if (opcionProd == 2) {
                desc = JOptionPane.showInputDialog("Ingrese la descripción del accesorio:");
                id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del accesorio:"));
                precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del accesorio:"));
                double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del accesorio:"));
                String metal = JOptionPane.showInputDialog("Ingrese el metal del accesorio(oro, plata o acero):");

                p = new Accesorio(desc, id, peso, metal, precio);
            }

            v.agregarProducto(p);
            opcionProd = elegirProducto();
        }
    }
    public static void mostrarFactura(Venta v) {
        StringBuilder factura = new StringBuilder();
        factura.append("Factura N°: ").append(v.getNroFact()).append(" - ").append(v.getFecha()).append("\n");
        
        for (Producto p : v.getListaProd()) {
            factura.append(p.toString()).append("\n");
        }
        factura.append("Total: ").append(v.calcularImporteTotal());
        
        JOptionPane.showMessageDialog(
            null,
            factura.toString(),
            "Factura",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
    public static void mostrarDespedida(String nombreUsuario) {
        JOptionPane.showMessageDialog(
            null,
            "¡Gracias por su compra " + nombreUsuario + "! Hasta luego.",
            "Despedida",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
