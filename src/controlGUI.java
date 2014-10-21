import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.util.jar.Attributes.Name;

public class controlGUI extends JFrame{
	public controlGUI(){
		setSize(new Dimension(700,200));
		setTitle("Clue - Control GUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// top panel
		JPanel panel = new JPanel();
		panel = createNorthPanel();
		add(panel, BorderLayout.NORTH);
		// bottom panel
		panel = createSouthPanel();
		add(panel, BorderLayout.SOUTH);
	}

	// creates top panel
	public JPanel createNorthPanel() {
		JPanel northPanel = new JPanel();
		// create components
		JLabel label = new JLabel("Whose Turn?");
		JTextField turn = new JTextField(20);
		turn.setFont(new Font("SansSerif", Font.BOLD, 12));
		Button nextPlayer = new Button("Next Player");
		Button makeAccusation = new Button("Make an Accusation");
		// add components to panel
		northPanel.add(label);
		northPanel.add(turn);
		northPanel.add(nextPlayer);
		northPanel.add(makeAccusation);
		// return panel
		return northPanel;
	}
	
	// creates bottom panel
	public JPanel createSouthPanel() {
		JPanel southPanel = new JPanel();
		JPanel panel = new JPanel();
		// die roll panel
		panel = createDieRoll();
		southPanel.add(panel);
		// guess panel
		panel = createGuess();
		southPanel.add(panel);
		// guess result panel
		panel = createGuessResult();
		southPanel.add(panel);
		// return panel
		return southPanel;
	}

	// create die roll
	public JPanel createDieRoll() {
		JPanel dieRollPanel = new JPanel();
		// create panel components
		JTextField dieRollText = new JTextField(3);
		JLabel dieRollLabel = new JLabel("Roll");
		dieRollText = new JTextField(3);
		dieRollText.setFont(new Font("SansSerif", Font.BOLD, 12));
		dieRollText.setEditable(false);
		// add components to panel
		dieRollPanel.add(dieRollLabel);
		dieRollPanel.add(dieRollText);
		dieRollPanel.setBorder(new TitledBorder (new EtchedBorder(), "Die"));
		// return panel
		return dieRollPanel;
	}
	
	// create guess
	public JPanel createGuess() {
		JPanel guessPanel = new JPanel();
		// create panel components
		JLabel guessLabel = new JLabel("Guess");
		JTextField guessText = new JTextField(20);
		guessText.setFont(new Font("SansSerif", Font.BOLD, 12));
		guessText.setEditable(false);
		// add components to panel
		guessPanel.add(guessLabel);
		guessPanel.add(guessText);
		guessPanel.setBorder(new TitledBorder (new EtchedBorder(), "Guess"));
		// return panel
		return guessPanel;
	}
	
	// create guess result
	public JPanel createGuessResult() {
		JPanel guessResultPanel = new JPanel();
		// create panel components
		JLabel guessResultLabel = new JLabel("Response");
		JTextField guessResultText = new JTextField(10);
		guessResultText.setFont(new Font("SansSerif", Font.BOLD, 12));
		guessResultText.setEditable(false);
		// add components to panel
		guessResultPanel.add(guessResultLabel);
		guessResultPanel.add(guessResultText);
		guessResultPanel.setBorder(new TitledBorder (new EtchedBorder(), "Guess Result"));
		// return panel
		return guessResultPanel;
	}

	// main
	public static void main(String[] args){
		controlGUI gui = new controlGUI();
		gui.setVisible(true);
	}
}
