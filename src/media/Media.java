package media;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JProgressBar;

public class Media extends JFrame {

	private JPanel contentPane;
	private JTextField txtn2;
	private JTextField txtn1;
	private JTextField txtmedia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Media frame = new Media();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Media() {
		setTitle("C\u00E1lculo da m\u00E9dia");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSair = new JButton("sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnSair.setBounds(302, 59, 89, 23);
		contentPane.add(btnSair);
		
		JLabel lblNewLabel = new JLabel("Nota 2:");
		lblNewLabel.setBounds(26, 63, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNota = new JLabel("Nota 1:");
		lblNota.setBounds(26, 43, 46, 14);
		contentPane.add(lblNota);
		
		txtn2 = new JTextField();
		txtn2.setBounds(70, 60, 86, 20);
		contentPane.add(txtn2);
		txtn2.setColumns(10);
		
		txtn1 = new JTextField();
		txtn1.setColumns(10);
		txtn1.setBounds(70, 40, 86, 20);
		contentPane.add(txtn1);
		
		JLabel lblNewLabel_1 = new JLabel("M\u00E9dia");
		lblNewLabel_1.setBounds(26, 142, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtmedia = new JTextField();
		txtmedia.setEditable(false);
		txtmedia.setBounds(70, 139, 86, 20);
		contentPane.add(txtmedia);
		txtmedia.setColumns(10);
	
		
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtn1.setText("");
				txtn2.setText("");
				txtmedia.setText("");
			}
		});
		btnLimpar.setBounds(302, 102, 89, 23);
		contentPane.add(btnLimpar);
		
		JTextPane txtwarning = new JTextPane();
		txtwarning.setEditable(false);
		txtwarning.setBounds(26, 186, 311, 20);
	
		contentPane.add(txtwarning);
		
		JButton btnCalc = new JButton("Calcular");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float nota1, nota2, media;
				
				try {
				
				
				nota1 = Float.valueOf(txtn1.getText());
				nota2 = Float.valueOf(txtn2.getText());
			
				media = (nota1 + nota2)/2;
				
				txtmedia.setText(String.valueOf(media));
				
				
				
				if(media >=7) {
					
					
					txtwarning.setText("Aluno aprovado");
					
					
				}
				
				else {
					
					
					txtwarning.setText("Aluno reprovado");
					
				
				
				}

				}
				catch (Exception ex) {
					
					JOptionPane.showMessageDialog(null,"Erro! Digite suas notas novamente!");
					
				}
				
			}
		});
		btnCalc.setBounds(302, 26, 89, 23);
		contentPane.add(btnCalc);
		
		
		
		
		
	}
	
}
