package pe.com.cdsi.VeficarDocumentoElectronico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;

public class Main {

	private JFrame frmVerificacinDeDe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmVerificacinDeDe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVerificacinDeDe = new JFrame();
		frmVerificacinDeDe.setTitle("Verificación de D.E SFS");
		frmVerificacinDeDe.getContentPane().setBackground(Color.WHITE);
		frmVerificacinDeDe.getContentPane().setLayout(null);
		
		JPanel pPrincipal = new JPanel();
		pPrincipal.setBackground(Color.WHITE);
		pPrincipal.setBounds(0, 0, 358, 271);
		frmVerificacinDeDe.getContentPane().add(pPrincipal);
		pPrincipal.setLayout(null);
		
		JButton btnIniciar = new JButton();
		btnIniciar.setIcon(new ImageIcon(Main.class.getResource("/pe/com/cdsi/VeficarDocumentoElectronico/iconos/play.png")));
		btnIniciar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIniciar.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnIniciar.setActionCommand("");
		btnIniciar.setBounds(259, 11, 89, 52);
		pPrincipal.add(btnIniciar);
		
		JPanel pEstado = new JPanel();
		pEstado.setBorder(new LineBorder(Color.LIGHT_GRAY));
		pEstado.setBackground(Color.PINK);
		pEstado.setBounds(10, 11, 147, 52);
		pPrincipal.add(pEstado);
		pEstado.setLayout(null);
		
		JLabel lblEstado = new JLabel("APAGADO");
		lblEstado.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstado.setHorizontalTextPosition(SwingConstants.CENTER);
		lblEstado.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEstado.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblEstado.setBounds(10, 11, 127, 30);
		pEstado.add(lblEstado);
		
		JButton btnApagar = new JButton();
		btnApagar.setIcon(new ImageIcon(Main.class.getResource("/pe/com/cdsi/VeficarDocumentoElectronico/iconos/stop.png")));
		btnApagar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnApagar.setAlignmentX(0.5f);
		btnApagar.setActionCommand("");
		btnApagar.setBounds(167, 11, 89, 52);
		pPrincipal.add(btnApagar);
		frmVerificacinDeDe.setBounds(100, 100, 374, 310);
		frmVerificacinDeDe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
