package Proyecto2;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class Pantalla3 extends Pantalla2 {
	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla3 frame = new Pantalla3();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Pantalla3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 255, 204));
		panel.setBounds(0, 0, 627, 354);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 153, 51));
		panel_1.setBounds(0, 30, 627, 10);
		panel.add(panel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("");
		rdbtnNewRadioButton.setBackground(new Color(102, 255, 204));
		rdbtnNewRadioButton.setBounds(0, 0, 21, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("");
		rdbtnNewRadioButton_1.setBackground(new Color(102, 255, 204));
		rdbtnNewRadioButton_1.setBounds(21, 0, 21, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("");
		rdbtnNewRadioButton_2.setBackground(new Color(102, 255, 204));
		rdbtnNewRadioButton_2.setBounds(41, 0, 21, 23);
		panel.add(rdbtnNewRadioButton_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 45, 404, 201);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Datos del usuario registrados: ");
		lblNewLabel.setFont(new Font("Yu Gothic Medium", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(20, 11, 217, 27);
		panel_2.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNombre.setBounds(10, 49, 70, 14);
		panel_2.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos: ");
		lblApellidos.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblApellidos.setBounds(10, 74, 76, 14);
		panel_2.add(lblApellidos);
		
		JLabel lblTrabajo = new JLabel("Trabajo:");
		lblTrabajo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTrabajo.setBounds(10, 99, 70, 14);
		panel_2.add(lblTrabajo);
		
		JLabel lblEdad = new JLabel("Edad: ");
		lblEdad.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEdad.setBounds(10, 124, 64, 14);
		panel_2.add(lblEdad);
		
		JLabel lblCont = new JLabel("Posibilidad de Contagio:");
		lblCont.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCont.setBounds(10, 149, 156, 14);
		panel_2.add(lblCont);		
		
		JLabel lblNomb = new JLabel("...");
		lblNomb.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNomb.setBounds(90, 49, 137, 14);
		panel_2.add(lblNomb);
		
		JLabel lblApell = new JLabel("...");
		lblApell.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblApell.setBounds(90, 74, 139, 14);
		panel_2.add(lblApell);
		
		JLabel lblTra = new JLabel("...");
		lblTra.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTra.setBounds(90, 100, 137, 13);
		panel_2.add(lblTra);
		
		JLabel lblEd = new JLabel("...");
		lblEd.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEd.setBounds(90, 125, 126, 14);
		panel_2.add(lblEd);
		
		JLabel lblC = new JLabel("...");
		lblC.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblC.setBounds(174, 149, 54, 14);
		panel_2.add(lblC);
		
		JButton btnVer = new JButton("Ver Datos");
		btnVer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNomb.setText(pers[idPer].getNom());
				lblApell.setText(pers[idPer].getApe());
				lblTra.setText(pers[idPer].getTra());
				lblEd.setText(pers[idPer].getEd());
				if(pers[idPer].getPos1()==1)
				lblC.setText("Baja");
				else if(pers[idPer].getPos1()==2)
					lblC.setText("Alta");
				else if(pers[idPer].getPos1()==3)
					lblC.setText("Media");
				else
					lblC.setText("No Respondio");
			}
		});
		btnVer.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVer.setBounds(249, 10, 145, 27);
		panel_2.add(btnVer);
		
		JButton btnSigUsuario = new JButton("Siguiente Usuario");
		btnSigUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idPer++;
				lblNomb.setText(pers[idPer].getNom());
				lblApell.setText(pers[idPer].getApe());
				lblTra.setText(pers[idPer].getTra());
				lblEd.setText(pers[idPer].getEd());
				if(pers[idPer].getPos1()==1)
				lblC.setText("Baja");
				else if(pers[idPer].getPos1()==2)
					lblC.setText("Alta");
				else if(pers[idPer].getPos1()==3)
					lblC.setText("Media");
				else
					lblC.setText("No Respondio");
			}
		});
		btnSigUsuario.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSigUsuario.setBounds(249, 49, 145, 27);
		panel_2.add(btnSigUsuario);
		
		JButton btnInicio = new JButton("Volver a Inicio");
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pantalla1 frame = new Pantalla1();
				frame.setVisible(true);
				dispose();
			}
		});		
		btnInicio.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnInicio.setBounds(249, 124, 145, 27);
		panel_2.add(btnInicio);
		
		JButton btnRegistrarOtro = new JButton("Registrar Otro");
		btnRegistrarOtro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pantalla2 frame = new Pantalla2();
				frame.setVisible(true);
				dispose();
			}
		});
		btnRegistrarOtro.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRegistrarOtro.setBounds(249, 86, 145, 27);
		panel_2.add(btnRegistrarOtro);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSalir.setBounds(249, 163, 145, 27);
		panel_2.add(btnSalir);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(68, 7, 534, 16);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("https://covid19.who.int");
		lblNewLabel_1.setBounds(10, 0, 216, 14);
		panel_3.add(lblNewLabel_1);
		
		this.setVisible(true);
	}
}