import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class tic_tac_toe implements ActionListener{
    static int a = 1;
    JButton numbers1,numbers2,numbers3,numbers4,numbers5,numbers6,numbers7,numbers8,numbers9,button_restart;
    tic_tac_toe(){
        JFrame window = new JFrame("tic");//Name app
        //numbers
        numbers1 = new JButton("");
        numbers2 = new JButton("");
        numbers3 = new JButton("");
        numbers4 = new JButton("");
        numbers5 = new JButton("");
        numbers6 = new JButton("");
        numbers7 = new JButton("");
        numbers8 = new JButton("");
        numbers9 = new JButton("");
        button_restart = new JButton("RESTART");
        //x: y: z: numbers
        numbers1.setBounds(10,10,50,50);
        numbers2.setBounds(60,10,50,50);
        numbers3.setBounds(110,10,50,50);

        numbers4.setBounds(10,60,50,50);
        numbers5.setBounds(60,60,50,50);
        numbers6.setBounds(110,60,50,50);

        numbers7.setBounds(10,110,50,50);
        numbers8.setBounds(60,110,50,50);
        numbers9.setBounds(110,110,50,50);
        button_restart.setBounds(10,165,150,20);

        numbers1.addActionListener(this);
        numbers2.addActionListener(this);
        numbers3.addActionListener(this);
        numbers4.addActionListener(this);
        numbers5.addActionListener(this);
        numbers6.addActionListener(this);
        numbers7.addActionListener(this);
        numbers8.addActionListener(this);
        numbers9.addActionListener(this);
        button_restart.addActionListener(this);
        //adding to screen(numbers)
        window.add(numbers1);
        window.add(numbers2);
        window.add(numbers3);
        window.add(numbers4);
        window.add(numbers5);
        window.add(numbers6);
        window.add(numbers7);
        window.add(numbers8);
        window.add(numbers9);
        window.add(button_restart);
        window.setSize(170,220);
        window.setLayout(null);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae) {

        if (a == 1) {
            if (ae.getSource() == numbers1) {
                numbers1.setText("X");numbers1.setEnabled(false);a=2;
            }
            if (ae.getSource() == numbers2) {
                numbers2.setText("X");numbers2.setEnabled(false);a = 2;
            }
            if (ae.getSource() == numbers3) {
                numbers3.setText("X");numbers3.setEnabled(false);a = 2;
            }
            if (ae.getSource() == numbers4) {
                numbers4.setText("X");numbers4.setEnabled(false);a = 2;
            }
            if (ae.getSource() == numbers5) {
                numbers5.setText("X");numbers5.setEnabled(false);a = 2;
            }
            if (ae.getSource() == numbers6) {
                numbers6.setText("X");numbers6.setEnabled(false);a = 2;
            }
            if (ae.getSource() == numbers7) {
                numbers7.setText("X");numbers7.setEnabled(false);a = 2;
            }
            if (ae.getSource() == numbers8) {
                numbers8.setText("X");numbers8.setEnabled(false);a = 2;
            }
            if (ae.getSource() == numbers9) {
                numbers9.setText("X");numbers9.setEnabled(false);a = 2;
            }
            if (ae.getSource()== button_restart){
                numbers1.setEnabled(true);numbers1.setText("");
                numbers2.setEnabled(true);numbers2.setText("");
                numbers3.setEnabled(true);numbers3.setText("");
                numbers4.setEnabled(true);numbers4.setText("");
                numbers5.setEnabled(true);numbers5.setText("");
                numbers6.setEnabled(true);numbers6.setText("");
                numbers7.setEnabled(true);numbers7.setText("");
                numbers8.setEnabled(true);numbers8.setText("");
                numbers9.setEnabled(true);numbers9.setText("");
                a = 1;
            }
        } else if (a == 2) {
            if (ae.getSource() == numbers1) {
                numbers1.setText("O");numbers1.setEnabled(false);a = 1;
            }
            if (ae.getSource() == numbers2) {
                numbers2.setText("O");numbers2.setEnabled(false);a = 1;
            }
            if (ae.getSource() == numbers3) {
                numbers3.setText("O");numbers3.setEnabled(false);a = 1;
            }
            if (ae.getSource() == numbers4) {
                numbers4.setText("O");numbers4.setEnabled(false);
            }
            if (ae.getSource() == numbers5) {
                numbers5.setText("O");numbers5.setEnabled(false);a = 1;
            }
            if (ae.getSource() == numbers6) {
                numbers6.setText("O");numbers6.setEnabled(false);a = 1;
            }
            if (ae.getSource() == numbers7) {
                numbers7.setText("O");numbers7.setEnabled(false);a = 1;
            }
            if (ae.getSource() == numbers8) {
                numbers8.setText("O");numbers8.setEnabled(false);a = 1;
            }
            if (ae.getSource() == numbers9) {
                numbers9.setText("O");numbers9.setEnabled(false);a = 1;
            }
            if (ae.getSource()==button_restart){
                numbers1.setEnabled(true);numbers1.setText("");
                numbers2.setEnabled(true);numbers2.setText("");
                numbers3.setEnabled(true);numbers3.setText("");
                numbers4.setEnabled(true);numbers4.setText("");
                numbers5.setEnabled(true);numbers5.setText("");
                numbers6.setEnabled(true);numbers6.setText("");
                numbers7.setEnabled(true);numbers7.setText("");
                numbers8.setEnabled(true);numbers8.setText("");
                numbers9.setEnabled(true);numbers9.setText("");
                a = 1;
            }
        }
    }

    public static void main(String[] arg){
        SwingUtilities.invokeLater(tic_tac_toe::new);
    }
}