package lab5;

import java.io.*;

public class WorkWithFile {
    String data, fileName, choice, choice2;
    RandomAccessFile text;
    BufferedReader in;

    public WorkWithFile() throws UnsupportedEncodingException {
        this.in = new BufferedReader(new InputStreamReader(System.in, "Cp1251"));
    }

    //меню
    public void printMenu() {
        System.out.println("Введите выбор:");
        System.out.println("a) Чтение из файла");
        System.out.println("b) Редактирование файла");
        System.out.println("c) Выполнение действий над файлом");
        System.out.println("d) Запись текста в файл");
        System.out.println("e) Выход");
    }

    //меню2
    public void printMenu2() {
        System.out.println("Введите выбор:");
        System.out.println("1 - добавление текста в произвольную позицию");
        System.out.println("2 - добавление текста в начало");
        System.out.println("3 - добавление текста в конец");
    }

    // работа с консолью
    public void workWithConsole() throws IOException {
        while (true) {
            printMenu();
            choice = in.readLine();
            if (choice.compareTo("a") == 0) textFromfile();
            else if (choice.compareTo("b") == 0) {
                printMenu2();
                choice2 = in.readLine();
                if (choice2.compareTo("1") == 0) addRandom();
                else if (choice2.compareTo("2") == 0) addStart();
                else if (choice2.compareTo("3") == 0) addEnd();
            } else if (choice.compareTo("c") == 0) redText();
            else if (choice.compareTo("d") == 0) writeToFile();
            else if (choice.compareTo("e") == 0) return;
        }
    }

    //чтение из файла
    public String textFromfile() throws IOException {
        System.out.println("Введите имя файла");
        fileName = in.readLine();
        File file = new File(fileName);
        text = new RandomAccessFile(file, "r");
        data = text.readLine();
        text.close();
        System.out.println(data);
        return data;

    }

    public void addStart() throws IOException {
        System.out.println("Введите имя файла");
        fileName = in.readLine();
        File file = new File(fileName);
        text = new RandomAccessFile(file, "rw");
        data = text.readLine();
        System.out.println("Введите строку для добавления в начало");
        String s = in.readLine();
        text.seek(0);
        text.writeBytes(s);
        text.seek(s.length());
        text.writeBytes(data);
        text.close();
        System.out.println("Строка успешно записана");
    }

    public void addEnd() throws IOException {
        System.out.println("Введите имя файла");
        fileName = in.readLine();
        File file = new File(fileName);
        text = new RandomAccessFile(file, "rw");
        System.out.println("Введите строку для добавления в конец");
        String s = in.readLine();
        text.seek(text.length());
        text.writeBytes(s);
        text.close();
        System.out.println("Строка успешно записана");
    }

    public void addRandom() throws IOException {//метод добавления текста в указаную позицию в файле
        System.out.println("Введите имя файла");
        fileName = in.readLine();
        File file = new File(fileName);
        text = new RandomAccessFile(file, "rw");
        System.out.println("Введите строку для добавления в указанную позицию в файле:");
        String s;
        s = in.readLine();//ввод строки
        System.out.println("Введите необходимую позицию в файле:");
        int n;
        n = Integer.parseInt(in.readLine());//ввод позиции
        text.seek(n);//смещение на n позицию в файле
        data = text.readLine();//чтение файла начиная с позиции n
        text.seek(n);
        text.writeBytes(s);//запись введенной строки с позиции n
        text.writeBytes(data);//запись прочитанного с позиции n текста после введенной строки
        text.close();
        System.out.println("Cтрока записана в файл.");
    }


    //редактирование текста
    public void redText() throws IOException {
        System.out.println("Введите имя файла");
        fileName = in.readLine();
        File file = new File(fileName);
        text = new RandomAccessFile(file, "rw");
        data = text.readLine();
        while (data.contains("  ")) {
            String replace = data.replace("  ", " ");
            data = replace;
        }
        System.out.println(data);
        text.close();
    }

    //Запись в файл
    public void writeToFile() throws IOException {
        File file = new File("D://text2.txt");
        file.createNewFile();
        text = new RandomAccessFile(file, "rw");
        text.writeBytes(this.textFromfile());
        text.close();
    }
}