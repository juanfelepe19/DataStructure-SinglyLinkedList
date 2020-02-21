public class LinkedList{
 Node head;
 Node tail;
 int count;
 
 //determine whether the list is empty
 public boolean isEmpty(){
  return count == 0;
 }
 
 //output the list
 public String toString(){
  StringBuffer sb = new StringBuffer();
  sb.append("{");
  Node p = head;
  while(p!= null){
   sb.append(p.getItem() + " ");
   p = p.getNext();
  }
  sb.append("}");
  return sb.toString();
 }
 
 public void addFirst(int item){
  Node temp = new Node(item,head);
  if(isEmpty())
   tail = head = temp;
  else
  head = temp;
  count++;
 }
 
 public void addLast(int item){
  if(isEmpty())
   addFirst(item);
  else{
   Node newNode = new Node(item);
   tail.setNext(newNode);
   tail = newNode;
   count++;
  }
 }
 
 //find the length of the list
 public int getCount(){
   return count;
 }
 //retrieve the item contained in the first node
 public int getFirstElement(){
  if(!isEmpty())
   return head.getItem();
  return 0;
 }
 
 //retrieve the item contained in the last node
 public int getLastElement(){
  if(!isEmpty())
   return tail.getItem();
  return 0;
 }
 
 //search the list for a given item
 public boolean isFound(int item){
   boolean check = false;
   
   Node p = head;
   while(p!=null){
      if(p.getItem()==item){
         check = true;
         break;
      }
      p = p.getNext();
   }
   return check;
 }
 
 //insert an item in the list
 
 //delete an item from the list
 public void delete(int item){
   Node p = head;
   Node prev = null;
   while(p!=null){
     if(p.getItem() == item){
      if(prev == null)
      head = p.getNext();
      else
      prev.setNext(p.getNext());
      count--;
     }
     else
     prev = p; 
     p = p.getNext();
  }
  tail = prev;
 }
 
 public int getSum(){
   int sum = 0;
   Node p = head;
   while(p!=null){
      sum+=p.getItem();
      p = p.getNext();
   }
   return sum;
 }
 
 public int getSmallest(){
   int min = 0;
   Node p = head;
   if(!isEmpty()){
      min = p.getItem();
      while(p!=null){
         if(min>p.getItem())
            min = p.getItem();
         p = p.getNext();
      }
   }
   return min;
 }
 
 public int getLargest(){
   int max = 0;
   Node p = head;
   if(!isEmpty()){
      max = p.getItem();
      while(p!=null){
         if(max<p.getItem())
            max = p.getItem();
         p = p.getNext();
      }
   }
   return max;
 }
 
 public int sumOfEven(){
   int sum = 0;
   Node p = head;
   while(p!=null){
      if(p.getItem()%2==0)
      sum+=p.getItem();
      p = p.getNext();
   }
   return sum;
 }
 
 public void doubleTheElement(){
   Node p = head;
   int temp = 0;
   while(p!=null){
      temp = p.getItem()*2;
      p.setItem(temp);
      p = p.getNext();
   }
 }
  
  public static void main(String [] args){
  LinkedList list = new LinkedList();
  list.addFirst(5);
  list.addFirst(6);
  list.addFirst(7);
  list.addLast(8);
  list.addFirst(2);
  list.addLast(1);
  //list.delete(8);
  list.delete(5);
  System.out.println("list contains: " + list);
  System.out.println("The first element is :  " + list.getFirstElement());
  System.out.println("The last element is :  " + list.getLastElement());
  System.out.println("Search 5: " + list.isFound(5));
  System.out.println("Sum: " + list.getSum());
  System.out.println("Smallest: " + list.getSmallest());
  System.out.println("Largest: " + list.getLargest());
  System.out.println("Sum of even: " + list.sumOfEven());
  list.doubleTheElement();
  System.out.println("list contains: " + list);
  
 }
}