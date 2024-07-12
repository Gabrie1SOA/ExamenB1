import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class Login extends JFrame{


    private JPanel panel1;
    private JTextField usuarioT;
    private JTextField passT;
    private JButton ENTRAR;
    private JLabel loginL;
    private JLabel usuarioL;
    private JLabel passL;

    public Connection conexion() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/productos_cp";
        String user = "root";
        String password = "";

        return DriverManager.getConnection(url, user, password);
    }

    public Login() throws SQLException {
        setTitle("Conexion");
        setContentPane(panel1);
        setSize(300, 300);

        String user1= usuarioT.getText();
        String pass1= passT.getText();

        Connection conex = conexion();



        ENTRAR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //no pude la validacion :(

                JFrame frame = new JFrame("Pantalla1");
                Pantalla1 pantalla1 = new Pantalla1();
                frame.setContentPane(pantalla1.getContentPane());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setSize(300, 300);
                frame.setVisible(true);
                dispose();


                try {
                    conex.close();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });
    }





}