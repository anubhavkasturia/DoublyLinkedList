
public class DLLclient {
    public static void main(String[] args) throws Exception {
        doublyLL dll=new doublyLL();
        System.out.println(dll.size());
        System.out.println(dll.isEmpty());
        // dll.addFirst(10);
        // dll.addFirst(20);
        // dll.addFirst(30);
        dll.addLast(10);
        dll.addLast(20);
        dll.addLast(30);
        dll.addAt(3, 40);
        System.out.println(dll.size());

         dll.display();
        // dll.removeAt(2);
        // System.out.println();
        // dll.display();


    }
}