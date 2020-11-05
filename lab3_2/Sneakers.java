package lab3_2;

public class Sneakers implements Object, Shoes {
    private String soleType;
    private String firmProduser;

    public String getSoleType() {
        return soleType;
    }

    public String getFirmProduser() {
        return firmProduser;
    }

    public Sneakers(){ //конструктор класса Sneakers
        this.soleType="silicon";
        this.firmProduser="Nike";
    }

    public void print(){
        System.out.println("\nSneakers of a soletype: " + getSoleType() + ", firm produser: " + getFirmProduser());
    }

    public void Brand() {
        System.out.println("Brand: Nike");  //реализация абстрактного метода интерфейса Shoes
    }
}
