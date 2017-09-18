import java.awt.EventQueue;
//eatshit :P
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PizzaOrderer {
	

	private JFrame PhoneNumberFrame;
	private JTextField TextPhoneNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PizzaOrderer window = new PizzaOrderer();
					window.PhoneNumberFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PizzaOrderer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		PhoneNumberFrame = new JFrame();
		PhoneNumberFrame.setBounds(100, 100, 468, 171);
		PhoneNumberFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PhoneNumberFrame.getContentPane().setLayout(null);
		
		TextPhoneNumber = new JTextField();
		TextPhoneNumber.setBounds(122, 47, 247, 20);
		PhoneNumberFrame.getContentPane().add(TextPhoneNumber);
		TextPhoneNumber.setColumns(10);
		
		JLabel LabelPhoneNumber = new JLabel("Please enter your phone number: ");
		LabelPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 20));
		LabelPhoneNumber.setHorizontalAlignment(SwingConstants.CENTER);
		LabelPhoneNumber.setBounds(0, 0, 525, 36);
		PhoneNumberFrame.getContentPane().add(LabelPhoneNumber);
		
		JButton ButtonPhoneNumber = new JButton("Enter");
		ButtonPhoneNumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				FinalOrder order = new FinalOrder();
				order.setNumber(TextPhoneNumber.getText());
				PhoneNumberFrame.dispose();
				PizzaBaseSelector selector = new PizzaBaseSelector(order);
				
				selector.setVisible(true);
			}
		});
		ButtonPhoneNumber.setBounds(194, 78, 89, 23);
		PhoneNumberFrame.getContentPane().add(ButtonPhoneNumber);
		
	}
}
