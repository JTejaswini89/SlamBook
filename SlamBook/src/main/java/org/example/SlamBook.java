package org.example;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SlamBook extends JFrame {
    private JTextField aboutField, dearField, nnameField, addrrField, phonenoField , bodField , schoolField , mottoField ,favSubField , singField , favPlaceField , authorField , prodField;
    private JButton saveButton, resetButton;
    private JRadioButton favsmField , dyrbField;
    private ButtonGroup radioGroup;
    private JComboBox <String> favmgField;

    SlamBook() {
        this.setTitle("Personal Diary between Me and My Friend");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(750, 750);
        this.setResizable(true);


        // Header Panel
        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new BorderLayout());
        headerPanel.setBackground(new Color(120, 120, 122));

        JLabel slamBookLabel = new JLabel("SLAM BOOK RECORD", JLabel.CENTER);
        slamBookLabel.setFont(new Font("Arial", Font.BOLD, 24));
        slamBookLabel.setForeground(Color.black);
        Border border = BorderFactory.createLineBorder(Color.red, 3);
        slamBookLabel.setBorder(border);
        headerPanel.add(slamBookLabel, BorderLayout.CENTER);

        // Content Panel with GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        Font labelFont = new Font("Times New Roman", Font.BOLD, 16);
        Font textFieldFont = new Font("Times New Roman", Font.PLAIN, 14);

        //About
        gbc.gridx = 0;
        gbc.gridy = 0;
        JLabel nameLabel = new JLabel("It's About:");
        nameLabel.setFont(labelFont);
        panel.add(nameLabel, gbc);

        gbc.gridx = 1;
        aboutField = new JTextField(20);
        aboutField.setFont(textFieldFont);
        panel.add(aboutField, gbc);

        //Dear
        gbc.gridx = 0;
        gbc.gridy = 1;
        JLabel dearLabel = new JLabel("To My Dear:");
        dearLabel.setFont(labelFont);
        panel.add(dearLabel, gbc);

        gbc.gridx = 1;
        dearField = new JTextField(20);
        dearField.setFont(textFieldFont);
        panel.add(dearField, gbc);

        //Nickname
        gbc.gridx = 0;
        gbc.gridy = 2;
        JLabel nickLabel = new JLabel("Nick Name:");
        nickLabel.setFont(labelFont);
        panel.add(nickLabel, gbc);

        gbc.gridx = 1;
        nnameField = new JTextField(20);
        nnameField.setFont(textFieldFont);
        panel.add(nnameField, gbc);

        //Address
        gbc.gridx = 0;
        gbc.gridy = 3;
        JLabel addrLabel = new JLabel("Address:");
        addrLabel.setFont(labelFont);
        panel.add(addrLabel, gbc);

        gbc.gridx = 1;
        addrrField = new JTextField(20);
        addrrField.setFont(textFieldFont);
        panel.add(addrrField, gbc);

        //Phone Number
        gbc.gridx = 0;
        gbc.gridy = 4;
        JLabel phoneLabel = new JLabel("Phone Number:");
        phoneLabel.setFont(labelFont);
        panel.add(phoneLabel, gbc);

        gbc.gridx = 1;
        phonenoField = new JTextField(20);
        phonenoField.setFont(textFieldFont);
        panel.add(phonenoField, gbc);

        //BOD row
        gbc.gridx = 0;
        gbc.gridy = 5;
        JLabel bodLabel = new JLabel("Date of birth");
        bodLabel.setFont(labelFont);
        panel.add(bodLabel, gbc);

        gbc.gridx = 1;
        bodField = new JTextField(20);
        bodField.setFont(textFieldFont);
        panel.add(bodField, gbc);

        //School row
        gbc.gridx = 0;
        gbc.gridy = 6;
        JLabel schoolLabel = new JLabel("School/University:");
        schoolLabel.setFont(labelFont);
        panel.add(schoolLabel, gbc);

        gbc.gridx = 1;
        schoolField = new JTextField(20);
        schoolField.setFont(textFieldFont);
        panel.add(schoolField, gbc);

        //Motto row
        gbc.gridx = 0;
        gbc.gridy = 7;
        JLabel mottoLabel = new JLabel("Motto:");
        mottoLabel.setFont(labelFont);
        panel.add(mottoLabel, gbc);

        gbc.gridx = 1;
        mottoField = new JTextField(20);
        mottoField.setFont(textFieldFont);
        panel.add(mottoField, gbc);

        //favsubject Field row
        gbc.gridx = 0;
        gbc.gridy = 8;
        JLabel subLabel = new JLabel("Favourite Subject:");
        subLabel.setFont(labelFont);
        panel.add(subLabel, gbc);

        gbc.gridx = 1;
        favSubField = new JTextField(20);
        favSubField.setFont(textFieldFont);
        panel.add(favSubField, gbc);

        //fav social media row
        gbc.gridy = 9;
        gbc.gridx = 0;

        JLabel favsmLabel = new JLabel("Favourite Social Media :");
        favsmLabel.setFont(labelFont);
        panel.add(favsmLabel, gbc);
        // Create separate radio buttons for Instagram and WhatsApp
        JRadioButton instagramRadioButton = new JRadioButton("Instagram");
        JRadioButton whatsappRadioButton = new JRadioButton("WhatsApp");
        JRadioButton twitterRadioButton = new JRadioButton("Twitter");
        JRadioButton facebookRadioButton = new JRadioButton("FaceBook");

        // Set font for radio buttons
        instagramRadioButton.setFont(labelFont);
        whatsappRadioButton.setFont(labelFont);
        twitterRadioButton.setFont(labelFont);
        facebookRadioButton.setFont(labelFont);

        // Add radio buttons to the panel
        gbc.gridy=9;
        gbc.gridx=0;
        panel.add(instagramRadioButton, gbc);

        // Move to next line in the grid for the second radio button
        gbc.gridx = 0;
        panel.add(whatsappRadioButton, gbc);
        gbc.gridx=1;
        panel.add(twitterRadioButton,gbc);
        gbc.gridx=1;
        panel.add(facebookRadioButton,gbc);

        // Create a ButtonGroup to group the radio buttons together
        radioGroup = new ButtonGroup();
        radioGroup.add(favsmField);
        radioGroup.add(instagramRadioButton);
        radioGroup.add(whatsappRadioButton);
        radioGroup.add(twitterRadioButton);
        radioGroup.add(facebookRadioButton);

        JPanel radioPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        radioPanel.add(instagramRadioButton);
        radioPanel.add(whatsappRadioButton);
        radioPanel.add(twitterRadioButton);
        radioPanel.add(facebookRadioButton);
        panel.add(radioPanel,gbc);


        //Do you Read Books
        gbc.gridy = 10;
        gbc.gridx = 0;
        JLabel dyrbLabel = new JLabel("Do you Read Books: ");
        dyrbLabel.setFont(labelFont);
        panel.add(dyrbLabel, gbc);

        gbc.gridy=10;
        gbc.gridx=1;
        JRadioButton cb=new JRadioButton("YES");
        JRadioButton cb1=new JRadioButton("NO");
        cb.setFont(labelFont);
        cb1.setFont(labelFont);

        gbc.gridx=1;
        panel.add(cb , gbc);
        gbc.gridx=2;
        panel.add(cb1,gbc);

        radioGroup = new ButtonGroup();
        radioGroup.add(cb);
        radioGroup.add(cb1);

        //favmovie gener
        gbc.gridx=0;
        gbc.gridy=11;
        JLabel movieLabel=new JLabel("Favourite Movie Gener:");
        movieLabel.setFont(labelFont);
        panel.add(movieLabel , gbc);

        gbc.gridx = 1;
        String[] movieLabel1 = {
                "Sad",
                "Romantic",
                "Horror",
                "Thriller",
                "Rom &Com",
                "Comedy",
                "Family"
        };
        favmgField = new JComboBox<String>(movieLabel1);
        favmgField.setFont(textFieldFont);
        panel.add(favmgField, gbc);

        //Singer
        gbc.gridx=0;
        gbc.gridy=12;
        JLabel singLabel=new JLabel("Favourite Singer:");
        singLabel.setFont(labelFont);
        panel.add(singLabel,gbc);

        gbc.gridx=1;
        singField=new JTextField(20);
        singField.setFont(textFieldFont);
        panel.add(singField,gbc);

        //Fav places
        gbc.gridx=0;
        gbc.gridy=13;
        JLabel favPlaceLabel = new JLabel("Favourite Place:");
        favPlaceLabel.setFont(labelFont);
        panel.add(favPlaceLabel,gbc);

        gbc.gridx=1;
        favPlaceField=new JTextField(20);
        favPlaceField.setFont(textFieldFont);
        panel.add(favPlaceField,gbc);

        //Signature of the Author
        gbc.gridx=0;
        gbc.gridy=14;
        JLabel authorLabel= new JLabel("Signature of the Author:");
        authorLabel.setFont(labelFont);
        panel.add(authorLabel,gbc);
        gbc.gridx=1;
        authorField=new JTextField(20);
        authorField.setFont(textFieldFont);
        panel.add(authorField,gbc);

        //Signature of the Book Producer
        gbc.gridx=0;
        gbc.gridy=15;
        JLabel prodLabel= new JLabel("Signature of the Producer:");
        prodLabel.setFont(labelFont);
        panel.add(prodLabel,gbc);
        gbc.gridx=1;
        prodField=new JTextField(20);
        prodField.setFont(textFieldFont);
        panel.add(prodField,gbc);


        // Button Panel
        JPanel buttonPanel = new JPanel(new FlowLayout());
        saveButton = new JButton("Save");
        resetButton = new JButton("Reset");
        buttonPanel.add(saveButton);
        buttonPanel.add(resetButton);

        // Wrap panel in JScrollPane
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);


        // Add components to frame
        this.setLayout(new BorderLayout());
        this.add(headerPanel, BorderLayout.NORTH);
        this.add(scrollPane, BorderLayout.CENTER);
        this.add(buttonPanel, BorderLayout.SOUTH);


        // Adding MouseListener to Save button
        saveButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Save button clicked!");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                saveButton.setText("Saving...");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                saveButton.setText("Save");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                saveButton.setBackground(Color.GREEN);
                saveButton.setForeground(Color.BLACK);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                saveButton.setBackground(null);
            }
        });

        // Adding Reset Functionality
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Clear all text fields
                aboutField.setText("");
                dearField.setText("");
                nnameField.setText("");
                addrrField.setText("");
                phonenoField.setText("");
                bodField.setText("");
                schoolField.setText("");
                mottoField.setText("");
                favSubField.setText("");
                singField.setText("");
                favPlaceField.setText("");
                authorField.setText("");
                prodField.setText("");
                radioGroup.clearSelection();
                resetButton.setForeground(Color.BLACK);
                resetButton.setBackground(Color.GREEN);

            }

        });
        // Adding MouseListener to the label for fun
        slamBookLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Header Label Clicked!");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                slamBookLabel.setBackground(Color.BLACK);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //JOptionPane.showInputDialog(null);- takes input from us
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                slamBookLabel.setForeground(Color.MAGENTA);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                slamBookLabel.setForeground(Color.BLACK);
            }
        });

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new SlamBook();
    }
}
