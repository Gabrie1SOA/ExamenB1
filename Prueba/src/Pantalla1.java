import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Pantalla1 extends JFrame{

    private JTextField codigoT;
    private JTextField nomprodT;
    private JTextField desT;
    private JTextField precioT;
    private JTextField cantidadT;
    private JButton INSERTAR;
    private JButton CONSULTAR;
    private JPanel pantalla1;
    private JLabel rpL;
    private JLabel codL;
    private JLabel nomL;
    private JLabel desL;
    private JLabel precioL;
    private JLabel cantL;
    private JTextField catT;
    private JLabel catL;



    public Connection conexion() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/productos_cp";
        String user = "root";
        String password = "";

        return DriverManager.getConnection(url, user, password);
    }

    public void Insertar()throws SQLException{
        String code = codigoT.getText();
        String names = nomprodT.getText();
        String desc= desT.getText();
        String precio = precioT.getText();
        String can = cantidadT.getText();
        String cat= catT.getText();


        Connection conex =conexion ();

        String query="INSERT INTO PRODUCTO (codigo_producto,nombre,descripcion,precio,cantidad,categoria)VALUES (?,?,?,?,?,?);";


        PreparedStatement pstm = conex.prepareStatement(query);

        pstm.setString(1,code);
        pstm.setString(2,names);
        pstm.setString(3,desc);
        pstm.setDouble(4,Double.parseDouble(precio));
        pstm.setInt(5,Integer.parseInt(can));
        pstm.setString(6,cat);


        int rowsAffected=pstm.executeUpdate();
        if(rowsAffected>0){
            JOptionPane.showMessageDialog(null,"INSERTADO");
        }

        pstm.close();
        conex.close();

    }

    public Pantalla1() {
        setTitle("Registro");
        setContentPane(pantalla1);
        setSize(300, 300);

        INSERTAR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    conexion();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    Insertar();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }


            }
        });


        CONSULTAR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Consulta");
                Consulta consulta = new Consulta();
                frame.setContentPane(consulta.getContentPane());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setSize(300, 300);
                frame.setVisible(true);
                dispose();

            }
        });

    }



}