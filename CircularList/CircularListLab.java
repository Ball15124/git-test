package CircularList;
public class CircularListLab {
    public static void main(String[] args) {
        CircularList list1=new CircularList();
         list1.addToHead("Scott", 100.00, 10, "Pink" );
         list1.addToHead("Scott", 300, 37, "Blue");
         System.out.println(list1.tail.getColor());
         System.out.println(list1.tail.next.getColor());
         System.out.println(list1.tail.getColor());
         list1.addToHead("Scatt", 300, 55, "Red");
         System.out.println(list1.tail.next.getColor());
         System.out.println(list1.tail.next.next.getColor());
         list1.addToHead("asdad", 500, 45, "Jasmine");
         System.out.println(list1.tail.next.getColor());
         System.out.println(list1.tail.next.next.next.getColor());
    }
}
