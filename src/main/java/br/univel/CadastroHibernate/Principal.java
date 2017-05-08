package br.univel.CadastroHibernate;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Cadastro");
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCadastro = new JMenu("Cadastro");
		menuBar.add(mnCadastro);
		
		JMenuItem mntmInserir = new JMenuItem("Inserir");
		mnCadastro.add(mntmInserir);
		
		JMenuItem mntmAlterar = new JMenuItem("Alterar");
		mnCadastro.add(mntmAlterar);
		
		JMenuItem mntmDeletar = new JMenuItem("Deletar");
		mnCadastro.add(mntmDeletar);
		
		JMenu mnListagem = new JMenu("Listagem");
		menuBar.add(mnListagem);
		
		JMenuItem mntmListarTodos = new JMenuItem("Listar Todos");
		mnListagem.add(mntmListarTodos);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		scrollPane.setViewportView(table);

		
		
		setVisible(true);
	}

}
