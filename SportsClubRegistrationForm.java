import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SportsClubRegistrationForm extends JFrame {
    private JTextField nameField, fatherNameField, motherNameField, bloodGroupField, pastAddressField, presentAddressField, mobileNumberField;
    private JTextArea interestsArea;

    public SportsClubRegistrationForm() {
        setTitle("MU Sports Club Registration Form");
        setSize(600, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        Font titleFont = new Font(Font.SANS_SERIF, Font.BOLD, 24);
        JLabel titleLabel = new JLabel("MU Sports Club Registration Form");
        titleLabel.setFont(titleFont);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(titleLabel, BorderLayout.NORTH);

        Font labelFont = new Font(Font.SANS_SERIF, Font.BOLD, 20); // Set font size for labels
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(9, 2));

        // Name
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setFont(labelFont); // Set font for label
        panel.add(nameLabel);
        nameField = new JTextField();
        nameField.setPreferredSize(new Dimension(200, 20)); // Set preferred size for text field
        panel.add(nameField);

        // Father's Name
        JLabel fatherNameLabel = new JLabel("Father's Name:");
        fatherNameLabel.setFont(labelFont); // Set font for label
        panel.add(fatherNameLabel);
        fatherNameField = new JTextField();
        fatherNameField.setPreferredSize(new Dimension(200, 20)); // Set preferred size for text field
        panel.add(fatherNameField);

        // Mother's Name
        JLabel motherNameLabel = new JLabel("Mother's Name:");
        motherNameLabel.setFont(labelFont); // Set font for label
        panel.add(motherNameLabel);
        motherNameField = new JTextField();
        motherNameField.setPreferredSize(new Dimension(200, 20)); // Set preferred size for text field
        panel.add(motherNameField);

        // Blood Group
        JLabel bloodGroupLabel = new JLabel("Blood Group:");
        bloodGroupLabel.setFont(labelFont); // Set font for label
        panel.add(bloodGroupLabel);
        bloodGroupField = new JTextField();
        bloodGroupField.setPreferredSize(new Dimension(200, 20)); // Set preferred size for text field
        panel.add(bloodGroupField);

        // Past Address
        JLabel pastAddressLabel = new JLabel("Past Address:");
        pastAddressLabel.setFont(labelFont); // Set font for label
        panel.add(pastAddressLabel);
        pastAddressField = new JTextField();
        pastAddressField.setPreferredSize(new Dimension(200, 20)); // Set preferred size for text field
        panel.add(pastAddressField);

        // Present Address
        JLabel presentAddressLabel = new JLabel("Present Address:");
        presentAddressLabel.setFont(labelFont); // Set font for label
        panel.add(presentAddressLabel);
        presentAddressField = new JTextField();
        presentAddressField.setPreferredSize(new Dimension(200, 20)); // Set preferred size for text field
        panel.add(presentAddressField);

        // Mobile Number
        JLabel mobileNumberLabel = new JLabel("Mobile Number:");
        mobileNumberLabel.setFont(labelFont); // Set font for label
        panel.add(mobileNumberLabel);
        mobileNumberField = new JTextField();
        mobileNumberField.setPreferredSize(new Dimension(200, 20)); // Set preferred size for text field
        panel.add(mobileNumberField);

        // Interests
        JLabel interestsLabel = new JLabel("Interests:");
        interestsLabel.setFont(labelFont); // Set font for label
        panel.add(interestsLabel);
        interestsArea = new JTextArea(4, 20);
        JScrollPane scrollPane = new JScrollPane(interestsArea);
        panel.add(scrollPane);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Retrieve form data
                String name = nameField.getText();
                String fatherName = fatherNameField.getText();
                String motherName = motherNameField.getText();
                String bloodGroup = bloodGroupField.getText();
                String pastAddress = pastAddressField.getText();
                String presentAddress = presentAddressField.getText();
                String mobileNumber = mobileNumberField.getText();
                String interests = interestsArea.getText();

                // Display the data
                System.out.println("Name: " + name);
                System.out.println("Father's Name: " + fatherName);
                System.out.println("Mother's Name: " + motherName);
                System.out.println("Blood Group: " + bloodGroup);
                System.out.println("Past Address: " + pastAddress);
                System.out.println("Present Address: " + presentAddress);
                System.out.println("Mobile Number: " + mobileNumber);
                System.out.println("Interests: " + interests);
            }
        });

        panel.add(submitButton);

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }
}