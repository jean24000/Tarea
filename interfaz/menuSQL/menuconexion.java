package menuSQL;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class menuconexion<JcontraseñaField> {
	 private JTextField usuarioField;
	    private JcontraseñaField contraseñaField;
	    private JTextField hostField;
	    private JTextField puertoField;
	    private JList<String> listaBD;
	    private DefaultListModel<String> listModel;

	public menuconexion() {

	JFrame ventana = new JFrame("Menú conexion");

    // Crear un panel principal
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(5, 2)); // 5 filas y 2 columnas
    
 // Agregar el panel al lado izquierdo del JFrame
    JPanel panelIzquierdo = new JPanel();
    panelIzquierdo.setBackground(Color.BLUE);
    panelIzquierdo.setPreferredSize(new Dimension(150, 300));
    ventana.add(panelIzquierdo, BorderLayout.WEST);

    // Agregar el panel a la ventana
    ventana.add(panel);	

    ventana.setSize(700, 500);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setVisible(true);


    // Etiquetas
    JLabel userLabel = new JLabel("User:");
    JTextField userField = new JTextField(20);
    panel.add(userLabel);
    panel.add(userField);

    JLabel contraseñaLabel = new JLabel("Password:");
    JTextField contraseñaField = new JTextField(20);
    panel.add(contraseñaLabel);
    panel.add(contraseñaField);
    
    JLabel hostLabel = new JLabel("Host:");
    JTextField hostField = new JTextField(20);
    panel.add(hostLabel);
    panel.add(hostField);
    
    JLabel puertoLabel = new JLabel("Puerto:");
    JTextField puertoField = new JTextField(20);
    panel.add(puertoLabel);
    panel.add(puertoField);

   

    // Botones
   
    JButton conectarButton = new JButton("Conectar");
    panel.add(conectarButton);

    JButton probarConexionButton = new JButton("Probar Conexión");
    panel.add(probarConexionButton);

    // Modelo para la lista de bases de datos
    listModel = new DefaultListModel<>();
    listaBD = new JList<>(listModel);

    JScrollPane scrollPane = new JScrollPane(listaBD);
    panelIzquierdo.add(scrollPane, BorderLayout.CENTER);
   
    // Acción del botón "Conectar"

              conectarButton.addActionListener(new ActionListener() {
                  		@Override
                  public void actionPerformed(ActionEvent e) {
                      // Obtener los valores de los campos
                      String usuario = userField.getText();
                      String contraseña = contraseñaField.getText();
                      String host = hostField.getText();
                      String puerto = puertoField.getText();

                      // Aquí puedes usar estos valores para establecer la conexión a MySQL
                      String url = "jdbc:mysql://" + host + ":" + puerto + "/pruebasql";

                      try {
                          // Establecer la conexión y realizar operaciones
                    	  Connection connection = DriverManager.getConnection(url, usuario, contraseña);
                          // Realiza tus operaciones con la conexión aquí
                          connection.close();
                          JOptionPane.showMessageDialog(null, "Conexión exitosa a la base de datos MySQL.");
                      } catch (SQLException ex) {
                          JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos: " + ex.getMessage());
                      }
                  }
              });
	
    //boton test
	probarConexionButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Obtener los valores de los campos
        String usuario = userField.getText();
        String contrasena = contraseñaField.getText();
        String host = hostField.getText();
        String puerto = puertoField.getText();

        // Aquí puedes usar estos valores para probar la conexión a MySQL
        String url = "jdbc:mysql://" + host + ":" + puerto + "/pruebasql";

        try {
            // Intenta establecer una conexión sin realizar operaciones
            Connection conexion = DriverManager.getConnection(url, usuario, contrasena);
            conexion.close();
            JOptionPane.showMessageDialog(null, "Prueba de conexión exitosa.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al probar la conexión: " + ex.getMessage());
        }
    }
});
	

	// Simula una lista de bases de datos (puedes cargarla desde tu base de datos real)
    ArrayList<String> basesDeDatos = new ArrayList<>();
    basesDeDatos.add("MiDB1");
    basesDeDatos.add("MiDB2");
    basesDeDatos.add("MiDB3");

    for (String bd : basesDeDatos) {
        listModel.addElement(bd);
    }
}

public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            new menuconexion().setVisible(true);
        }
    });
}
public static void setVisible(boolean b) {
	// TODO Auto-generated method stub
	
}
}