import java.awt.BorderLayout;
import java.awt.EventQueue;
//this is a test
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class FinalChecker extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinalChecker frame = new FinalChecker(null, null);
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
	public FinalChecker(Pizza za, FinalOrder order) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 135, 414, 115);
		contentPane.add(textPane);
		order.setOrder(za.getPizza());
		order.setNewPrice(za.getPrice());
		textPane.setText(order.getOrder() + order.getPrice());
		
		JLabel lblAnother = new JLabel("Another ?");
		lblAnother.setBounds(10, 11, 89, 14);
		contentPane.add(lblAnother);
		
		JButton btnNewButton = new JButton("Yes!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				PizzaBaseSelector selector = new PizzaBaseSelector(order);
				contentPane.setVisible(false);
				selector.setVisible(true);
			}
		});
		btnNewButton.setBounds(10, 36, 89, 23);
		contentPane.add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 70, 414, 54);
		contentPane.add(textArea);
		textArea.setText(order.getOrder() + order.getPrice());
		za.clearPizza();
		
	}
}
