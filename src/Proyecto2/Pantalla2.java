package Proyecto2;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class Pantalla2 extends JFrame {
	private JPanel p1;
	private JTextField txt2;
	private JTextField txt1;
	private JTextField txt3;
	private JTextField txt4;
	int idPer=0, nPer=0, uno=0;
	public static Persona[] pers=new Persona[20];
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla2 frame = new Pantalla2();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Pantalla2() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Ximena\\Downloads\\,........jpg"));
		setTitle("Empresa(Aguas Locas)- Control COVID-19");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450,200,500,300);
		p1 = new JPanel();
		p1.setBackground(SystemColor.inactiveCaption);
		p1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(p1);
		p1.setLayout(null);
		Font f1=new Font("Tw Cen MT", Font.PLAIN, 13);
		
		JLabel lbl1 = new JLabel("Instrucciones: Ingresa los datos que correspondan contigo ");
		lbl1.setFont(new Font("Tw Cen MT", Font.PLAIN, 17));
		lbl1.setBounds(21, 11, 405, 20);
		p1.add(lbl1);
		
		JLabel lbl2 = new JLabel("Ingresa tus Apellidos");
		lbl2.setFont(f1);
		lbl2.setBounds(10, 87, 174, 14);
		p1.add(lbl2);
		
		JLabel lbl3 = new JLabel("Ingresa tu Edad");
		lbl3.setFont(f1);
		lbl3.setBounds(10, 139, 196, 14);
		p1.add(lbl3);
		
		JLabel lbl4 = new JLabel("\u00BFSe te ha diagn\u00F3sticado COVID-19 Recientemente?");
		lbl4.setFont(f1);
		lbl4.setBounds(198, 38, 284, 14);
		p1.add(lbl4);
		
		JLabel lbl5 = new JLabel("\u00BFHas estado en Contacto Cercano con alguien a");
		lbl5.setFont(f1);
		lbl5.setBounds(202, 112, 276, 14);
		p1.add(lbl5);
		
		JLabel lbl6 = new JLabel("Ingresa tu Nombre");
		lbl6.setFont(f1);
		lbl6.setBounds(10, 42, 116, 14);
		p1.add(lbl6);
		
		JLabel lbl7 = new JLabel("quien se le ha Diagnosticado COVID-19");
		lbl7.setVerticalAlignment(SwingConstants.TOP);
		lbl7.setFont(f1);
		lbl7.setBounds(202, 125, 276, 14);
		p1.add(lbl7);
		
		JLabel lbl8 = new JLabel("Recientemente?");
		lbl8.setVerticalAlignment(SwingConstants.TOP);
		lbl8.setFont(f1);
		lbl8.setBounds(202, 139, 276, 14);
		p1.add(lbl8);
		
		JLabel lbl9 = new JLabel("Trabajo que Ejerces en la Empresa");
		lbl9.setFont(f1);
		lbl9.setBounds(10, 183, 196, 14);
		p1.add(lbl9);
		
		txt1 = new JTextField();
		txt1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==10)
					txt2.requestFocus();
			}
		});
		txt1.setFont(f1);
		txt1.setBounds(10, 60, 174, 20);
		p1.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==10)
					txt3.requestFocus();
			}
		});
		txt2.setFont(f1);
		txt2.setBounds(10, 109, 174, 20);
		p1.add(txt2);
		txt2.setColumns(10);
		
		txt3 = new JTextField();
		txt3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==10)
					txt4.requestFocus();
			}
		});
		txt3.setFont(f1);
		txt3.setColumns(10);
		txt3.setBounds(10, 158, 174, 20);
		p1.add(txt3);
		
		txt4 = new JTextField();
		txt4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==10)
					txt1.requestFocus();
			}
		});
		txt4.setFont(f1);
		txt4.setColumns(10);
		txt4.setBounds(10, 202, 174, 20);
		p1.add(txt4);
		
		JRadioButton rdbtn1 = new JRadioButton("Si");
		rdbtn1.setFont(f1);
		rdbtn1.setBackground(SystemColor.inactiveCaption);
		rdbtn1.setBounds(194, 59, 55, 23);
		p1.add(rdbtn1);
		
		JRadioButton rdbtn2 = new JRadioButton("No");
		rdbtn2.setFont(f1);
		rdbtn2.setBackground(SystemColor.inactiveCaption);
		rdbtn2.setBounds(194, 86, 55, 23);
		p1.add(rdbtn2);
		
		ButtonGroup g1 = new ButtonGroup();
		g1.add(rdbtn1);
		g1.add(rdbtn2);
		
		JRadioButton rdbtn3 = new JRadioButton("Si");
		rdbtn3.setFont(f1);
		rdbtn3.setBackground(SystemColor.inactiveCaption);
		rdbtn3.setBounds(198, 157, 55, 23);
		p1.add(rdbtn3);
		
		JRadioButton rdbtn4 = new JRadioButton("No");
		rdbtn4.setFont(f1);
		rdbtn4.setBackground(SystemColor.inactiveCaption);
		rdbtn4.setBounds(198, 183, 55, 23);
		p1.add(rdbtn4);
		
		ButtonGroup g2 = new ButtonGroup();
		g2.add(rdbtn3);
		g2.add(rdbtn4);
		
		JButton btn3 = new JButton("Siguiente");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pantalla3 p3=new Pantalla3();
				dispose();
			}
		});
		btn3.setFont(f1);
		btn3.setBounds(352, 228, 122, 23);
		p1.add(btn3);
		btn3.setEnabled(false);
		
		JButton btn1 = new JButton("Guardar");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtn2.isSelected() && rdbtn4.isSelected()) {
					uno=1;
				}
				else if(rdbtn1.isSelected() && rdbtn3.isSelected()) {
					uno=2;
				}
				else if(rdbtn1.isSelected() && rdbtn4.isSelected() || rdbtn2.isSelected() && rdbtn3.isSelected()) {
					uno=3;
				}
				else {
					uno=0;
				}
				btn3.setEnabled(true);
				Persona per=new Persona(txt1.getText(),txt2.getText(),txt3.getText(),txt4.getText(),uno);
				pers[nPer]=per; nPer++;
				txt1.setText("");
				txt2.setText("");
				txt3.setText("");
				txt4.setText("");
				g1.clearSelection();
				g2.clearSelection();
			}
		});
		btn1.setFont(f1);
		btn1.setBounds(178, 227, 122, 23);
		p1.add(btn1);
		
		JButton btn2 = new JButton("Salir");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btn2.setFont(f1);
		btn2.setBounds(10, 227, 122, 23);
		p1.add(btn2);
		this.setVisible(true);
	}
}