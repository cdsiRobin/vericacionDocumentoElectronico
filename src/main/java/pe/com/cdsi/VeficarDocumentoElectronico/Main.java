package pe.com.cdsi.VeficarDocumentoElectronico;

import pe.com.cdsi.VeficarDocumentoElectronico.conexion.Sqlite;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.LineBorder;


public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tbpPrincipal = new JTabbedPane(JTabbedPane.TOP);
		tbpPrincipal.setBackground(Color.WHITE);
		tbpPrincipal.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(tbpPrincipal);
		
		JPanel pHome = new JPanel();
		tbpPrincipal.addTab("Home", null, pHome, null);
		
		JPanel pConexion = new JPanel();
		tbpPrincipal.addTab("Conexión", null, pConexion, null);
		pConexion.setLayout(null);
		
		JPanel pSqlite = new JPanel();
		pSqlite.setBorder(new LineBorder(new Color(128, 128, 128)));
		pSqlite.setBounds(0, 0, 218, 233);
		pConexion.add(pSqlite);
		pSqlite.setLayout(null);
		
		JLabel lblSqlite = new JLabel("SQLITE");
		lblSqlite.setBounds(74, 11, 64, 14);
		pSqlite.add(lblSqlite);
		
		JLabel lblSfs1 = new JLabel("SFS BD");
		lblSfs1.setBounds(10, 29, 75, 14);
		pSqlite.add(lblSfs1);
		
		JTextPane txtSfsbd = new JTextPane();
		txtSfsbd.setBorder(new LineBorder(Color.LIGHT_GRAY));
		txtSfsbd.setBackground(Color.WHITE);
		txtSfsbd.setBounds(10, 46, 186, 20);
		pSqlite.add(txtSfsbd);
		
		JButton btnConectarSqlite = new JButton("CONECTAR");
		btnConectarSqlite.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {

				String direccionBDSqlite = txtSfsbd.getText();
				Sqlite objSqlite = new Sqlite(direccionBDSqlite);
				objSqlite.desconectar();
			}
		});
		btnConectarSqlite.setBounds(89, 77, 107, 23);
		pSqlite.add(btnConectarSqlite);
		
		JPanel pOracle = new JPanel();
		pOracle.setBorder(new LineBorder(new Color(128, 128, 128)));
		pOracle.setBounds(216, 0, 213, 233);
		pConexion.add(pOracle);
		pOracle.setLayout(null);
	}
}
