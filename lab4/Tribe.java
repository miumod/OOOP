package lab4;
import java.io.*;
import java.util.Arrays;
public class Tribe {

    String name;
    int population;
    boolean fire;
    Tribe() throws IOException {
        String bolv;
        //открываем символьный поток ввод
        BufferedReader input=new BufferedReader (new InputStreamReader(System.in,"Cp1251")); //создается буфферезированный поток для чтения
        System.out.print("\nВведите название племени: ");
        this.name = input.readLine(); //считывание из потока построчно
        System.out.print("\nВведите численность: ");
        this.population = Integer.parseInt(input.readLine()); //извлечение из строки числового значения типа int
        while (true) {
            System.out.print("\nЗнакомы с огнем(Yes/No): ");
            bolv = input.readLine();
            if ("Yes".equals(bolv)) {
                this.fire = true;
                break;
            }
            if ("No".equals(bolv)) {
                this.fire = false;
                break;
            }
            System.out.print("\nОшибка! Повторите ввод");
        }
    }
        //записываем информацию в файл document.doc
        public void InputInFile() throws IOException {
            File file = new File("document.doc"); //создается файл для записи
            file.deleteOnExit(); //файл удалится после завершения работы виртуальной машины Java
            //поток для записи в файл
            FileWriter writer = new FileWriter(file, true); // инф-ия дописывается в конец файла т.к. append = true
            writer.append("\nПлемя: " + this.name + "; численность: " + this.population + "; "); //запись данных
            if (this.fire)
                writer.append("знакомы с огнем.\n");
            else writer.append("незнакомы с огнем.\n");
            writer.flush(); //финализирует выходное состояние так, что все буферы очищаются
            writer.close(); //закрываем поток
        }
        //статический метод вывода информации из файла
        public static void OutputOfFile()throws IOException{
            File file = new File("document.doc");
            FileReader reader = new FileReader(file); //поток для вывода информации
            char buffer[] = new char[1];
            int numb;
            do {
                numb = reader.read(buffer); //поток читает буфер
                System.out.print(buffer[0]);
            } while (numb == 1);
            reader.close(); //закрываем поток
        }
    }
