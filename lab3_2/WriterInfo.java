package lab3_2;

public class WriterInfo {
    public static void main(String[] args) {

        Boots b1 = new Boots();
        b1.print();
        b1.Brand();
        Sneakers s1 = new Sneakers();
        s1.print();
        s1.Brand();
        FlipFlops fl1 = new FlipFlops(true, 40, "pink");
        fl1.print();
        fl1.Brand();
        Wedges w1 = new Wedges(false, 38, "blue");
        w1.print();
        w1.Brand();

    }
}