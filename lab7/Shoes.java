package lab7;

import java.util.Comparator;

public class Shoes {
    private String name;
    private String type;
    private String color;
    private int size;
    private String material;
    private String manufacturer;

    public Shoes(String name, String type, String color, int size, String material, String manufacturer) {
        this.name = name;
        this.type = type;
        this.color = color;
        this.size = size;
        this.material = material;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return
                " Наименование: " + name +
                        " /Вид: " + type +
                        " /Цвет: " + color +
                        " /Размер: " + size +
                        " /Материал: " + material + " /Производитель " +
                        manufacturer + ' '+"\n" ;
    }


    public static class TypeComparator implements Comparator<Shoes>{

        @Override
        public int compare(Shoes o1, Shoes o2) {
            return o1.type.compareTo(o2.type);
        }

    }

    public static class NameComparator implements Comparator<Shoes>{
        @Override
        public int compare(Shoes o1, Shoes o2) {
            return o1.name.compareTo(o2.name);
        }
    }
}