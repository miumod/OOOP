package lab7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Interface shoesCatalog = new Interface("Каталог обуви");
        shoesCatalog.setLayout(null);
        shoesCatalog.setVisible(true);
        shoesCatalog.setResizable(false);
    }
}