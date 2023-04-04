public class implementedQueue {
    public String dataItem;
    public implementedQueue next;

    public implementedQueue (String d){
        dataItem=d;
    }

    public void displayLink(){
        System.out.print(dataItem+ " ");
    }
    public static void main(String[] args) {
        linkQueue queue = new linkQueue();
        queue.enqueue("Java");
        queue.enqueue("PHP");
        queue.enqueue("HTML");
        queue.enqueue("DotNet");
        System.out.println("Remove\t: "+queue.dequeue());
        System.out.println("Element\t: "+queue.displayPeek());
        System.out.println("Poll\t: "+ queue.displayPoll() );
        System.out.println("Peek\t: "+ queue.displayPeek());
    }

}
