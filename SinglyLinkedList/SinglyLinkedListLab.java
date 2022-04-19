package SinglyLinkedList;
public class SinglyLinkedListLab {
    public static void main(String[] args) {
        SinglyLinkedList list1=new SinglyLinkedList();
         list1.addToHead("Scott", 100.00, 10, "Pink" );
         list1.addToHead("Scott", 300, 37, "Blue");
         System.out.println(list1.head.getColor());
         System.out.println(list1.tail.getColor());
         list1.addToHead("Gucci", 50000, 3, "Gold");
         System.out.println(list1.head.getColor()+" "+list1.tail.getColor());
         System.out.println(list1.head.next.getColor());
         list1.addToHead("Festa", 200, 12, "Orange");
         list1.addToHead("Festa", 210, 15, "Red");
         System.out.println(list1.head.next.next.getColor()+" "+list1.head.next.next.next.getColor());
         list1.addToTail("Supreme", 1000, 5, "Silver");
         System.out.println(list1.tail.getColor());
         list1.deleteFromHead();
         System.out.println(list1.head.getColor());
         list1.deleteFromTail();
         System.out.println(list1.tail.getColor());
         list1.printAllTOiletPaperColor();
    }
}
