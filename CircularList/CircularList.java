package CircularList;
public class CircularList {
    ToiletPaperTest tail;

    public CircularList() {
        tail = null;
    }

    public void addToHead(String b, double p, int l,String c){
        if(tail == null){
            tail = new ToiletPaperTest(b, p, l, c, tail);
            tail.next = tail;
        }else{
            tail.next = new ToiletPaperTest(b, p, l, c, tail.next);
            tail.next = tail.next;
        }
    }

}
