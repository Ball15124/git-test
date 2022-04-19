package SinglyLinkedList;
public class SinglyLinkedList {
    ToiletPaper head, tail;

    public SinglyLinkedList() {
        head=tail=null;
    }
    public void addToHead(String b, double p, int l, String c){
        head=new ToiletPaper(b, p, l, c, head);
        if(tail==null){
           tail=head;
        }
    }
    public void addToTail(String b, double p, int l,String c){
        if(head==null){
           head=tail=new ToiletPaper(b, p, l, c, null);
        }
        else{
          tail.next=new ToiletPaper(b, p, l, c, null);
          tail=tail.next;
        }
    }
    public ToiletPaper deleteFromHead(){
        ToiletPaper deletedNode=head;
        if(head==tail){
           head=tail=null;
        }
        else{
         head=head.next;
        }
        return deletedNode;
    }
    public String deleteFromTail(){
        String deletedNode;
        if(head==tail){
          head=tail=null;
          deletedNode="";
        }
        else{
            deletedNode=tail.toString();
            ToiletPaper temp;
          for( temp=head;temp.next != tail;temp=temp.next){

          }
          tail=temp;
          tail.next=null;
        }

        return deletedNode;
    }
    public void printAllTOiletPaperColor(){
         for(ToiletPaper temp=head;temp!=null;temp=temp.next){
            System.out.print(temp.getColor()+" ");
         }
    }

}
