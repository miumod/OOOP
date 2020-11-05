package lab3_2;

public class Wedges extends Sandals {//класс-наследник, который реализует 2 интерфейса
    public Wedges(boolean open, int size, String color){  //конструктор класса
        super(open, size, color); //вызов констректора супер-класса
    }

    public void print(){
        System.out.println("\nWadges of a size: " + getSize() + ", color: " + getColor());
        if(this.isOpen()){
            System.out.println("type: pen");
        } else {
            System.out.println("type: closed");
        }
    }

    public void Brand (){
        System.out.println("Brand: Prada"); //реализация метода интерфейса Shoes
    }
}
