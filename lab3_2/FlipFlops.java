package lab3_2;

public class FlipFlops extends Sandals { //класс-наследник, который реализует 2 интерфейса
    public FlipFlops(boolean open, int size, String color){  //конструктор класса
        super(open, size, color); //вызов констректора супер-класса
    }

    public void print(){
        System.out.println("\nFlipFlops of a size: " + getSize() + ", color: " + getColor());
        if(this.isOpen()){
            System.out.println("type: open");
        } else {
            System.out.println("type: closed");
        }
    }

    public void Brand (){
        System.out.println("Brand: Puma"); //реализация метода интерфейса Shoes
    }
}
