package CircularList;
public class ToiletPaperTest {
    private String brand;
    private double price;
    private int lenght;
    private String color;
    ToiletPaperTest next;

    public ToiletPaperTest(String brand, double price, int lenght, String color, ToiletPaperTest next){
        this.brand = brand;
        this.price = price;
        this.lenght = lenght;
        this.color = color;
        this.next = next;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getLenght() {
        return this.lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}