package EventHandlingSwing;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.net.IDN;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class FormValidationDemo extends JFrame {

    private static final Pattern LOCAL_PART_PATTERN =
            Pattern.compile("^[A-Za-z0-9.!#$%&'*+/=?^_`{|}~-]+$");
    private static final Pattern DOMAIN_PATTERN =
            Pattern.compile("^[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");

    public FormValidationDemo() {
        super("Form Validation Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(420, 230);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(8, 8, 8, 8);
        c.fill = GridBagConstraints.HORIZONTAL;

        JLabel nameLabel = new JLabel("Ad Soyad:");
        JLabel emailLabel = new JLabel("E-posta:");
        JTextField nameField = new JTextField();
        JTextField emailField = new JTextField();
        JButton submitButton = new JButton("Kaydet");

        c.gridx = 0;
        c.gridy = 0;
        panel.add(nameLabel, c);
        c.gridx = 1;
        c.weightx = 1.0;
        panel.add(nameField, c);

        c.gridx = 0;
        c.gridy = 1;
        c.weightx = 0;
        panel.add(emailLabel, c);
        c.gridx = 1;
        c.weightx = 1.0;
        panel.add(emailField, c);

        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 2;
        c.weightx = 0;
        panel.add(submitButton, c);

        submitButton.addActionListener(e -> {
            String name = nameField.getText().trim();
            String email = emailField.getText().trim();

            if (name.length() < 3) {
                JOptionPane.showMessageDialog(this, "Ad Soyad en az 3 karakter olmalı.");
                return;
            }

            if (!isValidEmail(email)) {
                JOptionPane.showMessageDialog(this, "Geçerli bir e-posta girin.");
                return;
            }

            JOptionPane.showMessageDialog(this, "Kayıt başarılı: " + name + " (" + email + ")");
        });

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            setSystemLookAndFeel();
            new FormValidationDemo().setVisible(true);
        });
    }

    private static void setSystemLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {
            // Keep default look and feel
        }
    }

    private static boolean isValidEmail(String email) {
        int atIndex = email.lastIndexOf('@');
        if (atIndex <= 0 || atIndex == email.length() - 1) {
            return false;
        }

        String localPart = email.substring(0, atIndex);
        String domain = email.substring(atIndex + 1);

        if (!LOCAL_PART_PATTERN.matcher(localPart).matches()) {
            return false;
        }

        try {
            String asciiDomain = IDN.toASCII(domain);
            return DOMAIN_PATTERN.matcher(asciiDomain).matches();
        } catch (IllegalArgumentException ex) {
            return false;
        }
    }
}
