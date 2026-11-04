import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class VentanaSecundaria extends JFrame {
    public VentanaSecundaria() {
        setTitle("Segunda Ventana");
        setBounds(200, 200, 350, 180);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        JLabel lblTexto = new JLabel("Esta es la segunda pantalla");
        lblTexto.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblTexto.setHorizontalAlignment(SwingConstants.CENTER);
        lblTexto.setBounds(20, 40, 290, 40);
        getContentPane().add(lblTexto);
    }
}