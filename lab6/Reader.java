package lab6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Reader extends JFrame {
    String text1,text_2;
    int k, i=0;
    Object boxA, boxB, boxC;
    File file = new File("D://GUI.txt");
    static JLabel l1, l2, l3, l4;
    JComboBox box_1, box_2, box_3;
    JRadioButton flag1, flag2;
    ButtonGroup bg;
    static JButton input, del;
    static JTextField text, text2;
    static String[] box1 = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    static String[] box2 = {"январь","февраль","март","апрель","май","июнь","июль","август","сентябрь","октябрь","ноябрь","декабрь"};
    static String[] box3 = {"2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020"};
    public Reader(String str){
        super(str);
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        input = new JButton("Внесение в базу");
        del = new JButton("Очистить");
        text = new JTextField(9);
        text2 = new JTextField(9);
        l1 = new JLabel("Название книги");
        l2 = new JLabel("Автор книги");
        l3 = new JLabel("Дата поступления");
        l4 = new JLabel("Ограничение по возрасту");
        box_1 = new JComboBox(box1);
        box_2 = new JComboBox(box2);
        box_3 = new JComboBox<Object>(box3);
        flag1 = new JRadioButton("есть");
        flag2 = new JRadioButton("нет");
        bg = new ButtonGroup();
        bg.add(flag1);
        bg.add(flag2);

        setLayout(null);
        input.setSize(200,30);
        input.setLocation(150, 200);
        del.setSize(100, 30);
        del.setLocation(10, 200);
        text.setSize(220,25);
        text.setLocation(250, 20);
        text2.setSize(220,25);
        text2.setLocation(250, 60);
        l1.setSize(200,25);
        l1.setLocation(30, 20);
        l2.setSize(220, 25);
        l2.setLocation(30, 60);
        l3.setSize(200, 25);
        l3.setLocation(30, 100);
        l4.setSize(200, 25);
        l4.setLocation(30, 160);
        box_1.setSize(40,25);
        box_1.setLocation(250,100);
        box_2.setSize(100, 25);
        box_2.setLocation(300, 100);
        box_3.setSize(70, 25);
        box_3.setLocation(410, 100);
        flag1.setSize(60,25);
        flag1.setLocation(250, 160);
        flag2.setSize(50, 25);
        flag2.setLocation(310, 160);

        add(input);
        add(del);
        add(text);
        add(text2);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(box_1);
        add(box_2);
        add(box_3);
        add(flag1);
        add(flag2);

        input.addActionListener((ActionListener) new InputActionListener());

        flag1.addActionListener(new FlagActionListener());
        flag2.addActionListener(new FlagActionListener());
        del.addActionListener(new DelActionListener());
        box_1.addActionListener(new BoxActionListener());
        box_2.addActionListener(new BoxActionListener());
        box_3.addActionListener(new BoxActionListener());
    }
    public class InputActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try{
                if(!file.exists()){
                    file.createNewFile();
                }
                FileWriter out = new FileWriter(file, true);
                try{ i++;
                    String text1 = text.getText();
                    String text_2 = text2.getText();
                    out.write(i+". "+text1 + "\t ");
                    out.write(text_2+ "\t");
                    if(k == 1)
                        out.write("Есть возрастное ограничение" + "\t");
                    else if(k == -1)
                        out.write("Нет ограничения по возрасту" + "\t");
                    out.write(" Дата поступления:" + boxA + " " + boxB + " " + boxC + "\n");
                } finally{
                    out.close();
                }
            }catch(IOException e1){
                throw new RuntimeException(e1);
            }
        }
    }

    public class FlagActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            k = 0;
            if(e.getSource() == flag1){
                k++;
            }
            else if(e.getSource() == flag2){
                k--;
            }
        }
    }
    public class DelActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == del){
                text.setText(null);
                text2.setText(null);

            }
        }
    }
    public class BoxActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == box_1){
                boxA = box_1.getSelectedItem();
            }
            if(e.getSource() == box_2){
                boxB = box_2.getSelectedItem();
            }
            if(e.getSource() == box_3){
                boxC = box_3.getSelectedItem();

            }
        }
    }
}
