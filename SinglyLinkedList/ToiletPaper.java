package SinglyLinkedList;
public class ToiletPaper{
    private String brand;
    private double price;
    private int length;
    private String color;
    ToiletPaper next;


    public ToiletPaper(String brand, double price, int length, String color, ToiletPaper n) {
        this.brand = brand;
        this.price = price;
        this.length = length;
        this.color = color;
        next=n;
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
    public int getLength() {
        return this.length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }


}