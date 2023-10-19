package menuSQL;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menutablascolum {
    public menutablascolum() {

        JFrame ventanatablas = new JFrame("Menú de Conexión");

        // Crear un panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 3)); // 

        // Etiquetas
        JLabel nombreBDLabel = new JLabel("Nombre de la tabla:");
        JLabel chorsetLabel = new JLabel("Columnas:");
       

        // Campos de texto
        JTextField nombreBDField = new JTextField(20);
       
        // Botones
        JButton crearButton = new JButton("Crea");
        //combobox
        String[] columnasBD = {"1", "2", "3", "4", "5"};
        JComboBox<String> columnasBDComboBox = new JComboBox<>(columnasBD);


        

        // Acción del botón "Conectar"
        crearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes agregar la lógica para la acción "Conectar"
                JOptionPane.showMessageDialog(null, "Conexión exitosa");
            }
        });

        // Agregar componentes al panel
        panel.add(nombreBDLabel);
        panel.add(nombreBDField);
        panel.add(chorsetLabel);
        panel.add(columnasBDComboBox);
        panel.add(crearButton);
        
        
     // Agregar el panel al lado izquierdo del JFrame
        JPanel panelIzquierdo = new JPanel();
        panelIzquierdo.setBackground(Color.BLUE);
        panelIzquierdo.setPreferredSize(new Dimension(150, 300));
        ventanatablas.add(panelIzquierdo, BorderLayout.WEST);



        // Agregar el panel a la ventana
        ventanatablas.add(panel);

        ventanatablas.setSize(700, 500);
        ventanatablas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanatablas.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                menutablascolum ventanatablas = new menutablascolum();
            }
        });
    }

	public static void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
