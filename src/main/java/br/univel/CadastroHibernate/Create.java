package br.univel.CadastroHibernate;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;

public class Create extends JFrame {

	private JPanel contentPane;
	private JTextField field_nome;
	private JTextField field_telefone;
	private JTextField field_email;
	private JTextField field_endereco;

	/**
	 * Create the frame.
	 */
	public Create() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 200);
		setTitle("Cliente");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{424, 0};
		gbl_contentPane.rowHeights = new int[]{252, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNome = new JLabel("Nome");
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome.anchor = GridBagConstraints.EAST;
		gbc_lblNome.gridx = 0;
		gbc_lblNome.gridy = 0;
		panel.add(lblNome, gbc_lblNome);
		
		field_nome = new JTextField();
		GridBagConstraints gbc_field_nome = new GridBagConstraints();
		gbc_field_nome.gridwidth = 3;
		gbc_field_nome.insets = new Insets(0, 0, 5, 0);
		gbc_field_nome.fill = GridBagConstraints.BOTH;
		gbc_field_nome.gridx = 1;
		gbc_field_nome.gridy = 0;
		panel.add(field_nome, gbc_field_nome);
		field_nome.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 0;
		gbc_lblEmail.gridy = 1;
		panel.add(lblEmail, gbc_lblEmail);
		
		field_email = new JTextField();
		GridBagConstraints gbc_field_email = new GridBagConstraints();
		gbc_field_email.gridwidth = 3;
		gbc_field_email.insets = new Insets(0, 0, 5, 0);
		gbc_field_email.fill = GridBagConstraints.BOTH;
		gbc_field_email.gridx = 1;
		gbc_field_email.gridy = 1;
		panel.add(field_email, gbc_field_email);
		field_email.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endereço");
		GridBagConstraints gbc_lblEndereo = new GridBagConstraints();
		gbc_lblEndereo.anchor = GridBagConstraints.EAST;
		gbc_lblEndereo.insets = new Insets(0, 0, 5, 5);
		gbc_lblEndereo.gridx = 0;
		gbc_lblEndereo.gridy = 2;
		panel.add(lblEndereo, gbc_lblEndereo);
		
		field_endereco = new JTextField();
		GridBagConstraints gbc_field_endereco = new GridBagConstraints();
		gbc_field_endereco.gridwidth = 3;
		gbc_field_endereco.insets = new Insets(0, 0, 5, 0);
		gbc_field_endereco.fill = GridBagConstraints.BOTH;
		gbc_field_endereco.gridx = 1;
		gbc_field_endereco.gridy = 2;
		panel.add(field_endereco, gbc_field_endereco);
		field_endereco.setColumns(10);
		
		JLabel lblTelfone = new JLabel("Telefone");
		GridBagConstraints gbc_lblTelfone = new GridBagConstraints();
		gbc_lblTelfone.anchor = GridBagConstraints.EAST;
		gbc_lblTelfone.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelfone.gridx = 0;
		gbc_lblTelfone.gridy = 3;
		panel.add(lblTelfone, gbc_lblTelfone);
		
		field_telefone = new JTextField();
		GridBagConstraints gbc_field_telefone = new GridBagConstraints();
		gbc_field_telefone.insets = new Insets(0, 0, 5, 5);
		gbc_field_telefone.fill = GridBagConstraints.BOTH;
		gbc_field_telefone.gridx = 1;
		gbc_field_telefone.gridy = 3;
		panel.add(field_telefone, gbc_field_telefone);
		field_telefone.setColumns(10);
		
		JButton btnConfirmar = new JButton("Confirmar");
		GridBagConstraints gbc_btnConfirmar = new GridBagConstraints();
		gbc_btnConfirmar.insets = new Insets(0, 0, 5, 5);
		gbc_btnConfirmar.gridx = 2;
		gbc_btnConfirmar.gridy = 3;
		panel.add(btnConfirmar, gbc_btnConfirmar);
		
		JButton btnCancelar = new JButton("Cancelar");
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 5, 0);
		gbc_btnCancelar.gridx = 3;
		gbc_btnCancelar.gridy = 3;
		panel.add(btnCancelar, gbc_btnCancelar);
		
		setVisible(true);
	}

}
