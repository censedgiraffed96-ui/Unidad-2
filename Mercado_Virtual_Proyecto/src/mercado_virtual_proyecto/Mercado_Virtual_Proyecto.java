//ARATH 👍
package mercado_virtual_proyecto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Mercado_Virtual_Proyecto {

    static JFrame mainFrame;
    static Map<String, Double> carrito = new LinkedHashMap<>();

    // ==============================
    //   PRECIOS DE PRODUCTOS
    // ==============================
    static Map<String, Double> precios = new HashMap<>();

    static {
    // 1) Variado
    precios.put("Arroz", 25.0);
    precios.put("Espagueti", 18.0);
    precios.put("Harina de trigo", 22.0);
    precios.put("Aceite vegetal", 35.0);
    precios.put("Salsa de tomate", 15.0);

    // 2) Lácteos y derivados
    precios.put("Leche entera", 22.0);
    precios.put("Yogur griego", 12.0);
    precios.put("Queso Oaxaca", 55.0);
    precios.put("Crema ácida", 18.0);
    precios.put("Mantequilla", 20.0);

    // 3) Huevos
    precios.put("Huevos blancos", 35.0);
    precios.put("Huevos orgánicos", 48.0);

    // 4) Carnes y embutidos
    precios.put("Pollo", 90.0);
    precios.put("Carne de res", 140.0);
    precios.put("Jamón", 45.0);
    precios.put("Salchichas", 30.0);
    precios.put("Chorizo", 38.0);

    // 5) Pescados y mariscos
    precios.put("Pescado", 120.0);
    precios.put("Camarón", 160.0);
    precios.put("Atún en lata", 22.0);

    // 6) Frutas y verduras
    precios.put("Manzana", 28.0);
    precios.put("Plátano", 16.0);
    precios.put("Jitomate", 22.0);
    precios.put("Cebolla", 18.0);
    precios.put("Aguacate", 38.0);

    // 7) Panadería y repostería
    precios.put("Pan blanco", 28.0);
    precios.put("Bolillo", 3.0);
    precios.put("Galletas", 20.0);
    precios.put("Pastel", 150.0);

    // 8) Cereales y desayuno
    precios.put("Cereal", 45.0);
    precios.put("Avena", 20.0);
    precios.put("Cacao", 28.0);
    precios.put("Mermelada", 32.0);

    // 9) Bebidas
    precios.put("Agua", 12.0);
    precios.put("Refresco", 18.0);
    precios.put("Jugo", 20.0);
    precios.put("Café", 65.0);
    precios.put("Cerveza", 22.0);

    // 10) Congelados y refrigerados
    precios.put("Helado", 55.0);
    precios.put("Pizza congelada", 80.0);
    precios.put("Comida lista", 65.0);

    // 11) Conservas y enlatados
    precios.put("Frijoles en lata", 22.0);
    precios.put("Verduras en conserva", 18.0);
    precios.put("Sopa en lata", 20.0);

    // 12) Snacks y botanas
    precios.put("Papas fritas", 18.0);
    precios.put("Palomitas", 15.0);
    precios.put("Chocolate", 22.0);
    precios.put("Nueces", 35.0);

    // 13) Dulces y confitería
    precios.put("Caramelos", 10.0);
    precios.put("Gomitas", 12.0);
    precios.put("Mazapán", 8.0);

    // 14) Productos para bebés
    precios.put("Pañales", 180.0);
    precios.put("Toallitas húmedas", 35.0);
    precios.put("Papilla", 22.0);

    // 15) Cuidado personal
    precios.put("Jabón", 15.0);
    precios.put("Shampoo", 35.0);
    precios.put("Desodorante", 28.0);
    precios.put("Crema", 25.0);

    // 16) Limpieza del hogar
    precios.put("Detergente", 32.0);
    precios.put("Suavizante", 28.0);
    precios.put("Cloro", 15.0);
    precios.put("Toallas de cocina", 18.0);

    // 17) Mascotas
    precios.put("Croquetas perro", 220.0);
    precios.put("Croquetas gato", 180.0);
    precios.put("Juguete para mascota", 45.0);

    // 18) Farmacia
    precios.put("Paracetamol", 25.0);
    precios.put("Vitaminas", 65.0);
    precios.put("Alcohol", 18.0);

    // 19) Papelería
    precios.put("Cuaderno", 25.0);
    precios.put("Pluma", 10.0);
    precios.put("Mochila", 280.0);

    // 20) Electrónica y hogar
    precios.put("Pilas", 25.0);
    precios.put("Foco", 18.0);
    precios.put("Cargador", 120.0);

    // 21) Cocina
    precios.put("Sartén", 180.0);
    precios.put("Platos", 65.0);
    precios.put("Vasos", 45.0);
    precios.put("Recipientes", 50.0);

    // 22) Ropa y calzado
    precios.put("Playera", 120.0);
    precios.put("Calcetines", 25.0);
    precios.put("Sandalias", 80.0);
    precios.put("Ropa interior", 55.0);
    precios.put("Gorro", 30.0);
    precios.put("Cinturón", 65.0);

    // 23) Jardinería y ferretería
    precios.put("Maceta", 22.0);
    precios.put("Tierra", 25.0);
    precios.put("Fertilizante", 40.0);

    // 24) Temporada
    precios.put("Decoración navideña", 120.0);
    precios.put("Artículos de playa", 85.0);
    precios.put("Canasta regalo", 150.0);

    // 25) Orgánicos
    precios.put("Chía", 35.0);
    precios.put("Quinoa", 45.0);
    precios.put("Proteína en polvo", 180.0);

    // 26) Importados
    precios.put("Salsa asiática", 55.0);
    precios.put("Queso importado", 90.0);
    precios.put("Aceite gourmet", 120.0);

    // 27) Servicios adicionales
    precios.put("Tortillas frescas", 20.0);
    precios.put("Pago de servicios", 10.0);
    precios.put("Recarga telefónica", 20.0);
}

    

    // ==============================
    //   INICIO DEL PROGRAMA
    // ==============================
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            mainFrame = new JFrame("Mercado Virtual LITEBORA");
            mainFrame.setSize(600, 450);
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.setLocationRelativeTo(null);
            crearMenu();
            mainFrame.setVisible(true);
        });
    }

    // ==============================
    //   MENÚ PRINCIPAL
    // ==============================
    public static void crearMenu() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        mainFrame.setContentPane(panel);

        JLabel titulo = new JLabel("Bienvenido a la Tienda LITEBORA");
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setBounds(130, 20, 400, 40);
        panel.add(titulo);

        JButton btnIntro = new JButton("Introducción");
        btnIntro.setBounds(150, 100, 250, 40);
        panel.add(btnIntro);

        JButton btnCategorias = new JButton("Lista de Categorías");
        btnCategorias.setBounds(150, 160, 250, 40);
        panel.add(btnCategorias);

        JButton btnCarrito = new JButton("Ver Carrito y Pago");
        btnCarrito.setBounds(150, 220, 250, 40);
        panel.add(btnCarrito);

        JButton btnSalir = new JButton("Salir");
        btnSalir.setBounds(150, 280, 250, 40);
        panel.add(btnSalir);

        // Funcionalidad de botones
        btnIntro.addActionListener(e -> mostrarIntroduccion());
        btnCategorias.addActionListener(e -> mostrarCategorias());
        btnCarrito.addActionListener(e -> mostrarCarrito());
        btnSalir.addActionListener(e -> System.exit(0));

        mainFrame.revalidate();
        mainFrame.repaint();
    }

    // ==============================
    //   INTRODUCCIÓN
    // ==============================
    public static void mostrarIntroduccion() {
        JFrame intro = new JFrame("Introducción");
        intro.setSize(500, 300);
        intro.setLocationRelativeTo(mainFrame);

        JTextArea texto = new JTextArea(
                "Bienvenido al Mercado Virtual LITEBORA.\n\n" +
                "Este programa es una tienda virtual interactiva y funcional\n" +
                "Contiene precios, productos variados y las categorias de los productos \n\n" +
                "Es una tienda digital diseñada para simular una experiencia real\n" +
                "Aunque sencilla comparada a uno real"
        );

        texto.setEditable(false);
        texto.setFont(new Font("Arial", Font.PLAIN, 16));
        intro.add(texto);

        intro.setVisible(true);
    }

    // ==============================
    //   CATEGORÍAS
    // ==============================
    public static void mostrarCategorias() {
        JFrame categorias = new JFrame("Categorías");
        categorias.setSize(400, 500);
        categorias.setLocationRelativeTo(mainFrame);
        categorias.setLayout(new GridLayout(0, 1));

        String[] nombresCategorias = {
    "Variado", "Lácteos y derivados", "Huevos", "Carnes y embutidos", "Pescados y mariscos",
    "Frutas y verduras", "Panadería y repostería", "Cereales y desayuno", "Bebidas",
    "Congelados y refrigerados", "Conservas y enlatados", "Snacks y botanas",
    "Dulces y confitería", "Productos para bebés", "Cuidado personal",
    "Limpieza del hogar", "Productos para mascotas", "Farmacia",
    "Papelería y oficina", "Electrónica y hogar", "Bazar y cocina",
    "Ropa y calzado", "Jardinería y ferretería", "Temporada / Estacional",
    "Orgánicos y saludables", "Importados e internacionales", "Servicios adicionales"
    };

        

        for (String nombre : nombresCategorias) {
            JButton btn = new JButton(nombre);
            btn.addActionListener(e -> mostrarProductos(nombre));
            categorias.add(btn);
        }

        categorias.setVisible(true);
    }

    // ==============================
    //   PRODUCTOS POR CATEGORÍA
    // ==============================
    // mostrarProductos: usa getOrDefault para evitar null en precios
