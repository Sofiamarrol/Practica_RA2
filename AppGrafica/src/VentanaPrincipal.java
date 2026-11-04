import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                VentanaPrincipal frame = new VentanaPrincipal();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public VentanaPrincipal() {
        setTitle("Ventana Principal");
        setBounds(100, 100, 400, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JLabel lblBienvenida = new JLabel("Bienvenido a la App");
        lblBienvenida.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblBienvenida.setHorizontalAlignment(SwingConstants.CENTER);
        lblBienvenida.setBounds(50, 25, 280, 30);
        getContentPane().add(lblBienvenida);

        JButton btnAbrir = new JButton("Abrir segunda ventana");
        btnAbrir.setBounds(100, 80, 180, 40);
        btnAbrir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VentanaSecundaria sec = new VentanaSecundaria();
                sec.setVisible(true);
            }
        });
        getContentPane().add(btnAbrir);
    }
}