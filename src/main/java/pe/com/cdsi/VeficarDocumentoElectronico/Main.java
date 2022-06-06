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
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

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
		frmVerificacinDeDe.setTitle("Verificación");
		frmVerificacinDeDe.getContentPane().setBackground(Color.WHITE);
		frmVerificacinDeDe.getContentPane().setLayout(null);
		
		JPanel pPrincipal = new JPanel();
		pPrincipal.setBackground(Color.WHITE);
		pPrincipal.setBounds(0, 0, 358, 271);
		frmVerificacinDeDe.getContentPane().add(pPrincipal);
		pPrincipal.setLayout(null);
		
		JButton btnIniciar = new JButton();
		btnIniciar.setToolTipText("Iniciar");
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
		btnApagar.setToolTipText("Cancelar");
		btnApagar.setIcon(new ImageIcon(Main.class.getResource("/pe/com/cdsi/VeficarDocumentoElectronico/iconos/stop.png")));
		btnApagar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnApagar.setAlignmentX(0.5f);
		btnApagar.setActionCommand("");
		btnApagar.setBounds(167, 11, 89, 52);
		pPrincipal.add(btnApagar);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 74, 338, 2);
		pPrincipal.add(separator);
		
		JPanel pVistaEnvio = new JPanel();
		pVistaEnvio.setBorder(new LineBorder(Color.LIGHT_GRAY));
		pVistaEnvio.setBackground(Color.WHITE);
		pVistaEnvio.setBounds(10, 85, 338, 175);
		pPrincipal.add(pVistaEnvio);
		pVistaEnvio.setLayout(null);
		
		JLabel lblBdSqlite = new JLabel();
		lblBdSqlite.setHorizontalAlignment(SwingConstants.CENTER);
		lblBdSqlite.setBounds(10, 11, 37, 42);
		ImageIcon imagen1= new ImageIcon(Main.class.getResource("/pe/com/cdsi/VeficarDocumentoElectronico/iconos/BdSqlite.png"));
		Icon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(lblBdSqlite.getWidth(), lblBdSqlite.getHeight(), Image.SCALE_DEFAULT));
		lblBdSqlite.setIcon(icono1);
		pVistaEnvio.add(lblBdSqlite);
		
		JLabel lblDocumento = new JLabel();		
		lblDocumento.setHorizontalAlignment(SwingConstants.CENTER);
		lblDocumento.setBounds(10, 64, 37, 42);
		ImageIcon imagen2= new ImageIcon(Main.class.getResource("/pe/com/cdsi/VeficarDocumentoElectronico/iconos/envioDocumento.gif"));
		Icon icono2 = new ImageIcon(imagen2.getImage().getScaledInstance(lblDocumento.getWidth(), lblDocumento.getHeight(), Image.SCALE_DEFAULT));
		lblDocumento.setIcon(icono2);
		pVistaEnvio.add(lblDocumento);
		
		JLabel lblEmpresa = new JLabel();

		lblEmpresa.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmpresa.setBounds(10, 122, 37, 42);
		ImageIcon imagen3= new ImageIcon(Main.class.getResource("/pe/com/cdsi/VeficarDocumentoElectronico/iconos/empresa.png"));
		Icon icono3 = new ImageIcon(imagen3.getImage().getScaledInstance(lblEmpresa.getWidth(), lblEmpresa.getHeight(), Image.SCALE_DEFAULT));
		lblEmpresa.setIcon(icono3);
		pVistaEnvio.add(lblEmpresa);
		
		JPanel pLog = new JPanel();
		pLog.setBorder(new LineBorder(Color.LIGHT_GRAY));
		pLog.setBackground(Color.WHITE);
		pLog.setBounds(57, 11, 271, 153);
		pVistaEnvio.add(pLog);
		pLog.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 271, 153);
		pLog.add(scrollPane);
		
		JTextPane txplog = new JTextPane();
		scrollPane.setViewportView(txplog);
		
		/*ImageIcon imagen1= new ImageIcon(Main.class.getResource("/pe/com/cdsi/VeficarDocumentoElectronico/iconos/envioDocumento.gif"));
		Icon icono = new ImageIcon(imagen1.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));*/
		
		frmVerificacinDeDe.setBounds(100, 100, 374, 310);
		frmVerificacinDeDe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
