public class FIFO {
    public implementedQueue first;
    public implementedQueue last;

    public FIFO(){
       first= null;
       last = null;
    }
    public boolean isEmpty(){
       return first==null;
    }
    public void insertLast(String dataData){
       implementedQueue link = new implementedQueue(dataData);
       if (isEmpty()){
           first = link;
       }else {
           last.next = link;
       }
       last= link;
    }
    public String deleteFirst(){
       String tempData = (String) first.dataItem;
       if (first.next == null){
           last = null;
       }
       first = first.next;
       return tempData;
    }
    public void displayList(){
       implementedQueue current = first;
       while (current != null){
           current.displayLink();
           current=current.next;
       }
    }
    public String peek(){
       String tempData = first.dataItem;
       return tempData;
    }
    public String poll(){
        String tempData =  first.dataItem;
        first = first.next;
        return tempData;
    }
   
}  

