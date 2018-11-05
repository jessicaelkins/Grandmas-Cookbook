import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JList;

public class BreakfastRecipes {

	private JFrame frameBreakfast;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakfastRecipes window = new BreakfastRecipes();
					window.frameBreakfast.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BreakfastRecipes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		// create breakfast menu frame
		frameBreakfast = new JFrame();
		frameBreakfast.setBounds(100, 100, 1280, 780);
		frameBreakfast.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameBreakfast.getContentPane().setLayout(null);
		
		// create breakfast panel
		JPanel panelBreakfast = new JPanel();
		panelBreakfast.setBounds(141, 45, 986, 114);
		frameBreakfast.getContentPane().add(panelBreakfast);
		panelBreakfast.setLayout(null);
		
		// create breakfast label
		JLabel lblBreakfastRecipes = new JLabel("Breakfast Recipes");
		lblBreakfastRecipes.setFont(new Font("Tahoma", Font.PLAIN, 60));
		lblBreakfastRecipes.setBounds(261, 20, 487, 73);
		panelBreakfast.add(lblBreakfastRecipes);
		
		// create breakfast result panel
		JPanel panelBreakfastResults = new JPanel();
		panelBreakfastResults.setBounds(141, 215, 986, 472);
		frameBreakfast.getContentPane().add(panelBreakfastResults);
		panelBreakfastResults.setLayout(null);
	}
}