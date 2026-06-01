package EventHandlingSwing;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class TableSearchDemo extends JFrame {

    public TableSearchDemo() {
        super("Table Search Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(540, 320);
        setLocationRelativeTo(null);

        String[] columns = {"Ürün", "Kategori", "Fiyat"};
        Object[][] data = {
            {"Klavye", "Donanım", 450},
            {"Mouse", "Donanım", 300},
            {"Monitör", "Donanım", 4200},
            {"IntelliJ IDEA", "Yazılım", 0},
            {"NetBeans", "Yazılım", 0},
            {"Not Defteri", "Ofis", 45}
        };

        DefaultTableModel model = new DefaultTableModel(data, columns) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        JTable table = new JTable(model);
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        table.setRowSorter(sorter);

        JTextField searchField = new JTextField();
        searchField.setToolTipText("Filtrelemek için yazın...");
        searchField.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                filter();
            }

            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                filter();
            }

            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                filter();
            }

            private void filter() {
                String text = searchField.getText().trim();
                sorter.setRowFilter(text.isEmpty() ? null : RowFilter.regexFilter("(?i)" + java.util.regex.Pattern.quote(text)));
            }
        });

        add(searchField, BorderLayout.NORTH);
        add(new JScrollPane(table), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            setSystemLookAndFeel();
            new TableSearchDemo().setVisible(true);
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
