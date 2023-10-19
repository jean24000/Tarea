package menuSQL;
import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class menuPrin {
	
	public static void main(String[] args) {

        // Crear la ventana principal
        JFrame ventanaPrincipal = new JFrame("Interfaz Principal");
        ventanaPrincipal.setBackground(Color.CYAN);
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaPrincipal.setSize(700, 500);
        
        JPanel panelIzquierdo = new JPanel();
        panelIzquierdo.setBackground(Color.BLUE);
        panelIzquierdo.setPreferredSize(new Dimension(150, 300));
        // Agregar el JPanel al lado izquierdo del JFrame
        ventanaPrincipal.add(panelIzquierdo, BorderLayout.WEST);

        ventanaPrincipal.setSize(700, 500);
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaPrincipal.setVisible(true);
        
       

        // Configurar el tamaño del JFrame
        ventanaPrincipal.setSize(700, 500);

        // Configurar la operación de cierre del JFrame
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un JPanel que servirá como contenido principal
        JPanel panel = new JPanel();
       
        // Crear un JLabel para mostrar la imagen
        JLabel labelImagen = new JLabel();

        // Cargar una imagen desde un archivo (ajusta la ruta según tu imagen)
        BufferedImage imagen = null;
        try {
            imagen = ImageIO.read(new File("C:\\Users\\jeanP\\Downloads\\OIP.jpeg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Si se cargó la imagen, configura el icono del JLabel
        if (imagen != null) {
            ImageIcon icono = new ImageIcon(imagen);
            labelImagen.setIcon(icono);
        }

        // Agregar el JLabel al JPanel
        panel.add(labelImagen);

        // Agregar el JPanel al JFrame
        ventanaPrincipal.add(panel);

        // Hacer visible el JFrame
        ventanaPrincipal.setVisible(true);
        
        // Crear la barra de menú
        JMenuBar menuBar = new JMenuBar();

        // Crear el menú "Opciones"
        JMenu menuOpciones = new JMenu("Opciones");

        // Crear la opción de menú "Mostrar Interfaz Secundaria"
        JMenuItem mostrarmenuconexion = new JMenuItem("Ir al menuconexion");
        JMenuItem mostrarmenucrearbd = new JMenuItem("Ir al menucrearbd");
        JMenuItem mostrarmenutablascolum = new JMenuItem("Ir al menutablascolumnas");

        // Agregar un ActionListener para la opción de menú
        mostrarmenuconexion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Crear una instancia de la Interfaz Secundaria
                menuconexion menuconex = new menuconexion();

                // Hacer visible la Interfaz Secundaria
                menuconexion.setVisible(true);
            }
        });
        
        // Agregar un ActionListener para la opción de menú
        mostrarmenucrearbd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Crear una instancia de la Interfaz Secundaria
                menucreardb menucrear = new menucreardb();

                // Hacer visible la Interfaz Secundaria
                menucreardb.setVisible(true);
            }
        });
        
        // Agregar un ActionListener para la opción de menú
        mostrarmenutablascolum.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Crear una instancia de la Interfaz Secundaria
                menutablascolum menutablas = new menutablascolum();

                // Hacer visible la Interfaz Secundaria
                menutablascolum.setVisible(true);	
            }
        });

        // Agregar la opción de menú al menú "Opciones"
        menuOpciones.add(mostrarmenuconexion);
        menuOpciones.add(mostrarmenucrearbd);
        menuOpciones.add(mostrarmenutablascolum);

        // Agregar el menú "Opciones" a la barra de menú
        menuBar.add(menuOpciones);

        // Establecer la barra de menú en la ventana principal
        ventanaPrincipal.setJMenuBar(menuBar);

        // Hacer visible la ventana principal
        ventanaPrincipal.setVisible(true);
        
        
    }
}
