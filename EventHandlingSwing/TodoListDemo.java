package EventHandlingSwing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class TodoListDemo extends JFrame {

    private final DefaultListModel<String> model = new DefaultListModel<>();

    public TodoListDemo() {
        super("Todo List Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(420, 320);
        setLocationRelativeTo(null);

        JTextField input = new JTextField();
        JList<String> todoList = new JList<>(model);

        JButton addButton = new JButton("Ekle");
        JButton removeButton = new JButton("Seçileni Sil");

        addButton.addActionListener(e -> addTask(input.getText(), input));
        removeButton.addActionListener(e -> removeTask(todoList.getSelectedIndex()));

        input.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    addTask(input.getText(), input);
                }
            }
        });

        JPanel controls = new JPanel(new FlowLayout(FlowLayout.LEFT));
        controls.add(addButton);
        controls.add(removeButton);

        add(input, BorderLayout.NORTH);
        add(new JScrollPane(todoList), BorderLayout.CENTER);
        add(controls, BorderLayout.SOUTH);
    }

    private void addTask(String text, JTextField input) {
        String trimmed = text == null ? "" : text.trim();
        if (trimmed.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Lütfen bir görev girin.");
            return;
        }
        model.addElement(trimmed);
        input.setText("");
    }

    private void removeTask(int selectedIndex) {
        if (selectedIndex >= 0) {
            model.remove(selectedIndex);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            setSystemLookAndFeel();
            new TodoListDemo().setVisible(true);
        });
    }

    private static void setSystemLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {
            // Keep default look and feel
        }
    }
}
