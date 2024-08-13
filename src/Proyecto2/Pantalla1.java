package Proyecto2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Pantalla1 extends JFrame {
	private JPanel p1;
	private JPasswordField conttext;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla1 frame = new Pantalla1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Pantalla1() {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 200, 450, 300);
		p1 = new JPanel();
		p1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(p1);
		p1.setLayout(null);

		JButton btn1 = new JButton("Ingresar");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pantalla2 p2 = new Pantalla2();
			    dispose();
			}
		});
		btn1.setBounds(172, 169, 89, 23);
		p1.add(btn1);

		JTextField ustext = new JTextField();
		ustext.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == 10)
					conttext.requestFocus();
			}
		});
		ustext.setToolTipText("usuario:directorCbtis222");
		ustext.setBounds(20, 64, 395, 27);
		p1.add(ustext);
		ustext.setColumns(10);

		JPasswordField conttext = new JPasswordField();
		conttext.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == 10)
					btn1.requestFocus();
			}
		});
		conttext.setToolTipText("Contraseï¿½a:");
		conttext.setBounds(20, 131, 395, 27);
		p1.add(conttext);

		JLabel con = new JLabel("Contraseña:");
		con.setFont(new Font("Tahoma", Font.BOLD, 13));
		con.setBounds(10, 102, 99, 20);
		p1.add(con);

		JLabel us = new JLabel("Usuario:");
		us.setFont(new Font("Tahoma", Font.BOLD, 13));
		us.setBounds(10, 42, 77, 20);
		p1.add(us);

		JLabel ti = new JLabel("Centro de Bachillerato Tecnologico industrial");
		ti.setFont(new Font("Tahoma", Font.BOLD, 14));
		ti.setBounds(57, 0, 331, 21);
		p1.add(ti);

		JLabel ti1 = new JLabel(" y de servicios No.222");
		ti1.setForeground(Color.BLACK);
		ti1.setFont(new Font("Tahoma", Font.BOLD, 14));
		ti1.setBounds(124, 20, 172, 21);
		p1.add(ti1);

		JLabel derechos = new JLabel("Copyright todos los derechos reservados 2020-2021 Company A.A.D.S.X");
		derechos.setForeground(Color.BLACK);
		derechos.setFont(new Font("Tahoma", Font.PLAIN, 10));
		derechos.setBounds(20, 237, 331, 13);
		p1.add(derechos);

		JButton btnCreditos = new JButton("Creditos");
		btnCreditos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,
						"Creditos: Tï¿½llez Salazar Alfonso Federico, Cortï¿½s Guzmï¿½n Angel Gabriel, Monroy Ferrer Diego Haziel, Castillo Zamudio Sebastiï¿½n, Duran del Villar Ximena");
			}
		});
		btnCreditos.setBounds(172, 203, 89, 23);
		p1.add(btnCreditos);
	}
}