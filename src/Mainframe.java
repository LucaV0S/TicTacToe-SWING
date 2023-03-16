import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mainframe extends JFrame {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button7;
    private JButton button5;
    private JButton button6;
    private JButton button8;
    private JButton button9;
    private JButton reset;
    private JLabel statusLabel;
    private JPanel Mainframe;
    private JButton start;
    String xSign = "X";
    String oSign = "O";
    String player;
    boolean go = false;
    int again=0;
    String winner;
    int count=0;

    public Mainframe() {
        constructorCode();
        lockButtons();

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttons(button1);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttons(button2);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttons(button3);
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttons(button4);
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttons(button5);
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttons(button6);
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttons(button7);
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttons(button8);
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttons(button9);
            }
        });
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setText("");
                button2.setText("");
                button3.setText("");
                button4.setText("");
                button5.setText("");
                button6.setText("");
                button7.setText("");
                button8.setText("");
                button9.setText("");
                unlockButtons();
                statusLabel.setText("");
                again=0;
                count=0;
                player= xSign;
                statusLabel.setText(xSign + ", your turn.");


            }
        });
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                again += 1;
                go = true;
                statusLabel.setText(xSign);
                player = xSign;
                statusLabel.setText(statusLabel.getText() + ", your turn.");
                if(again>1){
                    statusLabel.setText("PLEASE PRESS RESTART TO BEGIN A NEW GAME");
                    lockButtons();
                }
                unlockButtons();
            }
        });
    }
    public void play(){
       if(button1.getText().equals(xSign) && button2.getText().equals(xSign) && button3.getText().equals(xSign)){
            winner= xSign;
            statusLabel.setText(winner + ", has Won.");
           button1.setEnabled(false);
           lockButtons();
       }
       else if(button1.getText().equals(oSign) && button2.getText().equals(oSign) && button3.getText().equals(oSign)){
           winner=oSign;
           statusLabel.setText(winner + ", has Won.");
           lockButtons();
       }
       else if(button4.getText().equals(oSign) && button5.getText().equals(oSign) && button6.getText().equals(oSign)){
           winner=oSign;
           statusLabel.setText(winner + ", has Won.");
           lockButtons();
       }
       else if(button7.getText().equals(oSign) && button8.getText().equals(oSign) && button9.getText().equals(oSign)){
           winner=oSign;
           statusLabel.setText(winner + ", has Won.");
           lockButtons();
       }
       else if(button3.getText().equals(oSign) && button5.getText().equals(oSign) && button7.getText().equals(oSign)){
           winner=oSign;
           statusLabel.setText(winner + ", has Won.");
           lockButtons();
       }
       else if(button1.getText().equals(oSign) && button5.getText().equals(oSign) && button9.getText().equals(oSign)){
           winner=oSign;
           statusLabel.setText(winner + ", has Won.");
           lockButtons();
       }
       else if(button1.getText().equals(oSign) && button4.getText().equals(oSign) && button7.getText().equals(oSign)){
           winner=oSign;
           statusLabel.setText(winner + ", has Won.");
           lockButtons();
       }
       else if(button2.getText().equals(oSign) && button5.getText().equals(oSign) && button8.getText().equals(oSign)){
           winner=oSign;
           statusLabel.setText(winner + ", has Won.");
           lockButtons();
       }
       else if(button3.getText().equals(oSign) && button6.getText().equals(oSign) && button9.getText().equals(oSign)){
           winner=oSign;
           statusLabel.setText(winner + ", has Won.");
           lockButtons();
       }
       else if(button3.getText().equals(xSign) && button5.getText().equals(xSign) && button7.getText().equals(xSign)){
           winner=xSign;
           statusLabel.setText(winner + ", has Won.");
           lockButtons();
       }
       else if(button1.getText().equals(xSign) && button5.getText().equals(xSign) && button9.getText().equals(xSign)){
           winner=xSign;
           statusLabel.setText(winner + ", has Won.");
           lockButtons();
       }
       else if(button4.getText().equals(xSign) && button5.getText().equals(xSign) && button6.getText().equals(xSign)){
           winner=xSign;
           statusLabel.setText(winner + ", has Won.");
           lockButtons();
       }
       else if(button7.getText().equals(xSign) && button8.getText().equals(xSign) && button9.getText().equals(xSign)){
           winner=xSign;
           statusLabel.setText(winner + ", has Won.");
           lockButtons();
       }
       else if(button1.getText().equals(xSign) && button4.getText().equals(xSign) && button7.getText().equals(xSign)){
           winner=xSign;
           statusLabel.setText(winner + ", has Won.");
           lockButtons();
       }
       else if(button2.getText().equals(xSign) && button5.getText().equals(xSign) && button8.getText().equals(xSign)){
           winner=xSign;
           statusLabel.setText(winner + ", has Won.");
           lockButtons();
       }
       else if(button3.getText().equals(xSign) && button6.getText().equals(xSign) && button9.getText().equals(xSign)){
           winner=xSign;
           statusLabel.setText(winner + ", has Won.");
           button1.setEnabled(false);
           lockButtons();
       }
       else if(count>=8){
           statusLabel.setText("DRAW-> PLEASE RESET");
       }

    }

    public void lockButtons(){
        JButton[] buttonSpeicher = new JButton[]{button1, button2, button3, button4, button5, button6, button7, button8, button9};
        for (int i = 0; i <buttonSpeicher.length ; i++) {
            buttonSpeicher[i].setEnabled(false);
        }
    }
    public void unlockButtons(){
        JButton[] buttonSpeicher = new JButton[]{button1, button2, button3, button4, button5, button6, button7, button8, button9};
        for (int i = 0; i <buttonSpeicher.length ; i++) {
            buttonSpeicher[i].setEnabled(true);
        }
    }

    public void buttons(JButton buttonname){
        if(player == xSign){
            buttonname.setText(xSign);
            player = oSign;
            statusLabel.setText(oSign +", your turn.");
            buttonname.setEnabled(false);
            play();
            count+=1;
        }
        else{
            buttonname.setText(oSign);
            player = xSign;
            statusLabel.setText(xSign + ", your turn.");
            buttonname.setEnabled(false);
            play();
            count+=1;
        }
    }
    public void constructorCode(){
        setTitle("TicTacToe");
        setSize(600, 800);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setContentPane(Mainframe);
        setLocationRelativeTo(null);
    }
}