package lab7;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Interface extends JFrame {
    List<Shoes> shoesCatalog = new ArrayList<>(ActionsWithCatalog.CreateShoesCatalog());

    static JButton add, delete, edit, sort, search, showData;
    static JTextField searchManufacturer, name, type, color, size, material, manufacturer, indexToDelete, indexToEdit, name2, type2, color2, size2, material2, manufacturer2;
    static JTextArea catalog;
    static JLabel lSearchManufacturer, lname, ltype, lcolor, lsize, lmaterial, lmanufacturer, lindexToDelete, lindexToEdit, lname2, ltype2, lcolor2, lsize2, lmaterial2, lmanufacturer2, error;

    public Interface(String str) {
        super(str);

        setSize(850, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lSearchManufacturer = new JLabel("Искомый производитель:");
        lname = new JLabel("Наименование:");
        ltype = new JLabel("Вид:");
        lcolor = new JLabel("Цвет:");
        lsize = new JLabel("Размер:");
        lmaterial = new JLabel("Материал:");
        lmanufacturer = new JLabel("Производитель:");
        lindexToDelete = new JLabel("Введите индекс элемента для удаления: ");
        lindexToEdit = new JLabel("Введите индекс элемента для редактирования: ");
        lname2 = new JLabel("Наименование:");
        ltype2 = new JLabel("Вид:");
        lcolor2 = new JLabel("Цвет:");
        lsize2 = new JLabel("Размер:");
        lmaterial2 = new JLabel("Материал:");
        lmanufacturer2 = new JLabel("Производитель:");
        error = new JLabel("Ошибка ввода!");
        error.setForeground(Color.red);

        searchManufacturer = new JTextField();
        name = new JTextField();
        type = new JTextField();
        color = new JTextField();
        size = new JTextField();
        material = new JTextField();
        manufacturer = new JTextField();
        name2 = new JTextField();
        type2 = new JTextField();
        color2 = new JTextField();
        size2 = new JTextField();
        material2 = new JTextField();
        manufacturer2 = new JTextField();
        indexToDelete = new JTextField();
        indexToEdit = new JTextField();

        add = new JButton("Добавить");
        delete = new JButton("Удалить");
        edit = new JButton("Редактировать");
        sort = new JButton("Сортировать");
        search = new JButton("Найти");
        showData = new JButton(("Показать данные об элементе"));

        catalog = new JTextArea();
        catalog.setEditable(false);
        PrintTextToTextArea(shoesCatalog);


        setLayout(null);
        catalog.setLocation(20, 15);
        catalog.setSize(670, 100);
        sort.setLocation(20, 125);
        sort.setSize(150, 30);
        lSearchManufacturer.setLocation(190, 125);
        lSearchManufacturer.setSize(150, 30);
        searchManufacturer.setLocation(345, 125);
        searchManufacturer.setSize(150, 30);
        search.setLocation(495, 125);
        search.setSize(70, 30);

        add.setLocation(590, 190);
        add.setSize(90, 30);
        lname.setLocation(20, 165);
        lname.setSize(90, 30);
        ltype.setLocation(145, 165);
        ltype.setSize(40, 30);
        lcolor.setLocation(230, 165);
        lcolor.setSize(50, 30);
        lsize.setLocation(310, 165);
        lsize.setSize(70, 30);
        lmaterial.setLocation(390, 165);
        lmaterial.setSize(90, 30);
        lmanufacturer.setLocation(490, 165);
        lmanufacturer.setSize(100, 30);
        name.setLocation(20, 190);
        name.setSize(90, 30);
        type.setLocation(120, 190);
        type.setSize(80, 30);
        color.setSize(80, 30);
        color.setLocation(210, 190);
        size.setLocation(310, 190);
        size.setSize(40, 30);
        material.setLocation(380, 190);
        material.setSize(80, 30);
        manufacturer.setSize(90, 30);
        manufacturer.setLocation(490, 190);

        lindexToDelete.setSize(260, 30);
        lindexToDelete.setLocation(20, 230);
        indexToDelete.setSize(30, 30);
        indexToDelete.setLocation(265, 230);
        delete.setSize(90, 30);
        delete.setLocation(305, 230);

        lindexToEdit.setLocation(20, 285);
        lindexToEdit.setSize(290, 30);
        indexToEdit.setLocation(305, 285);
        indexToEdit.setSize(30, 30);
        showData.setLocation(335, 285);
        showData.setSize(220, 30);
        edit.setLocation(590, 340);
        edit.setSize(130, 30);
        lname2.setLocation(20, 315);
        lname2.setSize(90, 30);
        ltype2.setLocation(145, 315);
        ltype2.setSize(40, 30);
        lcolor2.setLocation(230, 315);
        lcolor2.setSize(50, 30);
        lsize2.setLocation(310, 315);
        lsize2.setSize(70, 30);
        lmaterial2.setLocation(390, 315);
        lmaterial2.setSize(90, 30);
        lmanufacturer2.setLocation(490, 315);
        lmanufacturer2.setSize(100, 30);
        name2.setLocation(20, 340);
        name2.setSize(90, 30);
        type2.setLocation(120, 340);
        type2.setSize(80, 30);
        color2.setSize(80, 30);
        color2.setLocation(210, 340);
        size2.setLocation(310, 340);
        size2.setSize(40, 30);
        material2.setLocation(380, 340);
        material2.setSize(80, 30);
        manufacturer2.setSize(90, 30);
        manufacturer2.setLocation(490, 340);


        add(catalog);
        add(sort);
        add(lSearchManufacturer);
        add(searchManufacturer);
        add(search);
        add(add);
        add(lname);
        add(ltype);
        add(lcolor);
        add(lsize);
        add(lmaterial);
        add(lmanufacturer);
        add(name);
        add(type);
        add(color);
        add(size);
        add(material);
        add(manufacturer);
        add(lindexToDelete);
        add(indexToDelete);
        add(delete);
        add(lindexToEdit);
        add(indexToEdit);
        add(edit);
        add(lname2);
        add(ltype2);
        add(lcolor2);
        add(lsize2);
        add(lmaterial2);
        add(lmanufacturer2);
        add(name2);
        add(type2);
        add(color2);
        add(size2);
        add(material2);
        add(manufacturer2);
        add(showData);
        add(error);

        sort.addActionListener(new SortActionListener());
        search.addActionListener(new SearchActionListener());
        add.addActionListener(new AddActionListener());
        delete.addActionListener(new DeleteActionListener());
        edit.addActionListener(new EditActionListener());
        showData.addActionListener(new ShowDataActionListener());
    }

    public void PrintTextToTextArea(List<Shoes> shoesCatalog) {
        catalog.setText(null);
        for (Shoes element : shoesCatalog) {
            catalog.append(element.toString());
        }
    }


    public class SortActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == sort) {
                PrintTextToTextArea(ActionsWithCatalog.sortShoesCatalogByType(shoesCatalog));
            }
        }
    }

    public class SearchActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == search) {
                ActionsWithCatalog.SearchShoesByManufacturer(shoesCatalog, searchManufacturer.getText());
            }
        }
    }

    public class AddActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource() == add) {
                    shoesCatalog.add(new Shoes(name.getText(), type.getText(), color.getText(), Integer.valueOf(size.getText()), material.getText(), manufacturer.getText()));
                    shoesCatalog.sort(new Shoes.NameComparator());
                    name.setText(null);
                    type.setText(null);
                    color.setText(null);
                    size.setText(null);
                    manufacturer.setText(null);
                    material.setText(null);
                    PrintTextToTextArea(shoesCatalog);
                }

            } catch (NumberFormatException exception) {
                error.setSize(200, 30);
                error.setLocation(685, 190);
            }
        }
    }

    public class DeleteActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource() == delete) {
                    shoesCatalog.remove(Integer.parseInt(indexToDelete.getText()) - 1);
                    shoesCatalog.sort(new Shoes.NameComparator());
                    PrintTextToTextArea(shoesCatalog);
                }
            } catch (IndexOutOfBoundsException exception) {
                error.setSize(200, 30);
                error.setLocation(400, 230);
            } catch (NumberFormatException exception2) {
                error.setSize(200, 30);
                error.setLocation(400, 230);
            }
        }
    }

    public class ShowDataActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource() == showData) {
                    name2.setText(shoesCatalog.get(Integer.parseInt(indexToEdit.getText()) - 1).getName());
                    type2.setText(shoesCatalog.get(Integer.parseInt(indexToEdit.getText()) - 1).getType());
                    color2.setText(shoesCatalog.get(Integer.parseInt(indexToEdit.getText()) - 1).getColor());
                    size2.setText(String.valueOf(shoesCatalog.get(Integer.parseInt(indexToEdit.getText()) - 1).getSize()));
                    material2.setText(shoesCatalog.get(Integer.parseInt(indexToEdit.getText()) - 1).getMaterial());
                    manufacturer2.setText(shoesCatalog.get(Integer.parseInt(indexToEdit.getText()) - 1).getManufacturer());
                }

            } catch (IndexOutOfBoundsException exception) {
                error.setSize(200, 30);
                error.setLocation(560, 285);
            } catch (NumberFormatException exception2) {
                error.setSize(200, 30);
                error.setLocation(560, 285);
            }
        }
    }

    public class EditActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource() == edit) {

                    shoesCatalog.get(Integer.parseInt(indexToEdit.getText()) - 1).setName(name2.getText());
                    shoesCatalog.get(Integer.parseInt(indexToEdit.getText()) - 1).setType(type2.getText());
                    shoesCatalog.get(Integer.parseInt(indexToEdit.getText()) - 1).setColor(color2.getText());
                    shoesCatalog.get(Integer.parseInt(indexToEdit.getText()) - 1).setSize(Integer.parseInt(size2.getText()));
                    shoesCatalog.get(Integer.parseInt(indexToEdit.getText()) - 1).setMaterial(material2.getText());
                    shoesCatalog.get(Integer.parseInt(indexToEdit.getText()) - 1).setManufacturer(manufacturer2.getText());
                    shoesCatalog.sort(new Shoes.NameComparator());
                    PrintTextToTextArea(shoesCatalog);

                }
            } catch (NumberFormatException exception) {
                error.setSize(200, 30);
                error.setLocation(725, 340);
            }
        }
    }
}