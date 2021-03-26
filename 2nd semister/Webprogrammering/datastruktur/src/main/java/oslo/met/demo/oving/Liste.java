package oslo.met.oving;

public class Liste {
   private static  class Node{
       int verdi;
       Node neste;

       public Node(int verdi){
           this.verdi = verdi;
       }
   }

   private Node hode= null;
   private Node hale = null;

   public void settInn(int tall){
       Node node = new Node(tall);

       if (hode ==null){
           hode=node;
       }else {
           hale.neste  = node;
       }
       hode =  node;
       hale.neste = hode;
   }
}
