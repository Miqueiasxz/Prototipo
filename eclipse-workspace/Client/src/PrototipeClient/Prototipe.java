package PrototipeClient;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Panel;
import java.awt.Choice;
import java.awt.List;

public class Prototipe extends JFrame {

	private JPanel Sobremessa;
	private JTextField textField_3;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton btnExcluir;
	private JTable table;
	private JTable table_1;
	private JLabel lblNewLabel_3;
	private JTable table_2;
	private JButton btnConfirmar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prototipe frame = new Prototipe();
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
	public Prototipe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 847, 561);
		Sobremessa = new JPanel();
		Sobremessa.setForeground(new Color(255, 128, 0));
		Sobremessa.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(Sobremessa);
		Sobremessa.setLayout(null);
		
		JButton btnConcluir = new JButton("Confirmar Pedido");
		btnConcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConcluir.setBounds(643, 368, 116, 23);
		Sobremessa.add(btnConcluir);
		
		JLabel lblNewLabel = new JLabel("Montagem de Pedido");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 11, 187, 14);
		Sobremessa.add(lblNewLabel);
		
		textField_3 = new JTextField();
		textField_3.setBounds(270, 283, -100, 20);
		Sobremessa.add(textField_3);
		textField_3.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Quantidade de Itens:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(306, 68, 153, 14);
		Sobremessa.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Lanche:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(69, 68, 71, 14);
		Sobremessa.add(lblNewLabel_2);
		
		btnExcluir = new JButton("Excluir Pedido");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				((DefaultTableModel) table.getModel()).removeRow(table.getSelectedRow());
			}
		});
		btnExcluir.setBounds(643, 417, 116, 23);
		Sobremessa.add(btnExcluir);
		
		table = new JTable();
		table.setBounds(10, 119, 211, 184);
		Sobremessa.add(table);
		
		table_1 = new JTable();
		table_1.setBounds(643, 134, 116, 184);
		Sobremessa.add(table_1);
		
		lblNewLabel_3 = new JLabel("Pedido ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(655, 68, 153, 14);
		Sobremessa.add(lblNewLabel_3);
		
		table_2 = new JTable();
		table_2.setBounds(306, 119, 153, 184);
		Sobremessa.add(table_2);
		
		btnConfirmar = new JButton("Confirmar Escolha");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConfirmar.setBounds(31, 343, 130, 23);
		Sobremessa.add(btnConfirmar);
	}
}
