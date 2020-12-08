package lab7;
import java.util.*;

import lab7.Shoes.TypeComparator;
class ActionsWithCatalog  {

    public static List<Shoes> CreateShoesCatalog(){
        List<Shoes> shoesCatalog = new ArrayList<>();
        shoesCatalog.add(new Shoes("Босоножки", "Детские", "Белый", 36, "Эко-кожа", "Marco"));
        shoesCatalog.add(new Shoes("Ботинки", "Женские", "Черный", 38, "Кожа", "Marcel"));
        shoesCatalog.add(new Shoes("Кроссовки", "Мужские", "Черный", 43, "Кожа", "Nike"));
        shoesCatalog.add(new Shoes("Кроссовки", "Женские", "Розовый", 37, "Кожа", "Reebok"));
        shoesCatalog.sort(new Shoes.NameComparator());
        return shoesCatalog;
    }

    public static List<Shoes> sortShoesCatalogByType(List<Shoes> shoesCatalog){
        shoesCatalog.sort(new Shoes.TypeComparator());
        return shoesCatalog;
    }

    public static void SearchShoesByManufacturer(List<Shoes> shoesCatalog, String manufacturer){
        Interface.catalog.setText(null);
        for (Shoes element: shoesCatalog) {
            if (element.getManufacturer().equals(manufacturer)){
                Interface.catalog.append(element.toString());
            }
        }
    }
}