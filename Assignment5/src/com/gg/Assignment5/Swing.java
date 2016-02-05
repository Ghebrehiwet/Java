package com.gg.Assignment5;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Swing {

	private JFrame frame;
	private JPanel borderPanel;
	private JPanel fileNamePanel;
	private JPanel formPanel;
	private JPanel buttonPanel;
	private JLabel filePrompt;
	private JTextField fileText;
	private JTextField fileNameText;
	private JButton writeButton;
	private JButton readButton;
	private JButton exitButton;

	public Swing() {
		createFrame();

	}

	private void createFrame() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 300);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.add(createBorderPanel());
		frame.setVisible(true);
	}

	private JPanel createBorderPanel() {
		borderPanel = new JPanel();
		borderPanel.setLayout(new BorderLayout());
		borderPanel.add(createFileNamePanel(), BorderLayout.NORTH);
		borderPanel.add(createFormPanel(), BorderLayout.CENTER);
		borderPanel.add(createButtonPanel(), BorderLayout.SOUTH);
		return borderPanel;
	}

	private JPanel createFileNamePanel() {
		fileNamePanel = new JPanel();
		fileNamePanel.setLayout(new GridLayout(1, 2));
		filePrompt = new JLabel("Enter fileName");
		fileNameText = new JTextField();
		fileNamePanel.add(filePrompt);
		fileNamePanel.add(fileNameText);
		return fileNamePanel;
	}

	private JPanel createFormPanel() {
		formPanel = new JPanel();
		formPanel.setLayout(new GridLayout(1, 1));
		fileText = new JTextField();
		formPanel.add(fileText);
		return formPanel;
	}

	private JPanel createButtonPanel() {
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		writeButton = new JButton("write File");
		writeButton.addActionListener(new writeButtonListener());
		readButton = new JButton("read File");
		readButton.addActionListener(new readButtonListener());
		exitButton = new JButton("Exit");
		exitButton.addActionListener(new ExitListener());

		buttonPanel.add(writeButton);
		buttonPanel.add(readButton);
		buttonPanel.add(exitButton);

		return buttonPanel;
	}

	private class writeButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			try {
				WriteFile wf = new WriteFile("C:\\Users\\user\\temp"
						+ fileNameText.getText() + ".txt");

				wf.addText(fileText.getText());
				wf.closefile();
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(frame, ex);
			}
		}

	}

	private class readButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				ReadFile rf = new ReadFile("C:\\Users\\user\\temp"
						+ fileNameText.getText() + ".txt");

				fileText.setText(rf.getText());
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(frame, ex);
			}
		}

	}

	private class ExitListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);

		}

	}
}