public static void mostrarProductos(String categoria) {
    JFrame prodWindow = new JFrame("Productos - " + categoria);
    prodWindow.setSize(400, 500);
    prodWindow.setLocationRelativeTo(mainFrame);
    prodWindow.setLayout(new GridLayout(0, 1));

    String[] productos;

    switch (categoria) {
        case "Variado":
            productos = new String[]{"Arroz", "Espagueti", "Harina de trigo", "Aceite vegetal", "Salsa de tomate"};
            break;
        case "Lácteos y derivados":
            productos = new String[]{"Leche entera", "Yogur griego", "Queso Oaxaca", "Crema ácida", "Mantequilla"};
            break;
        case "Huevos":
            productos = new String[]{"Huevos blancos", "Huevos orgánicos"};
            break;
        case "Carnes y embutidos":
            productos = new String[]{"Pollo", "Carne de res", "Jamón", "Salchichas", "Chorizo"};
            break;
        case "Pescados y mariscos":
            productos = new String[]{"Pescado", "Camarón", "Atún en lata"};
            break;
        case "Frutas y verduras":
            productos = new String[]{"Manzana", "Plátano", "Jitomate", "Cebolla", "Aguacate"};
            break;
        case "Panadería y repostería":
            productos = new String[]{"Pan blanco", "Bolillo", "Galletas", "Pastel"};
            break;
        case "Cereales y desayuno":
            productos = new String[]{"Cereal", "Avena", "Cacao", "Mermelada"};
            break;
        case "Bebidas":
            productos = new String[]{"Agua", "Refresco", "Jugo", "Café", "Cerveza"};
            break;
        case "Congelados y refrigerados":
            productos = new String[]{"Helado", "Pizza congelada", "Comida lista"};
            break;
        case "Conservas y enlatados":
            productos = new String[]{"Frijoles en lata", "Verduras en conserva", "Sopa en lata"};
            break;
        case "Snacks y botanas":
            productos = new String[]{"Papas fritas", "Palomitas", "Chocolate", "Nueces"};
            break;
        case "Dulces y confitería":
            productos = new String[]{"Caramelos", "Gomitas", "Mazapán"};
            break;
        case "Productos para bebés":
            productos = new String[]{"Pañales", "Toallitas húmedas", "Papilla"};
            break;
        case "Cuidado personal":
            productos = new String[]{"Jabón", "Shampoo", "Desodorante", "Crema"};
            break;
        case "Limpieza del hogar":
            productos = new String[]{"Detergente", "Suavizante", "Cloro", "Toallas de cocina"};
            break;
        case "Productos para mascotas":
            productos = new String[]{"Croquetas perro", "Croquetas gato", "Juguete para mascota"};
            break;
        case "Farmacia":
            productos = new String[]{"Paracetamol", "Vitaminas", "Alcohol"};
            break;
        case "Papelería y oficina":
            productos = new String[]{"Cuaderno", "Pluma", "Mochila"};
            break;
        case "Electrónica y hogar":
            productos = new String[]{"Pilas", "Foco", "Cargador"};
            break;
        case "Bazar y cocina":
            productos = new String[]{"Sartén", "Platos", "Vasos", "Recipientes"};
            break;
        case "Ropa y calzado":
            productos = new String[]{"Playera", "Calcetines", "Sandalias", "Ropa interior", "Gorro", "Cinturón"};
            break;
        case "Jardinería y ferretería":
            productos = new String[]{"Maceta", "Tierra", "Fertilizante"};
            break;
        case "Temporada / Estacional":
            productos = new String[]{"Decoración navideña", "Artículos de playa", "Canasta regalo"};
            break;
        case "Orgánicos y saludables":
            productos = new String[]{"Chía", "Quinoa", "Proteína en polvo"};
            break;
        case "Importados e internacionales":
            productos = new String[]{"Salsa asiática", "Queso importado", "Aceite gourmet"};
            break;
        case "Servicios adicionales":
            productos = new String[]{"Tortillas frescas", "Pago de servicios", "Recarga telefónica"};
            break;
        default:
            productos = new String[]{};
    }

    for (String prod : productos) {
        double precio = precios.getOrDefault(prod, 0.0);

        JButton btnProd = new JButton(prod + " - $" + precio);
        btnProd.addActionListener(e -> {
            carrito.put(prod, precio);
            JOptionPane.showMessageDialog(prodWindow, prod + " agregado al carrito.");
        });
        prodWindow.add(btnProd);
    }

    prodWindow.setVisible(true);
    }

    

    // ==============================
    //   CARRITO Y MÉTODOS DE PAGO
    // ==============================
    // mostrarCarrito: calcula total de forma segura (sin unboxing de null)
    public static void mostrarCarrito() {
    JFrame ventana = new JFrame("Carrito de Compras");
    ventana.setSize(400, 500);
    ventana.setLocationRelativeTo(mainFrame);
    ventana.setLayout(new BorderLayout());

    JTextArea area = new JTextArea();
    area.setEditable(false);

    // Mostrar ítems y calcular total para la vista inicial
    double total = 0.0;
    StringBuilder sb = new StringBuilder("PRODUCTOS EN TU CARRITO:\n\n");

    for (Map.Entry<String, Double> entry : carrito.entrySet()) {
        String prod = entry.getKey();
        Double precioObj = entry.getValue();
        double precio = (precioObj != null) ? precioObj : 0.0;
        sb.append(prod).append(" - $").append(String.format("%.2f", precio)).append("\n");
        total += precio;
    }

    sb.append("\nTOTAL A PAGAR: $").append(String.format("%.2f", total));
    area.setText(sb.toString());
    ventana.add(new JScrollPane(area), BorderLayout.CENTER);

    JPanel south = new JPanel(new GridLayout(1, 2));
    JButton pagar = new JButton("Proceder al Pago");
    JButton cerrar = new JButton("Cerrar");
    south.add(pagar);
    south.add(cerrar);
    ventana.add(south, BorderLayout.SOUTH);

    // Aquí recalculamos el total en el momento de pulsar pagar
    pagar.addActionListener(e -> {
        double totalPago = 0.0;
        for (Map.Entry<String, Double> entry2 : carrito.entrySet()) {
            Double precioObj2 = entry2.getValue();
            double precio2 = (precioObj2 != null) ? precioObj2 : 0.0;
            totalPago += precio2;
        }
        metodoDePago(totalPago); // pasamos el total real
    });

    cerrar.addActionListener(e -> ventana.dispose());

    ventana.setVisible(true);
}

    // ==============================
    //   MÉTODOS DE PAGO
    // ==============================
   // metodoDePago: sin cambios importantes, pero formatea total
    public static void metodoDePago(double total) {
    String[] metodos = {"Efectivo", "Tarjeta", "Transferencia"};
    String metodo = (String) JOptionPane.showInputDialog(
            mainFrame,
            "Selecciona un método de pago:",
            "Método de Pago",
            JOptionPane.QUESTION_MESSAGE,
            null,
            metodos,
            metodos[0]
    );

    if (metodo == null) return;

    JOptionPane.showMessageDialog(mainFrame,
            "Pago realizado con " + metodo + "\nTotal: $" + String.format("%.2f", total) +
                    "\n\n¡Gracias por tu compra!");

    carrito.clear();
}

    }


