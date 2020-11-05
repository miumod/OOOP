package lab3_2;

public class Boots implements Shoes, Object {
    private int heelSize;
    private boolean type; //поля

    public int getHeelSize() {
        return heelSize;
    }

    public boolean isType() { //геттеры
        return type;
    }

    public Boots( ){ //конструктор класса Boots
        this.heelSize=4;
        this.type=true;
    }

    public void print(){                        //реализация обстрактного метода интерфейса Object
        System.out.println("Boots of a heelsize: " +getHeelSize());
        if(this.isType()){
            System.out.println("Type: Demi-season");
        } else {
            System.out.println("Type: For Winter");
        }

    }

    public void Brand(){
        System.out.println("Brand: Michael Kors"); //реализация обстрактного метода интерфейса Shoes
    }
}
