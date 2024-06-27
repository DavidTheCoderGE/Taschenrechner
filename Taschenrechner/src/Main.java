import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main implements ActionListener{
    JFrame frame = new JFrame("Taschenrechner");
    JTextField text = new JTextField();
    JButton[] numberButtons = new JButton[10];
    JButton[] actionButtons = new JButton[8];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton;
    JPanel panel = new JPanel();
    ImageIcon icon = new ImageIcon("2976435.png");

    Font myFont = new Font("My Font", Font.BOLD, 30);
    double num1=0, num2=0, result=0;
    char operator;

    public Main() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setIconImage(icon.getImage());
        frame.setLayout(null);
        frame.setResizable(false);

        text.setBounds(50, 25, 380, 50);
        text.setFont(myFont);
        text.setEditable(false);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Delete");
        clrButton = new JButton("Clear");

        actionButtons[0] = addButton;
        actionButtons[1] = subButton;
        actionButtons[2] = mulButton;
        actionButtons[3] = divButton;
        actionButtons[4] = decButton;
        actionButtons[5] = equButton;
        actionButtons[6] = delButton;
        actionButtons[7] = clrButton;

        for(int i = 0; i < 8; i++) {
            actionButtons[i].addActionListener(this);
            actionButtons[i].setFont(myFont);
            actionButtons[i].setFocusable(false);
        }

        for(int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }

        panel.setBounds(50, 100, 380, 275);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        delButton.setBounds(50, 400, 180, 50);
        clrButton.setBounds(250, 400, 180, 50);

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

        frame.add(clrButton);
        frame.add(delButton);
        frame.add(panel);
        frame.add(text);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Main calc = new Main();

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        for(int i = 0; i < 10; i++) {
            if(actionEvent.getSource() == numberButtons[i]) {
                text.setText(text.getText().concat(String.valueOf(i)));
            }
        }

        if(actionEvent.getSource() == decButton) {
            if(text.getText().contains(".")) {
                //do nothing
            } else {
                text.setText(text.getText().concat("."));
            }
        }

        if(actionEvent.getSource() == delButton) {
            if(text.getText().isEmpty()) {
                //do nothing
            } else {
                text.setText(text.getText().substring(0, text.getText().length() - 1));
            }
        }

        if(actionEvent.getSource() == clrButton) {
            text.setText("");
        }

        if(actionEvent.getSource() == addButton) {
            switch (operator) {
                case '+':
                    num2 = Double.parseDouble(text.getText());
                    num1 = num1 + num2;
                    break;
                case '-':
                    num2 = Double.parseDouble(text.getText());
                    num1 = num1 - num2;
                    break;
                case '*':
                    num2 = Double.parseDouble(text.getText());
                    num1 = num1 * num2;
                    break;
                case '/':
                    num2 = Double.parseDouble(text.getText());
                    num1 = num1 / num2;
                    break;
                default:
                    num1 = Double.parseDouble(text.getText());
                    break;
            }

            operator = '+';
            text.setText("");

        }

        if(actionEvent.getSource() == subButton) {
            switch (operator) {
                case '+':
                    num2 = Double.parseDouble(text.getText());
                    num1 = num1 + num2;
                    break;
                case '-':
                    num2 = Double.parseDouble(text.getText());
                    num1 = num1 - num2;
                    break;
                case '*':
                    num2 = Double.parseDouble(text.getText());
                    num1 = num1 * num2;
                    break;
                case '/':
                    num2 = Double.parseDouble(text.getText());
                    num1 = num1 / num2;
                    break;
                default:
                    num1 = Double.parseDouble(text.getText());
                    break;
            }

            operator = '-';
            text.setText("");

        }

        if(actionEvent.getSource() == mulButton) {
            switch (operator) {
                case '+':
                    num2 = Double.parseDouble(text.getText());
                    num1 = num1 + num2;
                    break;
                case '-':
                    num2 = Double.parseDouble(text.getText());
                    num1 = num1 - num2;
                    break;
                case '*':
                    num2 = Double.parseDouble(text.getText());
                    num1 = num1 * num2;
                    break;
                case '/':
                    num2 = Double.parseDouble(text.getText());
                    num1 = num1 / num2;
                    break;
                default:
                    num1 = Double.parseDouble(text.getText());
                    break;
            }

            operator = '*';
            text.setText("");

        }

        if(actionEvent.getSource() == divButton) {
            switch (operator) {
                case '+':
                    num2 = Double.parseDouble(text.getText());
                    num1 = num1 + num2;
                    break;
                case '-':
                    num2 = Double.parseDouble(text.getText());
                    num1 = num1 - num2;
                    break;
                case '*':
                    num2 = Double.parseDouble(text.getText());
                    num1 = num1 * num2;
                    break;
                case '/':
                    num2 = Double.parseDouble(text.getText());
                    num1 = num1 / num2;
                    break;
                default:
                    num1 = Double.parseDouble(text.getText());
                    break;
            }

            operator = '/';
            text.setText("");

        }

        if(actionEvent.getSource() == equButton) {
            switch (operator) {
                case '+':
                    num2 = Double.parseDouble(text.getText());
                    num1 = num1 + num2;
                    break;
                case '-':
                    num2 = Double.parseDouble(text.getText());
                    num1 = num1 - num2;
                    break;
                case '*':
                    num2 = Double.parseDouble(text.getText());
                    num1 = num1 * num2;
                    break;
                case '/':
                    num2 = Double.parseDouble(text.getText());
                    num1 = num1 / num2;
                    break;
                default:
                    num1 = Double.parseDouble(text.getText());
                    break;
            }
            text.setText(String.valueOf(num1));
            operator = '!';
        }
    }
}