class doublyLL{
    private class Node{
        int data;
        Node next;
        Node prev;
    }
    private Node head;
    private Node tail;
    private int size;


public int size(){
    return size;
}
public boolean isEmpty(){
 return size == 0;
}
public void addFirst(int data){
    Node node=new Node();
    node.data=data;

    if(head==null){
        head=tail=node;
        tail.next=null;
        head.prev=null;
        size++;
    }else{
    node.next=head;

    head.prev=node;
    
    head=head.prev;
    head.prev=null;
    size++;
    }
}
    public void display(){
        Node temp=this.head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void reversedisplay(){
        Node temp=this.tail;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public void addLast(int data){
   
        Node node=new Node();  
        node.data=data;//add
        if(head==null){
            this.head=this.tail=node;
            this.size++;   
        }else{
        //link
        this.tail.next=node;
        node.prev=tail;
        //summary
        this.tail=node;
        tail.next=null;
        this.size++;
        }
        
       }
       public int getFirst(){
        return head.data;
    }
    
    
    public int getAt(int i)throws Exception{
     if(i>=this.size || i<0){
         throw new Exception("Index out of bounds");
 
     }else if(this.size==0){
         throw new Exception("Linked List is empty");
     }
         Node node=this.head;
         for(int j=0;j<i;j++){
             node=node.next;
         }
         return node.data;
     
 
    }
    public Node getNodeAt(int i)throws Exception{
     if(i>=this.size || i<0){
         throw new Exception("Index out of bounds");
 
     }else if(this.size==0){
         throw new Exception("Linked List is empty");
     }
         Node node=this.head;
         for(int j=0;j<i;j++){
             node=node.next;
         }
         return node;
     
 
    }
    public void addAt(int i,int data)throws Exception{
        if(i>this.size || i<0){
            throw new Exception("Index out of bounds");
    
        }else if(this.size==0){
            throw new Exception("Linked List is empty");
        }
        if(i==0){
            this.addFirst(data);
        }else if(i==this.size){
            this.addLast(data);
        }else{
        Node node=new Node();
        node.data=data;
        
        Node before=this.getNodeAt(i-1);
        Node after=before.next;
        
        before.next=node;
        node.prev=before;
        
        node.next=after;
        after.prev=node;
        
        this.size++;

    }

    }
    public void removeFirst() throws Exception{
        if(head==null){
            throw new Exception("LinkedList is Empty cannot remove");
        }
        this.head=head.next;
        this.size--;
        head.prev=null;
        
    }
    public void removeLast()throws Exception{
        if(head==null){
            throw new Exception("LinkedList is Empty");
        }
        tail=tail.prev;
        size--;
        tail.next=null;
    }
    public void removeAt(int i)throws Exception{
        if(i==0){
            removeFirst();
        }else if(i==this.size-1){
            removeLast();
        }
        else if(i>=this.size && i<0){
            throw new Exception("Index out of bounds");
    
        }else if(this.size==0){
            throw new Exception("Linked List is empty");
        }else{
        Node before=getNodeAt(i-1);
        Node after=getNodeAt(i+1);
       
        before.next=after;
        after.prev=before;
        this.size--;
        }
    }
}










