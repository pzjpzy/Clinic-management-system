import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MainFrame extends JFrame implements ActionListener {
    CardLayout cardLayout;
    JPanel cardPanel;
    JButton logoutButton;
    JButton backButton;
    
    public MainFrame(String name) {
        // Set up the frame
        setTitle("CardLayout Example");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);

        // Set up CardLayout
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // Add panels to cardPanel
        JPanel homePanel = createHomePanel(name);
        JPanel logoutPanel = createLogoutPanel();
        
        cardPanel.add(homePanel, "HomePanel");
        cardPanel.add(logoutPanel, "LogoutPanel");
        
        // Set the cardPanel as the content pane
        setContentPane(cardPanel);
        cardLayout.show(cardPanel, "HomePanel");

        // Display the frame
        setVisible(true);
    }

    private JPanel createHomePanel(String name) {
        // Home Panel
        JPanel homePanel = new JPanel();
        homePanel.setBackground(new Color(162, 229, 221));
        homePanel.setLayout(null);

        JLabel welcomeLabel = new JLabel("Welcome, " + name);
        welcomeLabel.setFont(new Font("My Boli", Font.PLAIN, 30));
        welcomeLabel.setBounds(250, 100, 300, 50);
        homePanel.add(welcomeLabel);

        logoutButton = new JButton("Log Out");
        logoutButton.setFont(new Font("My Boli", Font.PLAIN, 25));
        logoutButton.setBounds(250, 200, 200, 50);
        logoutButton.addActionListener(this);
        homePanel.add(logoutButton);

        return homePanel;
    }

    private JPanel createLogoutPanel() {
        // Logout Panel
        JPanel logoutPanel = new JPanel();
        logoutPanel.setBackground(Color.LIGHT_GRAY);
        logoutPanel.setLayout(null);

        JLabel logoutLabel = new JLabel("You have logged out.");
        logoutLabel.setFont(new Font("My Boli", Font.PLAIN, 30));
        logoutLabel.setBounds(250, 100, 300, 50);
        logoutPanel.add(logoutLabel);

        backButton = new JButton("Back to Home");
        backButton.setFont(new Font("My Boli", Font.PLAIN, 25));
        backButton.setBounds(250, 200, 200, 50);
        backButton.addActionListener(this);
        logoutPanel.add(backButton);

        return logoutPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == logoutButton) {
            cardLayout.show(cardPanel, "LogoutPanel");
        } else if (e.getSource() == backButton) {
            cardLayout.show(cardPanel, "HomePanel");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainFrame("User"));
    }
}