package menuSQL;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menucreardb {
    public menucreardb() {

        JFrame ventanacrear = new JFrame("Menú de Conexión");

        // Crear un panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 3)); // 

        // Etiquetas
        JLabel nombreBDLabel = new JLabel("Nombre de la BD:");
        JLabel chorsetLabel = new JLabel("Chor-set:");
       

        // Campos de texto
        JTextField nombreBDField = new JTextField(20);
       
        // Botones
        JButton crearButton = new JButton("Crea");
        //combobox
        String[] tiposBD = {"utf8_general_ci", "utf8mb4_general_ci", "latin1_swedish_ci", "utf8_bin", "utf8mb4_bin", "utf8_unicode_ci", "latin1_bin"};
        JComboBox<String> tipoBDComboBox = new JComboBox<>(tiposBD);


        

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
        panel.add(tipoBDComboBox);
        panel.add(crearButton);
        
        
     // Agregar el panel al lado izquierdo del JFrame
        JPanel panelIzquierdo = new JPanel();
        panelIzquierdo.setBackground(Color.BLUE);
        panelIzquierdo.setPreferredSize(new Dimension(150, 300));
        ventanacrear.add(panelIzquierdo, BorderLayout.WEST);



        // Agregar el panel a la ventana
        ventanacrear.add(panel);

        ventanacrear.setSize(700, 500);
        ventanacrear.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanacrear.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                menucreardb ventanacrear = new menucreardb();
            }
        });
    }

	public static void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
