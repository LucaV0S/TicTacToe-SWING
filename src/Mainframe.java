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
        setTitle("TicTacToe");
        setSize(600, 800);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setContentPane(Mainframe);
        lockButtons();

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(player == xSign){
                    button1.setText(xSign);
                    player = oSign;
                    statusLabel.setText(oSign +", your turn.");
                    button1.setEnabled(false);
                    play();
                    count+=1;
                }
                else{
                    button1.setText(oSign);
                    player = xSign;
                    statusLabel.setText(xSign + ", your turn.");
                    button1.setEnabled(false);
                    play();
                    count+=1;
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(player == xSign){
                    button2.setText(xSign);
                    player = oSign;
                    statusLabel.setText(oSign +", your turn.");
                    button2.setEnabled(false);
                    play();
                    count+=1;
                }
                else{
                    button2.setText(oSign);
                    player = xSign;
                    statusLabel.setText(xSign + ", your turn.");
                    button2.setEnabled(false);
                    play();
                    count+=1;
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(player == xSign){
                    button3.setText(xSign);
                    player = oSign;
                    statusLabel.setText(oSign +", your turn.");
                    button3.setEnabled(false);
                    play();
                    count+=1;
                }
                else{
                    button3.setText(oSign);
                    player = xSign;
                    statusLabel.setText(xSign + ", your turn.");
                    button3.setEnabled(false);
                    play();
                    count+=1;
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(player == xSign){
                    button4.setText(xSign);
                    player = oSign;
                    statusLabel.setText(oSign +", your turn.");
                    button4.setEnabled(false);
                    play();
                    count+=1;
                }
                else{
                    button4.setText(oSign);
                    player = xSign;
                    statusLabel.setText(xSign + ", your turn.");
                    button4.setEnabled(false);
                    play();
                    count+=1;
                }
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(player == xSign){
                    button5.setText(xSign);
                    player = oSign;
                    statusLabel.setText(oSign +", your turn.");
                    button5.setEnabled(false);
                    play();
                    count+=1;
                }
                else{
                    button5.setText(oSign);
                    player = xSign;
                    statusLabel.setText(xSign + ", your turn.");
                    button5.setEnabled(false);
                    play();
                    count+=1;
                }
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(player == xSign){
                    button6.setText(xSign);
                    player = oSign;
                    statusLabel.setText(oSign +", your turn.");
                    button6.setEnabled(false);
                    play();
                    count+=1;
                }
                else{
                    button6.setText(oSign);
                    player = xSign;
                    statusLabel.setText(xSign + ", your turn.");
                    button6.setEnabled(false);
                    play();
                    count+=1;
                }
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(player == xSign){
                    button7.setText(xSign);
                    player = oSign;
                    statusLabel.setText(oSign +", your turn.");
                    button7.setEnabled(false);
                    play();
                    count+=1;
                }
                else{
                    button7.setText(oSign);
                    player = xSign;
                    statusLabel.setText(xSign + ", your turn.");
                    button7.setEnabled(false);
                    play();
                    count+=1;
                }
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(player == xSign){
                    button8.setText(xSign);
                    player = oSign;
                    statusLabel.setText(oSign +", your turn.");
                    button8.setEnabled(false);
                    play();
                    count+=1;
                }
                else{
                    button8.setText(oSign);
                    player = xSign;
                    statusLabel.setText(xSign + ", your turn.");
                    button8.setEnabled(false);
                    play();
                    count+=1;
                }
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(player == xSign){
                    button9.setText(xSign);
                    player = oSign;
                    statusLabel.setText(oSign +", your turn.");
                    button9.setEnabled(false);
                    play();
                    count+=1;
                }
                else{
                    button9.setText(oSign);
                    player = xSign;
                    statusLabel.setText(xSign + ", your turn.");
                    button9.setEnabled(false);
                    play();
                    count+=1;
                }
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
       else if(count==8){
           statusLabel.setText("DRAW-> PLEASE RESET");
       }

    }

    public void lockButtons(){
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
    }
    public void unlockButtons(){
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
    }
}