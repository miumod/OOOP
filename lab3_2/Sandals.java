package lab3_2;

public abstract class Sandals implements Object, Shoes { //абстрактный класс так как не реализует методы интерфейсов
    private boolean open;
    private int size;
    private String color;

    public boolean isOpen() { //геттре
        return open;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public Sandals(boolean open, int size, String color){  //конструктор класса Sandals
        this.open=open;
        this.size=size;
        this.color=color;
    }

    public abstract void Brand(); //не реалируются абстрактные методы

    public abstract void print(); //не реалируются абстрактные методы
}
