import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentRegistrationForm extends JFrame {

    private JTextField nameField;
    private JTextField emailField;
    private JTextField ageField;
    private JTextField phoneField;
    private JTextField collegeField;
    private JTextField addressField;

    public StudentRegistrationForm() {
        setTitle("Student Registration Form");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2));

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        JLabel ageLabel = new JLabel("Age:");
        ageField = new JTextField();
        JLabel phoneLabel = new JLabel("Phone:");
        phoneField = new JTextField();
        JLabel collegeLabel = new JLabel("College:");
        collegeField = new JTextField();
        JLabel addressLabel = new JLabel("Address:");
        addressField = new JTextField();

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(phoneLabel);
        panel.add(phoneField);
        panel.add(collegeLabel);
        panel.add(collegeField);
        panel.add(addressLabel);
        panel.add(addressField);

        JButton submitButton = new JButton("Submit");
        JButton clearButton = new JButton("Clear");

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                int age = Integer.parseInt(ageField.getText());
                String phone = phoneField.getText();
                String college = collegeField.getText();
                String address = addressField.getText();
                System.out.print("*******************************************************");
                System.out.println("Submitted Data");
                System.out.println("Name: " + name);
                System.out.println("Email: " + email);
                System.out.println("Age: " + age);
                System.out.println("Phone: " + phone);
                System.out.println("College: " + college);
                System.out.println("Address: " + address);
                System.out.print("*******************************************************");
                String message = "Name: " + name + "\n"
                        + "Email: " + email + "\n"
                        + "Age: " + age + "\n"
                        + "Phone: " + phone + "\n"
                        + "College: " + college + "\n"
                        + "Address: " + address;

                JOptionPane.showMessageDialog(null, message, "Registration Details", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                emailField.setText("");
                ageField.setText("");
                phoneField.setText("");
                collegeField.setText("");
                addressField.setText("");
            }
        });

        panel.add(submitButton);
        panel.add(clearButton);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StudentRegistrationForm());
    }
}
