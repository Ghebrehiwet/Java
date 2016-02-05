package com.gg.Assignment6;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class EnterRecipeForm {

	private JFrame frame;
	private JList<String> list;
	private JScrollPane scrollPane;
	private JPanel borderPanel;
	private JPanel gridPanel;
	private JPanel buttonPanel;
	private JLabel recipeNameLabel;
	private JLabel ingredientNameLabel;
	private JLabel caloriesLabel;
	private JLabel fatLabel;
	private JLabel proteinLabel;
	private JLabel directionsLabel;
	private JTextField recipeNameTextField;
	private JTextField ingredientNameTextField;
	private JTextField caloriesTextField;
	private JTextField fatTextField;
	private JTextField proteinTextField;
	private JTextArea directionsTextArea;
	private JButton buttonAddIngredient;
	private JLabel placeLabel;
	private JButton buttonAddRecipe;
	private JButton buttonFillList;
	private JButton buttonExit;

	private RecipeList recipes;
	private ArrayList<Item> ingredients;
	private JLabel carbsLabel;
	private JTextField carbsTextField;
	private JLabel unitSizeLabel;
	private JTextField unitSizeTextField;

	public EnterRecipeForm() {

		createJFrame();
		recipes = new RecipeList();
		ingredients = new ArrayList<Item>();
	}

	private void createJFrame() {
		frame = new JFrame();
		frame.setBounds(200, 200, 550, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Recipe App");
		frame.add(createBorderPanel());
		frame.setVisible(true);
	}

	private JPanel createBorderPanel() {
		borderPanel = new JPanel();
		borderPanel.setLayout(new BorderLayout());
		borderPanel.add(createScrollPane(), BorderLayout.WEST);
		borderPanel.add(createGridPanel(), BorderLayout.EAST);
		borderPanel.add(createButtonPanel(), BorderLayout.SOUTH);
		return borderPanel;
	}

	private JScrollPane createScrollPane() {

		list = new JList<String>();

		list.addListSelectionListener(new SelectionListener());
		scrollPane = new JScrollPane(list);
		return scrollPane;
	}

	private JPanel createGridPanel() {

		gridPanel = new JPanel();
		gridPanel.setLayout(new GridLayout(9, 2));
		ingredientNameLabel = new JLabel("Enter Ingredient Name");
		ingredientNameTextField = new JTextField();
		unitSizeLabel = new JLabel("Unit Size");
		unitSizeTextField = new JTextField();
		caloriesLabel = new JLabel("Calories");
		caloriesTextField = new JTextField();
		fatLabel = new JLabel("Fat Grams");
		fatTextField = new JTextField();
		proteinLabel = new JLabel("Protein Grams");
		proteinTextField = new JTextField();
		carbsLabel = new JLabel("Carbs Grams");
		carbsTextField = new JTextField();
		buttonAddIngredient = new JButton("Add Ingredient");
		buttonAddIngredient.addActionListener(new IngredientListener());
		placeLabel = new JLabel();
		recipeNameLabel = new JLabel("Enter Recipe Name");
		recipeNameTextField = new JTextField();
		directionsLabel = new JLabel("Directions");
		directionsTextArea = new JTextArea();
		directionsTextArea.setLineWrap(true);


		gridPanel.add(ingredientNameLabel);
		gridPanel.add(ingredientNameTextField);
		gridPanel.add(unitSizeLabel);
		gridPanel.add(unitSizeTextField);
		gridPanel.add(caloriesLabel);
		gridPanel.add(caloriesTextField);
		gridPanel.add(fatLabel);
		gridPanel.add(fatTextField);
		gridPanel.add(proteinLabel);
		gridPanel.add(proteinTextField);
		gridPanel.add(carbsLabel);
		gridPanel.add(carbsTextField);
		gridPanel.add(placeLabel);
		gridPanel.add(buttonAddIngredient);
		gridPanel.add(recipeNameLabel);
		gridPanel.add(recipeNameTextField);
		gridPanel.add(directionsLabel);
		gridPanel.add(directionsTextArea);

		return gridPanel;

	}

	private JPanel createButtonPanel() {

		buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		buttonAddRecipe = new JButton("Add Recipe");
		buttonAddRecipe.addActionListener(new AddRecipeListener());
		buttonFillList = new JButton("GetRecipes");
		buttonFillList.addActionListener(new FillListListener());
		buttonExit = new JButton("Exit");
		buttonExit.addActionListener(new ExitListener());
		buttonPanel.add(buttonAddRecipe);
		buttonPanel.add(buttonFillList);
		buttonPanel.add(buttonExit);

		return buttonPanel;
	}

	private class ExitListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.exit(0);

		}

	}

	private class FillListListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ArrayList<Item> items = recipes.getItems();

			DefaultListModel<String> model = new DefaultListModel<String>();

			for (Item i : items) {
				model.addElement(i.getName());
			}
			list.setModel(model);
		}

	}

	private class AddRecipeListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Recipe r = new Recipe();
			r.setName(recipeNameTextField.getText());
			r.setDirections(directionsTextArea.getText());

			for (Item i : ingredients) {
				Ingredient ingredient = (Ingredient) i;
				r.addItem(ingredient);
			}

			recipes.addItem(r);
			recipeNameTextField.setText("");
			directionsTextArea.setText("");
			ingredients.clear(); 

		}

	}

	private class IngredientListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			Ingredient i = new Ingredient();
			i.setName(ingredientNameTextField.getText());
			i.setCalories(Integer.parseInt(caloriesTextField.getText()));
			i.setFat(Integer.parseInt(fatTextField.getText()));
			i.setProtein(Integer.parseInt(proteinTextField.getText()));
			i.setUnitSize(unitSizeTextField.getText());
			i.setCarbs(Integer.parseInt(carbsTextField.getText()));
			ingredients.add(i);
			ingredientNameTextField.setText("");
			caloriesTextField.setText("");
			fatTextField.setText("");
			proteinTextField.setText("");
			carbsTextField.setText("");
			unitSizeTextField.setText("");

		}

	}

	private class SelectionListener implements ListSelectionListener {

		@Override
		public void valueChanged(ListSelectionEvent arg0) {
			if (list.getSelectedIndex() != -1) {
				String name = list.getSelectedValue();
				Recipe r = (Recipe) recipes.getItem(name);
				ViewRecipeForm view = new ViewRecipeForm(r);

			}

		}
	}
}
