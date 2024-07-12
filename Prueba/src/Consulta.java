import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Consulta extends JFrame{
    private JPanel pantalla2;
    private JTextField consultaT;
    private JButton ok;
    private JButton regresarButton;
    private JButton loginButton;

    public Connection conexion() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/productos_cp";
        String user = "root";
        String password = "";

        return DriverManager.getConnection(url, user, password);
    }


    public void visual() throws SQLException {
        String consulta = consultaT.getText();

        Connection conex =conexion ();
        String sql="SELECT * FROM PRODUCTO WHERE codigo_producto=?;";

        PreparedStatement pstm = conex.prepareStatement(sql);
        pstm.setString(1,consulta);

        ResultSet rs=pstm.executeQuery();
        if(rs.next()){
            String name2= rs.getString("nombre");
            JOptionPane.showMessageDialog(null,"Codigo: "+consulta+" Nombre: "+name2);

        }

        rs.close();
        pstm.close();
        conex.close();
    }

    public Consulta(){
        setTitle("Consulta");
        setContentPane(pantalla2);
        setSize(300,300);


        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    visual();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });


        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Pantalla1");
                Pantalla1 pantalla1 = new Pantalla1();
                frame.setContentPane(pantalla1.getContentPane());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setSize(300, 300);
                frame.setVisible(true);
                dispose();
            }
        });
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame frame = new JFrame("Login");
                Login login = null;
                try {
                    login = new Login();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
                frame.setContentPane(login.getContentPane());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setSize(300, 300);
                frame.setVisible(true);
                dispose();

            }
        });
    }



}
